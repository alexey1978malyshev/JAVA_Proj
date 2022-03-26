import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args){
        System.out.println("Input A and B: ");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int numberInPeriod;
        if(B % 4==0 )
        {
            numberInPeriod = 4;
        }
        else {
            numberInPeriod = B % 4;    //т.к последние цифры результатов возведения в степень любого числа повторяются с
                                        // периодичностью 4, остаток от деления  на 4  б
            }                               // удет означать порядковое место в периоде

        int lastSymbolOfA = A % 10;                             // получаем последнюю цифру числа А

        int x = (int)(pow(lastSymbolOfA,numberInPeriod)) % 10; //возведя последнюю цифру числа А в степень порядкового
                                                                // номера периода и взяв последнюю цифру полученного
                                                                 // числа, получим реультат - последнюю цифру числа А
        System.out.println(x);
        System.out.println(pow(A,B));
    }
}
