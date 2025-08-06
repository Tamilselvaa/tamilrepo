
import java.util.*;
public class rowclm {
    public static void main(String[]args1) {
        Scanner sc =new Scanner(System.in);
        System.out.println("row");
        int row=sc.nextInt();
        System.out.println("col");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i+j==2)
               {
                  System.out.println(a[i][j]+" ");
               } 
            }
            
        }
    }
}