package JavaRush;

import java.util.Scanner;

public class Показываемчтополучаем {
    public static void main(String[] args) {
        final int hundred = 100;
        int counter = 0;
        int sum = 0;

        while (counter < hundred) {

            counter++;
            if (counter % 3 == 0) {
                continue;
            }
            sum += counter;
        }
        System.out.println(sum);
    }
}
