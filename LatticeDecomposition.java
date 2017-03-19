import java.lang.Math;

public class LatticeDecomposition {

  private static int iteration = 1;
  private static long t = 1;
  private static long[] v1 = new long[4];
  private static long[] v2 = new long[4];
  
  public static void main (String[] args) {
  
    double magnitude1;
    double magnitude2;
    double upper_product;
    double lower_product;
  
    // first vector initialization
    v1[0] = 51;
    v1[1] = 50;
    
    // second vector initialization
    v2[0] = 64;
    v2[1] = 63;
    
    // make duplicates just in case we need to swap
    v1[2] = 51;
    v1[3] = 50;
    v2[2] = 64;
    v2[3] = 63;
    
    // we iterate until t is zero
    while (t != 0) {
    
      System.out.println ("Iteration " + iteration + "\n------------");
      
      // compute the magnitudes of v1 and v2
      magnitude1 = Math.sqrt (v1[0] * v1[0] + v1[1] * v1[1]);
      magnitude2 = Math.sqrt (v2[0] * v2[0] + v2[1] * v2[1]);
      
      System.out.println ("Magnitude of v1: " + magnitude1 + " Magnitude of v2: " + magnitude2);
      
      // if magnitude1 is greater than magnitude2, then we swap the vectors
      if (magnitude1 > magnitude2) {
      
        v1[0] = v2[2];
        v1[1] = v2[3];
        v2[0] = v1[2];
        v2[1] = v1[3];
        
        v1[2] = v1[0];
        v1[3] = v1[1];
        v2[2] = v2[0];
        v2[3] = v2[1];
        
        System.out.println ("New v1: (" + v1[0] + ", " + v1[1] + ") New v2: (" + v2[0] + ", " + v2[1] + ")");
      }
      
      // compute t 
      upper_product = (v2[0] * v1[0]) + (v2[1] * v1[1]);
      lower_product = (v1[0] * v1[0]) + (v1[1] * v1[1]);
      
      if (Math.abs (upper_product / lower_product) > 0.5) {
      
        t = Math.round (upper_product / lower_product);
      }
      
      else {
      
        t = 0;
      }
      
      System.out.println ("v2 * v1 = " + upper_product + " v1 * v1 = " + lower_product);
      
      System.out.println ("t = " + t);
      
      // update v2
      v2[0] = v2[0] - t * v1[0];
      v2[1] = v2[1] - t * v1[1];
      v2[2] = v2[0];
      v2[3] = v2[1];
      
      System.out.println ("New v2: (" + v2[0] + ", " + v2[1] + ")");
      
      // increment iteration and continue if necessary
      iteration++;
      System.out.println ("\n");
    }
  }
}
