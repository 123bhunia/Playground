import java.util.Scanner;
class Main{
    public static void main(String args[]){
      int i;
        Scanner in= new Scanner(System.in);
      int arr_size= in.nextInt();
      int arr[] = new int[arr_size];
      for( i=0; i<arr_size; i++)
      {
       arr[i]=in.nextInt();
      }
      int search_elem1=in.nextInt();
       int search_elem2=in.nextInt();
      int is_matched1=-1;
       int is_matched2=-1;
      for( i=0; i< arr_size; i++)
      {
        if(search_elem1==arr[i])
        {
          is_matched1=i;
        }
        if(search_elem2==arr[i])
        {
          is_matched2=i;
        break;  
        }
        
      }
      
         System.out.println(is_matched1);
       System.out.println(is_matched2);
      
      
    }
}