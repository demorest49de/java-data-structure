package JavaRush;

import java.util.Scanner;

public class Минимумизвведенныхчисел {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = console.nextInt();
        int secondMin = console.nextInt();

        if (min > secondMin) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }

        while (console.hasNextInt()) {
            int x = console.nextInt();

            if (min == secondMin) {
                if (x < min) {
                    min = x;
                } else {
                    secondMin = x;
                }
            } else if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}
