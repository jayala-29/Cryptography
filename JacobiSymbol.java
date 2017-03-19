public class JacobiSymbol {

  public static boolean checkMod(int a, int p) {
  
    // change range of x if necessary
    for (int x = 1; x < 20; x++) {
      
      System.out.println (a + " - " + x + "^2 mod " + p + " = " + ((a - x * x) % p));
      
      if ((a - x * x) % p == 0) {
      
        return true;
      }
    }
    
    return false;
  }

  public static void main(String[] args) {
  
    // change 'a' and 'p' here
    int a = 9;
    int p = 97;
    
    int mod = a % p;
    
    if (checkMod(a, p) == true || p == 1) {
    
      System.out.print("1");
    }
    
    else if (mod == 0) {
    
      System.out.print("0");
    }
    
    else {
    
      System.out.print("-1");
    }
  }
}
