package deneme02;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        MetotDepo obj = new MetotDepo();
        Scanner input = new Scanner(System.in);


        ArrayList<String> urunIsmiList = new ArrayList<>();
        ArrayList<String> ureticiList = new ArrayList<>();
        ArrayList<String> birimiList = new ArrayList<>();
        while (true) {
            System.out.println("yapilacak isler");
            String menuTercih = input.nextLine();
            switch (menuTercih) {
                case "1":
                    System.out.println("urun tanimlama");
                    String urun = input.nextLine();
                    String uretici = input.nextLine();
                    String birim = input.nextLine();
                    obj.idOlustur(urunIsmiList, urun, ureticiList, uretici, birimiList, birim);
                    break;
                case "2":
                    String id = input.nextLine();
                    obj.urunListele(urunIsmiList, ureticiList, birimiList, id);
                    break;
                case "3":
                    System.out.println("id\tisim\turetici\tmiktari\tbirimi\traf");
                    System.out.println("-----------------------------------------------");
//
//                        System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", urun.getId(), urun.getIsim(), urun.getUretici(),
//                                urun.getMiktar(), urun.getBirim(), raf);
                    }
            }

        }
    }
