package Game;

import java.util.Scanner;

import Source.Calculations;
import Source.InputPlayers;
import Source.Slider;

public class Play {
    public static InputPlayers player1;
    public static InputPlayers player2;
    public static InputPlayers player3;
    public static char slider = Slider.getSlider();
    public static int iterations = 0;

    public static void getInput(Scanner sc) {
        System.out.println("How many iterations do you want?");
        iterations = sc.nextInt();
        System.out.println("Let's play the game for " + iterations + " times");
        player1 = new InputPlayers(iterations);
        player2 = new InputPlayers(iterations);
        player3 = new InputPlayers(iterations);
        // Enter the game
        System.out.println(" You entered intothe three player game ");
        System.out.println("Enter player's name");
        System.out.println("Player1 : ");
        player1.playerName = sc.next();
        System.out.println("Player2 : ");
        player2.playerName = sc.next();
        System.out.println("Player3 : ");
        player3.playerName = sc.next();
        System.out.println("Lets Play " + player1.playerName + ", " + player2.playerName + "& " + player3.playerName);

    }

    public static void startGame(Scanner sc) {
        System.out.println("Your GAME starts NOW!");
        // Loop through
        for (int i = 0; i < iterations; i++) {
            slider = Slider.getSlider();
            System.out.println("Your First Letter to start with is : " + '\"' + slider + '\"');
            System.out.println("");
            // Game start
            Calculations.getValues(3, slider, sc, i);
            System.out.println("Getting Values... Completed");
        }
        Calculations.printValues(iterations);

    }

    public static void getFinalresults() {
        Calculations.printResults();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getInput(sc);
        startGame(sc);
        getFinalresults();
        sc.close();
    }
}
