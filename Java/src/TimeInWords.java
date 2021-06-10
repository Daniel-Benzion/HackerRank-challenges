public class TimeInWords {
    
    public static String parseTime(int n) {
        
        String result;
        
        switch(n) {
            
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;                
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;    
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "quarter";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
            case 20:
                result = "twenty";
                break;
            case 21:
                result = "twenty one";
                break;
            case 22:
                result = "twenty two";
                break;
            case 23:
                result = "twenty three";
                break;
            case 24:
                result = "twenty four";
                break;
            case 25:
                result = "twenty five";
                break;
            case 26:
                result = "twenty six";
                break;
            case 27:
                result = "twenty seven";
                break;
            case 28:
                result = "twenty eight";
                break;
            case 29:
                result = "twenty nine";
                break;
            case 30:
                result = "half";
                break;
            default:
                result = "o' clock";
                break;
        }
        return result;
    }

    public static String timeInWords(int h, int m) {
        
        String hour;
        String minute;
        
        if (m > 30) {
            
            if (h == 12) {
                hour = "one";
            } else {
                h++;
                hour = parseTime(h);
            }
            
            m = 60 - m;
            minute = parseTime(m);
            if (m == 1) return "one minute to " + hour;
            if (m == 15) return "quarter to " + hour;
            return minute + " minutes to " + hour;
        }
        
        if (m == 0) {
            hour = parseTime(h);
            minute = parseTime(m);
            
            return hour + " " + minute;
        }
        
        hour = parseTime(h);
        minute = parseTime(m);
        if (m == 1) return "one minute past " + hour;
        if (m == 30) return "half past " + hour;
        if (m == 15) return "quarter past " + hour;
        return minute + " minutes past " + hour;
    }

}
