import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class TopWords {

    public static List<String> top3(String s) {
        Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z']*");
        Matcher matcher = pattern.matcher(s.toLowerCase());
        Map<String, Integer> wordsCount = new HashMap<>();

        while (matcher.find()) {
            String str = matcher.group();
            wordsCount.put(str, wordsCount.getOrDefault(str, 1) + 1);
        }

        return wordsCount.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    
}
