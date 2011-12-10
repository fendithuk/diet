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
         for (int i = 0; i < 3; i++) {
            if (selectPoint == 0)//play
            {
                
            } else if (selectPoint == 1) //rekor
            {


            } else if (selectPoint == 2) //panduan
            {

            }
        }
    }

}
