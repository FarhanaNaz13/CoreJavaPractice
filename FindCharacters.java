public class FindCharacters {
   
    public static void main(String[] args) {

          String text = " To be or not to be, that is the question; " + " Whether ‘tis nobler in the mind to suffer" +
           " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles," +
                "and by opposing end them?";

        int andcount =0;
        int thecount =0;

        int index =-1;

        String andStr = "and";
        String theStr = "the";

        index = text.indexOf(andStr);

        while (index >=0)
        {
            andcount++;
            index += andStr.length();
            index = text.indexOf(andStr , index);
        }

        index = text.lastIndexOf(theStr);

        while (index >=0)
        {
            thecount++;
            index -= theStr.length();
            index = text.lastIndexOf(theStr , index);
        }

        System.out.println("text contains " + andcount + " ands");
        System.out.println("text contains" + thecount + " thes");



    }
}

