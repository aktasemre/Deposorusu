package deneme01;

public class Tesk {/*
     * basit bir depo projesi
     *
     * Calisan bir fabrikada uygulanan bir sistem olan depo uygulamasidir.
     *
     * 1-) burada oncelikle urunun tanimlamasi  yapilir.  //pojoUrun
      id
      urunIsmi
      uretici
      miktar
      birim ve
      raf (6 adet fields mevcut)
     *
     * 2-) methodlar olusturacagiz.
     *      urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  //MAP<id,pojoUrun>   RAF="-"ve Miktar=0 //arraylist
     *
     *      urunListele     ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
     *     ///  printf(%10)
          *      urunGirisi      ==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
     *
     *      urunuRafaKoy    ==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
     *
     *      urunCikisi      ==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
     *                          urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.  ///exception
     *      ===> yaptigimiz tum degisiklikler listede de gorunsun.
     *
     *
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   0           cuval       null
     *
     *      urunGirisi      ==> id:1000  urun girisi :5
     *      urunListele     ==>
     *
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   5           cuval       null
     *
     *      urunuRafaKoy    ==> id:1000 raf : raf1
     *      urunListele     ==>
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   5           cuval       raf1
     *
     *      urunCikisi      ==> id 1000: urun cikis : 3 (kalan 2 cuval un)
     *      urunListele     ==>
     *          id      ismi    ureticisi   miktari     birimi      raf
     *      ---------------------------------------------------------------
     *      or: 1000     un     hekimoglu   2           cuval       raf1
     *
     *
     */

 /*   Bu depo projesine ekleyebileceğiniz bazı özellikleri aşağıda sıraladım:

    Ürün Silme: Mevcut bir ürünü depodan silme işlemini ekleyebilirsiniz.
     Bu işlem için bir urunSil metodunu tanımlayabilirsiniz.
      Bu metod, id bilgisine göre ilgili ürünü urunler haritasından kaldırır.


    Ürün Güncelleme: Mevcut bir ürünün bilgilerini güncelleme işlemini ekleyebilirsiniz.
     Bu işlem için urunGuncelle adında bir metod tanımlayabilirsiniz.
      Bu metod, id bilgisine göre ilgili ürünü bulur ve yeni bilgilerle günceller.

    Raf Yönetimi: Depodaki rafları daha detaylı yönetmek için bir Raf sınıfı oluşturabilirsiniz.
    Bu sınıf, raf numarası, kapasite ve doluluk durumu gibi bilgileri içerebilir.
     Depo uygulamasında her rafa ilişkin bilgileri bu sınıf kullanarak tutabilirsiniz.
      Böylece, raf kapasitesi, doluluk durumu gibi bilgilere erişim sağlayabilir
      ve gerekli kontrolleri yapabilirsiniz.

    Depo İstatistikleri: Depodaki ürünlerle ilgili istatistiksel bilgileri takip etmek
     için bir DepoIstatistikleri sınıfı oluşturabilirsiniz
     . Bu sınıf, toplam ürün sayısı, stokta bulunan ürünlerin miktarları,
     en çok/az miktarda olan ürünler gibi istatistiksel bilgileri hesaplayabilir ve sunabilir.

    Arama ve Filtreleme: Ürünleri arama ve filtreleme işlemlerini destekleyebilirsiniz.
    Örneğin, bir ürünü urunAdi veya uretici bilgilerine göre arama yapabilir,
    miktarı belirli bir eşiği geçen veya altında olan ürünleri listeleyebilirsiniz.

    Depo Hareketleri Kaydı: Depodaki ürün hareketlerini kaydetmek için bir DepoHareketleri
    sınıfı oluşturabilirsiniz. Bu sınıf, ürün girişleri, rafa konulmaları, çıkışlar gibi işlemleri kaydederek,
     tarih ve saat bilgisiyle birlikte takip etmenizi sağlar.

    Kullanıcı Arayüzü: Kullanıcı dostu bir arayüz ekleyebilirsiniz.
    Örneğin, terminal tabanlı veya grafiksel bir kullanıcı arayüzü ile kullanıcıya menüler,
    giriş formları ve sonuçları göstererek interaktif bir deneyim sunabilirsiniz.
            */}
