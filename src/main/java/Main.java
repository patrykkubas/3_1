public class Main{

    public static void main(String[] args){
    choinka();
    System.out.println();
    System.out.println();
    trojp();
    }
      public static void choinka() {
          int wysokosc = 7;

          for (int i = 0; i < wysokosc; i++){
              for ( int j = 0; j < wysokosc - i - 1; j++){
                  System.out.print(" ");
              }
              for (int k = 0; k < (2 * i + 1); k++){
                  System.out.print("*");
              }
              System.out.println();
          }    
    }    
    public static void trojp() {
          int wysokosc = 7;

          for (int i = 0; i < wysokosc; i++){
              for ( int j = 0; j < wysokosc - i - 1; j++){
                  System.out.print(" ");
              }
              for (int k = 0; k <= i; k++) {
                  System.out.print("*");
              }
              System.out.println();
          }    
    }    
}

