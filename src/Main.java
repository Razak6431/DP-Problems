import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.printf("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();


        int i=0;
        int n=str.length()-1;
        while(i<=n){
            if(str.charAt(i)!=str.charAt(n)){
                System.out.println("Given string is not palindrome");
            }
            i++;
            n--;
        }
        
        System.out.println("Given string is a palindrome");

    }
}