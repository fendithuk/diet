/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dietmain;

import dietmain.data.DataCari;
import dietmain.data.DataKetGolDarah;
import dietmain.data.DataMakanan;
import dietmain.data.DataSuplemen;
import dietmain.data.Search;
import dietmain.data.TableModelOlahraga;
import dietmain.menu.MenuAwal;
import dietmain.menu.MenuUtama;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import net.mypapit.java.StringTokenizer;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.TableItem;

/**
 * @author fendi
 */
public class Diet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    DataKetGolDarah dkgd = new DataKetGolDarah();
    TableModelOlahraga tmo = new TableModelOlahraga();
    DataSuplemen dsu = new DataSuplemen();
    DataMakanan dm = new DataMakanan();
    Vector v = new Vector(100);
    DataCari dc = new DataCari();
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private java.util.Hashtable __previousDisplayables = new java.util.Hashtable();
    private SplashScreen splashScreenMasuk;
    private SplashScreen splashScreenKeluar;
    private List listPanduaDietMakanan;
    private List listGolDarah;
    private List listMakanan;
    private Form formGambar;
    private ImageItem gambarListmakanan;
    private List listSuplemenPentingA;
    private List listSuplemenPentingAB;
    private List listSuplemenPentingB;
    private Form formKeternganSuplemen;
    private StringItem ketSuplemen;
    private Form formOlahraga;
    private StringItem ketOlahraga;
    private TableItem tableItem;
    private Form formGolDarahA;
    private StringItem golDarahA;
    private Form formPencarian;
    private ChoiceGroup choiceGroupHasil;
    private ChoiceGroup choiceGroupGolDarah;
    private TextField textFieldNamaMakanan;
    private Form formGolDarahB;
    private StringItem golDarahB;
    private Form formGolDarahO;
    private StringItem golDarahO;
    private Form formGolDarahAB;
    private StringItem golDarahAB;
    private List listSuplemenPentingO;
    private Form formHitungBB;
    private ChoiceGroup choiceGroupJK;
    private StringItem stringItemHasilHitung;
    private TextField textFieldTB;
    private Form formListDataMKN;
    private ChoiceGroup choiceGroupListMKN;
    private StringItem stringItemListMKN;
    private Form formPanduan;
    private StringItem stringItem;
    private Form formDetailPencarian;
    private ImageItem imageItemPencarian;
    private StringItem stringItemKeterangan;
    private Command okListGolDarah;
    private Command okMakanan;
    private Command backListGolDarah;
    private Command okKeterangan;
    private Command backToListPanduan;
    private Command okGambar;
    private Command b;
    private Command backToMenuUtama;
    private Command stopCommand;
    private Command backToKeterangan;
    private Command backToSuplemen;
    private Command backFormGolDarah;
    private Command backTo;
    private Command okListGolDarah1;
    private Command okHitung;
    private Command backToListMakanan;
    private Command okDetail;
    private Command okCari;
    private Command backPencarian;
    private Command backToMenuAwal;
    private SimpleTableModel tableModel1;
    private Image image1;
    //</editor-fold>//GEN-END:|fields|0|
    /**
     * The Diet constructor.
     */
    private MenuAwal ma;
    private MenuUtama mu;
 

    public MenuAwal getMa() {
        return ma;
    }

    public MenuUtama getMu() {
        return mu;
    }

    public Diet() {
        ma = new MenuAwal(this);
        mu = new MenuUtama(this);

    }

    public void lisGolA() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu1A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa1A();

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh1A()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman1A()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void lisGolO() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta1O();

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu1O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh1O()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman1O()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void lisGolB() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak1B();

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji1B();

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu1B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh1B()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }

    public void lisGolAB() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu1AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh1AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman1AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }


     public void lisGolA2() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta2A()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh2A()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa2A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman2A();


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

     public void lisGolB2() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta2B()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh2B()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa2B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman2B()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

     public void lisGolAB2() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta2AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh2AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa2AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman2AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

      public void lisGolO2() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta2O()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh2O()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa2O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman2O();


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

      public void lisGolA3() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta3A()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh3A()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa3A()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman3A()[choiceGroupListMKN.getSelectedIndex()];



                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

      public void lisGolB3() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta3B()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu3B()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh3B()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa3B();

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman3B()[choiceGroupListMKN.getSelectedIndex()];



                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

       public void lisGolAB3() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta3AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu3AB()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh3AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa3AB()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman3AB()[choiceGroupListMKN.getSelectedIndex()];



                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

       public void lisGolO3() {
        String ticker2 = getFormListDataMKN().getTitle();
        if (ticker2.equals("Daging dan Unggas")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getDagingUnggas3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Makanan Hasil Laut")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMakananLaut3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Minyak dan Lemak")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinyakLemak3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Kacang-kacangan dan Biji-bijian")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getKacangBiji3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Polong-polongan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPolong3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Padi-padian (Serella), Roti, dan Pasta")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPadiRotiPasta3O()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Sayur-sayuran")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getSayur3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Buah-buahan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getBuah3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Jus dan Sirup")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getJusSirop3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        if (ticker2.equals("Rempah-rempah dan Bumbu-bumbuan")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getRempahBumbu3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Tanaman Obat dan Teh Herbal")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getObatTeh3O()[choiceGroupListMKN.getSelectedIndex()];


                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Penyedap Rasa")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getPenyedapRasa3O()[choiceGroupListMKN.getSelectedIndex()];

                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (ticker2.equals("Berbagai Minuman")) {
            try {
                PisahKata p = new PisahKata();
                Image img = null;
                String s = dm.getMinuman3O()[choiceGroupListMKN.getSelectedIndex()];



                p.getData(s);
                System.out.println((String) p.v.elementAt(1));
                img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(1));
                getGambarListmakanan().setImage(img);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

       //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
       /**
        * Switches a display to previous displayable of the current displayable.
        * The <code>display</code> instance is obtain from the <code>getDisplay</code> method.
        */
       private void switchToPreviousDisplayable() {
           Displayable __currentDisplayable = getDisplay().getCurrent();
           if (__currentDisplayable != null) {
               Displayable __nextDisplayable = (Displayable) __previousDisplayables.get(__currentDisplayable);
               if (__nextDisplayable != null) {
                   switchDisplayable(null, __nextDisplayable);
               }
           }
       }
       //</editor-fold>//GEN-END:|methods|0|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
       /**
        * Initilizes the application.
        * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
        */
       private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
         // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
         // write post-initialize user code here
       }//GEN-BEGIN:|0-initialize|2|
       //</editor-fold>//GEN-END:|0-initialize|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
       /**
        * Performs an action assigned to the Mobile Device - MIDlet Started point.
        */
       public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
         // write pre-action user code here
           switchDisplayable(null, getSplashScreenMasuk());//GEN-LINE:|3-startMIDlet|1|3-postAction
         // write post-action user code here
       }//GEN-BEGIN:|3-startMIDlet|2|
       //</editor-fold>//GEN-END:|3-startMIDlet|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
       /**
        * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
        */
       public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
         // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
         // write post-action user code here
       }//GEN-BEGIN:|4-resumeMIDlet|2|
       //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
       /**
        * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
        * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
        * @param nextDisplayable the Displayable to be set
        */
       public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
         // write pre-switch user code here
           Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
           Displayable __currentDisplayable = display.getCurrent();
           if (__currentDisplayable != null  &&  nextDisplayable != null) {
               __previousDisplayables.put(nextDisplayable, __currentDisplayable);
           }
           if (alert == null) {
               display.setCurrent(nextDisplayable);
           } else {
               display.setCurrent(alert, nextDisplayable);
           }//GEN-END:|5-switchDisplayable|1|5-postSwitch
         // write post-switch user code here
       }//GEN-BEGIN:|5-switchDisplayable|2|
       //</editor-fold>//GEN-END:|5-switchDisplayable|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
       /**
        * Called by a system to indicated that a command has been invoked on a particular displayable.
        * @param command the Command that was invoked
        * @param displayable the Displayable where the command was invoked
        */
       public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
         // write pre-action user code here
           if (displayable == formDetailPencarian) {//GEN-BEGIN:|7-commandAction|1|283-preAction
               if (command == backPencarian) {//GEN-END:|7-commandAction|1|283-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getFormPencarian());//GEN-LINE:|7-commandAction|2|283-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|3|129-preAction
           } else if (displayable == formGambar) {
               if (command == backToKeterangan) {//GEN-END:|7-commandAction|3|129-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getFormListDataMKN());//GEN-LINE:|7-commandAction|4|129-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|5|192-preAction
           } else if (displayable == formGolDarahA) {
               if (command == backToMenuUtama) {//GEN-END:|7-commandAction|5|192-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|6|192-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMu());
               } else if (command == okListGolDarah) {//GEN-LINE:|7-commandAction|7|210-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|8|210-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|9|197-preAction
           } else if (displayable == formGolDarahAB) {
               if (command == backToMenuUtama) {//GEN-END:|7-commandAction|9|197-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|10|197-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMu());
               } else if (command == okListGolDarah) {//GEN-LINE:|7-commandAction|11|212-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|12|212-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|13|196-preAction
           } else if (displayable == formGolDarahB) {
               if (command == backToMenuUtama) {//GEN-END:|7-commandAction|13|196-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|14|196-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMu());
               } else if (command == okListGolDarah) {//GEN-LINE:|7-commandAction|15|211-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|16|211-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|17|198-preAction
           } else if (displayable == formGolDarahO) {
               if (command == backToMenuUtama) {//GEN-END:|7-commandAction|17|198-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|18|198-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMu());
               } else if (command == okListGolDarah) {//GEN-LINE:|7-commandAction|19|213-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|20|213-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|21|254-preAction
           } else if (displayable == formHitungBB) {
               if (command == backToMenuUtama) {//GEN-END:|7-commandAction|21|254-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|22|254-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMu());
               } else if (command == okHitung) {//GEN-LINE:|7-commandAction|23|256-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|24|256-postAction
                 // write post-action user code here
                 double hasil = 0;
                 double tinggiBadan = Double.parseDouble(textFieldTB.getString());
                 stringItemHasilHitung.setText("");
                 if (tinggiBadan <= 100 || tinggiBadan >= 250) {
                     stringItemHasilHitung.setText("\nAngka yang anda masukan salah range data antara 100 - 250.");
                 } else {
                     if (choiceGroupJK.getSelectedIndex() == 0) {
                         System.out.println("1");
                         hasil = (tinggiBadan - 100) - (0.10 * (tinggiBadan - 100));
                         stringItemHasilHitung.setText("\nBerat Badan Ideal Anda Adalah " + String.valueOf(hasil) + " Kg");
                     } else if (choiceGroupJK.getSelectedIndex() == 1) {
                         System.out.println(tinggiBadan - 100);
                         hasil = (tinggiBadan - 100) - (0.15 * (tinggiBadan - 100));
                         stringItemHasilHitung.setText("\nBerat Badan Ideal Anda Adalah " + String.valueOf(hasil) + " Kg");
                     }
                 }


               }//GEN-BEGIN:|7-commandAction|25|173-preAction
           } else if (displayable == formKeternganSuplemen) {
               if (command == backToSuplemen) {//GEN-END:|7-commandAction|25|173-preAction
                 // write pre-action user code here
                   switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|26|173-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|27|245-preAction
           } else if (displayable == formListDataMKN) {
               if (command == backToListMakanan) {//GEN-END:|7-commandAction|27|245-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListMakanan());//GEN-LINE:|7-commandAction|28|245-postAction
                 // write post-action user code here
               } else if (command == okMakanan) {//GEN-LINE:|7-commandAction|29|250-preAction
                 // write pre-action user code here
                 String ticker = getListMakanan().getTitle();


                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     lisGolO();
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     lisGolB();
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     lisGolAB();
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     lisGolA();
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     lisGolO2();
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     lisGolB2();
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     lisGolAB2();
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     lisGolA2();
                 }

                  if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     lisGolO3();
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     lisGolB3();
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     lisGolAB3();
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     lisGolA3();
                 }
                 switchDisplayable(null, getFormGambar());//GEN-LINE:|7-commandAction|30|250-postAction
                 // write post-action user code here

               }//GEN-BEGIN:|7-commandAction|31|178-preAction
           } else if (displayable == formOlahraga) {
               if (command == backListGolDarah) {//GEN-END:|7-commandAction|31|178-preAction
                 // write pre-action user code here
                   switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|32|178-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|33|277-preAction
           } else if (displayable == formPanduan) {
               if (command == backToMenuAwal) {//GEN-END:|7-commandAction|33|277-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|34|277-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMa());
               }//GEN-BEGIN:|7-commandAction|35|271-preAction
           } else if (displayable == formPencarian) {
               if (command == backToMenuAwal) {//GEN-END:|7-commandAction|35|271-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|36|271-postAction
                 // write post-action user code here
                 switchDisplayable(null, getMa());
               } else if (command == okCari) {//GEN-LINE:|7-commandAction|37|273-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|38|273-postAction
                 // write post-action user code here
                 String find = textFieldNamaMakanan.getString();
                 if (choiceGroupGolDarah.getSelectedIndex() == 0) {
                     for (int i = 0; i < dc.getGolDrhO().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhO()[i];

                         p.getData(s);

                         Search temu = new Search(find, (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             choiceGroupHasil.append((String) p.v.elementAt(1), null);
                         }
                     }
                 } else if (choiceGroupGolDarah.getSelectedIndex() == 1) {
                     for (int i = 0; i < dc.getGolDrhB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhB()[i];

                         p.getData(s);

                         Search temu = new Search(find, (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             choiceGroupHasil.append((String) p.v.elementAt(1), null);
                         }
                     }
                 } else if (choiceGroupGolDarah.getSelectedIndex() == 2) {
                     for (int i = 0; i < dc.getGolDrhAB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhAB()[i];

                         p.getData(s);

                         Search temu = new Search(find, (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             choiceGroupHasil.append((String) p.v.elementAt(1), null);
                         }
                     }
                 } else if (choiceGroupGolDarah.getSelectedIndex() == 3) {
                     for (int i = 0; i < dc.getGolDrhA().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhA()[i];

                         p.getData(s);

                         Search temu = new Search(find, (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             choiceGroupHasil.append((String) p.v.elementAt(1), null);
                         }
                     }
                 }
               } else if (command == okDetail) {//GEN-LINE:|7-commandAction|39|275-preAction
                 // write pre-action user code here
                 if (choiceGroupGolDarah.getSelectedIndex() == 0) {
                     for (int i = 0; i < dc.getGolDrhO().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhO()[i];
                         p.getData(s);
                         Search temu = new Search(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()), (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             getStringItemKeterangan().setText(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()) + ""
                                     + " Termasuk dalam " + (String) p.v.elementAt(0) + " Dalam golongan darah O");
                             try {
                                 Image img = null;
                                 img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(2));
                                 getImageItemPencarian().setImage(img);
                             } catch (IOException ex) {
                                 ex.printStackTrace();
                             }
                         }
                     }
                 } else if (choiceGroupGolDarah.getSelectedIndex() == 1) {
                     for (int i = 0; i < dc.getGolDrhB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhB()[i];
                         p.getData(s);
                         Search temu = new Search(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()), (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             getStringItemKeterangan().setText(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()) + ""
                                     + " Termasuk dalam " + (String) p.v.elementAt(0) + " Dalam golongan darah B");
                             try {
                                 Image img = null;
                                 img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(2));
                                 getImageItemPencarian().setImage(img);
                             } catch (IOException ex) {
                                 ex.printStackTrace();
                             }
                         }
                     }
                 } else if (choiceGroupGolDarah.getSelectedIndex() == 2) {
                     for (int i = 0; i < dc.getGolDrhAB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhAB()[i];
                         p.getData(s);
                         Search temu = new Search(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()), (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             getStringItemKeterangan().setText(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()) + ""
                                     + " Termasuk dalam " + (String) p.v.elementAt(0) + " Dalam golongan darah AB");
                             try {
                                 Image img = null;
                                 img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(2));
                                 getImageItemPencarian().setImage(img);
                             } catch (IOException ex) {
                                 ex.printStackTrace();
                             }
                         }
                     }
                 } else if (choiceGroupGolDarah.getSelectedIndex() == 3) {
                     for (int i = 0; i < dc.getGolDrhA().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dc.getGolDrhA()[i];
                         p.getData(s);
                         System.out.println(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()));
                         Search temu = new Search(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()), (String) p.v.elementAt(1), true);
                         if (temu.isTemu() == true) {
                             System.out.println("masuk");
                             getStringItemKeterangan().setText(choiceGroupHasil.getString(choiceGroupHasil.getSelectedIndex()) + ""
                                     + " Termasuk dalam " + (String) p.v.elementAt(0) + " Dalam golongan darah A\n\n");
                             try {
                                 Image img = null;
                                 img = Image.createImage("/dietmain/gambar/golA/m1/" + (String) p.v.elementAt(2));
                                 getImageItemPencarian().setImage(img);
                             } catch (IOException ex) {
                                 ex.printStackTrace();
                             }
                         }
                     }
                 }
                 switchDisplayable(null, getFormDetailPencarian());//GEN-LINE:|7-commandAction|40|275-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|41|64-preAction
           } else if (displayable == listGolDarah) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|41|64-preAction
                 // write pre-action user code here
                   listGolDarahAction();//GEN-LINE:|7-commandAction|42|64-postAction
                 // write post-action user code here
               } else if (command == backFormGolDarah) {//GEN-LINE:|7-commandAction|43|189-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|44|189-postAction
                 // write post-action user code here
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     switchDisplayable(null, getFormGolDarahO());
                 } else if (men.equals("Golongan Darah AB")) {
                     switchDisplayable(null, getFormGolDarahAB());
                 } else if (men.equals("Golongan Darah B")) {
                     switchDisplayable(null, getFormGolDarahB());
                 } else if (men.equals("Golongan Darah A")) {
                     switchDisplayable(null, getFormGolDarahA());
                 }
               }//GEN-BEGIN:|7-commandAction|45|107-preAction
           } else if (displayable == listMakanan) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|45|107-preAction
                 // write pre-action user code here
                   listMakananAction();//GEN-LINE:|7-commandAction|46|107-postAction
                 // write post-action user code here
               } else if (command == backToListPanduan) {//GEN-LINE:|7-commandAction|47|124-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListPanduaDietMakanan());//GEN-LINE:|7-commandAction|48|124-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|49|35-preAction
           } else if (displayable == listPanduaDietMakanan) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|49|35-preAction
                 // write pre-action user code here
                   listPanduaDietMakananAction();//GEN-LINE:|7-commandAction|50|35-postAction
                 // write post-action user code here
               } else if (command == backListGolDarah) {//GEN-LINE:|7-commandAction|51|44-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|52|44-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|53|131-preAction
           } else if (displayable == listSuplemenPentingA) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|53|131-preAction
                 // write pre-action user code here
                   listSuplemenPentingAAction();//GEN-LINE:|7-commandAction|54|131-postAction
                 // write post-action user code here
               } else if (command == backListGolDarah) {//GEN-LINE:|7-commandAction|55|146-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|56|146-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|57|159-preAction
           } else if (displayable == listSuplemenPentingAB) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|57|159-preAction
                 // write pre-action user code here
                   listSuplemenPentingABAction();//GEN-LINE:|7-commandAction|58|159-postAction
                 // write post-action user code here
               } else if (command == backListGolDarah) {//GEN-LINE:|7-commandAction|59|161-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|60|161-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|61|149-preAction
           } else if (displayable == listSuplemenPentingB) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|61|149-preAction
                 // write pre-action user code here
                   listSuplemenPentingBAction();//GEN-LINE:|7-commandAction|62|149-postAction
                 // write post-action user code here
               } else if (command == backListGolDarah) {//GEN-LINE:|7-commandAction|63|151-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|64|151-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|65|234-preAction
           } else if (displayable == listSuplemenPentingO) {
               if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|65|234-preAction
                 // write pre-action user code here
                   listSuplemenPentingOAction();//GEN-LINE:|7-commandAction|66|234-postAction
                 // write post-action user code here
               } else if (command == backListGolDarah) {//GEN-LINE:|7-commandAction|67|236-preAction
                 // write pre-action user code here
                   switchDisplayable(null, getListGolDarah());//GEN-LINE:|7-commandAction|68|236-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|69|18-preAction
           } else if (displayable == splashScreenKeluar) {
               if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|69|18-preAction
                 // write pre-action user code here
                   exitMIDlet();//GEN-LINE:|7-commandAction|70|18-postAction
                 // write post-action user code here
               }//GEN-BEGIN:|7-commandAction|71|16-preAction
           } else if (displayable == splashScreenMasuk) {
               if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|71|16-preAction
                 // write pre-action user code here
//GEN-LINE:|7-commandAction|72|16-postAction
                 // write post-action user code here
                 switchDisplayable(null, ma);
               }//GEN-BEGIN:|7-commandAction|73|7-postCommandAction
           }//GEN-END:|7-commandAction|73|7-postCommandAction
         // write post-action user code here
       }//GEN-BEGIN:|7-commandAction|74|
       //</editor-fold>//GEN-END:|7-commandAction|74|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreenMasuk ">//GEN-BEGIN:|14-getter|0|14-preInit
       /**
        * Returns an initiliazed instance of splashScreenMasuk component.
        * @return the initialized component instance
        */
       public SplashScreen getSplashScreenMasuk() {
           if (splashScreenMasuk == null) {//GEN-END:|14-getter|0|14-preInit
             // write pre-init user code here
               splashScreenMasuk = new SplashScreen(getDisplay());//GEN-BEGIN:|14-getter|1|14-postInit
               splashScreenMasuk.setTitle("");
               splashScreenMasuk.setCommandListener(this);
               splashScreenMasuk.setFullScreenMode(true);
               splashScreenMasuk.setImage(getImage1());
               splashScreenMasuk.setTimeout(2000);//GEN-END:|14-getter|1|14-postInit
             // write post-init user code here
           }//GEN-BEGIN:|14-getter|2|
           return splashScreenMasuk;
       }
       //</editor-fold>//GEN-END:|14-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreenKeluar ">//GEN-BEGIN:|17-getter|0|17-preInit
       /**
        * Returns an initiliazed instance of splashScreenKeluar component.
        * @return the initialized component instance
        */
       public SplashScreen getSplashScreenKeluar() {
           if (splashScreenKeluar == null) {//GEN-END:|17-getter|0|17-preInit
             // write pre-init user code here
               splashScreenKeluar = new SplashScreen(getDisplay());//GEN-BEGIN:|17-getter|1|17-postInit
               splashScreenKeluar.setTitle("");
               splashScreenKeluar.setCommandListener(this);
               splashScreenKeluar.setFullScreenMode(true);
               splashScreenKeluar.setImage(getImage1());//GEN-END:|17-getter|1|17-postInit
             // write post-init user code here
           }//GEN-BEGIN:|17-getter|2|
           return splashScreenKeluar;
       }
       //</editor-fold>//GEN-END:|17-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listPanduaDietMakanan ">//GEN-BEGIN:|34-getter|0|34-preInit
       /**
        * Returns an initiliazed instance of listPanduaDietMakanan component.
        * @return the initialized component instance
        */
       public List getListPanduaDietMakanan() {
           if (listPanduaDietMakanan == null) {//GEN-END:|34-getter|0|34-preInit
             // write pre-init user code here
               listPanduaDietMakanan = new List("Panduan Diet Makananan", Choice.IMPLICIT);//GEN-BEGIN:|34-getter|1|34-postInit
               listPanduaDietMakanan.append("Makanan Sangat Bermanfaat", null);
               listPanduaDietMakanan.append("Makanan Netral atau Di Ijinkan", null);
               listPanduaDietMakanan.append("Makananan Yang Harus Di Hindari", null);
               listPanduaDietMakanan.addCommand(getBackListGolDarah());
               listPanduaDietMakanan.setCommandListener(this);
               listPanduaDietMakanan.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|34-getter|1|34-postInit
             // write post-init user code here
           }//GEN-BEGIN:|34-getter|2|
           return listPanduaDietMakanan;
       }
       //</editor-fold>//GEN-END:|34-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listPanduaDietMakananAction ">//GEN-BEGIN:|34-action|0|34-preAction
       /**
        * Performs an action assigned to the selected list element in the listPanduaDietMakanan component.
        */
       public void listPanduaDietMakananAction() {//GEN-END:|34-action|0|34-preAction
         // enter pre-action user code here
           String __selectedString = getListPanduaDietMakanan().getString(getListPanduaDietMakanan().getSelectedIndex());//GEN-BEGIN:|34-action|1|94-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Makanan Sangat Bermanfaat")) {//GEN-END:|34-action|1|94-preAction
                 // write pre-action user code here
//GEN-LINE:|34-action|2|94-postAction
                 // write post-action user code here
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     getListMakanan().setTitle("Makanan Bermanfaat Gol Darah O");
                 } else if (men.equals("Golongan Darah AB")) {
                     getListMakanan().setTitle("Makanan Bermanfaat Gol Darah AB");
                 } else if (men.equals("Golongan Darah B")) {
                     getListMakanan().setTitle("Makanan Bermanfaat Gol Darah B");
                 } else if (men.equals("Golongan Darah A")) {
                     getListMakanan().setTitle("Makanan Bermanfaat Gol Darah A");
                 }
                 switchDisplayable(null, getListMakanan());
               } else if (__selectedString.equals("Makanan Netral atau Di Ijinkan")) {//GEN-LINE:|34-action|3|95-preAction
                 // write pre-action user code here
//GEN-LINE:|34-action|4|95-postAction
                 // write post-action user code here
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     getListMakanan().setTitle("Makanan Netral Gol Darah O");
                 } else if (men.equals("Golongan Darah AB")) {
                     getListMakanan().setTitle("Makanan Netral Gol Darah AB");
                 } else if (men.equals("Golongan Darah B")) {
                     getListMakanan().setTitle("Makanan Netral Gol Darah B");
                 } else if (men.equals("Golongan Darah A")) {
                     getListMakanan().setTitle("Makanan Netral Gol Darah A");
                 }
                 switchDisplayable(null, getListMakanan());
               } else if (__selectedString.equals("Makananan Yang Harus Di Hindari")) {//GEN-LINE:|34-action|5|96-preAction
                 // write pre-action user code here
//GEN-LINE:|34-action|6|96-postAction
                 // write post-action user code here
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     getListMakanan().setTitle("Makanan Yang Harus Di Hindari Gol Darah O");
                 } else if (men.equals("Golongan Darah AB")) {
                     getListMakanan().setTitle("Makanan Yang Harus Di Hindari Gol Darah AB");
                 } else if (men.equals("Golongan Darah B")) {
                     getListMakanan().setTitle("Makanan Yang Harus Di Hindari Gol Darah B");
                 } else if (men.equals("Golongan Darah A")) {
                     getListMakanan().setTitle("Makanan Yang Harus Di Hindari Gol Darah A");
                 }
                 switchDisplayable(null, getListMakanan());
               }//GEN-BEGIN:|34-action|7|34-postAction
           }//GEN-END:|34-action|7|34-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|34-action|8|
       //</editor-fold>//GEN-END:|34-action|8|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okListGolDarah ">//GEN-BEGIN:|29-getter|0|29-preInit
       /**
        * Returns an initiliazed instance of okListGolDarah component.
        * @return the initialized component instance
        */
       public Command getOkListGolDarah() {
           if (okListGolDarah == null) {//GEN-END:|29-getter|0|29-preInit
             // write pre-init user code here
               okListGolDarah = new Command("Ok", Command.OK, 0);//GEN-LINE:|29-getter|1|29-postInit
             // write post-init user code here
           }//GEN-BEGIN:|29-getter|2|
           return okListGolDarah;
       }
       //</editor-fold>//GEN-END:|29-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okMakanan ">//GEN-BEGIN:|37-getter|0|37-preInit
       /**
        * Returns an initiliazed instance of okMakanan component.
        * @return the initialized component instance
        */
       public Command getOkMakanan() {
           if (okMakanan == null) {//GEN-END:|37-getter|0|37-preInit
             // write pre-init user code here
               okMakanan = new Command("Lihat Gambar", Command.OK, 0);//GEN-LINE:|37-getter|1|37-postInit
             // write post-init user code here
           }//GEN-BEGIN:|37-getter|2|
           return okMakanan;
       }
       //</editor-fold>//GEN-END:|37-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backListGolDarah ">//GEN-BEGIN:|43-getter|0|43-preInit
       /**
        * Returns an initiliazed instance of backListGolDarah component.
        * @return the initialized component instance
        */
       public Command getBackListGolDarah() {
           if (backListGolDarah == null) {//GEN-END:|43-getter|0|43-preInit
             // write pre-init user code here
               backListGolDarah = new Command("Back", Command.BACK, 0);//GEN-LINE:|43-getter|1|43-postInit
             // write post-init user code here
           }//GEN-BEGIN:|43-getter|2|
           return backListGolDarah;
       }
       //</editor-fold>//GEN-END:|43-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarah ">//GEN-BEGIN:|63-getter|0|63-preInit
       /**
        * Returns an initiliazed instance of listGolDarah component.
        * @return the initialized component instance
        */
       public List getListGolDarah() {
           if (listGolDarah == null) {//GEN-END:|63-getter|0|63-preInit
             // write pre-init user code here
               listGolDarah = new List("Golongan Darah", Choice.IMPLICIT);//GEN-BEGIN:|63-getter|1|63-postInit
               listGolDarah.append("Panduan Diet Makanan", null);
               listGolDarah.append("Suplemen Penting", null);
               listGolDarah.append("Olahraga Yang Di Anjurkan", null);
               listGolDarah.addCommand(getBackFormGolDarah());
               listGolDarah.setCommandListener(this);
               listGolDarah.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|63-getter|1|63-postInit
             // write post-init user code here
           }//GEN-BEGIN:|63-getter|2|
           return listGolDarah;
       }
       //</editor-fold>//GEN-END:|63-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listGolDarahAction ">//GEN-BEGIN:|63-action|0|63-preAction
       /**
        * Performs an action assigned to the selected list element in the listGolDarah component.
        */
       public void listGolDarahAction() {//GEN-END:|63-action|0|63-preAction
         // enter pre-action user code here
           String __selectedString = getListGolDarah().getString(getListGolDarah().getSelectedIndex());//GEN-BEGIN:|63-action|1|77-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Panduan Diet Makanan")) {//GEN-END:|63-action|1|77-preAction
                 // write pre-action user code here
//GEN-LINE:|63-action|2|77-postAction
                 // write post-action user code here
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     getListPanduaDietMakanan().setTitle("Panduan Makanan Gol Darah O");
                 } else if (men.equals("Golongan Darah AB")) {
                     getListPanduaDietMakanan().setTitle("Panduan Makanan Gol Darah AB");
                 } else if (men.equals("Golongan Darah B")) {
                     getListPanduaDietMakanan().setTitle("Panduan Makanan Gol Darah B");
                 } else if (men.equals("Golongan Darah A")) {
                     getListPanduaDietMakanan().setTitle("Panduan Makanan Gol Darah A");
                 }
                 switchDisplayable(null, getListPanduaDietMakanan());
               } else if (__selectedString.equals("Suplemen Penting")) {//GEN-LINE:|63-action|3|78-preAction
                 // write pre-action user code here
//GEN-LINE:|63-action|4|78-postAction
                 // write post-action user code here
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     // getListPanduaDietMakanan().setTitle("Panduan Makanan Gol Darah O");
                     getListSuplemenPentingO().setTitle("Suplemen Gol Darah O");
                     switchDisplayable(null, getListSuplemenPentingO());
                 } else if (men.equals("Golongan Darah AB")) {
                     getListSuplemenPentingAB().setTitle("Suplemen Gol Darah AB");
                     switchDisplayable(null, getListSuplemenPentingAB());
                 } else if (men.equals("Golongan Darah B")) {
                     getListSuplemenPentingA().setTitle("Suplemen Gol Darah B");
                     switchDisplayable(null, getListSuplemenPentingB());
                 } else if (men.equals("Golongan Darah A")) {
                     getListSuplemenPentingA().setTitle("Suplemen Gol Darah A");
                     switchDisplayable(null, getListSuplemenPentingA());
                 }
               } else if (__selectedString.equals("Olahraga Yang Di Anjurkan")) {//GEN-LINE:|63-action|5|79-preAction
                 // write pre-action user code here
//GEN-LINE:|63-action|6|79-postAction
                 // write post-action user code here
                 String[] headers = {"Olahraga", "Durasi", "Frekuensi"};
                 String men = getListGolDarah().getTitle();
                 if (men.equals("Golongan Darah O")) {
                     getFormOlahraga().setTitle(men);
                     tableItem.setTitle("Olahraga Yang Dianjurkan");
                     tableModel1 = new SimpleTableModel(new java.lang.String[][]{
                                 tmo.getGolO1(),
                                 tmo.getGolO2(),
                                 tmo.getGolO3(),
                                 tmo.getGolO4(),
                                 tmo.getGolO5(),
                                 tmo.getGolO6(),
                                 tmo.getGolO7(),
                                 tmo.getGolO8(),
                                 tmo.getGolO9()}, headers);

                 } else if (men.equals("Golongan Darah AB")) {
                     getFormOlahraga().setTitle(men);
                     tableItem.setTitle("Olahraga Yang Dianjurkan");
                     tableModel1 = new SimpleTableModel(new java.lang.String[][]{
                                 tmo.getGolAB1(),
                                 tmo.getGolAB2(),
                                 tmo.getGolAB3(),
                                 tmo.getGolAB4(),
                                 tmo.getGolAB5(),
                                 tmo.getGolAB6(),
                                 tmo.getGolAB7(),
                                 tmo.getGolAB8(),
                                 tmo.getGolAB9()}, headers);

                 } else if (men.equals("Golongan Darah A")) {
                     getFormOlahraga().setTitle(men);
                     tableItem.setTitle("Olahraga Yang Dianjurkan");
                     tableModel1 = new SimpleTableModel(new java.lang.String[][]{
                                 tmo.getGolA1(),
                                 tmo.getGolA2(),
                                 tmo.getGolA3(),
                                 tmo.getGolA4(),
                                 tmo.getGolA5(),
                                 tmo.getGolA6(),
                                 tmo.getGolA7(),
                                 tmo.getGolA8(),
                                 tmo.getGolA9()}, headers);

                 } else if (men.equals("Golongan Darah B")) {
                     getFormOlahraga().setTitle(men);
                     tableItem.setTitle("Olahraga Yang Dianjurkan");
                     tableModel1 = new SimpleTableModel(new java.lang.String[][]{
                                 tmo.getGolB1(),
                                 tmo.getGolB2(),
                                 tmo.getGolB3(),
                                 tmo.getGolB4(),
                                 tmo.getGolB5(),
                                 tmo.getGolB6(),
                                 tmo.getGolB7(),
                                 tmo.getGolB8(),
                                 tmo.getGolB9()}, headers);

                 }



                 tableItem.setModel(tableModel1);

                 switchDisplayable(null, getFormOlahraga());
               }//GEN-BEGIN:|63-action|7|63-postAction
           }//GEN-END:|63-action|7|63-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|63-action|8|
       //</editor-fold>//GEN-END:|63-action|8|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okKeterangan ">//GEN-BEGIN:|50-getter|0|50-preInit
       /**
        * Returns an initiliazed instance of okKeterangan component.
        * @return the initialized component instance
        */
       public Command getOkKeterangan() {
           if (okKeterangan == null) {//GEN-END:|50-getter|0|50-preInit
             // write pre-init user code here
               okKeterangan = new Command("Ok", Command.OK, 0);//GEN-LINE:|50-getter|1|50-postInit
             // write post-init user code here
           }//GEN-BEGIN:|50-getter|2|
           return okKeterangan;
       }
       //</editor-fold>//GEN-END:|50-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backToListPanduan ">//GEN-BEGIN:|52-getter|0|52-preInit
       /**
        * Returns an initiliazed instance of backToListPanduan component.
        * @return the initialized component instance
        */
       public Command getBackToListPanduan() {
           if (backToListPanduan == null) {//GEN-END:|52-getter|0|52-preInit
             // write pre-init user code here
               backToListPanduan = new Command("Back", Command.BACK, 0);//GEN-LINE:|52-getter|1|52-postInit
             // write post-init user code here
           }//GEN-BEGIN:|52-getter|2|
           return backToListPanduan;
       }
       //</editor-fold>//GEN-END:|52-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okGambar ">//GEN-BEGIN:|58-getter|0|58-preInit
       /**
        * Returns an initiliazed instance of okGambar component.
        * @return the initialized component instance
        */
       public Command getOkGambar() {
           if (okGambar == null) {//GEN-END:|58-getter|0|58-preInit
             // write pre-init user code here
               okGambar = new Command("Ok", Command.OK, 0);//GEN-LINE:|58-getter|1|58-postInit
             // write post-init user code here
           }//GEN-BEGIN:|58-getter|2|
           return okGambar;
       }
       //</editor-fold>//GEN-END:|58-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: b ">//GEN-BEGIN:|60-getter|0|60-preInit
       /**
        * Returns an initiliazed instance of b component.
        * @return the initialized component instance
        */
       public Command getB() {
           if (b == null) {//GEN-END:|60-getter|0|60-preInit
             // write pre-init user code here
               b = new Command("Back", Command.BACK, 0);//GEN-LINE:|60-getter|1|60-postInit
             // write post-init user code here
           }//GEN-BEGIN:|60-getter|2|
           return b;
       }
       //</editor-fold>//GEN-END:|60-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backToMenuUtama ">//GEN-BEGIN:|80-getter|0|80-preInit
       /**
        * Returns an initiliazed instance of backToMenuUtama component.
        * @return the initialized component instance
        */
       public Command getBackToMenuUtama() {
           if (backToMenuUtama == null) {//GEN-END:|80-getter|0|80-preInit
             // write pre-init user code here
               backToMenuUtama = new Command("Back", Command.BACK, 0);//GEN-LINE:|80-getter|1|80-postInit
             // write post-init user code here
           }//GEN-BEGIN:|80-getter|2|
           return backToMenuUtama;
       }
       //</editor-fold>//GEN-END:|80-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listMakanan ">//GEN-BEGIN:|106-getter|0|106-preInit
       /**
        * Returns an initiliazed instance of listMakanan component.
        * @return the initialized component instance
        */
       public List getListMakanan() {
           if (listMakanan == null) {//GEN-END:|106-getter|0|106-preInit
             // write pre-init user code here
               listMakanan = new List("makanan", Choice.IMPLICIT);//GEN-BEGIN:|106-getter|1|106-postInit
               listMakanan.append("Daging dan Unggas", null);
               listMakanan.append("Makanan Hasil Laut", null);
               listMakanan.append("Telur dan Produk Susu", null);
               listMakanan.append("Minyak dan Lemak", null);
               listMakanan.append("Kacang-kacangan dan Biji-bijian", null);
               listMakanan.append("Polong-polongan", null);
               listMakanan.append("Padi-padian (Serella), Roti, dan Pasta", null);
               listMakanan.append("Sayur-sayuran", null);
               listMakanan.append("Buah-buahan", null);
               listMakanan.append("Jus dan Sirup", null);
               listMakanan.append("Rempah-rempah dan Bumbu-bumbuan", null);
               listMakanan.append("Penyedap Rasa", null);
               listMakanan.append("Tanaman Obat dan Teh Herbal", null);
               listMakanan.append("Berbagai Minuman", null);
               listMakanan.addCommand(getBackToListPanduan());
               listMakanan.setCommandListener(this);
               listMakanan.setSelectedFlags(new boolean[] { false, false, false, false, false, false, false, false, false, false, false, false, false, false });//GEN-END:|106-getter|1|106-postInit
             // write post-init user code here
           }//GEN-BEGIN:|106-getter|2|
           return listMakanan;
       }
       //</editor-fold>//GEN-END:|106-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listMakananAction ">//GEN-BEGIN:|106-action|0|106-preAction
       /**
        * Performs an action assigned to the selected list element in the listMakanan component.
        */
       public void listMakananAction() {//GEN-END:|106-action|0|106-preAction
         // enter pre-action user code here
           String __selectedString = getListMakanan().getString(getListMakanan().getSelectedIndex());//GEN-BEGIN:|106-action|1|109-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Daging dan Unggas")) {//GEN-END:|106-action|1|109-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|2|109-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Daging dan Unggas");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getDagingUnggas1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getDagingUnggas1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getDagingUnggas1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     getStringItemListMKN().setText("Tidak Ada Data");
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getDagingUnggas2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getDagingUnggas2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getDagingUnggas2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getDagingUnggas2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getDagingUnggas3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getDagingUnggas3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getDagingUnggas3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getDagingUnggas3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getDagingUnggas3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Makanan Hasil Laut")) {//GEN-LINE:|106-action|3|110-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|4|110-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Makanan Hasil Laut");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getMakananLaut1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getMakananLaut1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getMakananLaut1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     for (int i = 0; i < dm.getMakananLaut1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getMakananLaut2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getMakananLaut2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getMakananLaut2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getMakananLaut2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getMakananLaut3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getMakananLaut3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getMakananLaut3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getMakananLaut3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMakananLaut3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Telur dan Produk Susu")) {//GEN-LINE:|106-action|5|111-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|6|111-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Telur Susu");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     getStringItemListMKN().setText("\nTidak Ada Data");
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getTelurSusu1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getTelurSusu1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     getStringItemListMKN().setText("\nTidak Ada Data");
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getTelurSusu2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getTelurSusu2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getTelurSusu2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getTelurSusu2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getTelurSusu3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getTelurSusu3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getTelurSusu3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getTelurSusu3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getTelurSusu3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Minyak dan Lemak")) {//GEN-LINE:|106-action|7|112-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|8|112-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Minyak dan Lemak");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getMinyakLemak1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {

                     PisahKata p = new PisahKata();
                     String s = dm.getMinyakLemak1B();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);

                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getMinyakLemak1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     for (int i = 0; i < dm.getMinyakLemak1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getMinyakLemak2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getMinyakLemak2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getMinyakLemak2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getMinyakLemak2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getMinyakLemak3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getMinyakLemak3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getMinyakLemak3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getMinyakLemak3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinyakLemak3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Kacang-kacangan dan Biji-bijian")) {//GEN-LINE:|106-action|9|113-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|10|113-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Kacang-kacangan dan Biji-bijian");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getKacangBiji1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     PisahKata p = new PisahKata();
                     String s = dm.getKacangBiji1B();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getKacangBiji1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     for (int i = 0; i < dm.getKacangBiji1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getKacangBiji2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getKacangBiji2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getKacangBiji2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getKacangBiji2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }


                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getKacangBiji3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getKacangBiji3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getKacangBiji3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getKacangBiji3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getKacangBiji3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Polong-polongan")) {//GEN-LINE:|106-action|11|114-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|12|114-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Polong-polongan");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getPolong1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getPolong1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getPolong1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     for (int i = 0; i < dm.getPolong1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getPolong2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getPolong2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getPolong2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getPolong2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getPolong3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getPolong3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getPolong3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getPolong3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPolong3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Padi-padian (Serella), Roti, dan Pasta")) {//GEN-LINE:|106-action|13|115-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|14|115-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Padi-padian (Serella), Roti, dan Pasta");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {

                     PisahKata p = new PisahKata();
                     String s = dm.getPadiRotiPasta1O();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);

                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getPadiRotiPasta1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getPadiRotiPasta1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     for (int i = 0; i < dm.getPadiRotiPasta1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getPadiRotiPasta2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta2O()[1];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getPadiRotiPasta2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getPadiRotiPasta2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getPadiRotiPasta2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getPadiRotiPasta3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta3O()[1];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getPadiRotiPasta3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getPadiRotiPasta3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getPadiRotiPasta3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPadiRotiPasta3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Sayur-sayuran")) {//GEN-LINE:|106-action|15|116-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|16|116-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Sayur-sayuran");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getSayur1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getSayur1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getSayur1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {
                     for (int i = 0; i < dm.getSayur1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getSayur2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getSayur2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getSayur2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {
                     for (int i = 0; i < dm.getSayur2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getSayur3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getSayur3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getSayur3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {
                     for (int i = 0; i < dm.getSayur3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getSayur3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }


                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Buah-buahan")) {//GEN-LINE:|106-action|17|117-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|18|117-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Buah-buahan");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getBuah1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getBuah1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getBuah1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {

                     for (int i = 0; i < dm.getBuah1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getBuah2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getBuah2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getBuah2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {

                     for (int i = 0; i < dm.getBuah2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getBuah3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getBuah3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getBuah3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {

                     for (int i = 0; i < dm.getBuah3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Jus dan Sirup")) {//GEN-LINE:|106-action|19|118-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|20|118-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Jus dan Sirup");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getJusSirop1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getJusSirop1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getJusSirop1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {

                     for (int i = 0; i < dm.getJusBuah1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusBuah1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getJusSirop2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getJusSirop2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getJusSirop2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {

                     for (int i = 0; i < dm.getBuah2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getJusSirop3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getJusSirop3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getJusSirop3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getJusSirop3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {

                     for (int i = 0; i < dm.getBuah3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getBuah3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Rempah-rempah dan Bumbu-bumbuan")) {//GEN-LINE:|106-action|21|119-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|22|119-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Rempah-rempah dan Bumbu-bumbuan");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getRempahBumbu1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getRempahBumbu1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getRempahBumbu1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {

                     for (int i = 0; i < dm.getRempahBumbu1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getRempahBumbu2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getRempahBumbu2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getRempahBumbu2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {

                     for (int i = 0; i < dm.getRempahBumbu2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getRempahBumbu3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getRempahBumbu3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getRempahBumbu3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {

                     for (int i = 0; i < dm.getRempahBumbu3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getRempahBumbu3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Penyedap Rasa")) {//GEN-LINE:|106-action|23|120-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|24|120-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Penyedap Rasa");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     getStringItemListMKN().setText("Tidak ada data");
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     getStringItemListMKN().setText("Tidak ada data");
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     getStringItemListMKN().setText("Tidak ada data");
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {

                     PisahKata p = new PisahKata();
                     String s = dm.getPenyedapRasa1A();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);

                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getPenyedapRasa2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getPenyedapRasa2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getPenyedapRasa2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {

                     for (int i = 0; i < dm.getPenyedapRasa2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }

                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getPenyedapRasa3O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {

                     PisahKata p = new PisahKata();
                     String s = dm.getPenyedapRasa3B();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);

                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getPenyedapRasa3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {

                     for (int i = 0; i < dm.getPenyedapRasa3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getPenyedapRasa3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }

                 }




                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Tanaman Obat dan Teh Herbal")) {//GEN-LINE:|106-action|25|121-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|26|121-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Tanaman Obat dan Teh Herbal");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getObatTeh1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     for (int i = 0; i < dm.getObatTeh1B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh1B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getObatTeh1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {

                     for (int i = 0; i < dm.getObatTeh1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {
                     for (int i = 0; i < dm.getObatTeh2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh2O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getObatTeh2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getObatTeh2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {

                     for (int i = 0; i < dm.getObatTeh2A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh2A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah O")) {
                     for (int i = 0; i < dm.getObatTeh2O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh3O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah B")) {
                     for (int i = 0; i < dm.getObatTeh3B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh3B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah AB")) {
                     for (int i = 0; i < dm.getObatTeh3AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh3AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Yang Harus Di Hindari Gol Darah A")) {

                     for (int i = 0; i < dm.getObatTeh3A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getObatTeh3A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }
                 switchDisplayable(null, getFormListDataMKN());
               } else if (__selectedString.equals("Berbagai Minuman")) {//GEN-LINE:|106-action|27|122-preAction
                 // write pre-action user code here
//GEN-LINE:|106-action|28|122-postAction
                 // write post-action user code here
                 String ticker = getListMakanan().getTitle();
                 getFormListDataMKN().setTitle("Berbagai Minuman");
                 choiceGroupListMKN.deleteAll();
                 getStringItemListMKN().setText("");
                 if (ticker.equals("Makanan Bermanfaat Gol Darah O")) {
                     for (int i = 0; i < dm.getMinuman1O().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinuman1O()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah B")) {
                     getStringItemListMKN().setText("Tidak ada data");
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah AB")) {
                     for (int i = 0; i < dm.getMinuman1AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinuman1AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Bermanfaat Gol Darah A")) {

                     for (int i = 0; i < dm.getMinuman1A().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinuman1A()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 }

                 if (ticker.equals("Makanan Netral Gol Darah O")) {

                     PisahKata p = new PisahKata();
                     String s = dm.getMinuman2O();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);

                 } else if (ticker.equals("Makanan Netral Gol Darah B")) {
                     for (int i = 0; i < dm.getMinuman2B().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinuman2B()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah AB")) {
                     for (int i = 0; i < dm.getMinuman2AB().length; i++) {
                         PisahKata p = new PisahKata();
                         String s = dm.getMinuman2AB()[i];

                         p.getData(s);
                         choiceGroupListMKN.append((String) p.v.elementAt(0), null);
                     }
                 } else if (ticker.equals("Makanan Netral Gol Darah A")) {


                     PisahKata p = new PisahKata();
                     String s = dm.getMinuman2A();

                     p.getData(s);
                     choiceGroupListMKN.append((String) p.v.elementAt(0), null);

                 }
                 switchDisplayable(null, getFormListDataMKN());
               }//GEN-BEGIN:|106-action|29|106-postAction
           }//GEN-END:|106-action|29|106-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|106-action|30|
       //</editor-fold>//GEN-END:|106-action|30|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stopCommand ">//GEN-BEGIN:|104-getter|0|104-preInit
       /**
        * Returns an initiliazed instance of stopCommand component.
        * @return the initialized component instance
        */
       public Command getStopCommand() {
           if (stopCommand == null) {//GEN-END:|104-getter|0|104-preInit
             // write pre-init user code here
               stopCommand = new Command("Stop", Command.STOP, 0);//GEN-LINE:|104-getter|1|104-postInit
             // write post-init user code here
           }//GEN-BEGIN:|104-getter|2|
           return stopCommand;
       }
       //</editor-fold>//GEN-END:|104-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formGambar ">//GEN-BEGIN:|126-getter|0|126-preInit
       /**
        * Returns an initiliazed instance of formGambar component.
        * @return the initialized component instance
        */
       public Form getFormGambar() {
           if (formGambar == null) {//GEN-END:|126-getter|0|126-preInit
             // write pre-init user code here
               formGambar = new Form("form", new Item[] { getGambarListmakanan() });//GEN-BEGIN:|126-getter|1|126-postInit
               formGambar.addCommand(getBackToKeterangan());
               formGambar.setCommandListener(this);//GEN-END:|126-getter|1|126-postInit
             // write post-init user code here
           }//GEN-BEGIN:|126-getter|2|
           return formGambar;
       }
       //</editor-fold>//GEN-END:|126-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backToKeterangan ">//GEN-BEGIN:|128-getter|0|128-preInit
       /**
        * Returns an initiliazed instance of backToKeterangan component.
        * @return the initialized component instance
        */
       public Command getBackToKeterangan() {
           if (backToKeterangan == null) {//GEN-END:|128-getter|0|128-preInit
             // write pre-init user code here
               backToKeterangan = new Command("Back", Command.BACK, 0);//GEN-LINE:|128-getter|1|128-postInit
             // write post-init user code here
           }//GEN-BEGIN:|128-getter|2|
           return backToKeterangan;
       }
       //</editor-fold>//GEN-END:|128-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listSuplemenPentingA ">//GEN-BEGIN:|130-getter|0|130-preInit
       /**
        * Returns an initiliazed instance of listSuplemenPentingA component.
        * @return the initialized component instance
        */
       public List getListSuplemenPentingA() {
           if (listSuplemenPentingA == null) {//GEN-END:|130-getter|0|130-preInit
             // write pre-init user code here
               listSuplemenPentingA = new List("Suplemen Penting A", Choice.IMPLICIT);//GEN-BEGIN:|130-getter|1|130-postInit
               listSuplemenPentingA.append("Vitamin B", null);
               listSuplemenPentingA.append("Vitamin C", null);
               listSuplemenPentingA.append("Vitamin E", null);
               listSuplemenPentingA.append("Kalsium", null);
               listSuplemenPentingA.append("Besi", null);
               listSuplemenPentingA.append("Seng", null);
               listSuplemenPentingA.append("Howhorn (crataegus oxyacantha)", null);
               listSuplemenPentingA.append("Conflower Ungu (Echinacea Purpusa) ", null);
               listSuplemenPentingA.append("Kamomil dan Akar Valerian", null);
               listSuplemenPentingA.append("Kuersetin", null);
               listSuplemenPentingA.append("Milk Thitle (Silybum Marianum)", null);
               listSuplemenPentingA.append("Bromelain (enzim nanas)", null);
               listSuplemenPentingA.append("Probiotik", null);
               listSuplemenPentingA.addCommand(getBackListGolDarah());
               listSuplemenPentingA.setCommandListener(this);
               listSuplemenPentingA.setSelectedFlags(new boolean[] { false, false, false, false, false, false, false, false, false, false, false, false, false });//GEN-END:|130-getter|1|130-postInit
             // write post-init user code here
           }//GEN-BEGIN:|130-getter|2|
           return listSuplemenPentingA;
       }
       //</editor-fold>//GEN-END:|130-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listSuplemenPentingAAction ">//GEN-BEGIN:|130-action|0|130-preAction
       /**
        * Performs an action assigned to the selected list element in the listSuplemenPentingA component.
        */
       public void listSuplemenPentingAAction() {//GEN-END:|130-action|0|130-preAction
         // enter pre-action user code here
           String __selectedString = getListSuplemenPentingA().getString(getListSuplemenPentingA().getSelectedIndex());//GEN-BEGIN:|130-action|1|133-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Vitamin B")) {//GEN-END:|130-action|1|133-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|2|133-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getVitaminBA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Vitamin C")) {//GEN-LINE:|130-action|3|134-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|4|134-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getVitaminCA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Vitamin E")) {//GEN-LINE:|130-action|5|135-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|6|135-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getVitaminEA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Kalsium")) {//GEN-LINE:|130-action|7|136-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|8|136-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getKalsiumA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Besi")) {//GEN-LINE:|130-action|9|137-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|10|137-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getBesiA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Seng")) {//GEN-LINE:|130-action|11|138-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|12|138-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getSengA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Howhorn (crataegus oxyacantha)")) {//GEN-LINE:|130-action|13|139-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|14|139-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getHarthornA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Conflower Ungu (Echinacea Purpusa) ")) {//GEN-LINE:|130-action|15|140-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|16|140-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getConeflowerUnguA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Kamomil dan Akar Valerian")) {//GEN-LINE:|130-action|17|141-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|18|141-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getKamomildanAkarValerianA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Kuersetin")) {//GEN-LINE:|130-action|19|142-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|20|142-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getKuersetinA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Milk Thitle (Silybum Marianum)")) {//GEN-LINE:|130-action|21|143-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|22|143-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getMilkThistleA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Bromelain (enzim nanas)")) {//GEN-LINE:|130-action|23|144-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|24|144-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getBromelainA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Probiotik")) {//GEN-LINE:|130-action|25|145-preAction
                 // write pre-action user code here
//GEN-LINE:|130-action|26|145-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getProbiotikA());
                 switchDisplayable(null, getFormKeternganSuplemen());
               }//GEN-BEGIN:|130-action|27|130-postAction
           }//GEN-END:|130-action|27|130-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|130-action|28|
       //</editor-fold>//GEN-END:|130-action|28|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listSuplemenPentingB ">//GEN-BEGIN:|148-getter|0|148-preInit
       /**
        * Returns an initiliazed instance of listSuplemenPentingB component.
        * @return the initialized component instance
        */
       public List getListSuplemenPentingB() {
           if (listSuplemenPentingB == null) {//GEN-END:|148-getter|0|148-preInit
             // write pre-init user code here
               listSuplemenPentingB = new List("Suplemen Penting B", Choice.IMPLICIT);//GEN-BEGIN:|148-getter|1|148-postInit
               listSuplemenPentingB.append("Magnesium", null);
               listSuplemenPentingB.append("Licorice (Glycynhiza glabra)", null);
               listSuplemenPentingB.append("Bromelain", null);
               listSuplemenPentingB.append("Gingseng Siberta dan Gingko Biloa", null);
               listSuplemenPentingB.append("Lesitin", null);
               listSuplemenPentingB.addCommand(getBackListGolDarah());
               listSuplemenPentingB.setCommandListener(this);
               listSuplemenPentingB.setSelectedFlags(new boolean[] { false, false, false, false, false });//GEN-END:|148-getter|1|148-postInit
             // write post-init user code here
           }//GEN-BEGIN:|148-getter|2|
           return listSuplemenPentingB;
       }
       //</editor-fold>//GEN-END:|148-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listSuplemenPentingBAction ">//GEN-BEGIN:|148-action|0|148-preAction
       /**
        * Performs an action assigned to the selected list element in the listSuplemenPentingB component.
        */
       public void listSuplemenPentingBAction() {//GEN-END:|148-action|0|148-preAction
         // enter pre-action user code here
           String __selectedString = getListSuplemenPentingB().getString(getListSuplemenPentingB().getSelectedIndex());//GEN-BEGIN:|148-action|1|153-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Magnesium")) {//GEN-END:|148-action|1|153-preAction
                 // write pre-action user code here
//GEN-LINE:|148-action|2|153-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getMagnesiumB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Licorice (Glycynhiza glabra)")) {//GEN-LINE:|148-action|3|154-preAction
                 // write pre-action user code here
//GEN-LINE:|148-action|4|154-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getLicoriceB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Bromelain")) {//GEN-LINE:|148-action|5|155-preAction
                 // write pre-action user code here
//GEN-LINE:|148-action|6|155-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getBromelainB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Gingseng Siberta dan Gingko Biloa")) {//GEN-LINE:|148-action|7|156-preAction
                 // write pre-action user code here
//GEN-LINE:|148-action|8|156-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getGingsengGingkoB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Lesitin")) {//GEN-LINE:|148-action|9|157-preAction
                 // write pre-action user code here
//GEN-LINE:|148-action|10|157-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getLesitinB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               }//GEN-BEGIN:|148-action|11|148-postAction
           }//GEN-END:|148-action|11|148-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|148-action|12|
       //</editor-fold>//GEN-END:|148-action|12|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listSuplemenPentingAB ">//GEN-BEGIN:|158-getter|0|158-preInit
       /**
        * Returns an initiliazed instance of listSuplemenPentingAB component.
        * @return the initialized component instance
        */
       public List getListSuplemenPentingAB() {
           if (listSuplemenPentingAB == null) {//GEN-END:|158-getter|0|158-preInit
             // write pre-init user code here
               listSuplemenPentingAB = new List("Suplemen Penting AB", Choice.IMPLICIT);//GEN-BEGIN:|158-getter|1|158-postInit
               listSuplemenPentingAB.append("Vitamin C", null);
               listSuplemenPentingAB.append("Seng", null);
               listSuplemenPentingAB.append("Conflower Ungu (Echinacea Purpusa) ", null);
               listSuplemenPentingAB.append("Kamomil dan Akar Valerian", null);
               listSuplemenPentingAB.append("Milk Thitle (Silybum Marianum)", null);
               listSuplemenPentingAB.append("Kuersetin", null);
               listSuplemenPentingAB.append("Howhorn (crataegus oxyacantha)", null);
               listSuplemenPentingAB.addCommand(getBackListGolDarah());
               listSuplemenPentingAB.setCommandListener(this);
               listSuplemenPentingAB.setSelectedFlags(new boolean[] { false, false, false, false, false, false, false });//GEN-END:|158-getter|1|158-postInit
             // write post-init user code here
           }//GEN-BEGIN:|158-getter|2|
           return listSuplemenPentingAB;
       }
       //</editor-fold>//GEN-END:|158-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listSuplemenPentingABAction ">//GEN-BEGIN:|158-action|0|158-preAction
       /**
        * Performs an action assigned to the selected list element in the listSuplemenPentingAB component.
        */
       public void listSuplemenPentingABAction() {//GEN-END:|158-action|0|158-preAction
         // enter pre-action user code here
           String __selectedString = getListSuplemenPentingAB().getString(getListSuplemenPentingAB().getSelectedIndex());//GEN-BEGIN:|158-action|1|163-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Vitamin C")) {//GEN-END:|158-action|1|163-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|2|163-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getVitaminCAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Seng")) {//GEN-LINE:|158-action|3|164-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|4|164-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getSengAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Conflower Ungu (Echinacea Purpusa) ")) {//GEN-LINE:|158-action|5|165-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|6|165-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getConeflowerUnguAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Kamomil dan Akar Valerian")) {//GEN-LINE:|158-action|7|166-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|8|166-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getKamomildanAkarValerianAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Milk Thitle (Silybum Marianum)")) {//GEN-LINE:|158-action|9|167-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|10|167-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getMilkThistleAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Kuersetin")) {//GEN-LINE:|158-action|11|168-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|12|168-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getKuersetinAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Howhorn (crataegus oxyacantha)")) {//GEN-LINE:|158-action|13|170-preAction
                 // write pre-action user code here
//GEN-LINE:|158-action|14|170-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getHawnthornAB());
                 switchDisplayable(null, getFormKeternganSuplemen());
               }//GEN-BEGIN:|158-action|15|158-postAction
           }//GEN-END:|158-action|15|158-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|158-action|16|
       //</editor-fold>//GEN-END:|158-action|16|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formKeternganSuplemen ">//GEN-BEGIN:|171-getter|0|171-preInit
       /**
        * Returns an initiliazed instance of formKeternganSuplemen component.
        * @return the initialized component instance
        */
       public Form getFormKeternganSuplemen() {
           if (formKeternganSuplemen == null) {//GEN-END:|171-getter|0|171-preInit
             // write pre-init user code here
               formKeternganSuplemen = new Form("Keterangan", new Item[] { getKetSuplemen() });//GEN-BEGIN:|171-getter|1|171-postInit
               formKeternganSuplemen.addCommand(getBackToSuplemen());
               formKeternganSuplemen.setCommandListener(this);//GEN-END:|171-getter|1|171-postInit
             // write post-init user code here
           }//GEN-BEGIN:|171-getter|2|
           return formKeternganSuplemen;
       }
       //</editor-fold>//GEN-END:|171-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backToSuplemen ">//GEN-BEGIN:|172-getter|0|172-preInit
       /**
        * Returns an initiliazed instance of backToSuplemen component.
        * @return the initialized component instance
        */
       public Command getBackToSuplemen() {
           if (backToSuplemen == null) {//GEN-END:|172-getter|0|172-preInit
             // write pre-init user code here
               backToSuplemen = new Command("Back", Command.BACK, 0);//GEN-LINE:|172-getter|1|172-postInit
             // write post-init user code here
           }//GEN-BEGIN:|172-getter|2|
           return backToSuplemen;
       }
       //</editor-fold>//GEN-END:|172-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formOlahraga ">//GEN-BEGIN:|175-getter|0|175-preInit
       /**
        * Returns an initiliazed instance of formOlahraga component.
        * @return the initialized component instance
        */
       public Form getFormOlahraga() {
           if (formOlahraga == null) {//GEN-END:|175-getter|0|175-preInit
             // write pre-init user code here
               formOlahraga = new Form("form", new Item[] { getKetOlahraga(), getTableItem() });//GEN-BEGIN:|175-getter|1|175-postInit
               formOlahraga.addCommand(getBackListGolDarah());
               formOlahraga.setCommandListener(this);//GEN-END:|175-getter|1|175-postInit
             // write post-init user code here

           }//GEN-BEGIN:|175-getter|2|
           return formOlahraga;
       }
       //</editor-fold>//GEN-END:|175-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backTo ">//GEN-BEGIN:|176-getter|0|176-preInit
       /**
        * Returns an initiliazed instance of backTo component.
        * @return the initialized component instance
        */
       public Command getBackTo() {
           if (backTo == null) {//GEN-END:|176-getter|0|176-preInit
             // write pre-init user code here
               backTo = new Command("Back", Command.BACK, 0);//GEN-LINE:|176-getter|1|176-postInit
             // write post-init user code here
           }//GEN-BEGIN:|176-getter|2|
           return backTo;
       }
       //</editor-fold>//GEN-END:|176-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formGolDarahA ">//GEN-BEGIN:|185-getter|0|185-preInit
       /**
        * Returns an initiliazed instance of formGolDarahA component.
        * @return the initialized component instance
        */
       public Form getFormGolDarahA() {
           if (formGolDarahA == null) {//GEN-END:|185-getter|0|185-preInit
             // write pre-init user code here
               formGolDarahA = new Form("Golongan Darah A", new Item[] { getGolDarahA() });//GEN-BEGIN:|185-getter|1|185-postInit
               formGolDarahA.addCommand(getBackToMenuUtama());
               formGolDarahA.addCommand(getOkListGolDarah());
               formGolDarahA.setCommandListener(this);//GEN-END:|185-getter|1|185-postInit
             // write post-init user code here
             getListGolDarah().setTitle("Golongan Darah A");
             getGolDarahA().setText(dkgd.getGoldaA());
           }//GEN-BEGIN:|185-getter|2|
           return formGolDarahA;
       }
       //</editor-fold>//GEN-END:|185-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formGolDarahB ">//GEN-BEGIN:|193-getter|0|193-preInit
       /**
        * Returns an initiliazed instance of formGolDarahB component.
        * @return the initialized component instance
        */
       public Form getFormGolDarahB() {
           if (formGolDarahB == null) {//GEN-END:|193-getter|0|193-preInit
             // write pre-init user code here
               formGolDarahB = new Form("Golongan Darah B", new Item[] { getGolDarahB() });//GEN-BEGIN:|193-getter|1|193-postInit
               formGolDarahB.addCommand(getBackToMenuUtama());
               formGolDarahB.addCommand(getOkListGolDarah());
               formGolDarahB.setCommandListener(this);//GEN-END:|193-getter|1|193-postInit
             // write post-init user code here
             getListGolDarah().setTitle("Golongan Darah B");
             getGolDarahB().setText(dkgd.getGoldaB());
           }//GEN-BEGIN:|193-getter|2|
           return formGolDarahB;
       }
       //</editor-fold>//GEN-END:|193-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formGolDarahAB ">//GEN-BEGIN:|194-getter|0|194-preInit
       /**
        * Returns an initiliazed instance of formGolDarahAB component.
        * @return the initialized component instance
        */
       public Form getFormGolDarahAB() {
           if (formGolDarahAB == null) {//GEN-END:|194-getter|0|194-preInit
             // write pre-init user code here
               formGolDarahAB = new Form("Golongan Darah AB", new Item[] { getGolDarahAB() });//GEN-BEGIN:|194-getter|1|194-postInit
               formGolDarahAB.addCommand(getBackToMenuUtama());
               formGolDarahAB.addCommand(getOkListGolDarah());
               formGolDarahAB.setCommandListener(this);//GEN-END:|194-getter|1|194-postInit
             // write post-init user code here
             getListGolDarah().setTitle("Golongan Darah AB");
             getGolDarahAB().setText(dkgd.getGoldaAB());
           }//GEN-BEGIN:|194-getter|2|
           return formGolDarahAB;
       }
       //</editor-fold>//GEN-END:|194-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formGolDarahO ">//GEN-BEGIN:|195-getter|0|195-preInit
       /**
        * Returns an initiliazed instance of formGolDarahO component.
        * @return the initialized component instance
        */
       public Form getFormGolDarahO() {
           if (formGolDarahO == null) {//GEN-END:|195-getter|0|195-preInit
             // write pre-init user code here
               formGolDarahO = new Form("Golongan Darah O", new Item[] { getGolDarahO() });//GEN-BEGIN:|195-getter|1|195-postInit
               formGolDarahO.addCommand(getBackToMenuUtama());
               formGolDarahO.addCommand(getOkListGolDarah());
               formGolDarahO.setCommandListener(this);//GEN-END:|195-getter|1|195-postInit
             // write post-init user code here
             getListGolDarah().setTitle("Golongan Darah O");
             getGolDarahO().setText(dkgd.getGoldaO());
           }//GEN-BEGIN:|195-getter|2|
           return formGolDarahO;
       }
       //</editor-fold>//GEN-END:|195-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formPencarian ">//GEN-BEGIN:|202-getter|0|202-preInit
       /**
        * Returns an initiliazed instance of formPencarian component.
        * @return the initialized component instance
        */
       public Form getFormPencarian() {
           if (formPencarian == null) {//GEN-END:|202-getter|0|202-preInit
             // write pre-init user code here
               formPencarian = new Form("Pencarian Data Makanan", new Item[] { getChoiceGroupGolDarah(), getTextFieldNamaMakanan(), getChoiceGroupHasil() });//GEN-BEGIN:|202-getter|1|202-postInit
               formPencarian.addCommand(getBackToMenuAwal());
               formPencarian.addCommand(getOkCari());
               formPencarian.addCommand(getOkDetail());
               formPencarian.setCommandListener(this);//GEN-END:|202-getter|1|202-postInit
             // write post-init user code here
           }//GEN-BEGIN:|202-getter|2|
           return formPencarian;
       }
       //</editor-fold>//GEN-END:|202-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backFormGolDarah ">//GEN-BEGIN:|188-getter|0|188-preInit
       /**
        * Returns an initiliazed instance of backFormGolDarah component.
        * @return the initialized component instance
        */
       public Command getBackFormGolDarah() {
           if (backFormGolDarah == null) {//GEN-END:|188-getter|0|188-preInit
             // write pre-init user code here
               backFormGolDarah = new Command("Back", Command.BACK, 0);//GEN-LINE:|188-getter|1|188-postInit
             // write post-init user code here
           }//GEN-BEGIN:|188-getter|2|
           return backFormGolDarah;
       }
       //</editor-fold>//GEN-END:|188-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: golDarahA ">//GEN-BEGIN:|204-getter|0|204-preInit
       /**
        * Returns an initiliazed instance of golDarahA component.
        * @return the initialized component instance
        */
       public StringItem getGolDarahA() {
           if (golDarahA == null) {//GEN-END:|204-getter|0|204-preInit
             // write pre-init user code here
               golDarahA = new StringItem("", null);//GEN-LINE:|204-getter|1|204-postInit
             // write post-init user code here
           }//GEN-BEGIN:|204-getter|2|
           return golDarahA;
       }
       //</editor-fold>//GEN-END:|204-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: golDarahB ">//GEN-BEGIN:|205-getter|0|205-preInit
       /**
        * Returns an initiliazed instance of golDarahB component.
        * @return the initialized component instance
        */
       public StringItem getGolDarahB() {
           if (golDarahB == null) {//GEN-END:|205-getter|0|205-preInit
             // write pre-init user code here
               golDarahB = new StringItem("", null);//GEN-LINE:|205-getter|1|205-postInit
             // write post-init user code here
           }//GEN-BEGIN:|205-getter|2|
           return golDarahB;
       }
       //</editor-fold>//GEN-END:|205-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: golDarahAB ">//GEN-BEGIN:|206-getter|0|206-preInit
       /**
        * Returns an initiliazed instance of golDarahAB component.
        * @return the initialized component instance
        */
       public StringItem getGolDarahAB() {
           if (golDarahAB == null) {//GEN-END:|206-getter|0|206-preInit
             // write pre-init user code here
               golDarahAB = new StringItem("", null);//GEN-LINE:|206-getter|1|206-postInit
             // write post-init user code here
           }//GEN-BEGIN:|206-getter|2|
           return golDarahAB;
       }
       //</editor-fold>//GEN-END:|206-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: golDarahO ">//GEN-BEGIN:|207-getter|0|207-preInit
       /**
        * Returns an initiliazed instance of golDarahO component.
        * @return the initialized component instance
        */
       public StringItem getGolDarahO() {
           if (golDarahO == null) {//GEN-END:|207-getter|0|207-preInit
             // write pre-init user code here
               golDarahO = new StringItem("", null);//GEN-LINE:|207-getter|1|207-postInit
             // write post-init user code here
           }//GEN-BEGIN:|207-getter|2|
           return golDarahO;
       }
       //</editor-fold>//GEN-END:|207-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okListGolDarah1 ">//GEN-BEGIN:|208-getter|0|208-preInit
       /**
        * Returns an initiliazed instance of okListGolDarah1 component.
        * @return the initialized component instance
        */
       public Command getOkListGolDarah1() {
           if (okListGolDarah1 == null) {//GEN-END:|208-getter|0|208-preInit
             // write pre-init user code here
               okListGolDarah1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|208-getter|1|208-postInit
             // write post-init user code here
           }//GEN-BEGIN:|208-getter|2|
           return okListGolDarah1;
       }
       //</editor-fold>//GEN-END:|208-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: gambarListmakanan ">//GEN-BEGIN:|220-getter|0|220-preInit
       /**
        * Returns an initiliazed instance of gambarListmakanan component.
        * @return the initialized component instance
        */
       public ImageItem getGambarListmakanan() {
           if (gambarListmakanan == null) {//GEN-END:|220-getter|0|220-preInit
             // write pre-init user code here
               gambarListmakanan = new ImageItem("", getImage1(), ImageItem.LAYOUT_DEFAULT, "<Missing Image>");//GEN-LINE:|220-getter|1|220-postInit
             // write post-init user code here
           }//GEN-BEGIN:|220-getter|2|
           return gambarListmakanan;
       }
       //</editor-fold>//GEN-END:|220-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ketSuplemen ">//GEN-BEGIN:|221-getter|0|221-preInit
       /**
        * Returns an initiliazed instance of ketSuplemen component.
        * @return the initialized component instance
        */
       public StringItem getKetSuplemen() {
           if (ketSuplemen == null) {//GEN-END:|221-getter|0|221-preInit
             // write pre-init user code here
               ketSuplemen = new StringItem("", null);//GEN-LINE:|221-getter|1|221-postInit
             // write post-init user code here
           }//GEN-BEGIN:|221-getter|2|
           return ketSuplemen;
       }
       //</editor-fold>//GEN-END:|221-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ketOlahraga ">//GEN-BEGIN:|222-getter|0|222-preInit
       /**
        * Returns an initiliazed instance of ketOlahraga component.
        * @return the initialized component instance
        */
       public StringItem getKetOlahraga() {
           if (ketOlahraga == null) {//GEN-END:|222-getter|0|222-preInit
             // write pre-init user code here
               ketOlahraga = new StringItem("", null);//GEN-LINE:|222-getter|1|222-postInit
             // write post-init user code here
           }//GEN-BEGIN:|222-getter|2|
           return ketOlahraga;
       }
       //</editor-fold>//GEN-END:|222-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableItem ">//GEN-BEGIN:|225-getter|0|225-preInit
       /**
        * Returns an initiliazed instance of tableItem component.
        * @return the initialized component instance
        */
       public TableItem getTableItem() {
           if (tableItem == null) {//GEN-END:|225-getter|0|225-preInit
             // write pre-init user code here


               tableItem = new TableItem(getDisplay(), "");//GEN-BEGIN:|225-getter|1|225-postInit
               tableItem.setModel(getTableModel1());//GEN-END:|225-getter|1|225-postInit
             // write post-init user code here

           }//GEN-BEGIN:|225-getter|2|
           return tableItem;
       }
       //</editor-fold>//GEN-END:|225-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableModel1 ">//GEN-BEGIN:|227-getter|0|227-preInit
       /**
        * Returns an initiliazed instance of tableModel1 component.
        * @return the initialized component instance
        */
       public SimpleTableModel getTableModel1() {
           if (tableModel1 == null) {//GEN-END:|227-getter|0|227-preInit
             // write pre-init user code here
               tableModel1 = new SimpleTableModel(new java.lang.String[][] {}, new java.lang.String[] { });//GEN-LINE:|227-getter|1|227-postInit
             // write post-init user code here
           }//GEN-BEGIN:|227-getter|2|
           return tableModel1;
       }
       //</editor-fold>//GEN-END:|227-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listSuplemenPentingO ">//GEN-BEGIN:|233-getter|0|233-preInit
       /**
        * Returns an initiliazed instance of listSuplemenPentingO component.
        * @return the initialized component instance
        */
       public List getListSuplemenPentingO() {
           if (listSuplemenPentingO == null) {//GEN-END:|233-getter|0|233-preInit
             // write pre-init user code here
               listSuplemenPentingO = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|233-getter|1|233-postInit
               listSuplemenPentingO.append("Vitamin B", null);
               listSuplemenPentingO.append("Vitamin K", null);
               listSuplemenPentingO.append("Kalsium", null);
               listSuplemenPentingO.append("Yodium", null);
               listSuplemenPentingO.append("EnzimPankreas", null);
               listSuplemenPentingO.addCommand(getBackListGolDarah());
               listSuplemenPentingO.setCommandListener(this);
               listSuplemenPentingO.setSelectedFlags(new boolean[] { false, false, false, false, false });//GEN-END:|233-getter|1|233-postInit
             // write post-init user code here
           }//GEN-BEGIN:|233-getter|2|
           return listSuplemenPentingO;
       }
       //</editor-fold>//GEN-END:|233-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Method: listSuplemenPentingOAction ">//GEN-BEGIN:|233-action|0|233-preAction
       /**
        * Performs an action assigned to the selected list element in the listSuplemenPentingO component.
        */
       public void listSuplemenPentingOAction() {//GEN-END:|233-action|0|233-preAction
         // enter pre-action user code here
           String __selectedString = getListSuplemenPentingO().getString(getListSuplemenPentingO().getSelectedIndex());//GEN-BEGIN:|233-action|1|238-preAction
           if (__selectedString != null) {
               if (__selectedString.equals("Vitamin B")) {//GEN-END:|233-action|1|238-preAction
                 // write pre-action user code here
//GEN-LINE:|233-action|2|238-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getVitBO());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Vitamin K")) {//GEN-LINE:|233-action|3|239-preAction
                 // write pre-action user code here
//GEN-LINE:|233-action|4|239-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getVitKO());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Kalsium")) {//GEN-LINE:|233-action|5|240-preAction
                 // write pre-action user code here
//GEN-LINE:|233-action|6|240-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getKalsiumO());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("Yodium")) {//GEN-LINE:|233-action|7|241-preAction
                 // write pre-action user code here
//GEN-LINE:|233-action|8|241-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getYodiumO());
                 switchDisplayable(null, getFormKeternganSuplemen());
               } else if (__selectedString.equals("EnzimPankreas")) {//GEN-LINE:|233-action|9|242-preAction
                 // write pre-action user code here
//GEN-LINE:|233-action|10|242-postAction
                 // write post-action user code here
                 getKetSuplemen().setText(dsu.getEnzimPankreasO());
                 switchDisplayable(null, getFormKeternganSuplemen());
               }//GEN-BEGIN:|233-action|11|233-postAction
           }//GEN-END:|233-action|11|233-postAction
         // enter post-action user code here
       }//GEN-BEGIN:|233-action|12|
       //</editor-fold>//GEN-END:|233-action|12|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formListDataMKN ">//GEN-BEGIN:|243-getter|0|243-preInit
       /**
        * Returns an initiliazed instance of formListDataMKN component.
        * @return the initialized component instance
        */
       public Form getFormListDataMKN() {
           if (formListDataMKN == null) {//GEN-END:|243-getter|0|243-preInit
             // write pre-init user code here
               formListDataMKN = new Form("form", new Item[] { getChoiceGroupListMKN(), getStringItemListMKN() });//GEN-BEGIN:|243-getter|1|243-postInit
               formListDataMKN.addCommand(getBackToListMakanan());
               formListDataMKN.addCommand(getOkMakanan());
               formListDataMKN.setCommandListener(this);//GEN-END:|243-getter|1|243-postInit
             // write post-init user code here
           }//GEN-BEGIN:|243-getter|2|
           return formListDataMKN;
       }
       //</editor-fold>//GEN-END:|243-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backToListMakanan ">//GEN-BEGIN:|244-getter|0|244-preInit
       /**
        * Returns an initiliazed instance of backToListMakanan component.
        * @return the initialized component instance
        */
       public Command getBackToListMakanan() {
           if (backToListMakanan == null) {//GEN-END:|244-getter|0|244-preInit
             // write pre-init user code here
               backToListMakanan = new Command("Back", Command.BACK, 0);//GEN-LINE:|244-getter|1|244-postInit
             // write post-init user code here
           }//GEN-BEGIN:|244-getter|2|
           return backToListMakanan;
       }
       //</editor-fold>//GEN-END:|244-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroupListMKN ">//GEN-BEGIN:|248-getter|0|248-preInit
       /**
        * Returns an initiliazed instance of choiceGroupListMKN component.
        * @return the initialized component instance
        */
       public ChoiceGroup getChoiceGroupListMKN() {
           if (choiceGroupListMKN == null) {//GEN-END:|248-getter|0|248-preInit
             // write pre-init user code here
               choiceGroupListMKN = new ChoiceGroup("", Choice.EXCLUSIVE);//GEN-LINE:|248-getter|1|248-postInit
             // write post-init user code here
           }//GEN-BEGIN:|248-getter|2|
           return choiceGroupListMKN;
       }
       //</editor-fold>//GEN-END:|248-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItemListMKN ">//GEN-BEGIN:|249-getter|0|249-preInit
       /**
        * Returns an initiliazed instance of stringItemListMKN component.
        * @return the initialized component instance
        */
       public StringItem getStringItemListMKN() {
           if (stringItemListMKN == null) {//GEN-END:|249-getter|0|249-preInit
             // write pre-init user code here
               stringItemListMKN = new StringItem("", null);//GEN-LINE:|249-getter|1|249-postInit
             // write post-init user code here
           }//GEN-BEGIN:|249-getter|2|
           return stringItemListMKN;
       }
       //</editor-fold>//GEN-END:|249-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|252-getter|0|252-preInit
       /**
        * Returns an initiliazed instance of image1 component.
        * @return the initialized component instance
        */
       public Image getImage1() {
           if (image1 == null) {//GEN-END:|252-getter|0|252-preInit
             // write pre-init user code here
               try {//GEN-BEGIN:|252-getter|1|252-@java.io.IOException
                   image1 = Image.createImage("/dietmain/gambar/blood.jpg");
               } catch (java.io.IOException e) {//GEN-END:|252-getter|1|252-@java.io.IOException
                 e.printStackTrace();
               }//GEN-LINE:|252-getter|2|252-postInit
             // write post-init user code here
           }//GEN-BEGIN:|252-getter|3|
           return image1;
       }
       //</editor-fold>//GEN-END:|252-getter|3|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formHitungBB ">//GEN-BEGIN:|253-getter|0|253-preInit
       /**
        * Returns an initiliazed instance of formHitungBB component.
        * @return the initialized component instance
        */
       public Form getFormHitungBB() {
           if (formHitungBB == null) {//GEN-END:|253-getter|0|253-preInit
             // write pre-init user code here
               formHitungBB = new Form("Perhitungan Berat Badan Ideal", new Item[] { getChoiceGroupJK(), getTextFieldTB(), getStringItemHasilHitung() });//GEN-BEGIN:|253-getter|1|253-postInit
               formHitungBB.addCommand(getBackToMenuUtama());
               formHitungBB.addCommand(getOkHitung());
               formHitungBB.setCommandListener(this);//GEN-END:|253-getter|1|253-postInit
             // write post-init user code here
             textFieldTB.setString("");
             stringItemHasilHitung.setText("");
           }//GEN-BEGIN:|253-getter|2|
           return formHitungBB;
       }
       //</editor-fold>//GEN-END:|253-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okHitung ">//GEN-BEGIN:|255-getter|0|255-preInit
       /**
        * Returns an initiliazed instance of okHitung component.
        * @return the initialized component instance
        */
       public Command getOkHitung() {
           if (okHitung == null) {//GEN-END:|255-getter|0|255-preInit
             // write pre-init user code here
               okHitung = new Command("Hitung", Command.OK, 0);//GEN-LINE:|255-getter|1|255-postInit
             // write post-init user code here
           }//GEN-BEGIN:|255-getter|2|
           return okHitung;
       }
       //</editor-fold>//GEN-END:|255-getter|2|
    //</editor-fold>

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroupJK ">//GEN-BEGIN:|257-getter|0|257-preInit
       /**
        * Returns an initiliazed instance of choiceGroupJK component.
        * @return the initialized component instance
        */
       public ChoiceGroup getChoiceGroupJK() {
           if (choiceGroupJK == null) {//GEN-END:|257-getter|0|257-preInit
             // write pre-init user code here
               choiceGroupJK = new ChoiceGroup("Pilih Jenis Kelamin :", Choice.EXCLUSIVE);//GEN-BEGIN:|257-getter|1|257-postInit
               choiceGroupJK.append("Laki-laki", null);
               choiceGroupJK.append("Perempuan", null);
               choiceGroupJK.setSelectedFlags(new boolean[] { false, false });//GEN-END:|257-getter|1|257-postInit
             // write post-init user code here
           }//GEN-BEGIN:|257-getter|2|
           return choiceGroupJK;
       }
       //</editor-fold>//GEN-END:|257-getter|2|
    //</editor-fold>

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textFieldTB ">//GEN-BEGIN:|261-getter|0|261-preInit
       /**
        * Returns an initiliazed instance of textFieldTB component.
        * @return the initialized component instance
        */
       public TextField getTextFieldTB() {
           if (textFieldTB == null) {//GEN-END:|261-getter|0|261-preInit
             // write pre-init user code here
               textFieldTB = new TextField("Masukan Tinggi Badan Anda (cm) :", null, 32, TextField.NUMERIC);//GEN-LINE:|261-getter|1|261-postInit
             // write post-init user code here
           }//GEN-BEGIN:|261-getter|2|
           return textFieldTB;
       }
       //</editor-fold>//GEN-END:|261-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItemHasilHitung ">//GEN-BEGIN:|262-getter|0|262-preInit
       /**
        * Returns an initiliazed instance of stringItemHasilHitung component.
        * @return the initialized component instance
        */
       public StringItem getStringItemHasilHitung() {
           if (stringItemHasilHitung == null) {//GEN-END:|262-getter|0|262-preInit
             // write pre-init user code here
               stringItemHasilHitung = new StringItem("Hasil Perhitungan :", null);//GEN-LINE:|262-getter|1|262-postInit
             // write post-init user code here
           }//GEN-BEGIN:|262-getter|2|
           return stringItemHasilHitung;
       }
       //</editor-fold>//GEN-END:|262-getter|2|
    //</editor-fold>

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroupGolDarah ">//GEN-BEGIN:|263-getter|0|263-preInit
       /**
        * Returns an initiliazed instance of choiceGroupGolDarah component.
        * @return the initialized component instance
        */
       public ChoiceGroup getChoiceGroupGolDarah() {
           if (choiceGroupGolDarah == null) {//GEN-END:|263-getter|0|263-preInit
             // write pre-init user code here
               choiceGroupGolDarah = new ChoiceGroup("Jenis Golongan Darah :", Choice.EXCLUSIVE);//GEN-BEGIN:|263-getter|1|263-postInit
               choiceGroupGolDarah.append("Golongan Darah O", null);
               choiceGroupGolDarah.append("Golongan Darah B", null);
               choiceGroupGolDarah.append("Golongan Darah AB", null);
               choiceGroupGolDarah.append("Golongan Darah A", null);
               choiceGroupGolDarah.setSelectedFlags(new boolean[] { false, false, false, false });//GEN-END:|263-getter|1|263-postInit
             // write post-init user code here
           }//GEN-BEGIN:|263-getter|2|
           return choiceGroupGolDarah;
       }
       //</editor-fold>//GEN-END:|263-getter|2|
    //</editor-fold>

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textFieldNamaMakanan ">//GEN-BEGIN:|268-getter|0|268-preInit
       /**
        * Returns an initiliazed instance of textFieldNamaMakanan component.
        * @return the initialized component instance
        */
       public TextField getTextFieldNamaMakanan() {
           if (textFieldNamaMakanan == null) {//GEN-END:|268-getter|0|268-preInit
             // write pre-init user code here
               textFieldNamaMakanan = new TextField("Masukan Nama Makanan", null, 32, TextField.ANY);//GEN-LINE:|268-getter|1|268-postInit
             // write post-init user code here
           }//GEN-BEGIN:|268-getter|2|
           return textFieldNamaMakanan;
       }
       //</editor-fold>//GEN-END:|268-getter|2|
    //</editor-fold>

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backToMenuAwal ">//GEN-BEGIN:|270-getter|0|270-preInit
       /**
        * Returns an initiliazed instance of backToMenuAwal component.
        * @return the initialized component instance
        */
       public Command getBackToMenuAwal() {
           if (backToMenuAwal == null) {//GEN-END:|270-getter|0|270-preInit
             // write pre-init user code here
               backToMenuAwal = new Command("Back", Command.BACK, 0);//GEN-LINE:|270-getter|1|270-postInit
             // write post-init user code here
           }//GEN-BEGIN:|270-getter|2|
           return backToMenuAwal;
       }
       //</editor-fold>//GEN-END:|270-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCari ">//GEN-BEGIN:|272-getter|0|272-preInit
       /**
        * Returns an initiliazed instance of okCari component.
        * @return the initialized component instance
        */
       public Command getOkCari() {
           if (okCari == null) {//GEN-END:|272-getter|0|272-preInit
             // write pre-init user code here
               okCari = new Command("Cari", Command.OK, 0);//GEN-LINE:|272-getter|1|272-postInit
             // write post-init user code here
           }//GEN-BEGIN:|272-getter|2|
           return okCari;
       }
       //</editor-fold>//GEN-END:|272-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okDetail ">//GEN-BEGIN:|274-getter|0|274-preInit
       /**
        * Returns an initiliazed instance of okDetail component.
        * @return the initialized component instance
        */
       public Command getOkDetail() {
           if (okDetail == null) {//GEN-END:|274-getter|0|274-preInit
             // write pre-init user code here
               okDetail = new Command("Lihat Gambar", Command.OK, 0);//GEN-LINE:|274-getter|1|274-postInit
             // write post-init user code here
           }//GEN-BEGIN:|274-getter|2|
           return okDetail;
       }
       //</editor-fold>//GEN-END:|274-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formPanduan ">//GEN-BEGIN:|276-getter|0|276-preInit
       /**
        * Returns an initiliazed instance of formPanduan component.
        * @return the initialized component instance
        */
       public Form getFormPanduan() {
           if (formPanduan == null) {//GEN-END:|276-getter|0|276-preInit
             // write pre-init user code here
               formPanduan = new Form("Panduan Pengguna", new Item[] { getStringItem() });//GEN-BEGIN:|276-getter|1|276-postInit
               formPanduan.addCommand(getBackToMenuAwal());
               formPanduan.setCommandListener(this);//GEN-END:|276-getter|1|276-postInit
             // write post-init user code here
           }//GEN-BEGIN:|276-getter|2|
           return formPanduan;
       }
       //</editor-fold>//GEN-END:|276-getter|2|

       //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|278-getter|0|278-preInit
       /**
        * Returns an initiliazed instance of stringItem component.
        * @return the initialized component instance
        */
       public StringItem getStringItem() {
           if (stringItem == null) {//GEN-END:|278-getter|0|278-preInit
             // write pre-init user code here
               stringItem = new StringItem("", "Panduan Untuk Penguna");//GEN-LINE:|278-getter|1|278-postInit
             // write post-init user code here
           }//GEN-BEGIN:|278-getter|2|
           return stringItem;
       }
       //</editor-fold>//GEN-END:|278-getter|2|

     //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroupHasil ">//GEN-BEGIN:|280-getter|0|280-preInit
     /**
      * Returns an initiliazed instance of choiceGroupHasil component.
      * @return the initialized component instance
      */
     public ChoiceGroup getChoiceGroupHasil() {
         if (choiceGroupHasil == null) {//GEN-END:|280-getter|0|280-preInit
            // write pre-init user code here
             choiceGroupHasil = new ChoiceGroup("Hasil pencarian :", Choice.EXCLUSIVE);//GEN-LINE:|280-getter|1|280-postInit
            // write post-init user code here
         }//GEN-BEGIN:|280-getter|2|
         return choiceGroupHasil;
     }
     //</editor-fold>//GEN-END:|280-getter|2|

     //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formDetailPencarian ">//GEN-BEGIN:|281-getter|0|281-preInit
     /**
      * Returns an initiliazed instance of formDetailPencarian component.
      * @return the initialized component instance
      */
     public Form getFormDetailPencarian() {
         if (formDetailPencarian == null) {//GEN-END:|281-getter|0|281-preInit
            // write pre-init user code here
             formDetailPencarian = new Form("Detail Pencarian", new Item[] { getStringItemKeterangan(), getImageItemPencarian() });//GEN-BEGIN:|281-getter|1|281-postInit
             formDetailPencarian.addCommand(getBackPencarian());
             formDetailPencarian.setCommandListener(this);//GEN-END:|281-getter|1|281-postInit
            // write post-init user code here
         }//GEN-BEGIN:|281-getter|2|
         return formDetailPencarian;
     }
     //</editor-fold>//GEN-END:|281-getter|2|

     //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItemKeterangan ">//GEN-BEGIN:|286-getter|0|286-preInit
     /**
      * Returns an initiliazed instance of stringItemKeterangan component.
      * @return the initialized component instance
      */
     public StringItem getStringItemKeterangan() {
         if (stringItemKeterangan == null) {//GEN-END:|286-getter|0|286-preInit
            // write pre-init user code here
             stringItemKeterangan = new StringItem("", null);//GEN-LINE:|286-getter|1|286-postInit
            // write post-init user code here
         }//GEN-BEGIN:|286-getter|2|
         return stringItemKeterangan;
     }
     //</editor-fold>//GEN-END:|286-getter|2|
    //</editor-fold>

     //<editor-fold defaultstate="collapsed" desc=" Generated Getter: imageItemPencarian ">//GEN-BEGIN:|287-getter|0|287-preInit
     /**
      * Returns an initiliazed instance of imageItemPencarian component.
      * @return the initialized component instance
      */
     public ImageItem getImageItemPencarian() {
         if (imageItemPencarian == null) {//GEN-END:|287-getter|0|287-preInit
            // write pre-init user code here
             imageItemPencarian = new ImageItem("", getImage1(), ImageItem.LAYOUT_DEFAULT, "<Missing Image>");//GEN-LINE:|287-getter|1|287-postInit
            // write post-init user code here
         }//GEN-BEGIN:|287-getter|2|
         return imageItemPencarian;
     }
     //</editor-fold>//GEN-END:|287-getter|2|

     //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backPencarian ">//GEN-BEGIN:|282-getter|0|282-preInit
     /**
      * Returns an initiliazed instance of backPencarian component.
      * @return the initialized component instance
      */
     public Command getBackPencarian() {
         if (backPencarian == null) {//GEN-END:|282-getter|0|282-preInit
            // write pre-init user code here
             backPencarian = new Command("Back", Command.BACK, 0);//GEN-LINE:|282-getter|1|282-postInit
            // write post-init user code here
         }//GEN-BEGIN:|282-getter|2|
         return backPencarian;
     }
     //</editor-fold>//GEN-END:|282-getter|2|



    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}

class PisahKata {

    Vector v = new Vector(100);

    public void getData(String data) {
        //initialise StringTokenizer with "|" as delimiter
        StringTokenizer tok = new StringTokenizer(data, "#");
        while (tok.hasMoreTokens()) {

            v.addElement(tok.nextToken());
        }

    }
}
