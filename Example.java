import java.util.*;
public class Example {
	public static int[][] createTwoDArray(int size){
		Scanner input=new Scanner(System.in);
		int[][] marks=new int[size][];
		for (int i = 0; i < marks.length; i++){
			System.out.print("Input no of subjects for student "+(i+1)+" : ");
			int s=input.nextInt();
			marks[i]=new int[s];
		}
		return marks;
	}
	public static void readMarks(int[][] x){
		Random r=new Random();
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x[i].length; j++){
				x[i][j]=r.nextInt(101);
			}
		}		
	}
	public static void printMarks(int[][] f){
		for(int i=0; i<f.length; i++){
			for(int j=0; j<f[i].length; j++){
				System.out.print(f[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		
		int[][] marks=createTwoDArray(N);
		
	
		readMarks(marks);
		
	
		printMarks(marks);
    }
}
