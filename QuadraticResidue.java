import java.util.Scanner;

public class QuadraticResidue {

  public static void main(String [] args) {
  
    int i = 1;
    int j = 1;
  
    Scanner input = new Scanner(System.in);
    
    while (true) {
      System.out.print("\nEnter the number whose quadratic residue modulo you want to see: ");
    
      int base = input.nextInt();

      while (i <= (base - 1) / 2) {
    
        int result = (i * i) % base;
    
        System.out.println (i + "^2: " + result);
      
        i++;
      }
      
      System.out.print("Anotha one? (n=0/y=1): "); 
      
      int user_result = input.nextInt();
      
      if (user_result != 1) {
      
        break;
      }
    }
  }
}
