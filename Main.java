public class Main {
    public static void main(String[] args) {

        Bottle b1 = new Bottle(5, 1, 5 );
        Bottle b2 = new Bottle(3, 2, 3);
        System.out.println( b1 );
        System.out.println( b2 );
        System.out.println("--------------------");




        BottleService bottleService = new BottleService();


        bottleService.changeLiqiudAmount(b1,b2, 2);
        System.out.println( b1 );
        System.out.println( b2 );
        System.out.println("--------------------");


        bottleService.breakBottle(b1);



        System.out.println( b1 );



    }
}
