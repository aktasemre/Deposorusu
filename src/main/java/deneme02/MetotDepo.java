package deneme02;

import java.util.ArrayList;

import static java.lang.Integer.valueOf;

public class MetotDepo {
    // *//      urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
    // MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist


    public String idOlustur(ArrayList<String> urunIsmiList, String girilenUrun,
                            ArrayList<String> ureticiList, String uretici,
                            ArrayList<String> birimiList, String birimi) {
        int IDurun = 0, IDuretici = 0, IDbirim = 0;
        if (urunIsmiList.contains(girilenUrun)) {
            IDurun = urunIsmiList.indexOf(girilenUrun) + 1001;
        } else {
            urunIsmiList.add(girilenUrun);
            IDurun = urunIsmiList.indexOf(girilenUrun) + 1001;
        }
        if (ureticiList.contains(uretici)) {
            IDuretici = ureticiList.indexOf(uretici) + 1001;
        } else {
            ureticiList.add(uretici);
            IDuretici = ureticiList.indexOf(uretici) + 1001;
        }
        if (birimiList.contains(birimi)) {
            IDbirim = birimiList.indexOf(birimi) + 101;
        } else {
            birimiList.add(birimi);
            IDbirim = birimiList.indexOf(birimi) + 101;
        }
        String Urunid = "" + IDurun + IDuretici + IDbirim;
        System.out.println("SonId :" + Urunid);
        return Urunid;
    }

//urunListele     ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.


    public void urunListele(ArrayList<String> urunIsmiList, ArrayList<String> ureticiList, ArrayList<String> birimiList, String Urunid) {

        int urun_numarasi = Integer.parseInt(Urunid.substring(0, 4)) - 1001;
        int uretici_numarasi = Integer.parseInt(Urunid.substring(4, 8)) - 1001;
        int birim_numarasi = Integer.parseInt(Urunid.substring(8, 11)) - 101;
        String a = "urun :" + urunIsmiList.get(urun_numarasi) + "-Uretici :" + ureticiList.get(uretici_numarasi) +
                "-Birimi :" + birimiList.get(birim_numarasi);
        System.out.println(a);
    }
}
