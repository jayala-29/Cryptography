import java.util.*;
public class Squarefree {
  public static List<Integer> prime_factors (int num) {
    int n = num;
    List<Integer> factors = new ArrayList<Integer>();
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    return factors;
  }
  public static boolean is_squarefree (int n) {
    List<Integer> factors = prime_factors (n);
    if (factors.size() != 1) {
      for (int i = 0; i < factors.size() - 1; i++) {
        if (factors.get(i) == factors.get(i+1))
          return false;
      }
    }
    return true;
  }
  public static void main (String[] args) {
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    for (int i = 0; i < num_list.length; i++) {
      if (is_squarefree (num_list[i]))
        System.out.println (num_list[i] + " is squarefree.");
    }
  }
}
