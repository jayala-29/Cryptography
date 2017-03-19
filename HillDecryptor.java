import java.util.Scanner;
public class HillDecryptor {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    // given matrix and message
    int[] matrix = {7, 6, 8, 7};
    char[] given = {'2', 'b', '9', 'h', 'u', 'c'};
    int[] converted = new int[given.length];
    char[] message = new char[given.length];
    int[] decrypt = new int[given.length];
    // maps the alphabet to indices
    char[] alphabet = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.'};
    // converts the letters to decrypt into their respective indices
    System.out.print ("Converted Letter/Number Indices: ");
    for (int i = 0; i < given.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        if (given[i] == alphabet[j]) {
          converted[i] = j;
          System.out.print (j + " ");
          break;
        }
      }
    }
    System.out.print ("\nWhat is the modulo inverse: ");
    int inv = input.nextInt();
    System.out.print ("Inverse Matrix: ");
    matrix[0] = matrix[3];
    matrix[3] = matrix[0];
    matrix[1] = -1 * matrix[1];
    matrix[2] = -1 * matrix[2];
    for (int i = 0; i < matrix.length; i++) {
      matrix[i] = (inv * matrix[i]) % alphabet.length;
      System.out.print (matrix[i] + " ");
    }
    // dont forget about the negative mods
    matrix[1] = 31;
    matrix[2] = 29;
    System.out.print ("\n\nMessage To Decrypt: \n");
    for (int i = 0; i < given.length/2; i++) {
      System.out.println (matrix[0] + " * " + converted[2*i] + " + " + matrix[1] + " * " + converted[((2*i)+1)] + " = " + (matrix[0] * converted[2*i] + matrix[1] * converted[((2*i)+1)]));
      decrypt[2*i] = (matrix[0] * converted[2*i] + matrix[1] * converted[((2*i)+1)]) % alphabet.length;
      System.out.println (matrix[2] + " * " + converted[2*i] + " + " + matrix[3] + " * " + converted[((2*i)+1)] + " = " + (matrix[2] * converted[2*i] + matrix[3] * converted[((2*i)+1)]));  
      decrypt[2*i + 1] = (matrix[2] * converted[2*i] + matrix[3] * converted[((2*i)+1)]) % alphabet.length;      
    }
    System.out.print ("\nNew Array: ");
    for (int i = 0; i < decrypt.length; i++) {
      System.out.print (decrypt[i] + " ");
    }
    System.out.print ("\nMessage: ");
    for (int i = 0; i < given.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        if (decrypt[i] == j) {
          message[i] = alphabet[j];
          System.out.print (message[i] + " ");
          break;
        }
      }
    }
  } 
}
