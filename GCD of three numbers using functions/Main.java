import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    int a,b,c,g;
    
     Scanner in = new Scanner(System.in);
 
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    g=gcd(gcd(a,b),c);
     System.out.println(g);
    
}

public static int gcd(int a, int b)
{
    int t;
    
    while(b!=0)
    {
        t = b;
        b = a%b;
        a = t;
    } 
    
    return a;
}

}