import java.util.Scanner;

public class Palindrom {


    public static void main(String[] args) {

        checkPalindrom();

    }

    public static void checkPalindrom() {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        String s = String.valueOf(A);
        StringBuilder build = new StringBuilder(s);
        build.reverse();
        int B = Integer.parseInt(build.toString());
        if (A == B)
            {
                System.out.println("Поздравляю! Введенное число - истинный ПАЛИНДРОМ!");
            }

        else
            {
                System.out.println("На палиндром не похоже");
                checkPalindrom();
            }
    }
}





