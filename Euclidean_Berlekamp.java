public class Euclidean_Berlekamp {
  private static int length = 0;
  private static int gcd;
  private static int[] aArray = new int[100];
  private static int[] pArray = new int[100];
  private static int[] qArray = new int[100];
  public static void getGCD (int a, int b) {
    System.out.println (a + " = (" + b + " * " + (a / b) + ") + " + (a % b));
    aArray[length] = (a / b);
    length++;
    if ((a % b) != 0) {
      getGCD (b, (a % b));
    }
    else {
      System.out.println ("\nGCD: " + b + "\n");
      gcd = b;
    }
  }
  public static void addToPArray (int a) {
    pArray[0] = 0;
    pArray[1] = 1;
    for (int i = 0; i < length; i++) {
      pArray[i+2] = aArray[i] * pArray[i+1] + pArray[i];
      System.out.println ("p" + i + " = (" + aArray[i] + " * " + pArray[i+1] + ") + " + pArray[i] + " = " + pArray[i+2]);
      if (i == (length - 1)) {
        System.out.print ("\n");
      }
    }
  }
  public static void addToQArray (int a) {
    qArray[0] = 1;
    qArray[1] = 0;
    for (int i = 0; i < length; i++) {
      qArray[i+2] = aArray[i] * qArray[i+1] + qArray[i];
      System.out.println ("q" + i + " = (" + aArray[i] + " * " + qArray[i+1] + ") + " + qArray[i] + " = " + qArray[i+2]);
      if (i == (length - 1)) {
        System.out.print ("\n");
      }
    }
  }  
  public static void main (String[] args) {
    int a = 109; // go ahead and change the 'a' and 'b' values to match what you want to output
    int b = 17;
    int k = -1;
    System.out.println ("Euclidean Algorithm Result\n--------------------------");
    getGCD (a, b);
    for (int i = 0; i < length; i++) {
      System.out.println ("a" + i + " = " + aArray[i]);
    }
    System.out.println ("\nBerlekamp Algorithm Result\n--------------------------");
    addToPArray (aArray[0]);
    addToQArray (aArray[0]);
    for (int i = 0; i < length; i++) {
      k = -1 * k;
    }
    System.out.println ("Linear Combination: (" + b + " * " + pArray[length] + ") - (" + a + " * " + qArray[length] + ") = " + (k * gcd));
    System.out.println ("If the result is -1, make sure to take it into account for the final result.");
    System.out.print ("-1 implies: -p4 mod p = p - p4");
  }
}
