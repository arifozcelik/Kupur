package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class Kupur {
    public static void main(String[] args) {
        int Para, Sa , i;
        //7 elemanlı para küpürlerinden oluşan K dizisi
        int K[] = {200,100,50,20,10,5,1};
        System.out.println("Para miktarını gir...");
        Scanner tara = new Scanner(System.in);
        Para = tara.nextInt();
        for (i = 0; i<=6; i++){
            Sa = (int) Para / K[i];
            Para= Para - Sa * K[i];
            if (Sa != 0){
                System.out.println(Sa + "adet" +K[i] +"TL,");
            }
        }
        System.out.println("vermelisiniz.");
    }
}
