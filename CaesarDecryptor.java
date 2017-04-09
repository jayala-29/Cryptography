import java.util.Scanner;
import java.lang.StringBuilder;
public class CaesarDecryptor {
  public static void main(String[] args) {
    StringBuilder decryptedMessage = new StringBuilder();
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a message to decrypt: ");
    String message = input.nextLine();
    System.out.print("Please enter the letter key from the encryptor: ");
    String key = input.nextLine();
    message = message.toLowerCase();
    key = key.toLowerCase();
    for(int i = 0; i < message.length(); i++) {
      if (message.charAt(i) == ' ') {
        decryptedMessage.append(" ");
      }
      else {
        char c = (char) (((message.charAt(i) - 97 - (key.charAt(0) - 97)) % 26) + 97);
        decryptedMessage.append(String.valueOf(c));
      }
    }
    System.out.print("Decrypted message: " + decryptedMessage);
  }
}
