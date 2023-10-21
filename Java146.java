//Wildcard Matching
import java.util.*;
class Java146
{
    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";
        boolean result = isMatch(s, p);
        System.out.println(result);
    }
    public static boolean isMatch(String s, String p)
    {
        return solve(s,p,0,0,new Boolean[s.length()][p.length()]);
    }
    private static boolean solve(String s, String t, int i, int j, Boolean[][] dp)
    {
        if(i==s.length()){
            return hasNoLCLeft(t,j);
        }
        if(j==t.length()){
            return i==s.length();
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(Character.isLowerCase(t.charAt(j)) && s.charAt(i)!=t.charAt(j)){
            return dp[i][j] = false;
        }
        if(t.charAt(j)=='*'){
            if(solve(s,t,i+1,j,dp)){
                return true;
            }
            if(solve(s,t,i,j+1,dp)){
                return true;
            }
        }
        return dp[i][j] = solve(s,t,i+1,j+1,dp)? true: false;
    }

    private static boolean hasNoLCLeft(String t,int j){
        for(int i=j;i<t.length();i++){
            if(t.charAt(i)!='*'){
                return false;
            }
        }
        return true;
    }
}