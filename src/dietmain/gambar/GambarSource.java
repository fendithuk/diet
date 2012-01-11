/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dietmain.gambar;

import java.io.IOException;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

/**
 *
 * @author fendi
 */
public class GambarSource {

    public static Hashtable img = new Hashtable();
    public static GambarSource res = new GambarSource();

    public GambarSource() {
        try {
            //Letak Gambar Menu
            img.put("a56", Image.createImage("/dietmain/gambar56/a.png"));
            img.put("a64", Image.createImage("/dietmain/gambar64/a.png"));

            img.put("b56", Image.createImage("/dietmain/gambar56/b.png"));
            img.put("b64", Image.createImage("/dietmain/gambar64/b.png"));

            img.put("ab56", Image.createImage("/dietmain/gambar56/ab.png"));
            img.put("ab64", Image.createImage("/dietmain/gambar64/ab.png"));

            img.put("o56", Image.createImage("/dietmain/gambar56/o.png"));
            img.put("o64", Image.createImage("/dietmain/gambar64/o.png"));

            img.put("timbangan56", Image.createImage("/dietmain/gambar56/timbangan.png"));
            img.put("timbangan64", Image.createImage("/dietmain/gambar64/timbangan.png"));

            img.put("bg240", Image.createImage("/dietmain/gambar/bg.png"));
            img.put("bgTr", Image.createImage("/dietmain/gambar/BgTr.png"));

            img.put("mulai", Image.createImage("/dietmain/gambar/mulai.png"));
            img.put("pencarian", Image.createImage("/dietmain/gambar/pencarian.png"));
            img.put("panduan", Image.createImage("/dietmain/gambar/panduan.png"));
            img.put("exit", Image.createImage("/dietmain/gambar/exit.png"));

            img.put("suntik", Image.createImage("/dietmain/gambar/suntik.png"));





        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static GambarSource getInstance() {
        return res;
    }
}
