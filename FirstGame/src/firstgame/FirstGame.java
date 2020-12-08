
package firstgame;

import java.awt.Toolkit;

public class FirstGame {

    
    public static void main(String[] args) {
        Game g = new Game();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        g.setSize(xSize,ySize);
        g.setVisible(true);
        
    }
    
}
