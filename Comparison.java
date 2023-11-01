//Comparison between Strings
class Comparison
{
    public static void main(String[] args) {
        String a = "Gaurav";
        String b = "Gaurav";
        String c = a;
        // System.out.println(c == a);
        // System.out.println(a == b);
        
        String name1 = new String("Gaurav");
        String name2 = new String("Gaurav");

        // System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}