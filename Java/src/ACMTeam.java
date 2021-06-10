import java.util.*;

public class ACMTeam {
    
    public static List<Integer> acmTeam(List<String> topic) {
        int max = -1;
        int count = 0;
        for (int i = 0; i < topic.size() - 1; i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                int numSkills = 0;
                for (int k = 0; k < topic.get(i).length(); k++) {
                    if ((topic.get(i)).charAt(k) == '1' || (topic.get(j)).charAt(k) == '1') numSkills++;
                }
               if (numSkills > max) {
                   max = numSkills;
                   count = 1;
               } else if (numSkills == max) {
                   count++;
               }
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(max);
        result.add(count);
        return result;
    }
}
