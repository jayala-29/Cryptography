public class BinaryAddition4bits {

  public static void main(String[] args) {
  
    int[] operand1 = {1, 0, 1, 1};
    int[] operand2 = {1, 0, 1, 0};
    int length = operand1.length;
    int[] carry = {0, 0, 0, 0};
    int[] result = {0, 0, 0, 0, 0};
    
    if (operand1[length-1] == 1 && operand2[length-1] == 1) {
    
      carry[length] = 1;
    }
    
    if ((operand1[length-1] == 0 && operand2[length-1] == 1) || (operand1[length-1] == 1 && operand2[length-1] == 0)) {
    
      result[length] = 1;
    }
    
    for (int i = 2; i >= 0; i--) {
    
      if (operand1[i] == 1 && operand2[i] == 1 && carry[i+1] == 1) {
      
        result[i+1] = 1;
        carry[i] = 1;
      }
      
      else if (operand1[i] == 1 && operand2[i] == 1 && carry[i+1] == 0) {
      
        result[i+1] = 0;
        carry[i] = 1;
      }
      
      else if ((operand1[i] == 0 && operand2[i] == 1) || (operand1[i] == 1 && operand2[i] == 0) || (operand1[i] == 0 && operand2[i] == 0 && carry[i+1] == 1)) {
    
        result[i+1] = 1;
      }
    }
    
    if (carry[0] == 1) {
    
      result[0] = 1;
    }
    
    for (int i = 0; i < length; i++) {
    
      System.out.print(operand1[i]);
    }
    
    System.out.print("\n   +");
    
    for (int i = 0; i < length; i++) {
    
      System.out.print(operand2[i]);
    }
    
    System.out.print("\n");
    
    for (int i = 0; i < result.length; i++) {
    
      System.out.print(result[i]);
    }
  }
}
