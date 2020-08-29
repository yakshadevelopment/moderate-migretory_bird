package java8.mod.migretoryBird;
import java.util.Scanner;

public class Main {
	public static int countTotalBirds(int rowNumber)
	{
		if(rowNumber==1)
			return 1;
		else
		{
		int row=0;
		int row1=1;
		int row2=2;
		int totalBirds=row1+row2;
		rowNumber=rowNumber-2;
		while(row<rowNumber)
		{
		 int total=row1+row2;
		 totalBirds=totalBirds+total;
		 row1=row2;
		 row2=total;
		 row++;
		}
		return totalBirds; 
		}
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total number of rows.");
        int rowNumber=scanner.nextInt();
        System.out.println(countTotalBirds(rowNumber));
	}
}
