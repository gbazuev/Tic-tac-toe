package X0Game;

import java.util.Scanner;

public class Field {
    char[][] field;
    int size;
    void initializeField(Scanner scanner)  {
        System.out.println("Hello! Let's play tic-tac-toe!");

        System.out.print("Enter field size: ");
        this.size = checkFieldSize(scanner, scanner.nextInt());

        this.field = new char[this.size][this.size];

        for (int rows = 0; rows < this.size; rows++)  {
            for (int cols = 0; cols
                    < this.size; cols++)   {
                this.field[rows][cols] = ' ';
            }
        }
    }

    void printField()   {
        System.out.print("\t\t\t\t\t\t\t\t    ");
        for (int numbers = 1; numbers < this.size + 1; numbers++)   {
            System.out.print(numbers + generateWhiteSpace(numbers));
        }

        System.out.println();

        for (int cols = 1; cols < this.size + 1; cols++) {
            System.out.print("\t\t\t\t\t\t\t\t" + cols + generateWhiteSpace(cols));
            for (int rows = 0; rows < this.size; rows++)    {
                System.out.print("[" + this.field[cols - 1][rows] + "]");
            }
            System.out.println();
        }
    }

    void updateField(int[] coordinates, char playerSymbol) {
            this.field[coordinates[0]][coordinates[1]] = playerSymbol;
    }

    boolean isExist(char[][] matrix, int row, int col)   {
        boolean isBig = row > this.size || col > this.size;
        boolean isSmall = row < 0 || col < 0;

        if (isBig || isSmall)   {
            return true;
        }

        return !(matrix[row][col] == ' ');
    }

    int checkFieldSize(Scanner scanner, int size)    {
        while (size < 3)    {
            System.out.print("You can't create a field with such small size.");
            System.out.print("Try again: ");
            size = scanner.nextInt();
        }
        return size;
    }

    int[] validateCellCoordinates(Scanner scanner, int row, int col) {
            while (isExist(this.field, row, col))   {
                System.out.print("Incorrect data! Try again: ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            }
            return new int[] {row, col};
        }

        private String generateWhiteSpace(int pointer)  {
            if (String.valueOf(pointer).length() == 1)  {
                return "  ";
            }
            return " ";
        }
    }
