public class Testy {
    public static void main(String[] args) {

        int[] tab ={1,2,3,4,5,6,70};


        int dupa;
        for (int i = 0; i < tab.length/2; i++) {
           dupa = tab[i];
           tab[i] = tab[tab.length - 1- i];
           tab[tab.length - 1 - i] = dupa;
           }

        for (int i = 0; i < tab.length ; i++) {
            System.out.println(tab[i]);
        }


        System.out.println("---------------");
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        System.out.println("Arvage equals: " + suma / tab.length);


        System.out.println("---------------");
        for (int i = 0; i < tab.length ; i++) {
            if (tab[i] == 5) {
                System.out.println("Array contains number " + tab[i]);
            }

        }

        }





}
