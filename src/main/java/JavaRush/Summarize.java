package JavaRush;

import java.util.Scanner;

public class Summarize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var sum = 0;
        String result = "";
        var isEnter = false;
        final String enterValue = "ENTER";

        while (!isEnter) {
            isEnter = result.equals(enterValue);
            if (isEnter) {
                System.out.println(sum);
                break;
            }

            result = scanner.next();
            var convertion = 0;
            try {
                convertion = Integer.parseInt(result);
            } catch (NumberFormatException e) {
                convertion = 0;
            }

            sum += convertion;
        }
    }
}
