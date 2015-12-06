import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

/**
 * Created by Sebastian on 04/12/2015.
 */
public class Board extends JPanel {

    private final int canvasWidth;
    private final int canvasHeight;

    public Board(int canvasWidth, int canvasHeight) {
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;

        this.setBackground(Color.red);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.fillRect(1,5,50,100);
        g.drawString("test", 20, 20);
    }

    public void updateObjects(double delta) {

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(canvasWidth, canvasHeight);
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    @Override
    public Dimension getMaximumSize() {
        return getPreferredSize();
    }

    public void synchronizePieces(Hashtable allPieces) {
        //TODO: Opdater dem der ikke findes i forvejen
    }
}
