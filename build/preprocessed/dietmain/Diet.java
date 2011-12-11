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
    private List listMakanan;
    private Form formKeterangan;
    private List listGolDarahA;
    private List listGolDarahB;
    private List listGolDarahAB;
    private List listGolDarahO;
    private Command okListGolDarah;
    private Command okMakanan;
    private Command backGolDarah;
    private Command okKeterangan;
    private Command backToListPanduan;
    private Command okGambar;
    private Command backCommand;
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
        if (displayable == formKeterangan) {//GEN-BEGIN:|7-commandAction|1|61-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|61-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|2|61-postAction
                // write post-action user code here
            } else if (command == okGambar) {//GEN-LINE:|7-commandAction|3|59-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|4|59-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|64-preAction
        } else if (displayable == listGolDarahA) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|5|64-preAction
                // write pre-action user code here
                listGolDarahAAction();//GEN-LINE:|7-commandAction|6|64-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|70-preAction
        } else if (displayable == listGolDarahAB) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|7|70-preAction
                // write pre-action user code here
                listGolDarahABAction();//GEN-LINE:|7-commandAction|8|70-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|67-preAction
        } else if (displayable == listGolDarahB) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|9|67-preAction
                // write pre-action user code here
                listGolDarahBAction();//GEN-LINE:|7-commandAction|10|67-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|11|73-preAction
        } else if (displayable == listGolDarahO) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|11|73-preAction
                // write pre-action user code here
                listGolDarahOAction();//GEN-LINE:|7-commandAction|12|73-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|48-preAction
        } else if (displayable == listMakanan) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|13|48-preAction
                // write pre-action user code here
                listMakananAction();//GEN-LINE:|7-commandAction|14|48-postAction
                // write post-action user code here
            } else if (command == backToListPanduan) {//GEN-LINE:|7-commandAction|15|53-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|16|53-postAction
                // write post-action user code here
            } else if (command == okKeterangan) {//GEN-LINE:|7-commandAction|17|51-preAction
                // write pre-action user code here
                switchDisplayable(null, getFormKeterangan());//GEN-LINE:|7-commandAction|18|51-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|35-preAction
        } else if (displayable == listPanduaDietMakanan) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|19|35-preAction
                // write pre-action user code here
                listPanduaDietMakananAction();//GEN-LINE:|7-commandAction|20|35-postAction
                // write post-action user code here
            } else if (command == backGolDarah) {//GEN-LINE:|7-commandAction|21|44-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|22|44-postAction
                // write post-action user code here
            } else if (command == okMakanan) {//GEN-LINE:|7-commandAction|23|38-preAction
                // write pre-action user code here
                switchDisplayable(null, getListMakanan());//GEN-LINE:|7-commandAction|24|38-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|18-preAction
        } else if (displayable == splashScreenKeluar) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|25|18-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|26|18-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|27|16-preAction
        } else if (displayable == splashScreenMasuk) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|27|16-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|28|16-postAction
                // write post-action user code here
                switchDisplayable(null, ma);
            }//GEN-BEGIN:|7-commandAction|29|7-postCommandAction
        }//GEN-END:|7-commandAction|29|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|30|
    //</editor-fold>//GEN-END:|7-commandAction|30|


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
            listPanduaDietMakanan = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|34-getter|1|34-postInit
            listPanduaDietMakanan.addCommand(getOkMakanan());
            listPanduaDietMakanan.addCommand(getBackGolDarah());
            listPanduaDietMakanan.setCommandListener(this);//GEN-END:|34-getter|1|34-postInit
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
        String __selectedString = getListPanduaDietMakanan().getString(getListPanduaDietMakanan().getSelectedIndex());//GEN-LINE:|34-action|1|34-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|34-action|2|
    //</editor-fold>//GEN-END:|34-action|2|



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

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listMakanan ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initiliazed instance of listMakanan component.
     * @return the initialized component instance
     */
    public List getListMakanan() {
        if (listMakanan == null) {//GEN-END:|47-getter|0|47-preInit
            // write pre-init user code here
            listMakanan = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|47-getter|1|47-postInit
            listMakanan.addCommand(getOkKeterangan());
            listMakanan.addCommand(getBackToListPanduan());
            listMakanan.setCommandListener(this);//GEN-END:|47-getter|1|47-postInit
            // write post-init user code here
        }//GEN-BEGIN:|47-getter|2|
        return listMakanan;
    }
    //</editor-fold>//GEN-END:|47-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listMakananAction ">//GEN-BEGIN:|47-action|0|47-preAction
    /**
     * Performs an action assigned to the selected list element in the listMakanan component.
     */
    public void listMakananAction() {//GEN-END:|47-action|0|47-preAction
        // enter pre-action user code here
        String __selectedString = getListMakanan().getString(getListMakanan().getSelectedIndex());//GEN-LINE:|47-action|1|47-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|47-action|2|
    //</editor-fold>//GEN-END:|47-action|2|

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
            formKeterangan.addCommand(getBackCommand());
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

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|60-getter|0|60-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|60-getter|0|60-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|60-getter|1|60-postInit
            // write post-init user code here
        }//GEN-BEGIN:|60-getter|2|
        return backCommand;
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
            listGolDarahB = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|66-getter|1|66-postInit
            listGolDarahB.setCommandListener(this);//GEN-END:|66-getter|1|66-postInit
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
        String __selectedString = getListGolDarahB().getString(getListGolDarahB().getSelectedIndex());//GEN-LINE:|66-action|1|66-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|66-action|2|
    //</editor-fold>//GEN-END:|66-action|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarahAB ">//GEN-BEGIN:|69-getter|0|69-preInit
    /**
     * Returns an initiliazed instance of listGolDarahAB component.
     * @return the initialized component instance
     */
    public List getListGolDarahAB() {
        if (listGolDarahAB == null) {//GEN-END:|69-getter|0|69-preInit
            // write pre-init user code here
            listGolDarahAB = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|69-getter|1|69-postInit
            listGolDarahAB.setCommandListener(this);//GEN-END:|69-getter|1|69-postInit
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
        String __selectedString = getListGolDarahAB().getString(getListGolDarahAB().getSelectedIndex());//GEN-LINE:|69-action|1|69-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|69-action|2|
    //</editor-fold>//GEN-END:|69-action|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: listGolDarahO ">//GEN-BEGIN:|72-getter|0|72-preInit
    /**
     * Returns an initiliazed instance of listGolDarahO component.
     * @return the initialized component instance
     */
    public List getListGolDarahO() {
        if (listGolDarahO == null) {//GEN-END:|72-getter|0|72-preInit
            // write pre-init user code here
            listGolDarahO = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|72-getter|1|72-postInit
            listGolDarahO.setCommandListener(this);//GEN-END:|72-getter|1|72-postInit
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
        String __selectedString = getListGolDarahO().getString(getListGolDarahO().getSelectedIndex());//GEN-LINE:|72-action|1|72-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|72-action|2|
    //</editor-fold>//GEN-END:|72-action|2|

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
