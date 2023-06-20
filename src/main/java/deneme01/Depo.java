//package day01;
//
//import java.util.*;
//
//public class Depo {
//    public static <Urun> void main(String[] args) {
//
//
//    Scanner input=new Scanner(System.in);
//     String   Urun= input.nextLine();
//    Map<Integer, Urun> urunler;
//    List<String> rafListesi;
//
//    public Depo() {
//        urunler = new HashMap<>();
//        rafListesi = new ArrayList<>();
//    }
//
//    public void urunTanimlama(int id, String isim, String uretici, String birim) {
//        if (!urunler.containsKey(id)) {
//            Urun urun = new Urun(id, isim, uretici, birim);
//            urunler.put(id, urun);
//            System.out.println("Ürün tanımlandı.");
//        } else {
//            System.out.println("Bu ID'ye sahip bir ürün zaten tanımlı.");
//        }
//    }
//
//    public void urunListele() {
//        if (urunler.isEmpty()) {
//            System.out.println("Depoda hiç ürün bulunmamaktadır.");
//            return;
//        }
//
//        System.out.println("id\tisim\turetici\tmiktari\tbirimi\traf");
//        System.out.println("-----------------------------------------------");
//        for (Urun urun : urunler.values()) {
//            String raf = urun.getRaf() != null ? urun.getRaf() : "-";
//            System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\n", urun.getId(), urun.getIsim(), urun.getUretici(),
//                    urun.getMiktar(), urun.getBirim(), raf);
//        }
//    }
//
//    public void urunGirisi(int id, int girisMiktari) {
//        if (urunler.containsKey(id)) {
//            Urun urun = urunler.get(id);
//            int yeniMiktar = urun.getMiktar() + girisMiktari;
//            urun.setMiktar(yeniMiktar);
//            System.out.println("Ürün girişi yapıldı. Yeni miktar: " + yeniMiktar);
//        } else {
//            System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
//        }
//    }
//
//    public void urunuRafaKoy(int id, String raf) {
//        if (urunler.containsKey(id)) {
//            if (rafListesi.contains(raf)) {
//                Urun urun = urunler.get(id);
//                urun.setRaf(raf);
//                System.out.println("Ürün rafa koyuldu.");
//            } else {
//                System.out.println("Belirtilen raf bulunamadı.");
//            }
//        } else {
//            System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
//        }
//    }
//
//    public void urunCikisi(int id, int cikisMiktari) {
//        if (urunler.containsKey(id)) {
//            Urun urun = urunler.get(id);
//            int mevcutMiktar = urun.getMiktar();
//            if (mevcutMiktar >= cikisMiktari) {
//                int yeniMiktar = mevcutMiktar - cikisMiktari;
//                urun.setMiktar(yeniMiktar);
//                System.out.println("Ürün çıkışı yapıldı. Yeni miktar: " + yeniMiktar);
//            } else {
//                System.out.println("Stokta yeterli ürün bulunmamaktadır.");
//            }
//        } else {
//            System.out.println("Belirtilen ID'ye sahip bir ürün bulunamadı.");
//        }
//    }
//
//    public void rafEkle(String raf) {
//        if (!rafListesi.contains(raf)) {
//            rafListesi.add(raf);
//            System.out.println("Raf eklendi.");
//        } else {
//            System.out.println("Bu isimde bir raf zaten bulunmaktadır.");
//        }
//    }
//
//    public void rafListele() {
//        if (rafListesi.isEmpty()) {
//            System.out.println("Depoda hiç raf bulunmamaktadır.");
//            return;
//        }
//
//        System.out.println("Raf Listesi:");
//        for (String raf : rafListesi) {
//            System.out.println(raf);
//        }
//    }}
//}
