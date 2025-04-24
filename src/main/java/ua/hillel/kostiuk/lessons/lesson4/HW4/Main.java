package ua.hillel.kostiuk.lessons.lesson4.HW4;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = 3;
        int countSides = 4;
        int volume = a * b * c;
        int length = (a + b + c) * countSides;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        System.out.println("Length = " + length);
    }
}
