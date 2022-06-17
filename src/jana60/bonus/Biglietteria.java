package jana60.bonus;

import jana60.Biglietto;

import java.util.Scanner;

public class Biglietteria {


    public static void main(String[] args) {
        System.out.println("Benvenuto");
        boolean repeat;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Vuoi fare un nuovo biglietto? (y/n)");
            String nuovo = scan.nextLine();
            repeat = nuovo.equals("y");

            if (!repeat)
                break;

            System.out.print("Inserisci il numero di km che vuoi percorrere(usa la virgola per i decimali): ");
            double km = scan.nextDouble();
            System.out.print("Inserisci la tua età: ");
            int age = scan.nextInt();
            scan.nextLine();

            Biglietto biglietto = new Biglietto();

            biglietto.setKm(km);
            biglietto.setAge(age);
            System.out.println(biglietto.prezzoFormat() + "€");

        } while (repeat);
        System.out.println("Grazie per averci scelto.");
        scan.close();
    }
//    public static void biglietteria() {


//        System.out.print("Inserisci il numero di km che vuoi percorrere(usa la virgola per i decimali): ");
//        double km = scan.nextDouble();
//        System.out.print("Inserisci la tua età: ");
//        int age = scan.nextInt();

//        Biglietto biglietto = new Biglietto();

//        biglietto.setKm(km);
//        biglietto.setAge(age);

//        System.out.println(biglietto.prezzoFormat() + "€");
//    }
}
