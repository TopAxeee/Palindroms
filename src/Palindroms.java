import java.util.Scanner;
public class Palindroms {
    public static void main (String[] args) {
        System.out.print("Введите слово:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if((s.equals(reverseString(s)))==true){
            System.out.print("Слово " + s + " является палиндромом");
        }else{
            System.out.print("Слово " + s + " не является палиндромом");
        }

    }
    public static String reverseString (String D){
        String s1 = "";
        for(int i=(D.length()-1);i>=0;i--){
            s1+=D.charAt(i);
        }
            return s1;
    }
}
