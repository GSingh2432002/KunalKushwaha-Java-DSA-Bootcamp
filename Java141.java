//Restore IP Addresses
import java.util.List;
import java.util.ArrayList;
class Java141
{
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> result = restoreIpAddresses(s);
        for (String ip : result) {
            System.out.println(ip);
        }
    }
    public static List<String> restoreIpAddresses(String s)
    {
        List<String> result = new ArrayList<>();
        backtrack(result,s,"",0,0);
        return result;
    }
    private static void backtrack(List<String> result, String s, String current, int startIndex,int segmentCount)
    {
        if (startIndex == s.length() && segmentCount == 4) {
            result.add(current);
            return;
        }

        if (segmentCount >= 4 || startIndex >= s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && startIndex + len <= s.length(); len++) {
            String segment = s.substring(startIndex, startIndex + len);
            if (isValidSegment(segment)) {
                if (segmentCount == 3) {
                    backtrack(result, s, current + segment, startIndex + len, segmentCount + 1);
                } else {
                    backtrack(result, s, current + segment + ".", startIndex + len, segmentCount + 1);
                }
            }
        }
    }
    private static boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}