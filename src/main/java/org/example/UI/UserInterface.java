package org.example.UI;
import Superhero.Superhero;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class UserInterface {
    private Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int userChoice = -1;
        controller.loadFile();

        System.out.println("Welcome to Superhero! \n" +
                "_______________");

        while (userChoice != 9) {
            System.out.println("""                  
                    1. Add Superhero
                    2. Superhero List
                    3. Search Superhero
                    4. Edit Superhero
                    5. Delete Hero
                    6. Sort after attribute
                    9. End Program
                    """);

            userChoice = scanner.nextInt();
            scanner.nextLine(); // Håndtering af Scanner bug
            UserChoice(userChoice);


        }

    }

    // Brugerens valgmuligheder
    public void UserChoice(int userChoice) {
        if (userChoice == 1)
            addSuperhero();
        else if (userChoice == 2)
            superheroList();
        else if (userChoice == 3)
            searchInput();
        else if (userChoice == 4)
            editSuperhero();
        else if (userChoice == 5)
            deleteHero();
        else if (userChoice == 6)
            caseSortSuperheroes();
        else if (userChoice == 9)

            controller.saveToFile();
    }

    // Tilføjer superhelte nedenfor

    public void addSuperhero() {
        System.out.println("Enter the superhero's real name:");
        String name = scanner.nextLine();

        System.out.println("Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println("Enter the superhero's year of publication: ");
        int year = readInteger();

        System.out.println("Enter the superhero's strength:");
        double strength = readDouble();
        controller.addSuperheroes(name, true, power, year, strength);
    }

    // Forekommer en list af superhelte
    public void superheroList() {

        ArrayList<Superhero> superheroList = controller.getHeroDatabase();
        //Collections.sort(superheroList, new ComparatorName().thenComparing(new ComparatorSuperPower().thenComparing(new ComparatorCreationYear().thenComparing(new ComparatorStrength()))));
        if (superheroList.size() == 0) {
            System.out.println("There's no Superheroes registered...\n");
        } else {
            System.out.println("List of Superheroes registered\n");
            for (Superhero superhero : controller.getHeroDatabase()) {
                System.out.println(
                        "Name:" + " " + superhero.getName() + " " +
                                "Human:" + " " + superhero.getisHuman() + " " +
                                "Superpower:" + " " + superhero.getSuperPower() + " " +
                                "Year of creation" + " " + superhero.getCreationYear() + " " +
                                "Strength" + " " + superhero.getStrength());
                System.out.println(" ");
            }
        }
    }

    // søgning af superhelte.

    public void searchInput() {
        System.out.println("Enter Superhero.Superhero name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = controller.findSuperhero(findHero);
        if (superhero != null) {
            System.out.println("Information" + "\n " +
                    "Name:" + " " + superhero.getName() + " " +
                    "Human:" + " " + superhero.getisHuman() + " " +
                    "Superpower" + " " + superhero.getSuperPower() + " " +
                    "Year of creation" + " " + superhero.getCreationYear() + " " +
                    "Strength" + " " + superhero.getStrength());

        } else {
            System.out.println("Found nothing with this name.");
        }
    }

    // Så bruger kan redigere på fremtidige superhelte.

    public void editSuperhero() {

        int editUserChoice = -1;

        System.out.println("""
                                
                Welcome to superhero edit tool!
                                
                """);
        while (editUserChoice != 9) {
            System.out.println("""
                    1. Edit 
                    9. Back to main menu
                    """);

            editUserChoice = readInteger();
            scanner.nextLine();
            editSuperhero(editUserChoice);
            System.exit(0);
        }
    }

    private void editSuperhero(int editUserChoice) {
        if (editUserChoice == 1)
            editTool();
        else if (editUserChoice != 9) {
            System.out.println("Please try again, choose between 1 or 9.");
        }
    }

    public void editTool() {

        if (controller.getHeroDatabase().size() == 0) {
            System.out.println("There's no Superhero.Superhero registered");
        } else {
            System.out.println("List of Superhero.Superhero's registered");

            for (int i = 0; i < controller.getHeroDatabase().size(); i++) {
                System.out.println(i + 1 + " Superhero.Superhero: \n" + controller.getHeroDatabase().get(i));
            }


            System.out.println("Enter which superhero you want to change");
            int numb = scanner.nextInt();
            Superhero editHero;
            scanner.nextLine();

            if (numb - 1 >= controller.getHeroDatabase().size()) {
                System.out.println("Invalid data, try again");
            } else {
                editHero = controller.getHeroDatabase().get(numb - 1);
                System.out.println("Edit superhero" + editHero.getName() + " " + editHero.getSuperPower() + " " + editHero.getCreationYear() + " " + editHero.getStrength());

                System.out.println("Edit superhero and press enter" + " " + "If no need for editing press enter");

                System.out.println("Current name: " + editHero.getName());
                System.out.println("Please enter the new name below");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    editHero.setName();
                }
                System.out.println("Current Super Power: " + editHero.getSuperPower());
                System.out.println("Please enter the updated superpower");
                String newPower = scanner.nextLine();
                if (!newPower.isEmpty()) {
                    editHero.getSuperPower();
                }

                System.out.println("Current Year of publication: " + editHero.getCreationYear());
                System.out.println("Please enter updated creation year");
                String newYear = scanner.nextLine();
                if (!newYear.isEmpty()) {
                    editHero.setCreationYear();
                }

                System.out.println("Strength: " + editHero.getStrength());
                System.out.println("Enter the updated strength");
                String newStrength = scanner.nextLine();
                if (!newStrength.isEmpty()) {
                    editHero.setStrength();
                }
            }
        }
    }

    // Tilføjer noget briger venlighed, som sørger for der ikke forekommer errors.
    public int readInteger() {
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println(text + " " + "Invalid data, input a number please.");
        }
        int result = scanner.nextInt();
        return result;
    }

    public int readDouble() {
        while (!scanner.hasNextDouble()) {
            String text = scanner.next();
            System.out.println(text + " " + "Invalid data, input a number please.");
        }
        int result = scanner.nextInt();
        return result;
    }


    // Tilføjere en deltehero, som kan fjeren superheroes igen.

    private void deleteHero() {

        if (controller.getHeroDatabase().isEmpty()) {
            System.out.println("No heroes found in our database");
        } else {

            System.out.println("Choose hero you want to delete: \n");
            for (Superhero superhero : controller.getHeroDatabase()) {
                System.out.println(controller.getHeroDatabase().indexOf(superhero) + 1 + ". " + superhero.getName());
            }

            int RI = readInteger();
            System.out.println("Are you sure, you want delete this superhero? " + controller.getHeroDatabase().get(RI - 1).getName() + "?\n1. Delete " + controller.getHeroDatabase().get(RI - 1).getName() + "\n2. Dont delete");

            int v2 = readInteger();
            switch (v2) {
                case 1:
                    controller.deleteHero(RI);
                case 2:
                    System.out.println("Going back");
                    break;
                default:
                    System.out.println("Input is not valid");
                    break;
            }
        }
    }

    public void caseSortSuperheroes() {
        System.out.println("Sort by Year,IsHuman,Name, Stength, Power");
        System.out.println("""
                                
                1. Name
                2. Ishuman
                3. Superpower
                4. Strength
                5. CreationYear
                """

        );
        int sortChoise = readInteger();

        switch (sortChoise) {
            case 1:
                controller.sortName();
                superheroList();
                break;
            case 2:
                controller.sortHuman();
                superheroList();
                break;
            case 3:
                controller.sortSuperPower();
                superheroList();
                break;
            case 4:
                controller.sortStrengh();
                superheroList();
                break;
            case 5:
                controller.sortCreationYear();
                superheroList();
                break;
        }
    }


