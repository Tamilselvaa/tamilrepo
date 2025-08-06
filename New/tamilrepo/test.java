package tamilrepo;
import java.util.*;
public class test {
 	public static void main(String[] args) {
 		// TODO Auto-generated method stub

            Scanner sc = new Scanner(System.in);
            int mark=sc.nextInt();
            if(mark>75)
            {
 	        System.out.print("Mark 75 : " + ("C"));
 	        }
            else if(mark>90) {
 	        System.out.print("Mark 90: " + ("A"));
 	        }
            else if(mark>80){
 	        System.out.print("Mark 80: "+ ("B"));
 	        }
            else if(mark>50)
            {
 	        System.out.print("Mark 50: " + ("d"));
 
 	        }
            else {
            System.out.println("Mark 45:" + ("fail"));
            }
        }
     }