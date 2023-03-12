package X0Game;

public class WinningChecker {

    boolean check(Field gameField, char playerSymbol)   {
        if (lineCheck(gameField, playerSymbol)) {
            return true;
        }
        else if (columnCheck(gameField, playerSymbol))  {
            return true;
        }
        else if (rightDiagonalCheck(gameField, playerSymbol))  {
            return true;
        }
        else return leftDiagonalCheck(gameField, playerSymbol);
    }

    boolean lineCheck(Field gameField, char playerSymbol) {
        for (int i = 0; i < gameField.field.length; i++) {
            int pointer = 0;
            for (int j = 0; j < gameField.field.length; j++) {
                if (gameField.field[i][j] != playerSymbol) {
                    break;
                }
                pointer++;
                if (pointer == gameField.field.length) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean columnCheck(Field gameField, char playerSymbol) {
        for (int i = 0; i < gameField.field.length; i++) {
            int pointer = 0;
            for (int j = 0; j < gameField.field.length; j++) {
                if (gameField.field[j][i] != playerSymbol)  {
                    break;
                }
                pointer++;
                if (pointer == gameField.field.length) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean rightDiagonalCheck(Field gameField, char playerSymbol) {
        for (int i = 0; i < gameField.field.length; i++)    {
            if (gameField.field[i][i] != playerSymbol)  {
                return false;
            }
        }
        return true;
    }

    boolean leftDiagonalCheck(Field gameField, char playerSymbol) {
        for (int i = gameField.field.length - 1; i >= 0; i--)    {
            if (gameField.field[i][gameField.field.length - i - 1] != playerSymbol)  {
                return false;
            }
        }
        return true;
    }
}
