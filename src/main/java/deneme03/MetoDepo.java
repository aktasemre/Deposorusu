package deneme03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetoDepo {
    List<String> list=new ArrayList<>();
    public Map<Integer, PojoClas> urunler = new HashMap<>();


    public void urunTanimlama(int id, String urunIsmi, String uretici, String birim) {
        PojoClas urun = new PojoClas(id, urunIsmi, uretici, 0, birim, "-");
        System.out.println(urun);

        urunler.put(id, urun);
        System.out.println(urunler);
    }

    public void urunListele() {//printfn ile yapacagim
        //  System.out.println("id\t  urunIsmi\t   uretici\t  miktar\t birim\t raf");
//        System.out.println("===================================================");
        for (PojoClas urun : urunler.values()) {
            System.out.println(urun.getId() + "\t" + urun.getUrunIsmi() + "\t" + urun.getUretici() +
                    "\t" + urun.getMiktar() + "\t" + urun.getBirim() + "\t" + urun.getRaf());
        }
    }

    public void urunGirisi(int id, int miktar) {
        if (urunler.containsKey(id)) {
            PojoClas urun = urunler.get(id);
            int yeniMiktar = urun.getMiktar() + miktar;
            urun.setMiktar(yeniMiktar);
        } else {
            System.out.println("Hatalı ID! Ürün tanımlı değil.");
        }
    }

    public void urunuRafaKoy(int id, String raf) {
        if (urunler.containsKey(id)) {
            PojoClas urun = urunler.get(id);
            urun.setRaf(raf);
        } else {
            System.out.println("Hatalı ID! Ürün tanımlı değil.");
        }
    }
    public void urunCikisi(int id, int miktar){
        PojoClas urun=urunler.get(id);
        if (miktar<=urun.getMiktar()){
          int  yeniMiktar= urun.getMiktar()-miktar;
        urun.setMiktar(yeniMiktar);
        }else {
            System.out.println("Depoda-"+miktar+"- kadar urun yoktur " +
                    "\n en fazla"+urun.getMiktar()+ "- kadar cikti yapilabilir");
        }
    }

}

