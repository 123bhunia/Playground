import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    sum(n);
    System.out.println(sum(n));
    
  }
  static int sum(int x)
  {
    if(x==0)
      return 0;
    else
    return (x+sum(x-1));
  }
}