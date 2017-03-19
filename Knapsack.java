import java.util.Scanner;

public class Knapsack {
  private static int length = 0;
  private static int gcd;
  private static int C = 61;
  private static int[] aArray = new int[100];
  private static int[] pArray = new int[100];
  private static int[] qArray = new int[100];
  private static int[] sequence = {2, 5, 8, 21, 40};
  public static int getGCD (int a, int b, int c) {
    System.out.println (a + " = (" + b + " * " + (a / b) + ") + " + (a % b));  
    if (c == 1) {
      return (a % b);
    }
    aArray[length] = (a / b);
    length++;
    if ((a % b) != 0) {      
      getGCD (b, (a % b), 0);
    }
    else {
      System.out.println ("\nGCD: " + b + "\n");
      gcd = b;
    }
    return 0;
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
    int p = 79;
    int a = 16;
    int d = 0;
    int k = -1;
    Scanner input = new Scanner(System.in);
    System.out.println ("Euclidean Algorithm Result\n--------------------------");
    getGCD (p, a, 0);
    for (int i = 0; i < length; i++) {
      System.out.println ("a" + i + " = " + aArray[i]);
    }
    System.out.println ("\nBerlekamp Algorithm Result\n--------------------------");
    addToPArray (aArray[0]);
    addToQArray (aArray[0]);
    for (int i = 0; i < length; i++) {
      k = -1 * k;
    }
    System.out.println ("Linear Combination: (" + a + " * " + pArray[length] + ") - (" + p + " * " + qArray[length] + ") = " + (k * gcd) + "\n");
    System.out.print ("What is the modulo inverse: ");
    int inv = input.nextInt();
    int M = (inv * C) % p;
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] > M) {
        if (i == 0) {
          d = getGCD (M, sequence[i], 1);
        }
        else {
          d = getGCD (M, sequence[i-1], 1);
        }
        break;
      }
      if (i == sequence.length - 1) {
        d = getGCD (M, sequence[i], 1);
      }
    }
  }
}
