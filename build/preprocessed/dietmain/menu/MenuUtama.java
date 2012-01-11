/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dietmain.menu;

import dietmain.Diet;
import dietmain.gambar.GambarSource;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 *
 * @author fendi
 */
public class MenuUtama extends Canvas implements CommandListener{

    private final Diet dt;
    private int selectPoint = 0;
    private Image menu;
    private Command commBack = null;

    public MenuUtama(Diet dt) {
        this.dt = dt;
        this.commBack = new Command("Kembali", Command.BACK, 1);
        setCommandListener(this);
        addCommand(commBack);
    }

    void menu(Graphics g) {
        double lingSatu = getWidth() - ((getWidth() / 6) * 2); //160
        double lingDua = getWidth() - ((getWidth() / 5) * 2); //120
        double w1 = (getWidth() - lingSatu) / 2;
        double h1 = (getHeight() - lingSatu) / 2;
        double w2 = (getWidth() - lingDua) / 2;
        double h2 = (getHeight() - lingDua) / 2;
        double gO = h1 - 25;
        double gB = (getHeight() / 2) - 25;
        double gWB = lingSatu + w1 - 31;
        double gWA = w1 - 23;
        double gHAB = h1 + lingSatu - 31;



        g.setColor(223, 0, 0);
        g.fillArc((int) w1, (int) h1, (int) lingSatu, (int) lingSatu, 90, 360);

        g.setColor(255, 255, 255);
        g.fillArc((int) w2, (int) h2, (int) lingDua, (int) lingDua, 90, 360);

        this.menu = (Image) GambarSource.img.get("o56");
        g.drawImage(menu, (getWidth() / 2) - 25, (int) gO, Graphics.TOP | Graphics.LEFT);

        this.menu = (Image) GambarSource.img.get("b56");
        g.drawImage(menu, (int) gWB, (int) gB, Graphics.TOP | Graphics.LEFT);

        this.menu = (Image) GambarSource.img.get("a56");
        g.drawImage(menu, (int) gWA, (int) gB, Graphics.TOP | Graphics.LEFT);

        this.menu = (Image) GambarSource.img.get("ab56");
        g.drawImage(menu, (getWidth() / 2) - 25, (int) gHAB, Graphics.TOP | Graphics.LEFT);

        this.menu = (Image) GambarSource.img.get("timbangan56");
        g.drawImage(menu, (getWidth() / 2) - 25, (int) gB, Graphics.TOP | Graphics.LEFT);

    }

    protected void paint(Graphics g) {
        double lingSatu = getWidth() - ((getWidth() / 6) * 2); //160
        double lingDua = getWidth() - ((getWidth() / 5) * 2); //120
        double w1 = (getWidth() - lingSatu) / 2;
        double h1 = (getHeight() - lingSatu) / 2;
        double w2 = (getWidth() - lingDua) / 2;
        double h2 = (getHeight() - lingDua) / 2;
        double gO = h1 - 29;
        double gB = (getHeight() / 2) - 29;
        double gWB = lingSatu + w1 - 35;
        double gWA = w1 - 27;
        double gHAB = h1 + lingSatu - 35;

        g.setColor(255, 255, 255);
        g.fillRect(0, 0, getWidth(), getHeight());
        this.menu = (Image) GambarSource.img.get("bg240");
        g.drawImage(menu, 0, 0, Graphics.TOP | Graphics.LEFT);
        this.menu = (Image) GambarSource.img.get("bgTr");
        g.drawImage(menu, 0, 0, Graphics.TOP | Graphics.LEFT);







        for (int i = 0; i < 3; i++) {
            if (selectPoint == 0)//golongan darah O
            {
                menu(g);
                this.menu = (Image) GambarSource.img.get("o64");
                g.drawImage(menu, (getWidth() / 2) - 29, (int) gO, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 1) //timbangan
            {
                menu(g);
                this.menu = (Image) GambarSource.img.get("timbangan64");
                g.drawImage(menu, (getWidth() / 2) - 29, (int) gB, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 2) //golongan darah AB
            {
                menu(g);
                this.menu = (Image) GambarSource.img.get("ab64");
                g.drawImage(menu, (getWidth() / 2) - 29, (int) gHAB, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 3) //golongan darah B
            {
                menu(g);
                this.menu = (Image) GambarSource.img.get("b64");
                g.drawImage(menu, (int) gWB, (int) gB, Graphics.TOP | Graphics.LEFT);

            } else if (selectPoint == 4) //golongan darah A
            {
                menu(g);
                this.menu = (Image) GambarSource.img.get("a64");
                g.drawImage(menu, (int) gWA, (int) gB, Graphics.TOP | Graphics.LEFT);

            }
        }
    }

    protected void keyPressed(int keyCode) {
        if (this.getGameAction(keyCode) == MenuUtama.DOWN) {
            selectPoint = selectPoint + 1;
            if (selectPoint > 5 - 1) {
                selectPoint = 0;
            }
        } else if (this.getGameAction(keyCode) == MenuUtama.UP) {
            selectPoint = selectPoint - 1;
            if (selectPoint < 0) {
                selectPoint = 5 - 1;
            }
        } else if (this.getGameAction(keyCode) == MenuUtama.RIGHT) {
            selectPoint = selectPoint + 1;
            if (selectPoint > 5 - 1) {
                selectPoint = 0;
            }

        } else if (this.getGameAction(keyCode) == MenuUtama.LEFT) {
            selectPoint = selectPoint - 1;
            if (selectPoint < 0) {
                selectPoint = 5 - 1;
            }

        } else if (this.getGameAction(keyCode) == MenuUtama.FIRE) {
            if (selectPoint == 0) {
                
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormGolDarahO());
            } else if (selectPoint == 1) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormHitungBB());
            } else if (selectPoint == 2) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormGolDarahAB());
            } else if (selectPoint == 3) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormGolDarahB());
            }else if (selectPoint == 4) {
                Display ds = dt.getDisplay();
                ds.setCurrent(dt.getFormGolDarahA());
            }
        }
        this.repaint();
    }

     public void commandAction(Command c, Displayable d) {
        if (c.equals(commBack)) {
            Display ds = dt.getDisplay();
            ds.setCurrent(dt.getMa());
        }
    }
    
}
