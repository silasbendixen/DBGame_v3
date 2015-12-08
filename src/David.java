import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by jbo on 07-12-2015.
 */
public class David implements KeyListener {

Int id = 3

// 3 er kun midlertidigt til test og skal selv hente/oprette et ID senere hen

    Controller controller;

    public David(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W){
            controller.moveUp(id);
        }
        if(key == KeyEvent.VK_S){
            controller.moveDown(id);
        }
        if(key == KeyEvent.VK_A){
            controller.moveLeft(id);
        }
        if(key == KeyEvent.VK_D){
            controller.moveRight(id);
        }
            if(key == KeyEvent.VK_UP){
            controller.moveUp(id);
        }
        if(key == KeyEvent.VK_DOWN){
            controller.moveDown(id);
        }
        if(key == KeyEvent.VK_LEFT){
            controller.moveLeft(id);
        }
        if(key == KeyEvent.VK_RIGHT){
            controller.moveRight(id);
        }
        System.out.println(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
