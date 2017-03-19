public class JacobiSymbol {

  public static boolean checkMod(int a, int p) {
  
    for (int i = 1; i < 1000; i++) {
    
      if ((a - i * i) % p == 0) {
      
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
