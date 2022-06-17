package jana60;

import java.util.Scanner;

public class Biglietteria {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il numero di km che vuoi percorrere(usa la virgola per i decimali): ");
        double km = scan.nextDouble();
        scan.nextLine();
        System.out.print("Inserisci la tua età: ");
        int age = scan.nextInt();

        scan.close();

        Biglietto biglietto = new Biglietto();

        biglietto.setKm(km);
        biglietto.setAge(age);

        System.out.println(biglietto.prezzoFormat()+"€");
    }
}
