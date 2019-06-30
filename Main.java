public class Main {
    public static void main(String[] args) {

        Bottle b1 = new Bottle(5, 1, 5 );
        Bottle b2 = new Bottle(3, 2, 3);
        Bottle b3 = new Bottle(3, 3, 3);
        System.out.println( b1 );
        System.out.println( b2 );
        System.out.println("--------------------");

        BottleService bottleService = new BottleService();

        bottleService.breakBottle(b1);

        System.out.println( b1 );

        Drinker trus = new Drinker("Trus");

        bottleService.drink(b3, trus);

        String s = trus.toString();
        System.out.println(s);
        System.out.println(b3.toString());

        Bottle[] bottleTab = new Bottle[10];
        for (int i = 0; i < bottleTab.length; i++) {
            bottleTab[i] = new Bottle(3, i);
        }

    }
}
