package assignmentDay6;

import java.util.Scanner;

public class Febbonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");

		Scanner s=new Scanner(System.in);

		int first=0;
		int second=1;
		int num=s.nextInt();
		s.close();
		int count;
		int sum;
		for(int i=0;i<num;i++) {
			count=first+second;
			System.out.println(count);
			first=second;
			second=count;
		}

	}

}
