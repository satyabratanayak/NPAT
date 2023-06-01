package Source;

import java.util.Scanner;
import Game.Play;

public class Calculations {
    public static void getValues(int totalPlayers, char slider, Scanner sc, int i) {
        // Player One Inputs
        System.out.println("Enter Name starts with " + slider);
        Play.player1.name[i] = sc.next().toLowerCase();
        System.out.println("Enter place starts with " + slider);
        Play.player1.place[i] = sc.next().toLowerCase();
        System.out.println("Enter animal starts with " + slider);
        Play.player1.animal[i] = sc.next().toLowerCase();
        System.out.println("Enter thing starts with " + slider);
        Play.player1.thing[i] = sc.next().toLowerCase();
        // Player two Inputs
        System.out.println("Enter Name starts with " + slider);
        Play.player2.name[i] = sc.next().toLowerCase();
        System.out.println("Enter place starts with " + slider);
        Play.player2.place[i] = sc.next().toLowerCase();
        System.out.println("Enter animal starts with " + slider);
        Play.player2.animal[i] = sc.next().toLowerCase();
        System.out.println("Enter thing starts with " + slider);
        Play.player2.thing[i] = sc.next().toLowerCase();
        // Player Three Inputs
        System.out.println("Enter Name starts with " + slider);
        Play.player3.name[i] = sc.next().toLowerCase();
        System.out.println("Enter place starts with " + slider);
        Play.player3.place[i] = sc.next().toLowerCase();
        System.out.println("Enter animal starts with " + slider);
        Play.player3.animal[i] = sc.next().toLowerCase();
        System.out.println("Enter thing starts with " + slider);
        Play.player3.thing[i] = sc.next().toLowerCase();

    }

