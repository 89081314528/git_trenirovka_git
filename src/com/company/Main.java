package com.company;
/**метод, который считает сумму
 *метод, который считает разность
 * метод, который считает произведение
 * посчитать сумму 4949494 и 49494 и распечатать
 * посчитать разность 9299292 и 92929
 * посчитать произведение 93993939 и 9399393
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(sum(4949494, 49494));
        System.out.println(raznost(9299292,92929));
        System.out.println(product(93993939,9399393));
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int raznost(int a, int b) {
        return a - b;
    }
    public static long product(int a, int b) {
        return a * b;
    }
}
