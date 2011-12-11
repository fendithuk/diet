/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dietmain.menu;

import dietmain.Diet;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author fendi
 */
public class MenuUtama extends Canvas {

    private final Diet dt;
    private int selectPoint = 0;

    public MenuUtama(Diet dt) {
        this.dt = dt;
    }

    protected void paint(Graphics g) {
        for (int i = 0; i < 3; i++) {
            if (selectPoint == 0)//play
            {
                g.setColor(0x000000);

                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_LARGE));
                g.drawString("Menu 1", 100, 50, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 2", 100, 100, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 3", 100, 150, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 4", 100, 200, Graphics.TOP | Graphics.LEFT);
            } else if (selectPoint == 1) //rekor
            {
                g.setColor(0xffffff);

                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_LARGE));
                g.drawString("Menu 1", 100, 50, Graphics.TOP | Graphics.LEFT);
                g.setColor(0x000000);
                g.drawString("Menu 2", 100, 100, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 3", 100, 150, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 4", 100, 200, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 2) //panduan
            {
                g.setColor(0xffffff);

                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_LARGE));
                g.drawString("Menu 1", 100, 50, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 2", 100, 100, Graphics.TOP | Graphics.LEFT);
                g.setColor(0x000000);
                g.drawString("Menu 3", 100, 150, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 4", 100, 200, Graphics.TOP | Graphics.LEFT);

            }else if (selectPoint == 3) //panduan
            {
                g.setColor(0xffffff);

                g.setFont(Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_LARGE));
                g.drawString("Menu 1", 100, 50, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 2", 100, 100, Graphics.TOP | Graphics.LEFT);
                g.setColor(0xffffff);
                g.drawString("Menu 3", 100, 150, Graphics.TOP | Graphics.LEFT);
                g.setColor(0x000000);
                g.drawString("Menu 4", 100, 200, Graphics.TOP | Graphics.LEFT);

            }
        }
    }

    protected void keyPressed(int keyCode) {
        if (this.getGameAction(keyCode) == MenuUtama.DOWN) {
            selectPoint = selectPoint + 1;
            if (selectPoint > 4 - 1) {
                selectPoint = 0;
            }
        } else if (this.getGameAction(keyCode) == MenuUtama.UP) {
            selectPoint = selectPoint - 1;
            if (selectPoint < 0) {
                selectPoint = 4 - 1;
            }
        } else if (this.getGameAction(keyCode) == MenuUtama.FIRE) {
            if (selectPoint == 0) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getListGolDarahA());
            } else if (selectPoint == 1) {
            } else if (selectPoint == 2) {
                 
            }else if (selectPoint == 3) {
                 Display ds = dt.getDisplay();
                ds.setCurrent(dt.getMa());
            }
        }
        this.repaint();
    }
}
