package ua.hillel.kvartalnyi.lesson02.task09;

public class Task09 {

    public static void main(String[] args) {
        int[] mas = {90, 0, 9, 5, 3, 6, 8, 7, -34};
        int umn = 1;
        for (int i = 0; i < mas.length; i++) {
            if ((mas[i] % 2) == 0) {
            } else {
                umn = umn * mas[i];
            }
        }
        System.out.println(umn);
    }
}
