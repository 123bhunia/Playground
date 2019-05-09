import java.util.Scanner;
class Main
{
   public static int square(int m)
   {
      int sq=m*m; 
      return sq;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sq1 = square(n);
     System.out.println(sq1); //result printed here
   }
}
