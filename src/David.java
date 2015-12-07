import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by jbo on 07-12-2015.
 */
public class David implements KeyListener {

    Controller controller;

    public David(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
