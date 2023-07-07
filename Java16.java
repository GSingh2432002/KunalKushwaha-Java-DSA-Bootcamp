import java.util.Scanner;
class Java16
{
    public static void main(String args[])
    {
        int numOfSub;
        float totalScore, percentage, CGPA;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        numOfSub = obj.nextInt();
        System.out.println("Enter the total score");
        totalScore = obj.nextInt();
        percentage = (totalScore/(100*numOfSub))*100;
        CGPA = (percentage/9.5f);
        System.out.println("CGPA" + CGPA);
        
    }
}