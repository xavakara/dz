public class Main {

    public static void main(String[] args) {


        if (possibility()) {
            System.out.println("имеются средства");
            System.out.println("остаток " + balance() + " серебрянных монет");
        } else { // �����
            System.out.println("недостаточно средств");
            System.out.println(" - ");
        }
    }


    static float coat = 70;
    static byte coatDiscount = 77;
    static float hat = 25;
    static byte hatDiscount = 37;
    static float business_suit = 53;
    static byte business_suitDiscount = 44;
    static float shirt = 19;

    static float shoes = 41;
    static byte shoesDiscount = 32;
    static float account = 312;


    private static float calculation() {

        float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount)
                + business_suit * (100 - business_suitDiscount) + shirt
                + shoes * (100 - shoesDiscount)) / 100;
        return count;
    }


    private static boolean possibility() {
        if (calculation() <= account) {
            return true; //
        } else { //
            return false; //
        }
    }


    private static float balance() {
        if(possibility()) {
            return account - calculation();
        } else {
            return -1;
        }
    }


}