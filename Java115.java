//Count and Say
class Java115
{
    public static void main(String[] args) {
        int n = 5; // You can change this to any value you want.
        String result = countAndSay(n);
        
        System.out.println("The " + n + "th term of the count-and-say sequence is: " + result);
    }
    public static String countAndSay(int n) {
        if(n == 1) return "1";

        //Recursion
        String s = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        int counter = 0;

        for(int i = 0; i < s.length(); i++)
        {
            counter++;
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1))
            {
                res.append(counter).append(s.charAt(i));
                counter = 0;
            }
        }
        return res.toString();
    }
}