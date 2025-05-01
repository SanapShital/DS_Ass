import java.rmi.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String url = "rmi://localhost/Server";
            ServerIntf serverIntf = (ServerIntf) Naming.lookup(url);

            System.out.print("Enter num1: ");
            int a = sc.nextInt();
            System.out.print("Enter num2: ");
            int b = sc.nextInt();
            sc.nextLine(); // consume newline left-over

            System.out.print("Enter str1: ");
            String str1 = sc.nextLine();

            System.out.print("Enter str2: ");
            String str2 = sc.nextLine();

            System.out.println("Add is: " + serverIntf.addition(a, b));
            System.out.println("Sub is: " + serverIntf.substraction(a, b));
            System.out.println("Mul is: " + serverIntf.multiplication(a, b));
            System.out.println("Div is: " + serverIntf.division(a, b));
            System.out.println("Square is: " + serverIntf.square(a));
            System.out.println("Square root is: " + serverIntf.squareroot(b));

            System.out.println("Palindrome check: " + serverIntf.palindrome(str1));
            System.out.println("String equality check: " + serverIntf.isequalstring(str1, str2));
            System.out.println("Reverse of str1: " + serverIntf.reverseString(str1));
            System.out.println("Concatenation of str1 and str2: " + serverIntf.concatStrings(str1, str2));

        } catch (Exception e) {
            System.out.println("Exception at Client: " + e);
        } finally {
            sc.close();
        }
    }
}