// TO DO fix
    public void SortByPrimary {
        ArrayList<Superhero> superheroes = new ArrayList<>();

        superheroes.add(new Superhero("Batman;true;Wealth And High technology;2005;65.0"));
        superheroes.add(new Superhero("Hulk;false;Ultra Strength;1950;100.0"));
        superheroes.add(new Superhero("Iron Man;true;Intelligent;1925;75.0"));
        superheroes.add(new Superhero("Spiderman;true;Fast And Smart;2006;65.0"));

        Scanner scanner = new Scanner(System.in);

        Comparator<Superhero> comparator = null;
        Comparator<Superhero> comparatorS = null;

        while (true) {
            System.out.println("""
                    1. Sort by Name
                    2. Sort by IsHuman
                    3. Sort by Superpower
                    4. Sort by Strength
                    5. Sort by CreationYear
                    6. Print""");

            String type = null;

            switch (scanner.nextInt()) {
                case 1:
                    type = "Name";
                    comparatorSort(type);
                    break;
                case 2:
                    type = "IsHuman";
                    comparatorSort(type);
                    break;
                case 3:
                    type = "SuperPower";
                    comparatorSort(type);
                    break;
                case 4:
                    type = "CreationYear";
                    comparatorSort(type);
                    break;
                case 5:
                    type = "IsHuman";
                    comparatorSort(type);
                    break;
                case 6:
                    for (Superhero superhero : superheroes) {
                        System.out.println(superheroes);
                    }
            }
        }
    }
}

