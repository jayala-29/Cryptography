public class VernamDecryptor {
  public static void main (String[] args) {
    // given vectors and values
    int[] uray = {3, 5, 3, 5, 3, 5};
    int[] vray = {16, 23, 18, 16, 23, 18};
    char[] given = {'m', 'j', 'z', 'w', 'l', 'r', 'x', 'f', 'v', 'i', 'u', 'y', 'x'};
    int[] converted = new int[given.length];
    int[] wray = new int[given.length];
    int[] message = new int[given.length];
    // maps the alphabet to indices
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    // converts the letters to decrypt into their respective indices
    System.out.print ("Converted Letter Indices: ");
    for (int i = 0; i < given.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        if (given[i] == alphabet[j]) {
          converted[i] = j;
          System.out.print (j + " ");
          break;
        }
      }
    }
    // add the u and v vectors together and store them in w
    System.out.print ("\n\nW Array without mod: ");
    for (int i = 0; i < wray.length; i++) {
      System.out.print (uray[i % uray.length] + vray[i % vray.length] + " ");
    }
    System.out.print ("\nW Array: ");
    for (int i = 0; i < wray.length; i++) {
      wray[i] = (uray[i % uray.length] + vray[i % vray.length]) % alphabet.length;
      System.out.print (wray[i] + " ");
    }
    System.out.print ("\n\nMessage: ");
    // get the character values and print the encrypted message
    for (int i = 0; i < wray.length; i++) {
      message[i] = (converted[i] - wray[i]) % alphabet.length;
      if (message[i] < 0) {
        message[i] = alphabet.length + message[i];
      }
      System.out.print(alphabet[message[i]] + " ");
    } 
  } 
}
