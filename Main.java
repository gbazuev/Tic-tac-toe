package X0Game;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player(1);
        Player playerTwo = new Player(2);

        Game game = new Game();
        game.game(playerOne, playerTwo);
    }
}
