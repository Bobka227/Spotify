/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotimain;

/**
 *
 * @author 38067
 */
public class Song {
    
    private String intrapet;
    private String nazev;
    private Cas delka;
    private String zanr;

    public Song(String intrapet, String nazev, Cas delka, String zanr) {
        this.intrapet = intrapet;
        this.nazev = nazev;
        this.delka = delka;
        this.zanr = zanr;
    }

    public String getIntrapet() {
        return intrapet;
    }

    public String getNazev() {
        return nazev;
    }

    public Cas getDelka() {
        return delka;
    }

    public String getZanr() {
        return zanr;
    }
    
    
    public int casNaSekundy(){
       return  delka.PrevedNaSecundy();
        
    }

    @Override
    public String toString() {
        return "Song{" + "intrapet=" + intrapet + ", nazev=" + nazev + ", delka=" + delka + ", zanr=" + zanr + '}';
    }
    
    
    
    
}
