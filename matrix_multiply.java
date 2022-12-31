
import java.util.*;
public class matrix_multiply
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows and columns of the first matrix");
       int r1=sc.nextInt();
       int c1=sc.nextInt();
       int a1[][]=new int[r1][c1];
        System.out.println("enter the values of the first matrix");
        int i,j,l,n;
        for(i=0;i<r1;i++)
        for(j=0;j<c1;j++)
        a1[i][j]=sc.nextInt();
        System.out.println("enter the number of rows and columns of the second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int a2[][]=new int[r2][c2];
         System.out.println("enter the values of the second matrix");
         for(i=0;i<r2;i++)
         for(j=0;j<c2;j++)
         a2[i][j]=sc.nextInt();
         if(c1!=r2)
         {
              System.out.println("multiplication not possible \n(m*n=n*p) not satisfied");
              System.exit(0);
            }
            int a3[][]=new int[r1][c2];
            for(i=0;i<r1;i++)
            {
                
               for(l=0;l<c2;l++)
                   {
                       int s=0;
                      for(j=0;j<r2;j++)
                      {
                          s=s+(a1[i][j]*a2[j][l]);
                        }
                        a3[i][l]=s;
                    }
                    }
                    for(i=0;i<r1;i++)
                    {
                    for(j=0;j<c2;j++)
                    {
                        System.out.print(a3[i][j]+"\t");
                        }
                        System.out.println();
                    }
                    }
                }