public class Main {
    public static void main(String[] args) {

        Bottle b11 = new Bottle(5, 1, 5 );
        Bottle b12 = new Bottle(3, 2, 3);
        System.out.println( b11 );
        System.out.println( b12 );
        System.out.println("--------------------");




        BottleService bottleService = new BottleService();


        bottleService.changeLiqiudAmount(b11,b12, 2);
        System.out.println( b11 );
        System.out.println( b12 );
        System.out.println("--------------------");

        bottleService.breakBottle(b11);
        System.out.println(  b11 );



        for(int i = 0; i < 100; i++) {
            Bottle b2 = new Bottle(3, i, 3);
        }

        // comment


    }
}
