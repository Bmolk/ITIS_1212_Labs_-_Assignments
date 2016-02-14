/* Lab 11, Part D: Created by Celine Latulipe  */  
public class Lab11PartD {   
  public static void main(String [] args) 
  {   
    final int NUM_COLS = 5;
    final int NUM_ROWS = 9;
    String[][] truthTable = new String[NUM_ROWS][NUM_COLS];
    
    // fill in the first (header) row
    truthTable[0][0] = "  x";
    truthTable[0][1] = "  y";
    truthTable[0][2] = "  z";
    truthTable[0][3] = "   Condition";
    truthTable[0][4] = "     Result";
    
    // fill in the x, y, z and condition values, make the last column blank
    for (int i = 1; i < NUM_ROWS; i++) {
      // fill in the x values
      if ((i-1)/4 == 0) {
        truthTable[i][0] = "false";
      } else {
        truthTable[i][0] = "true";
      }
      // fill in the y values
      if ((i-1)%4 == 0 || (i-1)%4 == 1) {
        truthTable[i][1] = "false";
      } else {
        truthTable[i][1] = "true";
      }
      // fill in the z values
      if ((i-1)%2 == 0) {
        truthTable[i][2] = "false";
      } else {
        truthTable[i][2] = "true";
      }
      // copy condition
      truthTable[i][3] = "!(x && (y || z))";
      truthTable[i][4] = "";
    }
    
    // fill in values below and uncomment
    truthTable[1][4] = "True";
    truthTable[2][4] = "True";
    truthTable[3][4] = "True";
    truthTable[4][4] = "True";
    truthTable[5][4] = "True";
    truthTable[6][4] = "False";
    truthTable[7][4] = "False";
    truthTable[8][4] = "False";
    // Don't touch this code, it just prints out the 2D array
    for (int i = 0; i < NUM_ROWS; i++) {
      for (int j = 0; j < NUM_COLS; j++) {
        System.out.print(truthTable[i][j] + "\t");
      }
      System.out.println();
    }
    
  } 
}  