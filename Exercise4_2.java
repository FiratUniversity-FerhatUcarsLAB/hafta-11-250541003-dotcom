public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {//1
        zippo("rattle", 13);//2
    }

    public static void baffle(String blimp) {//6
        System.out.println(blimp);//7
        zippo("ping", -5);//8
    }

    public static void zippo(String quince, int flag) {//3,9
        if (flag < 0) {//10
            System.out.println(quince + " zoop");//11
        } else {
            System.out.println("ik");//4
            baffle(quince);//5
            System.out.println("boo-wa-ha-ha");//12
        }
    }
}
/* program cıktısı
ik
rattle
ping zoop
boo -wa-ha-ha*/
