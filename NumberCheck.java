public class NumberCheck { 
    
     public static void main(String[] args) {  
          
           int number = 0;    
           
           number = 1+(int)(100*Math.random());    // Get a random integer between 1 & 100   
            
            if(number%2 == 0) {                 // Test if it is even    
         
             System.out.println("You have got an even number, " + number);   // It’s even  
            
            
          }else {      
         
             System.out.println("You have got an odd number, "+ number);     // It’s odd   
     
     
     
     
     }
     //nested if
        int num = 0;    
           
           num= 1+(int)(100*Math.random()); 
        if(num%2 == 0) { 
         
                                         // Test if it is even  
         if(num< 50) {  
                  
                                        // Output a message if number is < 50   
         System.out.println("You have got an even number < 50, " + num); 
         
          }
          
        
       } 
         else {  
         System.out.println("You have got an odd number, " + num);   // It is odd
         
         }
         
         //lettercheck
         
        
         char symbol = 'A';   
       
        symbol = (char)(128.0*Math.random());        // Generate a random character   
         
         if(symbol >= 'A') {                          // Is it A or greater?  
               
                 if(symbol <= 'Z') {                        // yes, and is it Z or less?        // Then it is a capital letter      
            
            System.out.println("You have the capital letter " + symbol);   
            
             } 
             
             else {                                     // It is not Z or less       
                 
                  if(symbol >= 'a') {                      // So is it a or greater?       
                      
                         if(symbol <= 'z') {                 // Yes, so is it z or less?      
                                                             // Then it is a small letter    
                                     
                                      System.out.println("You have the small letter " + symbol);        
                                      
                                }
                                    
                                     else {                                          // It is not less than z        
                                                System.out.println("The code is greater than a but it’s not a letter");      
                                                   
                                                   }  
                                                       } 
                                                       
                                                     
                                          else {         
                                                           
                                                     System.out.println("The code is less than a and it’s not a letter");     
                                                              
                                                  }   
                                                        
                                                } 
                                                                  
                                                                  
                                            } 
                                                 else {
                                                            
                                                       System.out.println("The code is less than A so it’s not a letter");   
                                                       
                                            }  
                         //logical AND operators
                            
                             char sym = 'A';   
                              
                              sym= (char)(128.0*Math.random());        // Generate a random character   
                              
                               if(sym >= 'A' && sym <= 'Z') {       // Is it a capital letter     
                                   
                                    System.out.println("You have the capital letter "+ sym);    
                                    } else {     
                                        
                                         if(sym >= 'a'&& sym <= 'z') {    // or is it a small letter?     
                                         
                                           System.out.println("You have the small letter " + sym);     
                                          
                                          
                                            } else {                                  // It is not less than z      
                                           
                                           System.out.println("The code is not a letter");  
                                               }  
                                               
                                                 }                              
     
     
    }
       
}
