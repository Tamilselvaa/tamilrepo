import java.util.Scanner;
public class logicaloperator {

    public static void main(String[] args){

        int a = 10 , b = 15 , c = 20 ;
        System.out.println("a> b && c > a: " +(a > b && c > a));
        System.out.println("a > b || c <: "+(a > b || c < b ));
        System.out.println("!a > b ):" + (!(a > b)));
    }
    
}
