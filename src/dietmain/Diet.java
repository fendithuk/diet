/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dietmain;

import dietmain.menu.MenuAwal;
import dietmain.menu.MenuUtama;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author fendi
 */
public class Diet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private java.util.Hashtable __previousDisplayables = new java.util.Hashtable();
    private SplashScreen splashScreenMasuk;
    private SplashScreen splashScreenKeluar;
    private List listPanduaDietMakanan;
    private Form formKeterangan;
    private List listGolDarahA;
    private List listGolDarahB;
    private List listGolDarahAB;
    private List listGolDarahO;
    private List listMakanan;
    private Form formGambar;
    private List listSuplemenPentingA;
    private List listSuplemenPentingB;
    private List listSuplemenPentingAB;
    private Form formKeternganSuplemen;
    private Form formOlahraga;
    private Command okListGolDarah;
    private Command okMakanan;
    private Command backGolDarah;
    private Command okKeterangan;
    private Command backToListPanduan;
    private Command okGambar;
    private Command b;
    private Command backToMenuUtama;
    private Command stopCommand;
    private Command backToKeterangan;
    private Command backToSuplemen;
    private Command backTo;
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
        if (displayable == formGambar) {//GEN-BEGIN:|7-commandAction|1|129-preAction
            if (command == backToKeterangan) {//GEN-END:|7-commandAction|1|129-preAction
                // write pre-action user code here
                switchDisplayable(null, getFormKeterangan());//GEN-LINE:|7-commandAction|2|129-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|179-preAction
        } else if (displayable == formKeterangan) {
            if (command == backToListPanduan) {//GEN-END:|7-commandAction|3|179-preAction
                // write pre-action user code here
                switchDisplayable(null, getListMakanan());//GEN-LINE:|7-commandAction|4|179-postAction
                // write post-action user code here
            } else if (command == okGambar) {//GEN-LINE:|7-commandAction|5|59-preAction
                // write pre-action user code here
                switchDisplayable(null, getFormGambar());//GEN-LINE:|7-commandAction|6|59-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|173-preAction
        } else if (displayable == formKeternganSuplemen) {
            if (command == backToSuplemen) {//GEN-END:|7-commandAction|7|173-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|8|173-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|178-preAction
        } else if (displayable == formOlahraga) {
            if (command == backGolDarah) {//GEN-END:|7-commandAction|9|178-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|10|178-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|64-preAction
        } else if (displayable == listGolDarahA) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|11|64-preAction
                // write pre-action user code here
                listGolDarahAAction();//GEN-LINE:|7-commandAction|12|64-postAction
                // write post-action user code here
            } else if (command == backToMenuUtama) {//GEN-LINE:|7-commandAction|13|81-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|14|81-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|15|70-preAction
        } else if (displayable == listGolDarahAB) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|15|70-preAction
                // write pre-action user code here
                listGolDarahABAction();//GEN-LINE:|7-commandAction|16|70-postAction
                // write post-action user code here
            } else if (command == backToMenuUtama) {//GEN-LINE:|7-commandAction|17|83-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|18|83-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|67-preAction
        } else if (displayable == listGolDarahB) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|19|67-preAction
                // write pre-action user code here
                listGolDarahBAction();//GEN-LINE:|7-commandAction|20|67-postAction
                // write post-action user code here
            } else if (command == backToMenuUtama) {//GEN-LINE:|7-commandAction|21|82-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|22|82-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|23|73-preAction
        } else if (displayable == listGolDarahO) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|23|73-preAction
                // write pre-action user code here
                listGolDarahOAction();//GEN-LINE:|7-commandAction|24|73-postAction
                // write post-action user code here
            } else if (command == backToMenuUtama) {//GEN-LINE:|7-commandAction|25|84-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|26|84-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|27|107-preAction
        } else if (displayable == listMakanan) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|27|107-preAction
                // write pre-action user code here
                listMakananAction();//GEN-LINE:|7-commandAction|28|107-postAction
                // write post-action user code here
            } else if (command == backToListPanduan) {//GEN-LINE:|7-commandAction|29|124-preAction
                // write pre-action user code here
                switchDisplayable(null, getListPanduaDietMakanan());//GEN-LINE:|7-commandAction|30|124-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|31|35-preAction
        } else if (displayable == listPanduaDietMakanan) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|31|35-preAction
                // write pre-action user code here
                listPanduaDietMakananAction();//GEN-LINE:|7-commandAction|32|35-postAction
                // write post-action user code here
            } else if (command == backGolDarah) {//GEN-LINE:|7-commandAction|33|44-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|34|44-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|35|131-preAction
        } else if (displayable == listSuplemenPentingA) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|35|131-preAction
                // write pre-action user code here
                listSuplemenPentingAAction();//GEN-LINE:|7-commandAction|36|131-postAction
                // write post-action user code here
            } else if (command == backGolDarah) {//GEN-LINE:|7-commandAction|37|146-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|38|146-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|39|159-preAction
        } else if (displayable == listSuplemenPentingAB) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|39|159-preAction
                // write pre-action user code here
                listSuplemenPentingABAction();//GEN-LINE:|7-commandAction|40|159-postAction
                // write post-action user code here
            } else if (command == backGolDarah) {//GEN-LINE:|7-commandAction|41|161-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|42|161-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|43|149-preAction
        } else if (displayable == listSuplemenPentingB) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|43|149-preAction
                // write pre-action user code here
                listSuplemenPentingBAction();//GEN-LINE:|7-commandAction|44|149-postAction
                // write post-action user code here
            } else if (command == backGolDarah) {//GEN-LINE:|7-commandAction|45|151-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|46|151-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|47|18-preAction
        } else if (displayable == splashScreenKeluar) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|47|18-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|48|18-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|49|16-preAction
        } else if (displayable == splashScreenMasuk) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|49|16-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|50|16-postAction
                // write post-action user code here
                switchDisplayable(null, ma);
            }//GEN-BEGIN:|7-commandAction|51|7-postCommandAction
        }//GEN-END:|7-commandAction|51|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|52|
    //</editor-fold>//GEN-END:|7-commandAction|52|




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
            splashScreenMasuk.setTimeout(1000);//GEN-END:|14-getter|1|14-postInit
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
            splashScreenKeluar.setTitle("splashScreen");
            splashScreenKeluar.setCommandListener(this);//GEN-END:|17-getter|1|17-postInit
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
            listPanduaDietMakanan.addCommand(getBackGolDarah());
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
            } else if (__selectedString.equals("Makanan Netral atau Di Ijinkan")) {//GEN-LINE:|34-action|3|95-preAction
                // write pre-action user code here
//GEN-LINE:|34-action|4|95-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Makananan Yang Harus Di Hindari")) {//GEN-LINE:|34-action|5|96-preAction
                // write pre-action user code here
//GEN-LINE:|34-action|6|96-postAction
                // write post-action user code here
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
            okMakanan = new Command("Ok", Command.OK, 0);//GEN-LINE:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return okMakanan;
    }
    //</editor-fold>//GEN-END:|37-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backGolDarah ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initiliazed instance of backGolDarah component.
     * @return the initialized component instance
     */
    public Command getBackGolDarah() {
        if (backGolDarah == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            backGolDarah = new Command("Back", Command.BACK, 0);//GEN-LINE:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return backGolDarah;
    }
    //</editor-fold>//GEN-END:|43-getter|2|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formKeterangan ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initiliazed instance of formKeterangan component.
     * @return the initialized component instance
     */
    public Form getFormKeterangan() {
        if (formKeterangan == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            formKeterangan = new Form("form");//GEN-BEGIN:|56-getter|1|56-postInit
            formKeterangan.addCommand(getOkGambar());
            formKeterangan.addCommand(getBackToListPanduan());
            formKeterangan.setCommandListener(this);//GEN-END:|56-getter|1|56-postInit
            // write post-init user code here
        }//GEN-BEGIN:|56-getter|2|
        return formKeterangan;
    }
    //</editor-fold>//GEN-END:|56-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarahA ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initiliazed instance of listGolDarahA component.
     * @return the initialized component instance
     */
    public List getListGolDarahA() {
        if (listGolDarahA == null) {//GEN-END:|63-getter|0|63-preInit
            // write pre-init user code here
            listGolDarahA = new List("Golongan Darah A", Choice.IMPLICIT);//GEN-BEGIN:|63-getter|1|63-postInit
            listGolDarahA.append("Panduan Diet Makanan", null);
            listGolDarahA.append("Suplemen Penting", null);
            listGolDarahA.append("Olahraga Yang Di Anjurkan", null);
            listGolDarahA.addCommand(getBackToMenuUtama());
            listGolDarahA.setCommandListener(this);
            listGolDarahA.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|63-getter|1|63-postInit
            // write post-init user code here
        }//GEN-BEGIN:|63-getter|2|
        return listGolDarahA;
    }
    //</editor-fold>//GEN-END:|63-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listGolDarahAAction ">//GEN-BEGIN:|63-action|0|63-preAction
    /**
     * Performs an action assigned to the selected list element in the listGolDarahA component.
     */
    public void listGolDarahAAction() {//GEN-END:|63-action|0|63-preAction
        // enter pre-action user code here
        String __selectedString = getListGolDarahA().getString(getListGolDarahA().getSelectedIndex());//GEN-BEGIN:|63-action|1|77-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Panduan Diet Makanan")) {//GEN-END:|63-action|1|77-preAction
                // write pre-action user code here
//GEN-LINE:|63-action|2|77-postAction
                // write post-action user code here
                System.out.println("ok");
            } else if (__selectedString.equals("Suplemen Penting")) {//GEN-LINE:|63-action|3|78-preAction
                // write pre-action user code here
//GEN-LINE:|63-action|4|78-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Olahraga Yang Di Anjurkan")) {//GEN-LINE:|63-action|5|79-preAction
                // write pre-action user code here
//GEN-LINE:|63-action|6|79-postAction
                // write post-action user code here
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

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarahB ">//GEN-BEGIN:|66-getter|0|66-preInit
    /**
     * Returns an initiliazed instance of listGolDarahB component.
     * @return the initialized component instance
     */
    public List getListGolDarahB() {
        if (listGolDarahB == null) {//GEN-END:|66-getter|0|66-preInit
            // write pre-init user code here
            listGolDarahB = new List("Golongan Darah B", Choice.IMPLICIT);//GEN-BEGIN:|66-getter|1|66-postInit
            listGolDarahB.append("Panduan Diet Makanan", null);
            listGolDarahB.append("Suplemen Penting", null);
            listGolDarahB.append("Olahraga Yang Di Anjurkan", null);
            listGolDarahB.addCommand(getBackToMenuUtama());
            listGolDarahB.setCommandListener(this);
            listGolDarahB.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|66-getter|1|66-postInit
            // write post-init user code here
        }//GEN-BEGIN:|66-getter|2|
        return listGolDarahB;
    }
    //</editor-fold>//GEN-END:|66-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listGolDarahBAction ">//GEN-BEGIN:|66-action|0|66-preAction
    /**
     * Performs an action assigned to the selected list element in the listGolDarahB component.
     */
    public void listGolDarahBAction() {//GEN-END:|66-action|0|66-preAction
        // enter pre-action user code here
        String __selectedString = getListGolDarahB().getString(getListGolDarahB().getSelectedIndex());//GEN-BEGIN:|66-action|1|85-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Panduan Diet Makanan")) {//GEN-END:|66-action|1|85-preAction
                // write pre-action user code here
//GEN-LINE:|66-action|2|85-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Suplemen Penting")) {//GEN-LINE:|66-action|3|86-preAction
                // write pre-action user code here
//GEN-LINE:|66-action|4|86-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Olahraga Yang Di Anjurkan")) {//GEN-LINE:|66-action|5|87-preAction
                // write pre-action user code here
//GEN-LINE:|66-action|6|87-postAction
                // write post-action user code here
            }//GEN-BEGIN:|66-action|7|66-postAction
        }//GEN-END:|66-action|7|66-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|66-action|8|
    //</editor-fold>//GEN-END:|66-action|8|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarahAB ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initiliazed instance of listGolDarahAB component.
     * @return the initialized component instance
     */
    public List getListGolDarahAB() {
        if (listGolDarahAB == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            listGolDarahAB = new List("Golongan Darah AB", Choice.IMPLICIT);//GEN-BEGIN:|69-getter|1|69-postInit
            listGolDarahAB.append("Panduan Diet Makanan", null);
            listGolDarahAB.append("Suplemen Penting", null);
            listGolDarahAB.append("Olahraga Yang Di Anjurkan", null);
            listGolDarahAB.addCommand(getBackToMenuUtama());
            listGolDarahAB.setCommandListener(this);
            listGolDarahAB.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|69-getter|1|69-postInit
            // write post-init user code here
        }//GEN-BEGIN:|69-getter|2|
        return listGolDarahAB;
    }
    //</editor-fold>//GEN-END:|69-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listGolDarahABAction ">//GEN-BEGIN:|69-action|0|69-preAction
    /**
     * Performs an action assigned to the selected list element in the listGolDarahAB component.
     */
    public void listGolDarahABAction() {//GEN-END:|69-action|0|69-preAction
        // enter pre-action user code here
        String __selectedString = getListGolDarahAB().getString(getListGolDarahAB().getSelectedIndex());//GEN-BEGIN:|69-action|1|88-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Panduan Diet Makanan")) {//GEN-END:|69-action|1|88-preAction
                // write pre-action user code here
//GEN-LINE:|69-action|2|88-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Suplemen Penting")) {//GEN-LINE:|69-action|3|89-preAction
                // write pre-action user code here
//GEN-LINE:|69-action|4|89-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Olahraga Yang Di Anjurkan")) {//GEN-LINE:|69-action|5|90-preAction
                // write pre-action user code here
//GEN-LINE:|69-action|6|90-postAction
                // write post-action user code here
            }//GEN-BEGIN:|69-action|7|69-postAction
        }//GEN-END:|69-action|7|69-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|69-action|8|
    //</editor-fold>//GEN-END:|69-action|8|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarahO ">//GEN-BEGIN:|72-getter|0|72-preInit
    /**
     * Returns an initiliazed instance of listGolDarahO component.
     * @return the initialized component instance
     */
    public List getListGolDarahO() {
        if (listGolDarahO == null) {//GEN-END:|72-getter|0|72-preInit
            // write pre-init user code here
            listGolDarahO = new List("Golongan Darah O", Choice.IMPLICIT);//GEN-BEGIN:|72-getter|1|72-postInit
            listGolDarahO.append("Panduan Diet Makanan", null);
            listGolDarahO.append("Suplemen Penting", null);
            listGolDarahO.append("Olahraga Yang Di Anjurkan", null);
            listGolDarahO.addCommand(getBackToMenuUtama());
            listGolDarahO.setCommandListener(this);
            listGolDarahO.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|72-getter|1|72-postInit
            // write post-init user code here
        }//GEN-BEGIN:|72-getter|2|
        return listGolDarahO;
    }
    //</editor-fold>//GEN-END:|72-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listGolDarahOAction ">//GEN-BEGIN:|72-action|0|72-preAction
    /**
     * Performs an action assigned to the selected list element in the listGolDarahO component.
     */
    public void listGolDarahOAction() {//GEN-END:|72-action|0|72-preAction
        // enter pre-action user code here
        String __selectedString = getListGolDarahO().getString(getListGolDarahO().getSelectedIndex());//GEN-BEGIN:|72-action|1|91-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Panduan Diet Makanan")) {//GEN-END:|72-action|1|91-preAction
                // write pre-action user code here
//GEN-LINE:|72-action|2|91-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Suplemen Penting")) {//GEN-LINE:|72-action|3|92-preAction
                // write pre-action user code here
//GEN-LINE:|72-action|4|92-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Olahraga Yang Di Anjurkan")) {//GEN-LINE:|72-action|5|93-preAction
                // write pre-action user code here
//GEN-LINE:|72-action|6|93-postAction
                // write post-action user code here
            }//GEN-BEGIN:|72-action|7|72-postAction
        }//GEN-END:|72-action|7|72-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|72-action|8|
    //</editor-fold>//GEN-END:|72-action|8|

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
            } else if (__selectedString.equals("Makanan Hasil Laut")) {//GEN-LINE:|106-action|3|110-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|4|110-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Telur dan Produk Susu")) {//GEN-LINE:|106-action|5|111-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|6|111-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Minyak dan Lemak")) {//GEN-LINE:|106-action|7|112-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|8|112-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Kacang-kacangan dan Biji-bijian")) {//GEN-LINE:|106-action|9|113-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|10|113-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Polong-polongan")) {//GEN-LINE:|106-action|11|114-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|12|114-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Padi-padian (Serella), Roti, dan Pasta")) {//GEN-LINE:|106-action|13|115-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|14|115-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Sayur-sayuran")) {//GEN-LINE:|106-action|15|116-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|16|116-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Buah-buahan")) {//GEN-LINE:|106-action|17|117-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|18|117-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Jus dan Sirup")) {//GEN-LINE:|106-action|19|118-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|20|118-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Rempah-rempah dan Bumbu-bumbuan")) {//GEN-LINE:|106-action|21|119-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|22|119-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Penyedap Rasa")) {//GEN-LINE:|106-action|23|120-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|24|120-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Tanaman Obat dan Teh Herbal")) {//GEN-LINE:|106-action|25|121-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|26|121-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Berbagai Minuman")) {//GEN-LINE:|106-action|27|122-preAction
                // write pre-action user code here
//GEN-LINE:|106-action|28|122-postAction
                // write post-action user code here
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
            formGambar = new Form("form");//GEN-BEGIN:|126-getter|1|126-postInit
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
            listSuplemenPentingA.addCommand(getBackGolDarah());
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
            } else if (__selectedString.equals("Vitamin C")) {//GEN-LINE:|130-action|3|134-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|4|134-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Vitamin E")) {//GEN-LINE:|130-action|5|135-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|6|135-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Kalsium")) {//GEN-LINE:|130-action|7|136-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|8|136-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Besi")) {//GEN-LINE:|130-action|9|137-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|10|137-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Seng")) {//GEN-LINE:|130-action|11|138-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|12|138-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Howhorn (crataegus oxyacantha)")) {//GEN-LINE:|130-action|13|139-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|14|139-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Conflower Ungu (Echinacea Purpusa) ")) {//GEN-LINE:|130-action|15|140-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|16|140-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Kamomil dan Akar Valerian")) {//GEN-LINE:|130-action|17|141-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|18|141-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Kuersetin")) {//GEN-LINE:|130-action|19|142-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|20|142-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Milk Thitle (Silybum Marianum)")) {//GEN-LINE:|130-action|21|143-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|22|143-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Bromelain (enzim nanas)")) {//GEN-LINE:|130-action|23|144-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|24|144-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Probiotik")) {//GEN-LINE:|130-action|25|145-preAction
                // write pre-action user code here
//GEN-LINE:|130-action|26|145-postAction
                // write post-action user code here
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
            listSuplemenPentingB.addCommand(getBackGolDarah());
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
            } else if (__selectedString.equals("Licorice (Glycynhiza glabra)")) {//GEN-LINE:|148-action|3|154-preAction
                // write pre-action user code here
//GEN-LINE:|148-action|4|154-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Bromelain")) {//GEN-LINE:|148-action|5|155-preAction
                // write pre-action user code here
//GEN-LINE:|148-action|6|155-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Gingseng Siberta dan Gingko Biloa")) {//GEN-LINE:|148-action|7|156-preAction
                // write pre-action user code here
//GEN-LINE:|148-action|8|156-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Lesitin")) {//GEN-LINE:|148-action|9|157-preAction
                // write pre-action user code here
//GEN-LINE:|148-action|10|157-postAction
                // write post-action user code here
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
            listSuplemenPentingAB.append("Milk Thitle (Silybum Marianum)", null);
            listSuplemenPentingAB.append("Howhorn (crataegus oxyacantha)", null);
            listSuplemenPentingAB.addCommand(getBackGolDarah());
            listSuplemenPentingAB.setCommandListener(this);
            listSuplemenPentingAB.setSelectedFlags(new boolean[] { false, false, false, false, false, false, false, false });//GEN-END:|158-getter|1|158-postInit
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
            } else if (__selectedString.equals("Seng")) {//GEN-LINE:|158-action|3|164-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|4|164-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Conflower Ungu (Echinacea Purpusa) ")) {//GEN-LINE:|158-action|5|165-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|6|165-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Kamomil dan Akar Valerian")) {//GEN-LINE:|158-action|7|166-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|8|166-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Milk Thitle (Silybum Marianum)")) {//GEN-LINE:|158-action|9|167-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|10|167-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Kuersetin")) {//GEN-LINE:|158-action|11|168-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|12|168-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Milk Thitle (Silybum Marianum)")) {//GEN-LINE:|158-action|13|169-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|14|169-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Howhorn (crataegus oxyacantha)")) {//GEN-LINE:|158-action|15|170-preAction
                // write pre-action user code here
//GEN-LINE:|158-action|16|170-postAction
                // write post-action user code here
            }//GEN-BEGIN:|158-action|17|158-postAction
        }//GEN-END:|158-action|17|158-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|158-action|18|
    //</editor-fold>//GEN-END:|158-action|18|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: formKeternganSuplemen ">//GEN-BEGIN:|171-getter|0|171-preInit
    /**
     * Returns an initiliazed instance of formKeternganSuplemen component.
     * @return the initialized component instance
     */
    public Form getFormKeternganSuplemen() {
        if (formKeternganSuplemen == null) {//GEN-END:|171-getter|0|171-preInit
            // write pre-init user code here
            formKeternganSuplemen = new Form("form");//GEN-BEGIN:|171-getter|1|171-postInit
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
            formOlahraga = new Form("form");//GEN-BEGIN:|175-getter|1|175-postInit
            formOlahraga.addCommand(getBackGolDarah());
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

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
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
