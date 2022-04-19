import java.util.Scanner;
class Reverseofnum{
  public static void main (String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value :");
    n=sc.nextInt();
    while(n!=0){
      int rem=n%10;
      n=n/10;
    }
    System.out.println(rem);
  }
}