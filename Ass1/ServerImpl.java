import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {
    }

    public int addition(int a, int b) throws RemoteException {
        return a + b;
    }

    public int substraction(int a, int b) throws RemoteException {
        return a - b;
    }

    public int division(int a, int b) throws RemoteException {
        return a / b;
    }

    public int multiplication(int a, int b) throws RemoteException {
        return a * b;
    }

    public int square(int a) throws RemoteException {
        return a * a;
    }

    public int squareroot(int a) throws RemoteException {
        return (int) Math.sqrt(a);
    }

    public String palindrome(String str) throws RemoteException {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed))
            return "String is Palindrome!";
        else
            return "String is Not Palindrome!";
    }

    public String isequalstring(String str1, String str2) throws RemoteException {
        if (str1.equals(str2))
            return "Strings are equal!";
        else
            return "Strings are not equal!";
    }

    public String reverseString(String str) throws RemoteException {
        return new StringBuilder(str).reverse().toString();
    }

    public String concatStrings(String str1, String str2) throws RemoteException {
        return str1 + str2;
    }
}
