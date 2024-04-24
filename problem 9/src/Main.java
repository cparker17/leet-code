import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer input = 1222;
        String numForward = input.toString();
        String numBackward = "";

        for(int i = numForward.length() - 1; i >= 0; i--) {
            numBackward += numForward.charAt(i);
        }

        System.out.println(numBackward.equals(numForward));




    }
}