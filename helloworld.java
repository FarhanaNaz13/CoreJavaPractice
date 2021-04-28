public class helloworld{
public static void main(String args[]){
System.out.print("hello world");

System.out.print("Widening casting is done automatically when passing a smaller size type to a larger size type:");
int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      
    System.out.println(myDouble);  
    
    System.out.print("Narrowing casting must be done manually by placing the type in parentheses in front of the value:");
    double myDouble1 = 9.78;
    int myInt1 = (int) myDouble1; // Manual casting: double to int

    System.out.println(myDouble1);   
    System.out.println(myInt1);      
}
}
