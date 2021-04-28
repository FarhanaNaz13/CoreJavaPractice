public class ArraysPractiice{
    public static void main(String args[]){
        
        String[] cars ={"Volvo", "BMW", "Ford","Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars.length);
        
        cars[1] = "Axio";
        System.out.println(cars[1]);
        
        
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        
        for (String i : cars) {
        System.out.println(i); 
    }
    
    //multi-dimensional arrays
    
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    int x = myNumbers[1][2];
    System.out.println(x); 
    
    
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
    }
    
    
}
