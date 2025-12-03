public class Exercise4_3 {

    public static void zoop() {
        // baffle() çağrılır (3. Adım)
        baffle();
        // " You wugga " yazdırılır (8. Adım)
        System.out.print("You wugga ");
        // baffle() tekrar çağrılır (9. Adım)
        baffle();
        // zoop biter (14. Adım)
    }

    public static void main(String[] args) {
        // "No, I " yazdırılır (1. Adım)
        System.out.print("No, I ");
        // zoop() çağrılır (2. Adım)
        zoop();
        // "I " yazdırılır (15. Adım)
        System.out.print("I ");
        // baffle() çağrılır (16. Adım)
        baffle();
        // main biter (21. Adım)
    }

    public static void baffle() {
        // "wug" yazdırılır (4., 10., 17. Adımlar)
        System.out.print("wug");
        // ping() çağrılır (5., 11., 18. Adımlar)
        ping();
        // baffle biter (7., 13., 20. Adımlar)
    }

    public static void ping() {
        // "." yazdırılır ve alt satıra geçilir (6., 12., 19. Adımlar)
        System.out.println(".");
    }
}
/*No, I wug.
You wugga wug.
I wug.*/
