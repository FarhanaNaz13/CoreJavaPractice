public class UseStringBuffer {
    
    public static void main(String[] args) {
        
        StringBuffer sentence = new StringBuffer(20);

        System.out.println("capacity: " + sentence.capacity());
        System.out.println("Length: " + sentence.length());

        String[] words = {"Too", "many" ,"cooks" , "spoil", "the" , "broth"};
        sentence.append(words[0]);
        for(int i=1;i<words.length ;i++)
        {
            sentence.append(' ').append(words[i]);
        }

        System.out.println("The sentence is: " + sentence.toString());
        System.out.println("capacity: " + sentence.capacity());
        System.out.println("Length: " + sentence.length());

        sentence.insert(sentence.lastIndexOf("cooks")+4,"ie");
        sentence.insert(sentence.lastIndexOf("broth")+5,"er");

        System.out.println("The sentence is: " + sentence.toString());
        System.out.println("capacity: " + sentence.capacity());
        System.out.println("Length: " + sentence.length());

    }
}

