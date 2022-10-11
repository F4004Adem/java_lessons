package BENIM_DOSYALAR.J13_Brek_Continue.L04Break_Continue.HaftaninTaski;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number: ");
        double num = scan.nextInt();
       System.out.println(powerOfTwo(num));

    }

    private static boolean powerOfTwo(double num) {
        while(num>2){
            num/=2;
        }return num%2==0 ||num ==1;
    }
}

        /*
             private static boolean powerOfTwo(int a) {
             boolean power = true;
                for (int i =2; i <a ; i*=2){
                 if (a%i!=0) {power=false;}
                }
                return power;
        }*/


