import java.util.Scanner;
public class SymmetricMatrixProgram
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
  System.out.println("Enter the no.of rows:");
  int rows = sc.nextInt();
  System.out.println("Enter the no.of columns:");
  int cols = sc.nextInt();
  int matric[][]=new int[rows][cols];
  System.out.println("Enter the elements");
  for(int i=0;i<rows;i++)
   for(int j=0;j<cols;j++)
     matric[i][j]=sc.nextInt();
     sc.close();
     System.out.println("printing the input matrix");
     for(int i=0;i<rows;i++)
     {
       for(int j=0;j<cols;j++)
       System.out.print(matric[i][j]+"\t");
       System.out.println();
     }
    if(rows!=cols)
      System.out.println("The  given matrix is not a square matrix");
    else
    {
      boolean symmetric=true;
      for(int i=0;i<rows;i++)
       for(int j=0;j<cols;j++)
        if(matric[i][j]!=matric[j][i])
        {
          symmetric=false;
          break;
        }
       if(symmetric)
       {
         System.out.println("The given matrix is symmetric.....");
       }
       else
      {
         System.out.println("The matrix is not symmetric....... ");
       }
      }
     }
    }    