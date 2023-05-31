import java.util.Scanner;
import Source.InputPlayers;
import Source.Slider;

public class Game {
    public static void getInput(Scanner sc) {
        // Enter the game
        System.out.println(" You entered intothe three player game ");
        System.out.println("Enter player's name");
        // Taking 1st player's name
        System.out.println("Player1 : ");
        InputPlayers input1 = new InputPlayers(sc.next());
        String player1 = input1.playerName;
        // Taking 2nd player's name
        System.out.println("Player2 : ");
        InputPlayers input2 = new InputPlayers(sc.next());
        String player2 = input2.playerName;
        // Taking 3rd player's name
        System.out.println("Player3 : ");
        InputPlayers input3 = new InputPlayers(sc.next());
        String player3 = input3.playerName;
        // Confirmation message
        System.out.println("Lets Play " + player1 + ", " + player2 + " & " + player3);
        System.out.println("How many iterations do you want?");
        int iterations = sc.nextInt();
        System.out.println("Let's play the game for " + iterations + " times");
    }

    public static void startGame(Scanner sc) {
        System.out.println("Your GAME starts NOW!");
        char slider = Slider.getSlider();
        System.out.println("Your First Letter to start with is : " + '\"' + slider + '\"');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getInput(sc);
        startGame(sc);
        sc.close();
    }
}
