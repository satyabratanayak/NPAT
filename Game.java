import java.util.Scanner;
import Source.InputPlayers;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the game
        System.out.println(" You entered intothe three player game ");
        System.out.println("Enter player's name");
        System.out.println("Player1 : ");
        String player1Name = sc.next();
        InputPlayers inputOne = new InputPlayers(player1Name);
        inputOne.player1Name = player1Name;
        System.out.println(inputOne.playerName);
        // taking 1st player's name
        // System.out.println("player2 : ");
        // String player2 = sc.next();//taking 2nd player's name
        // System.out.println("player3 : ");
        // String player3 = sc.next();//taking 3rd player's name
        // System.out.println("How many iterations do you want?");
        // int iterations = sc.nextInt();
        // System.out.println("Let's play the game" + iterations + " times");
        // char slider = Slider.getSlider();
        // System.out.println(slider);
        sc.close();
    }
}
