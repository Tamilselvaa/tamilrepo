import java.util.Scanner;
public class unaryoperation {
     public static void main(String[] args){
      int x = 5;
      boolean flag = true;
      System.out.println("x++ = "+(x++)); //5
      System.out.println(x);
      System.out.println("++x = "+(++x)); //7
      System.out.println("x-- = "+(x--)); //7
      System.out.println(x);
      System.out.println("--x = "+(--x)); //5
      System.out.println("!flag = "+(!flag));
     }
    
}
