package tictactoe;

/**
 *
 * @author SFx
 */
public class Field {

    private static final int DEFAULT_MAX_LINE_TO_WIN = 3;
    private static final char DEFAULT_CHAR_X = 'X';
    private static final char DEFAULT_CHAR_O = 'O';
    private static final int MAX_FIELD_SIZE = 3;
    private static int fieldSize;
    private final char[][] field;

    public Field() {
        this(3);
    }

    public Field(int newFieldSize) {
        if (newFieldSize > 0 && newFieldSize <= MAX_FIELD_SIZE) {
            fieldSize = newFieldSize;
        }
        field = new char[fieldSize][fieldSize];
        //  System.out.println(fieldSize);
        eraseFieldAll();
    }

    private void eraseFieldAll() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                this.field[i][j] = ' ';
            }
        }
    }

    private void showFieldLine(int lineNumber) {
        for (int i = 0; i < fieldSize; i++) {
            System.out.print("[" + field[i][lineNumber] + "]");
        }
    }

    public void showFieldAll() {
        for (int i = 0; i < fieldSize; i++) {
            showFieldLine(i);
            System.out.println();
        }
    }

    public void setXinFieldXY(int x, int y) {
        if (x > 0 && x <= fieldSize) {
            if (y > 0 && x <= fieldSize) {
                field[x - 1][y - 1] = DEFAULT_CHAR_X;
            } else {
                System.out.println("Error " + DEFAULT_CHAR_X + " setting in colomn");
            }

        } else {
            System.out.println("Error " + DEFAULT_CHAR_X + " setting in row");
        }
    }

    public void setOinFieldXY(int x, int y) {
        if (x > 0 && x <= fieldSize) {
            if (y > 0 && x <= fieldSize) {
                field[x - 1][y - 1] = DEFAULT_CHAR_O;
            } else {
                System.out.println("Error " + DEFAULT_CHAR_O + " setting in colomn");
            }

        } else {
            System.out.println("Error " + DEFAULT_CHAR_O + " setting in row");
        }
    }

    public void isOWin() {
        int row;
        int col;
        row = 0;
        col = 0;

        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {

                col = 0;
                for (int k = 0; k < fieldSize; k++) {

                    if (field[i][j] == DEFAULT_CHAR_O) {
                        row++;
                    }

                    if (field[k][i] == DEFAULT_CHAR_O) {
                        col++;
                    }
                }
                if (row == DEFAULT_MAX_LINE_TO_WIN) {
                    System.out.println("RowO " + (i + 1));
                }
                 if (col == DEFAULT_MAX_LINE_TO_WIN) {
                    System.out.println("ColO " + (j + 1));
                }
                row = 0;
            }
        }
    }
}
