package BENIM_DOSYALAR.j01_Variables.j08_IfStatement_Ternary_Operators.TASK.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter any number");
        int i1 = scan.nextInt();
        System.out.println("please enter any number");
        int i2 = scan.nextInt();
        System.out.println("please enter any number");
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.



        if (i1>i2 && i2>i3){
            System.out.println("Maksimum sayi: "+ i1);
        } else if (i1>i3 && i3>i2){
            System.out.println("Maksimum sayi: "+ i1);
        } else if (i2>i1 && i1>i3){
            System.out.println("Maksimum sayi: "+ i2);
        }else if (i2>i3 && i3>i1){
            System.out.println("Maksimum sayi: "+ i2);
        }else if (i3>i2 && i2>i1){
            System.out.println("Maksimum sayi: "+ i3);
        }else if (i3>i1 && i1>i2){
            System.out.println("Maksimum sayi: "+ i3);
        }


    }
}
