package X0Game;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    WinningChecker checker = new WinningChecker();
    Field field = new Field();

    Game() {
        this.field.initializeField(this.scanner);
        this.field.printField();
    }

    void game(Player playerOne, Player playerTwo) {
       while (true) {

           turn(playerOne, field);
           if (checker.check(field, playerOne.skin))    {
               break;
           }

           turn (playerTwo, field);
           if (checker.check(field, playerTwo.skin))    {
               break;
           }
       }
    }

    void turn(Player player, Field field) {
        System.out.print("Player " + player.ID + ", time to make turn: ");

        int[] coordinates = field.validateCellCoordinates(scanner, scanner.nextInt() - 1, scanner.nextInt() - 1);

        field.updateField(coordinates, player.skin);
        field.printField();

        if (checker.check(field, player.skin)) {
            System.out.println("Player " + player.ID + ", you WIN");
        }
    }
}
