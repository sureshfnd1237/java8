package src;

public class RemoveCharactersFromString {
    public static void main(String[] args) {
        remove();
    }

    public static void remove(){
        String input = "Java is Awesome";
        String output = input.replaceAll("a", "");
        System.out.println(output);
    }
}
