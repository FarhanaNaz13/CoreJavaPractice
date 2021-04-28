
public class MatchStrings2 {
    public static void main(String[] args) {
        String string1 = "Too many";
        String string2 = " cooks";
        String string3 = "Too many cooks";

        string1+= string2;

        System.out.println("Test 1");
        System.out.println("string1: " + string1);
        System.out.println("string3: " + string3);

        if(string1.equals(string3))
            System.out.println("string1 and string3 point to the same string");
        else
            System.out.println("string1 and string3 dont point to the same string");



        string3 = "TOO many cooks";

        System.out.println("Test 2");
        System.out.println("string1: " + string1);
        System.out.println("string3: " + string3);

        if(string1.equals(string3))
            System.out.println("so strings are equal");
        else
            System.out.println("so strings are not equal");

        if(string1.equalsIgnoreCase(string3))
            System.out.println("so strings are equal");
        else
            System.out.println("so strings are not equal");

    }
}
