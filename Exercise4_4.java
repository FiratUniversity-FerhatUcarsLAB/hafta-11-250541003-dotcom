public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
       // Bir değer döndüren metodu çağırıp sonucu kullanmasam bile program çalışmaya devam eder. 
//Derleyici hata vermez ancak IDE “kullanılmayan değer” uyarısı gösterebilir.

        getNumber();// burada return geliyor ama kullanılmıyor → program yine çalışır


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        //Void metot değer döndürmediği için başka bir işlem içinde kullanılamaz.
//System.out.println("boo!") + 7 ifadesi derleme hatası verir çünkü println() metodu void döner ve 
//void bir sonuç matematiksel veya string işlemine katılamaz.

        // System.out.println(sayHello() + 7);//hata verir.

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
