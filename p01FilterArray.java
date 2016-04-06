import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class p01FilterArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();

        //System.out.println(inputStr);
        List<String> str = Arrays.asList(inputStr.split(" "));


        str.stream().filter(p -> p.length() > 3).forEach(System.out::println);
    }
}

