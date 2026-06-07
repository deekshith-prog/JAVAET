package Day04;

public class RemoveUnevenSpaces {
    public static void main(String[] args) {
        String input="     I     love coding    ";
        String output=input.replaceAll("\\s+", " ").trim();
        System.out.println(output);
    }

}

