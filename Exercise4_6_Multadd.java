public class Exercise4_6_Multadd {
/**
     * multadd metodunu uygular. İstenen işlemi gerçekleştirir: a * b + c 
     *
     * @param a Çarpmanın birinci faktörü
     * @param b Çarpmanın ikinci faktörü
     * @param c Toplamaya eklenecek değer
     * @return a * b + c işleminin sonucu
     */
    public static double multadd(double a, double b, double c) {
        // multadd işlemini gerçekleştir 
    
        return a*b+c;
    }
/**
     * expSum metodunu uygular. Şu matematiksel ifadeyi hesaplar: 
     * x * e^(-x) + sqrt(1 - e^(-x)) 
     * NOT: Bu metot içinde multadd() kullanılmalıdır.
     *
     * @param x Hesaplamada kullanılacak değer
     * @return İfadenin sonucu
     */
    public static double expSum(double x) {
        // e^(-x) ifadesini hesapla (Math.exp(x) = e^x)
        double e_minus_x = Math.exp(-x);
        // Karekök içindeki ifadeyi hesapla: sqrt(1 - e^(-x))
        double c_part = Math.sqrt(1.0 - e_minus_x); 

        // İfadeyi multadd(a, b, c) olarak yaz: 
        // a = x, b = e_minus_x, c = c_part
        return multadd(x, e_minus_x, c_part);
    }

    public static void main(String[] args) {
        System.out.println("--- multadd() Basit Testi ---");
        // Basit bir multadd testi: 5 * 10 + 3 = 53.0 
        double simpleTest = multadd(5.0, 10.0, 3.0);
        System.out.printf("multadd(5.0, 10.0, 3.0) = %.1f (Beklenen: 53.0)\n", simpleTest);
        
        System.out.println("\n--- İfadelerin multadd Kullanılarak Hesaplanması ---");
        
        // Görev 4: sin(π/4) + cos(π/4)/2 ifadesini hesapla 
        // İfadeyi a*b + c şeklinde yaz: (1/2) * cos(π/4) + sin(π/4)
        double cos_pi_4 = Math.cos(Math.PI / 4.0); // b
        double sin_pi_4 = Math.sin(Math.PI / 4.0); // c
        
        // a = 0.5 (1/2)
        double result1 = multadd(0.5, cos_pi_4, sin_pi_4);
        System.out.printf("1) sin(π/4) + cos(π/4)/2 = %.6f\n", result1); 

        // Görev 4: log(10) + log(20) ifadesini hesapla 
        // İfadeyi a*b + c şeklinde yaz: 1.0 * log(10) + log(20)
        // Not: Java'da Math.log() doğal logaritmayı (ln) hesaplar.
        double log10 = Math.log(10.0); // b
        double log20 = Math.log(20.0); // c
        
        // a = 1.0
        double result2 = multadd(1.0, log10, log20);
        System.out.printf("2) log(10) + log(20) = %.6f\n", result2);
        
        
        System.out.println("\n--- expSum() Metodu Testi ---");
        // expSum(x) = x * e^(-x) + sqrt(1 - e^(-x)) 
        double x_test = 2.5;
        double resultExpSum = expSum(x_test);
        System.out.printf("expSum(%.1f) = %.6f\n", x_test, resultExpSum);
    
    }
}
