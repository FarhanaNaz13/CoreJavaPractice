public class loopsPracticeBook{
    
     enum Season { spring, summer, fall, winter }  
     
    public static void main(String[] args){
        int limit = 20; 
        int sum=0;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int k=1;
          int z=1;
        
        
        
        
        for (int i = 1, j = 0; i <= limit; ++i) {
        sum += i;
        sum1 += i * j++;
        
       
        }
         System.out.println("the sum is " + sum);
         System.out.println("the sum is " + sum1);
         
         
          for(Season season : Season.values()) {       // Vary over all values    
            System.out.println(" The season is now " + season);
        }
        
        
          while(k <= limit) {   
                 sum2 += k++;                      
                  }    
                  System.out.println("sum-using while loop = " + sum2);
                  
                   do {   
                       sum3 += z;   
                          z++;                     
                             
                             } while(z <= limit); 
                                
                       System.out.println("sum-using do-while = "+ sum3);
    }


}

