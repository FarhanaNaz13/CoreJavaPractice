public class StringTokenizing {
    
    public static void main(String[] args) {
        
        String text = "To be or not to be, that is the question.";
        
        String delimiters = "[, .]";
        
        int[] limits = {0,-1};

        for(int limit:limits)
        {
            System.out.println("Limits: " + limit);
           
            String[] tokens = text.split(delimiters, limit);
            
            System.out.println("Number of tokens: " + tokens.length);
            
            for(String token:tokens)
            {
                System.out.println(token);
            }
        }

    }
}

