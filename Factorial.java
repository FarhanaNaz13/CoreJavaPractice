import java.util.*;

public class Factorial {
     
     public static void main(String[] args) {
         
         long limit = 20L;        
          
          long factorials = 1L;
          long factorial = 1L;
             
                                              
              
              for (long i = 1L; i <= limit; ++i) {    
                   
                    factorials = 1L;       
                   
                   for (long fact = 2; fact <= i; ++fact) {    
                          
                           factorials *= fact ;  
                           
                             }     
          System.out.println(i + "! is "+ factorials);  
          
          
            }
            
            OuterLoop:  
            
              for(long i = 1L; i <= limit; ++i) {  
                
                   factorial = 1;       
                        
                             for(long j = 2L; j <= i; ++j) {      
                                  
                                   if(i > 10L && i % 2L == 1L) {      
                                continue OuterLoop;        
                                }     
                          factorial *= j;  
                        }    
                  System.out.println(i + "! is " + factorial);   
                   
                   }
            
            
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        long num = input.nextLong();
          long i,fact1=1L;
          
          for(i=1L;i<=num;i++){    
              fact1=fact1*i;    
          }    
      System.out.println("Factorial of "+num+" is: "+fact1);    
     }  

     
     
     
     
    
}
