import java.util.Scanner;

public class MatrixSolution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Matrix rows:");
        int M = scan.nextInt();
        System.out.println("Enter Matrix cols:");
        int N = scan.nextInt();
        int [][] mat=new int[M][N];

        enterMatrixData(scan,mat,M,N);
        printMatrix(mat);

        //QN 1.1
        System.out.println("input n for column to be printed:");
        printNthCoumn(scan.nextInt(),mat);

        //QN. 1.2
        System.out.println("input n for row to be printed:");
        printNthRow(scan.nextInt(),mat);

        //QN 1.3
        System.out.println("input i for quad to be printed:");
        System.out.println("input j for quad to be printed:");
        printNthQuad(scan.nextInt(),scan.nextInt(),mat);
    }
    public static void enterMatrixData(Scanner scan, int[][] mat, int matrixRow, int matrixCol){
        System.out.println("Enter Matrix Data");
        for (int i = 0; i < matrixRow; i++)
            for (int j = 0; j < matrixCol; j++)
                mat[i][j] = scan.nextInt();
    }

    public static void printMatrix(int[][] mat){
        System.out.println("Your Matrix is : ");

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println();
        }
    }

    public static void printNthCoumn(int n,int[][] mat){
        n=n-1;
        for (int i=0;i<mat[0].length;i++)
            System.out.print(mat[i][n]+"\n");
        System.out.println();
    }

    public static void printNthRow(int n,int[][] mat){
        n=n-1;
        for (int i=0;i<mat.length;i++)
            System.out.print(mat[n][i]+"\t");
        System.out.println();
    }

    public static void printNthQuad(int i,int j,int[][] mat){
        i=--i;j=--j;
       if (((i-1) < mat.length ) && ((j-1) < mat[0].length )){
           System.out.print(mat[i][j]+"\t");
           System.out.println(mat[i][j+1]);
           System.out.print(mat[i+1][j]+"\t");
           System.out.println(mat[i+1][j+1]);
       } else {
           System.out.println("Invalid Input for quad!!");
       }
    }

}
