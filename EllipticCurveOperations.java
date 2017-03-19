import java.util.Scanner;

public class EllipticCurveOperations {

  private static double[] p = new double[2];
  private static double[] q = new double[2];
  private static double[] result = new double[2];
  
  public static void main (String[] args) {
  
    Scanner input = new Scanner(System.in);
    
    // are we doing an addition and is it under modulo flags
    boolean addition = true;
    boolean modulo = true;
  
    // initialized during calculations
    double a = 0;
    double A = 10;
    double prime = 67;
    double x3;
    double y3;
  
    // initialization of points to be added together
    p[0] = 38;
    p[1] = 60;  
    q[0] = 59;
    q[1] = 63;
    
    // computations of a, x3, and y3
    if (addition == true) {
    
      if (modulo == false) {
      
        a = (q[1] - p[1]) / (q[0] - p[0]);
        System.out.println ("a = " + (q[1] - p[1]) + " / " + (q[0] - p[0]) + " = " + a);
      }
      
      else {
      
        System.out.print ("What is the inverse for " + (q[0] - p[0]) + " modulo " + prime + ": ");
        int inv = input.nextInt();
        
        a = ((q[1] - p[1]) * inv) % prime;
        System.out.println ("a = " + (q[1] - p[1]) + " * " + inv + " modulo " + prime + " = " + a);
      }
    }
    
    else {
      
      if (modulo == false) {
      
        a = (3 * p[0] * p[0] + A) / (2 * p[1]);
        System.out.println ("a = (3 * (" + p[0] + ")^2 + " + A + ") / " + (2 * p[1]) + " = " + a);
      }
      
      else {
      
        System.out.print ("What is the inverse for " + (2 * p[1]) + " modulo " + prime + ": ");
        int inv = input.nextInt();
        
        a = ((3 * p[0] * p[0] + A) * inv) % prime;
        System.out.println ("a = (3 * (" + p[0] + ")^2 + " + A + ") * " + inv + " = " + a);
      }
    }
    
    x3 = (a * a) - q[0] - p[0];
    System.out.println ("x3 = (" + a + ")^2 - " + q[0] + " - " + p[0] + " = " + x3);
    
    y3 = p[1] + (a * (x3 - p[0]));
    System.out.println ("y3 = " + p[1] + " + " + a + " * (" + x3 + " - " + p[0] + ") = " + y3);
    
    // results
    result[0] = x3;
    result[1] = -1 * y3;
    
    // prints out result with respect to operation performed
    if (addition == true) {
    
      if (modulo == false) {
      
        System.out.println ("P + Q = (" + result[0] + ", " + result[1] + ")");
      }
      
      else {
        
        System.out.println ("P + Q = (" + (result[0] % prime) + ", " + (result[1] % prime) + ")");
      }
    }
    
    else { 
      
      if (modulo == false) {
      
        System.out.println ("2P = (" + result[0] + ", " + result[1] + ")");
      }
      
      else {
      
        System.out.println ("2P = (" + (result[0] % prime) + ", " + (result[1] % prime) + ")");
      }
    }
    
    System.out.println ("\nif the modulo comes out negative, then do prime + neg_result");
  }
}
