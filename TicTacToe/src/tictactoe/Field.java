/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author SFx
 */
public class Field {
    private static final int MAX_LINE_SIZE =3;
    private static final int MAX_LINES_COUNT =3;
    private int fieldSize;
    private final char[][] field;
    
 
    public  Field()
    {
       this(3);
        
    }
    
    public Field(int newFieldSize)
    {
       fieldSize=newFieldSize;  
       field = new char[fieldSize][fieldSize];
    }
    private void eraseFieldAll ()
    {
        for (int i=0;i<MAX_LINE_SIZE;i++) 
            for (int j=0;i<MAX_LINES_COUNT;j++) 
            {
                this.field[i][j] = ' ';
        
            }
    }
    
    public void showFieldLine(int lineNumber) {
    for (int i=0;i<MAX_LINE_SIZE;i++) {
    System.out.print("["+field[i][lineNumber]+"]");
            }
        }
    
    public void showFieldAll() {
        for (int i=0;i<MAX_LINES_COUNT;i++){
            showFieldLine(i);
            System.out.println();
            
        }
    }

 
}
