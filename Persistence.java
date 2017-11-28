public class Persistence {
  public static void main(String[] args) {
    String number = String.valueOf(39); // number to obtain persistence of
    int persistence = 0;
    while (true) {
      char[] digits = number.toCharArray();
      int new_number = 1;
      for (int i = 0; i < digits.length; i++) {
        new_number *= Character.getNumericValue(digits[i]);
      }
      number = String.valueOf(new_number);
      persistence++;
      if (new_number < 10) { 
        break;
      }
    }
    System.out.print(persistence);
  }
}
