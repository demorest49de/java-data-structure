package JavaRush;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean glassIsFull = scanner.nextBoolean();
        if (glassIsFull) {
            System.out.println(Math.ceil(glass));
        } else {
            System.out.println(Math.floor(glass));
        }
    }
}
