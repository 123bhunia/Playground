import java.util.Scanner; 
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat1[][] = new int[r][c];
    int mat2[][] = new int[r][c];
    int flag=0;
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        mat1[i][j] = in.nextInt();
         
      }
    }
     for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
       
         mat2[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i <= r - 1; i++)
    {
      for(int j = 0; j <=c-1; j++)
      {
        if(mat1[i][j]!=mat2[i][j])
        {
         flag=1;
          break;
        }
       
      }
    }
  
      if(flag==1)
      System.out.println("No");
      else
         System.out.println("Yes");
    
  }
}
