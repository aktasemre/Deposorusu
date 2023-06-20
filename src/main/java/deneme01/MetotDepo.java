package deneme01;

import deneme03.PojoClas;

import java.util.ArrayList;
import java.util.Scanner;

public class MetotDepo {
   static int urunIsmiId;
   static int ureticiId;
   static int birimId;
    public static void main(String[] args) {
        ArrayList<String> urunIsmiList = new ArrayList<>();
        ArrayList<String> ureticiList = new ArrayList<>();
        ArrayList<String> birimiList = new ArrayList<>();

        unurtanimlaIdOlustur(urunIsmiList, "un", ureticiList, "Emre", birimiList, "cuval");
        unurtanimlaIdOlustur(urunIsmiList, "un", ureticiList, "Emre", birimiList, "cuval");
        unurtanimlaIdOlustur(urunIsmiList, "bezelye", ureticiList, "Emre", birimiList, "cuval");
        unurtanimlaIdOlustur(urunIsmiList, "un", ureticiList, "Emree", birimiList, "kg");

    }

    Scanner input = new Scanner(System.in);
    static String nurunId = null;

    public static <urunIsmi> String unurtanimlaIdOlustur(ArrayList<String> isim, String urunIsmi, ArrayList<String> ureticiList, String uretici, ArrayList<String> BirimList, String birimi) {




        if (!isim.contains(urunIsmi)) {
            isim.add(urunIsmi);
           int urunIsmiId=  PojoClas.urunIsmiId++;
        } else {
            String urunIsmiId = isim.get(isim.indexOf(urunIsmi));
        }
        if (!ureticiList.contains(uretici)) {
            ureticiList.add(uretici);
            int ureticiId = PojoClas.ureticiId++;
        } else {
            String ureticiId = ureticiList.get(ureticiList.indexOf(uretici));
        }
        if (!BirimList.contains(birimi)) {
            BirimList.add(birimi);
            int birimId = PojoClas.birimId++;
        } else {
            String birimId = BirimList.get(BirimList.indexOf(birimi));
        }
        String nurunId =""+ urunIsmiId + "" + ureticiId + "" +birimId;
        System.out.println(nurunId);

        System.out.println("PojoClas.urunIsmiId = " + PojoClas.urunIsmiId);

        return nurunId;
    }

//    public
//
//    int idCounter = 1000;
//
//    private int generateId() {
//        return ++idCounter;
//    }
}

//
//    public void urunCikisi(int id, int miktar) {
//        if (urunler.containsKey(id)) {
//            pojoClas urun = urunler.get(id);
//            int mevcutMiktar = urun.getMiktar();
//            if (mevcutMiktar >= miktar) {
//                int kalanMiktar = mevcutMiktar - miktar;
//                urun.setMiktar(kalanMiktar);
//                if (kalanMiktar == 0) {
//                    urun.setRaf("-");
//                }
//            } else {
//                System.out.println("Hatalı miktar! Mevcut miktarı aşıyor.");
//            }
//        } else {
//            System.out.println("Hatalı ID! Ürün tanımlı değil.");
//        }
//    }
//  System.out.println("girisi yapilacak urunun id sini giriniz");
//          id = input.nextInt();
//          System.out.println("giris yapilacak urunun miktarini giriniz");
//          int miktar = input.nextInt();
//          metotDepo.urunGirisi(id, miktar);
//          metotDepo.urunListele();
//          break;
//          case "3":
//          System.out.println("rafa koyacaginiz urunun id sini giriniz");
//          id = input.nextInt();
//          input.nextLine();
//          System.out.println("urunu hangi rafa koymak istersiniz");
//          String rafIsmi = input.nextLine();
//          metotDepo.urunuRafaKoy(1000, rafIsmi);
//          metotDepo.urunListele();
//          break;
//          case "4":
//          System.out.println("Cikis yapacaginiz urunun id sini giriniz");
//          id = input.nextInt();
//          System.out.println("cikis yapacaginiz urunun miktarini giriniz");
//          miktar = input.nextInt();
//          metotDepo.urunCikisi(id, miktar);
//          metotDepo.urunListele();
//          break;