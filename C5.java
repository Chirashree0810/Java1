import java.util.Scanner;//to import the Scanner class
public class C5{
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);//to convert string to integer
        int[][] matrix1=new int[N][N];
	int[][] matrix2=new int[N][N];
	Scanner scanner = new Scanner(System.in);// read the elements of the matrices,Scanner is a class,scanner is method
	System.out.println("Enter the elements of the first matrix:");
	for (int i=0;i<N;i++){
	     for(int j=0;j<N;j++){
		matrix1[i][j]=scanner.nextInt();}}
	System.out.println("Enter the elements of the second matrix:");
	for (int i=0;i<N;i++){
	     for(int j=0;j<N;j++){
		matrix2[i][j]=scanner.nextInt();}}
	int[][] sumMatrix=new int[N][N];// create new matrix to store the sum
	for (int i=0;i<N;i++){
	     for(int j=0;j<N;j++){
		sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];}}
	System.out.println("the sum of the two matrices is:");
	    for (int i=0;i<N;i++){
	        for(int j=0;j<N;j++){
		    System.out.print(sumMatrix[i][j] +" ");
                 }
		 System.out.println();
		}
	}
}



	

