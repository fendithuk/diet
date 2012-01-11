/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dietmain.data;

/**
 *
 
 */
public class Search {
    private String kata;
    private String kata2;
    private boolean temu;

    public Search(String kata, String kata2,boolean temu) {
        this.kata = kata.toLowerCase();
        this.kata2 = kata2.toLowerCase();
        for(int i = 0;i<kata.length();i++){
            if(this.kata.substring(i, 1+i).equals(this.kata2.substring(i, 1+i))){
                this.temu = temu;
            }else{
                temu = false;
                this.temu = temu;
            }
        }
    }

    public boolean isTemu() {
        return temu;
    }

}
