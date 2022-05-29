import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Task 1: Word a10n (abbreviation)
        
        System.out.println("Task 1: Word a10n (abbreviation)");
        System.out.println("Введите несколько слов через пробел");
        Scanner sc1 = new Scanner(System.in);
        String s = sc1.nextLine();
        System.out.println("Аббривиатуры слов из вашей строки:");
        System.out.println(Abbreviator.abbreviate(s));
        System.out.println();
        
        // Task 2: Triangular Treasure
        
        System.out.println("Task 2: Triangular Treasure");
        System.out.println("Введите целое число n");
        long n = sc.nextLong();
        System.out.println("n-ое треугольное число:");
        System.out.println(Triangular.triangular(n));
    }
    
    // Task 1: Word a10n (abbreviation)
    
    public static class Abbreviator 
    {
      public static String abbreviate(String string) 
      {
        String[] words = string.split(" ");
        String res = "";
        String s = "";
        for(int i = 0; i < words.length; i++) 
        {
          s = words[i];
          if (res != "") res += " ";
          res += s.charAt(0);
          res += (s.length() - 2) ;
          res += s.charAt(s.length() - 1);
        }
        return res;
      }
    }
    
    // Task 2: Triangular Treasure
    
    public static class Triangular 
    {
        public static long triangular(long n) 
        {
            if (n <= 0) return 0;
            return(n*(n+1)/2);
        }
    }
  
}
