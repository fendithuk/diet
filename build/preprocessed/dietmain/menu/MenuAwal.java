/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dietmain.menu;

import dietmain.Diet;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 *
 * @author fendi
 */
public class MenuAwal extends Canvas{

    private final Diet dt;
    private int selectPoint = 0;
    private Image gmbr;

    public MenuAwal(Diet dt) {
        this.dt = dt;
    }



    protected void paint(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
