import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
//        String s="Suraj";
        char ch;
        String newstring = "";
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        for (int i = 0; i<input.length();i++){
            ch=input.charAt(i);
            newstring=ch+newstring;
        }
        if(newstring.equals(input)) {
            System.out.println(newstring+" is a palimdrome");
        }
        else {
            System.out.println(newstring +" isn't Palimdrome");
        }
    }
}
