import java.util.Scanner;
class Vowel
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enterr any character=");
      char ch=sc.next().charAt(0);
      switch (ch)
        {
          case'a':
            case'A':
            case'e': 
            case'E':
            case'i': 
            case'I':
            case'o': 
            case'O':
            case'u': 
            case'U':
          System.out.println(ch+"  is vowel");
          break;
          default:
          System.out.println(ch+" is consonant");
        }
      }
  }