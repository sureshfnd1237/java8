package src;

public class TextBlocks {
    public static void main(String[] args) {
        textblock();
    }

    public static void textblock(){
        String s1 =
                "Hi\n"
                +"Hello\n"
                +"World\n"
                ;

        String s2= """
                Hi
                Hello
                How r you
                """;

        System.out.println(s1);
        System.out.println(s2);
    }
}
