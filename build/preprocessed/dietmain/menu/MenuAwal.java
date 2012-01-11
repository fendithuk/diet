/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dietmain.menu;

import dietmain.Diet;
import dietmain.gambar.GambarSource;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
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


    void menu(Graphics g) {
    }

    protected void paint(Graphics g) {
        double h = getWidth() / 9;
        int h1 = (int) h;
        System.out.println(h1);
        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (int i = 0; i < 3; i++) {
            if (selectPoint == 0)//play
            {
                this.gmbr = (Image) GambarSource.img.get("suntik");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) - 26, h1 - 20 + 7, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("mulai");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) + 10, h1, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("pencarian");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 3, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("panduan");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 5, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("exit");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 7, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 1) //rekor
            {
                this.gmbr = (Image) GambarSource.img.get("mulai");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("suntik");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) - 26, h1 * 3 - 20 + 7, Graphics.TOP | Graphics.LEFT);

                this.gmbr = (Image) GambarSource.img.get("pencarian");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) + 10, h1 * 3, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("panduan");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 5, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("exit");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 7, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 2) //panduan
            {
                this.gmbr = (Image) GambarSource.img.get("mulai");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1, Graphics.TOP | Graphics.LEFT);

                this.gmbr = (Image) GambarSource.img.get("pencarian");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 3, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("suntik");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) - 26, h1 * 5 - 20 + 7, Graphics.TOP | Graphics.LEFT);

                this.gmbr = (Image) GambarSource.img.get("panduan");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) + 10, h1 * 5, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("exit");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 7, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 3) //panduan
            {
                this.gmbr = (Image) GambarSource.img.get("mulai");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1, Graphics.TOP | Graphics.LEFT);

                this.gmbr = (Image) GambarSource.img.get("pencarian");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 3, Graphics.TOP | Graphics.LEFT);

                this.gmbr = (Image) GambarSource.img.get("panduan");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8), h1 * 5, Graphics.TOP | Graphics.LEFT);
                this.gmbr = (Image) GambarSource.img.get("suntik");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) - 26, h1 * 7 - 20 + 7, Graphics.TOP | Graphics.LEFT);

                this.gmbr = (Image) GambarSource.img.get("exit");
                g.drawImage(gmbr, (getWidth() / 2) - (getWidth() / 8) + 10, h1 * 7, Graphics.TOP | Graphics.LEFT);

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
                ds.setCurrent(dt.getMu());
            } else if (selectPoint == 1) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormPencarian());
            } else if (selectPoint == 2) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormPanduan());
            } else if (selectPoint == 3) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getSplashScreenKeluar());
            }
        }
        this.repaint();
    }
}
