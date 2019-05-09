import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int row_no = 1 ; row_no <= n ; row_no++){
			//int num = col_no;
			for(int col_no =(n-(row_no - 1)); col_no >= 1; col_no--){
				System.out.print(col_no);
				int num =col_no;// = num - 1;
              num=num-1;
			}
			System.out.print("\n");
		}
	}
}