package BENIM_DOSYALAR.j08_IfStatement_Ternary_Operators.Task_Nestedİf;

public class Q09 {

    public static void main(String[] args) {

       /*
            BENIM_DOSYALAR.j01_Variables.j09_SwitchStatement.TASK :
            45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'Test01 bölününce kalan 5 ise ve double 9'Test01 bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */

        double d = 45;
        if (d%5 ==0 && d%8==0 ){
            System.out.println( "Able to divide by 5 and 8");
        } else if ((d%10==5 && d%9 == 0)){
            System.out.println( "able to divide by 9 and divide by 10 reminder is 5");
        }




    }
}
