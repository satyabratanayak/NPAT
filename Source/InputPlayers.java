package Source;

public class InputPlayers {
    public String playerName;

    String[] name; // {"Name", 5}
    String[] place; // {"Place",10}
    String[] animal;
    String[] thing;
    int[][] marks;
    int result;

    public InputPlayers(int iterations) {
        name = new String[iterations];
        place = new String[iterations];
        animal = new String[iterations];
        thing = new String[iterations];
        marks = new int[iterations][4];
    }

    public static void main(String[] args) {

    }
}
