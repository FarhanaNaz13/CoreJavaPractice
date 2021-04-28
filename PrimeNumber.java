
import java.util.Scanner;  

public class PrimeNumber{
	
    public static void main(String[] args){
		
         System.out.println("prime numbers between 1 to 50: ");
		
        for(int i=1; i<=50; i++){
			
            boolean isPrime= true;
			
            if(i == 1)
				isPrime=false;
			
            for(int j=2; j<i; j++){
				
                if(i%j==0){
				
                isPrime= false;
                
				}
			}
			
			if(isPrime == true){
               
				
                System.out.println(i);
		}
			
		}
		
         int nValues = 100; 
           System.out.println("prime numbers between 1 to 100 using outerloop: ");
          OuterLoop:   
          
           for(int i = 2; i <= nValues; ++i) {  
               
               for(int j = 2; j < i; ++j) {     
                    
                      if(i%j == 0) {                     
                     
                      continue OuterLoop;         
                           
                             }  
                                }
                                 System.out.println(i); 
                             }
                             
                              System.out.println("prime numbers infinte");
                             
                             //infinite
                             
                             int nPrimes = 50;                    
                               
                                OuterLoop:
                                
                                   for(int k= 2 ; ; ++k) {          
                                              
                                              for(int z = 2; z < k; ++z) {   
                                                   
                                                    if(k% z== 0) {                  
                                                    
                                                    continue OuterLoop;        
                                                     
                                                        }     
                                                       
                                                        }     
                                                             System.out.println(k);               
                                                                if(--nPrimes == 0) {               
                                                                         break   ;                
                                                                           }   
                                                                 }
                             
                             
         
         //using scanner
         
                   Scanner s = new Scanner(System.in);  
                   System.out.print("Enter a number : ");  
                   int n = s.nextInt();  
                   if (isPrime(n)) {  
                       System.out.println(n + " is a prime number");  
                   } else {  
                       System.out.println(n + " is not a prime number");  
                   }  
               }  
          
                   public static boolean isPrime(int n) {  
                       if (n <= 1) {  
                           return false;  
                       }  
                       for (int i = 2; i < Math.sqrt(n); i++) {  
                           if (n % i == 0) {  
                               return false;  
                           }  
                       }  
                       return true;  
               
	}
}

