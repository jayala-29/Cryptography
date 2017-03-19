public class SolveModEquations {

  public static void main(String[] args) {
  
    // x (cong) a1 (mod m1)
    // x (cong) a2 (mod m2)
    // solve for x
    
    int a1 = 1;
    int a2 = 11;
    
    int m1 = 13;
    int m2 = 23;
    
    int r1 = 0;
    int r2 = 0;
    
    // if you want to change the interval of evaluation for x
    // e.g. [0, 20] -> [20, 40]
    // rewrite the logic inside the for-condition to be
    // for (int x = 20; x < 40; x++)
    // to change to [a, b], rewrite as follows
    // for (int x = a; x < b; x++) 
    for (int x = 0; x < 20; x++) {
    
      r1 = (x - a1) % m1;
      r2 = (x - a2) % m2;
      
      if (r1 < 0) {
      
        r1 += m1;
      }
      
      if (r2 < 0) {
      
        r2 += m2;
      }
       
      System.out.println("(" + x + " - " + a1 + ") mod " + m1 + " = " + r1);
      System.out.println("(" + x + " - " + a2 + ") mod " + m2 + " = " + r2 + "\n");
      
      if (r1 == r2) {

        System.out.print("x = " + x);     
        return; 
      }
    }
    
    System.out.println("Try a bigger number for x.");
  }
}
