package org.example;
import java.util.Scanner;

public class UserInterface {
    public Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int userChoice = -1;

        System.out.println("Welcome to Superhero! \n" +
                "_______________");

        while (userChoice != 9) {
            System.out.println("""                  
                    1. Add Superhero.Superhero
                    2. Superhero.Superhero List
                    3. Search Superhero.Superhero
                    4. Edit Superhero.Superhero
                    5. Delete hero
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
        controller.saveToFile(); {
        }
    }

    // Tilføjer superhelte nedenfor

    public void addSuperhero() {
        System.out.println("Enter the superhero's real name:");
        String name = scanner.nextLine();

        System.out.println("Enter the superhero's power: ");
        String power = scanner.nextLine();

        System.out.println("Enter the superhero's year of publication: ");
        // int year = scanner.nextInt();
        int year = readIntger();

        System.out.println("Enter the superhero's strength:");
        // double strength = scanner.nextDouble();
        double strength = readDouble();
        controller.addSuperheroes(name, true, power, year, strength);
    }

    // Forekommer en list af suoerhelte
    public void superheroList() {

        if (controller.getHeroDatabase().size() == 0) {
            System.out.println("There's no Superhero.Superhero registered...\n");
        } else {
            System.out.println("List of Superhero.Superhero's registered\n");
            for (Superhero superhero : controller.getHeroDatabase()) {
                System.out.println("Name:" + " " + superhero.getName() + " " + "Human:" + " " + superhero.getisHuman() + " " + "Superpower:" + " " + superhero.getSuperPower() + " " + "Year of creation" + " " + superhero.getCreationYear() + " " + "Strength" + " " + superhero.getStrength());
            }
        }
    }

    // søgning af superhelte.

    public void searchInput() {
        System.out.println("Enter Superhero.Superhero name: ");
        String findHero = scanner.nextLine();
        Superhero superhero = controller.findSuperhero(findHero);
        if (superhero != null) {
            System.out.println("Information" + "\n Name:" + " " + superhero.getName() + " " + "Human:" + " " + superhero.getisHuman() + " " + "Superpower" + " " + superhero.getSuperPower() + " " + "Year of creation" + " " + superhero.getCreationYear() + " " + "Strength" + " " + superhero.getStrength());
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

            editUserChoice = readIntger();
            scanner.nextLine();
            editSuperhero(editUserChoice);
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

    public int readIntger() {
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
            for (Superhero hero : controller.getHeroDatabase()) {
                System.out.println(controller.getHeroDatabase().indexOf(hero) + 1 + ". " + hero.getName());
            }

            int RI = readIntger();
            System.out.println("Are you sure, you want delete this superhero? " + controller.getHeroDatabase().get(RI - 1).getName() + "?\n1. Delete " + controller.getHeroDatabase().get(RI - 1).getName() + "\n2. Dont delete");

            int v2 = readIntger();
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
}
