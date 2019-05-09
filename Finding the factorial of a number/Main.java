import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    factorial(n);
    System.out.println( factorial(n));
    
  }
  static int factorial(int x)
  {
    if(x==0)
      return 1;
    else
    return (x*factorial(x-1));
  }
}