import data.Database;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database helteDatabase = new Database() {
            @Override
            public void addSuperhero(String navn, String superkraft, int fødselsdag, String sandeNavn, double højde, int vægt) {

            }
        };

        int brugerValg = 0;
        do {
            System.out.println("""
                    Velkommen til superhelte universet
                    1. Opret superhelt
                    9. Afslut
                    """);


            brugerValg = sc.nextInt();
            sc.nextLine();
            if (brugerValg == 1) {


                System.out.println("Giv din helt et navn");

                String navn = sc.nextLine();
                System.out.println(" ");

                System.out.println("Giv helten en super kraft");
                String superkraft = sc.nextLine();
                System.out.println(" ");


                System.out.println("Angiv en fødselsdag til helten");
                int fødselsdag = sc.nextInt();
                System.out.println(" ");


                System.out.println("Angiv heltens sandenavn");
                String SandeNavn = sc.next();
                System.out.println(" ");


                System.out.println("Angiv heltens højde");
                double Højde = sc.nextDouble();
                System.out.println(" ");


                System.out.println("Angiv heltens vægt");
                int vægt = sc.nextInt();
                System.out.println(" ");

                helteDatabase.addSuperhero(navn, superkraft, fødselsdag, SandeNavn, Højde, vægt);


            } else {
                System.exit(0);
            }


        }
        while (brugerValg != 9);
    }
}