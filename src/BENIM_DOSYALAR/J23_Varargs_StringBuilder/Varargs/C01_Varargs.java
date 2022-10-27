package BENIM_DOSYALAR.J23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
/*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki toplamını print eden METHOD create ediniz

        int sayi1 = 24;
        int sayi2 = 27;
        int sayi3 = 46;
        int sayi4 = 10;
        int sayi5 = 67;

        topla(sayi1, sayi2);
        topla(sayi3, sayi2);
        topla(sayi1, sayi4);
        topla(sayi1, sayi3, sayi5);
        toplaVaraargs(sayi1, sayi2,23, sayi3, sayi4);
        toplaVaraargs(sayi1,63, sayi2, sayi3, sayi4);
        toplaVaraargs(sayi1,6, sayi2, sayi3);

    }// main sonu


    public static void topla(int a, int b) {
        System.out.println("Sayilar Toplami   = " + (a + b));
    }

    public static void topla(int a, int b, int c) {
        System.out.println("Sayilar Toplami   = " + (a + b + c));


    }

    public static void toplaVaraargs(int ...a) {
        int toplan =0;
        for (int v : a) {
            toplan += v;
        }
        System.out.println(" Toplam   = " + (toplan));

        }

    }

/*
  // Task -> verilen iki sayı toplamını print eden METHOD create ediniz
​
        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;
        topla(sayi1,sayi2);
        topla(sayi3,sayi2);
        topla(sayi1,sayi4);
        topla(sayi1,sayi4,sayi3);
​
        System.out.println("   ***  varags method   ***   ");

        toplaVarargs(sayi1,23,sayi2,sayi3);// 4 p
        toplaVarargs(44,23,62,sayi1,sayi3);// 5 p
        toplaVarargs(sayi2,sayi3);// 2 p

// Task -> verilen üç sayı toplamını print eden METHOD create ediniz
        }//main sonu

    public static void topla(int a, int b){//iki p'li overload meth
        System.out.println("sayılar toplamı :" +(a+b));

    }
    public static void topla(int a, int b,int c){//iki p'li overload meth
        System.out.println("sayılar toplamı :" +(a+b+c));

    }
    public static  void toplaVarargs(int ... a){//varargs method
        int toplam=0;
        for (int w:a){//varargs parametre arr içinde tanımlandıgı için parametreler loop aksiyon alır
            toplam+=w;
        }
        System.out.println("sayıların toplamı : "+(toplam));

 */




