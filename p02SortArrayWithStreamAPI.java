import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p02SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine1 = scan.nextLine();    // array of integer
        String inputLine2 = scan.nextLine();    // sorting order
        List<Integer> integersArray = new ArrayList<Integer>();     // arrayList of integers
        String[] tempLine1 = inputLine1.split(" ");
        for (String s : tempLine1) {
            integersArray.add(Integer.parseInt(s));

        }

        if (inputLine2.toLowerCase().substring(0, 2).equals("as")) {
            integersArray.stream().sorted((num1, num2) -> Integer.compare(num1, num2)).
                    forEach(num -> System.out.print(num + " "));
        } else {
            integersArray.stream().sorted((num1, num2) -> Integer.compare(num2, num1)).
                    forEach(num -> System.out.print(num + " "));
        }
    }
}
