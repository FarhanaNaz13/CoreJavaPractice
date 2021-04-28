public class SequenceStrings {
   
    public static void main(String[] args) {
       
        String string1 = "A";
        String string2 = "To";
        String string3 = "Z";

        int result = string1.compareTo(string3);

        if(result < 0)
            System.out.println(string1 + " is less than "+ string3);
        else if(result>0)
            System.out.println(string3 + " is greater than "+ string1);
        else
            System.out.println(string1 + " is equal to " + string3);

        result = string2.compareTo(string1);

        if(result < 0)
            System.out.println(string2 + " is less than "+ string1);
        else if(result>0)
            System.out.println(string1 + " is greater than "+ string2);
        else
            System.out.println(string2 + " is equal to " + string1);

    }
}

