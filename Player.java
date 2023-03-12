package X0Game;

import java.util.Scanner;

public class Player {
    int ID;
    char skin;

    Player(int id) {
        this.ID = id;
        getSkin();
    }

    void getSkin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + this.ID + ", choose a symbol: ");
        this.skin = scanner.next().charAt(0);
    }
}