    public static void printValues(int iterations) {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Printing All Values for" + iterations);
            System.out.println("-----------------------------------------------------");
            System.out.println("-----------------------------------------------------");
            System.out.println("Printing values... of Player One...");
            System.out.println("Printing Name...");
            System.out.println(Play.player1.name[i]);
            System.out.println("Printing Place...");
            System.out.println(Play.player1.place[i]);
            System.out.println("Printing Animal...");
            System.out.println(Play.player1.animal[i]);
            System.out.println("Printing Thing...");
            System.out.println(Play.player1.thing[i]);
            System.out.println("Printing values... of Player Two...");
            System.out.println("Printing Name...");
            System.out.println(Play.player2.name[i]);
            System.out.println("Printing Place...");
            System.out.println(Play.player2.place[i]);
            System.out.println("Printing Animal...");
            System.out.println(Play.player2.animal[i]);
            System.out.println("Printing Thing...");
            System.out.println(Play.player2.thing[i]);
            System.out.println("Printing values... of Player three...");
            System.out.println("Printing Name...");
            System.out.println(Play.player3.name[i]);
            System.out.println("Printing Place...");
            System.out.println(Play.player3.place[i]);
            System.out.println("Printing Animal...");
            System.out.println(Play.player3.animal[i]);
            System.out.println("Printing Thing...");
            System.out.println(Play.player3.thing[i]);
        }
    }

    public static void getMarks(InputPlayers player1, InputPlayers player2, InputPlayers player3, int iterations) {
        // All Results for Name
        {
            boolean checkNull1 = player1.name[iterations].isEmpty() || player1.name[iterations] == null;
            boolean checkNull2 = player2.name[iterations].isEmpty() || player2.name[iterations] == null;
            boolean checkNull3 = player3.name[iterations].isEmpty() || player3.name[iterations] == null;
            boolean notEquals1 = player1.name[iterations] != player2.name[iterations];
            boolean notEquals2 = player2.name[iterations] != player3.name[iterations];
            boolean notEquals3 = player1.name[iterations] != player3.name[iterations];
            if (checkNull1) {
                player1.marks[iterations][0] = 0;
            }
            if (checkNull2) {
                player2.marks[iterations][0] = 0;
            }
            if (checkNull3) {
                player3.marks[iterations][0] = 0;
            }
            if (player1.name[iterations].equals(player2.name[iterations])) {
                player1.marks[iterations][0] = 5;
                player2.marks[iterations][0] = 5;
            }
            if (player2.name[iterations].equals(player3.name[iterations])) {
                player2.marks[iterations][0] = 5;
                player3.marks[iterations][0] = 5;
            }
            if (player1.name[iterations].equals(player3.name[iterations])) {
                player1.marks[iterations][0] = 5;
                player3.marks[iterations][0] = 5;
            }
            if (notEquals1 && notEquals2 && notEquals3) {
                player1.marks[iterations][0] = 10;
                player2.marks[iterations][0] = 10;
                player3.marks[iterations][0] = 10;
            }
        }

        // for place
        {
            boolean checkNull1 = player1.place[iterations].isEmpty() || player1.place[iterations] == null;
            boolean checkNull2 = player2.place[iterations].isEmpty() || player2.place[iterations] == null;
            boolean checkNull3 = player3.place[iterations].isEmpty() || player3.place[iterations] == null;
            boolean notEquals1 = player1.place[iterations] != player2.place[iterations];
            boolean notEquals2 = player2.place[iterations] != player3.place[iterations];
            boolean notEquals3 = player1.place[iterations] != player3.place[iterations];
            if (checkNull1) {
                player1.marks[iterations][1] = 0;
            }
            if (checkNull2) {
                player2.marks[iterations][1] = 0;
            }
            if (checkNull3) {
                player3.marks[iterations][1] = 0;
            }
            if (player1.place[iterations].equals(player2.place[iterations])) {
                player1.marks[iterations][1] = 5;
                player2.marks[iterations][1] = 5;
            }
            if (player2.place[iterations].equals(player3.place[iterations])) {
                player2.marks[iterations][1] = 5;
                player3.marks[iterations][1] = 5;
            }
            if (player1.place[iterations].equals(player3.place[iterations])) {
                player1.marks[iterations][1] = 5;
                player3.marks[iterations][1] = 5;
            }
            if (notEquals1 && notEquals2 && notEquals3) {
                player1.marks[iterations][1] = 10;
                player2.marks[iterations][1] = 10;
                player3.marks[iterations][1] = 10;
            }
        }
        // for animal
        {
            boolean checkNull1 = player1.animal[iterations].isEmpty() || player1.animal[iterations] == null;
            boolean checkNull2 = player2.animal[iterations].isEmpty() || player2.animal[iterations] == null;
            boolean checkNull3 = player3.animal[iterations].isEmpty() || player3.animal[iterations] == null;
            boolean notEquals1 = player1.animal[iterations] != player2.animal[iterations];
            boolean notEquals2 = player2.animal[iterations] != player3.animal[iterations];
            boolean notEquals3 = player1.animal[iterations] != player3.animal[iterations];
            if (checkNull1) {
                player1.marks[iterations][2] = 0;
            }
            if (checkNull2) {
                player2.marks[iterations][2] = 0;
            }
            if (checkNull3) {
                player3.marks[iterations][2] = 0;
            }
            if (player1.name[iterations].equals(player2.name[iterations])) {
                player1.marks[iterations][2] = 5;
                player2.marks[iterations][2] = 5;
            }
            if (player2.name[iterations].equals(player3.name[iterations])) {
                player2.marks[iterations][2] = 5;
                player3.marks[iterations][2] = 5;
            }
            if (player1.name[iterations].equals(player3.name[iterations])) {
                player1.marks[iterations][2] = 5;
                player3.marks[iterations][2] = 5;
            }
            if (notEquals1 && notEquals2 && notEquals3) {
                player1.marks[iterations][2] = 10;
                player2.marks[iterations][2] = 10;
                player3.marks[iterations][2] = 10;
            }
        }
        // thing
        {
            boolean checkNull1 = player1.thing[iterations].isEmpty() || player1.thing[iterations] == null;
            boolean checkNull2 = player2.thing[iterations].isEmpty() || player2.thing[iterations] == null;
            boolean checkNull3 = player3.thing[iterations].isEmpty() || player3.thing[iterations] == null;
            boolean notEquals1 = player1.thing[iterations] != player2.thing[iterations];
            boolean notEquals2 = player2.thing[iterations] != player3.thing[iterations];
            boolean notEquals3 = player1.thing[iterations] != player3.thing[iterations];
            if (checkNull1) {
                player1.marks[iterations][3] = 0;
            }
            if (checkNull2) {
                player2.marks[iterations][3] = 0;
            }
            if (checkNull3) {
                player3.marks[iterations][3] = 0;
            }
            if (player1.thing[iterations].equals(player2.thing[iterations])) {
                player1.marks[iterations][3] = 5;
                player2.marks[iterations][3] = 5;
            }
            if (player2.thing[iterations].equals(player3.thing[iterations])) {
                player2.marks[iterations][3] = 5;
                player3.marks[iterations][3] = 5;
            }
            if (player1.thing[iterations].equals(player3.thing[iterations])) {
                player1.marks[iterations][3] = 5;
                player3.marks[iterations][3] = 5;
            }
            if (notEquals1 && notEquals2 && notEquals3) {
                player1.marks[iterations][3] = 10;
                player2.marks[iterations][3] = 10;
                player3.marks[iterations][3] = 10;
            }
        }
    }

    public static PlayResults getResult(InputPlayers player1, InputPlayers player2, InputPlayers player3) {
        for (int i = 0; i < player1.marks.length; i++) {
            for (int j = 0; j < 4; j++) {
                player1.result += player1.marks[i][j];
            }
        }
        for (int i = 0; i < player2.marks.length; i++) {
            for (int j = 0; j < 4; j++) {
                player2.result += player2.marks[i][j];
            }
        }
        for (int i = 0; i < player3.marks.length; i++) {
            for (int j = 0; j < 4; j++) {
                player3.result += player3.marks[i][j];
            }
        }
        PlayResults playerResult = new PlayResults(player1.result, player2.result, player3.result);
        return playerResult;
    }

    public static void printResults() {
        getResult(Play.player1, Play.player2, Play.player3);
        System.out.println(" The game ends !... Displaying results");
        System.out.println(Play.player1.playerName + " : " + Play.player1.result);
        System.out.println(Play.player2.playerName + " : " + Play.player2.result);
        System.out.println(Play.player3.playerName + " : " + Play.player3.result);
        if (Play.player1.result > Play.player2.result && Play.player1.result > Play.player3.result) {
            System.out.println("congratulations !" + Play.player1.playerName + " is the winner !");
        } else if (Play.player2.result > Play.player1.result && Play.player2.result > Play.player3.result) {
            System.out.println("congratulations !" + Play.player2.playerName + " is the winner !");
        } else if (Play.player3.result > Play.player2.result && Play.player3.result > Play.player1.result) {
            System.out.println("congratulations !" + Play.player3.playerName + " is the winner !");
        }
        if (Play.player1.result == Play.player2.result && Play.player1.result == Play.player3.result
                && Play.player2.result == Play.player3.result) {
            System.out.println("It's A Tie between Three players");
        }
    }
}
