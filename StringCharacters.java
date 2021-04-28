public class StringCharacters {
    
    public static void main(String[] args) {
        String text = " To be or not to be, that is the question; " + " Whether ‘tis nobler in the mind to suffer" +
           " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles," +
                "and by opposing end them?";

        int spaces=0, vowels =0 , letters=0;

        int textLength = text.length();

        for(int i=0;i<textLength;i++)
        {
            char ch =  Character.toLowerCase(text.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }

            if (Character.isLetter(ch))
                letters++;

            if(Character.isWhitespace(ch))
                spaces++;

        }

        System.out.println("vowels: "  + vowels);
        System.out.println("Consonants: "+ (letters-vowels));
        System.out.println("Spaces: " + spaces);

    }

}

