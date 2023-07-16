//Shadowing
class Java32
{
    static int x = 90; //This will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; //The class variable at line 4 is shadowed by this
        // System.out.println(x); //Scope will begin when value is initialised
        x = 40;
        System.out.println(x); //40
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
}

