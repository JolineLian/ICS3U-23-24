package lesson2;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("Alphabet Soup");        // s1 was created using a constructor
        String s2 = "Happy";                                    // s2 was created using not a constructor "String Literal"


        int strLength = s1.length();
        System.out.println(s1 + " has a length of " + strLength);
    }
}
