//Count and Say
class Java115
{
    public static void main(String[] args) {
        int n = 5; // You can change this to any value you want.
        String result = countAndSay(n);
        
        System.out.println("The " + n + "th term of the count-and-say sequence is: " + result);
    }
    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        
        String result = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count);
                    temp.append(result.charAt(j - 1));
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(result.charAt(result.length() - 1));
            result = temp.toString();
        }   
        return result;
    }
}