//About Performance
class Performance
{
    public static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++)
        {
            //Conversion to int to char
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }   
}