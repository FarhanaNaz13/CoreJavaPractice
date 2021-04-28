public class loopsPractice {
  public static void main(String[] args) {
    int x = 20;
    int y = 18;
    if (x > y) {
      System.out.println("x is greater than y");
    }  
    
    
    
    int time = 25;
    if (time < 15) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    } 
    
    
    int time2 = 24;
    if (time2 < 10) {
      System.out.println("Good morning.");
    } else if (time2 < 18) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
    
    //Ternary operator(short-hand if-else)
    System.out.println("............Ternary operator");
    
    int time3 = 20;
    String result;
    result = (time3 < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
    
    
    //Switch case
    System.out.println("..........Switch case");
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }
    //while
    System.out.println("...........while");
    
   int p = 0;
     while (p < 5) {
      System.out.println(p);
         p++;
}

    //do-while
   System.out.println("do.......while");
    int k = 7;
            do {
      System.out.println(k);
      k++;
    }
        while (k < 15);
        
    System.out.println("......FOR LOOP");
        for (int z = 0; z <= 10; z = z + 2) {
          System.out.println(z);
        }
        
        System.out.println("......FOR LOOP with break-continue statement");

    for (int t = 0; t < 10; t++) {
      if (t == 4) {
       break;
   }
        System.out.println(t);
  }
  
    for (int i1 = 0; i1 < 10; i1++) {
        if (i1 == 4) {
          continue;
    }
           System.out.println(i1);
 }
 
 System.out.println("......while LOOP with break-continue statement");
 
   int i2 = 0;
    while (i2 < 10) {
     System.out.println(i2);
       i2++;
     if (i2 == 4) {
       break;
  }
  
     int i3 = 0;
      while (i3 < 10) {
        if (i3 == 4) {
          i3++;
          continue;
     }
         System.out.println(i3);
           i3++;

    }

  }
  
  
  }
}
