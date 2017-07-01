public class DecimalToBinary {
  public static void main (String[] args) {
    int n = 9;
    int i = 0;
    int[] arr = new int[16];
    while (n > 0) {
      arr[i] = n % 2;
      n /= 2;
      i++;
    }
    i--;
    while (i >= 0) { 
      System.out.print(arr[i]);
      i--;
    }
  }
}
