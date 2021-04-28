import java.io.IOException;

public class Fruit {
    
   public static void main(String[] args) {  
         // Declare and initialize three variables   
          int numOranges = 5;
          int numApples = 10;  
          int numFruit = 0;
          numFruit = numOranges + numApples; 
          System.out.println("A totally fruity program");
          System.out.println("Total fruit is " + numFruit);
          
          
         double numOrangesN = 50.0E-1;        // Initial value is 5.0 
         double numApplesN = 1.0E1;           // Initial value is 10.0  
         double averageFruit = 0.0; 
           
            averageFruit = (numOrangesN + numApplesN)/2.0;
              
         System.out.println("A totally fruity program");    
         System.out.println("Average fruit is "+ averageFruit);
          
          
          // Code to delay ending the program 
          System.out.println("(press Enter to exit)");
          try {    
                System.in.read();         
              } catch (IOException e) {         
              
                return;
            }
            

        }
}
