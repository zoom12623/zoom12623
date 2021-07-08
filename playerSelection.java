package com.omar;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        playerSelection start = new playerSelection();
        start.menu(); //Call menu method
    }

    public static class playerSelection {


        static String choice;
        static String answer;


        public void menu() {
            System.out.println("======================================================");
            System.out.println("*         Player Selection Menu                       *");
            System.out.println("======================================================");
            System.out.println("* A. Add a Player                                     *");
            System.out.println("* V. View all players                                 *");
            System.out.println("* B. Display two best batmans                         *");
            System.out.println("* C. Display two best bowlers                         *");
            System.out.println("* D. Display the best keeper                          *");
            System.out.println("* Q. Quit the program                                 *");
            System.out.println("======================================================");
            System.out.println("");

            System.out.println("Choose one of the options from above. (E.g: Type 'A' to add a player)");
            Scanner input = new Scanner(System.in);

            do {
                System.out.println();
                System.out.print("Choice : ");
                choice = input.next();
                String selection = choice.toLowerCase(); //This will convert the input value to lowercase. this will help avoid case sensitive issues.

                switch (selection) {

                    case "v":
                        viewPlayers();
                        break;
                    case "a":

                        addPlayer();
                        break;

                    case "b":
                        bestBatman();
                        break;

                    case "c":
                        bestBowler();
                        break;

                    case "d":
                        bestKeeper();
                        break;
                    case "q":
                        System.out.println("Thank you for using");
                        break;
                    default:
                        System.out.println("Invalid input! Please Enter one of these letters: V,A,B,C,D");
                        menu();
                }


            }
            while (!(choice.equalsIgnoreCase("v") || choice.equalsIgnoreCase("a") || choice.equalsIgnoreCase("b") || choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("d")|| choice.equalsIgnoreCase("q") ));
        }

        public void viewPlayers() {

        }

        public void addPlayer() {


        }

        public void bestBatman() {

        }

        public void bestBowler() {

        }

        public void bestKeeper() {
        }
    }
}
