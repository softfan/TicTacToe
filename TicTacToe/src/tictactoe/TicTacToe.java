/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author SFx
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Field field = new Field();
        field.showFieldAll();
        field.setOinFieldXY(1, 2);
        field.setOinFieldXY(2, 2);
        field.setOinFieldXY(3, 2);
        field.showFieldAll();
        field.setXinFieldXY(3, 1);
        field.showFieldAll();
        field.isOWin();
    }
}
