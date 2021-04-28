public class primes{
	
    public static void main(String[] args){
         
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
                             
        
        
}
}
