import java.util.Scanner; 
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        mat[i][j] = in.nextInt();
      }
    }
    for(int x= 0; x <= r - 1; x++)
    {
      int i=0;
      int j=x;
      for(int y= j; y <=r-1; y++)
      {
        System.out.print(mat[i][j]+ " ");
        i++;
        j++;
      }
     
    }
  }
}