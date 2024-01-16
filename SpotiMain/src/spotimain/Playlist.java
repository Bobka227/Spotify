
package spotimain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.ArrayList;


public class Playlist {
    private String jmeno;
    private ArrayList<Song> songi;

    public Playlist(String jmeno) {
        this.jmeno = jmeno;
        this.songi = new ArrayList<>();
    }
    
    public void PridejSong(Song songulia){
        songi.add(songulia);
        
    }
    
    public void VypisSongy(){
        System.out.println("Spotik: " + jmeno);
        for(Song i : songi){
            System.out.println(i);
        }
    }
    
    public void VypisZanr( Song zanrik){
        for(Song j : songi){
            if(j.getZanr().equals(zanrik)){
                
                System.out.println(j);
            }
        }
        
      }
    
    public int DelkaDohromady(){
        int del = 0;
        for(Song o : songi){
            del += o.casNaSekundy();
        }
        return del;
    }
    
     public Song NajdiNejdelsiSkladbu(){
       Song sex = songi.get(0);
         for(Song f : songi){
             if(f.casNaSekundy() > sex.casNaSekundy() )
             sex = f;
         }
         System.out.println("delsi: " + sex.getNazev());
         return  sex ;
     }
     
     
     public void ulozPlaylistDoSouboru(String soubor){
         
         try(PrintWriter writer = new PrintWriter(new FileWriter(soubor))){
             writer.println(jmeno);
             
             for(Song songs : songi){
                 
                 writer.printf("%s;%s;%s%n", songs.getIntrapet()
                         ,songs.getNazev()
                         , songs.getDelka().toString(),songs.getZanr());
             }
         } catch(IOException e){
             e.printStackTrace();
         }
         
         
     }
     
     
     public void NactiSoubor(String soubor){
         try(BufferedReader reader = new BufferedReader( new FileReader(soubor))){
             
             jmeno = reader.readLine();
             
             
             String line;
             while((line =reader.readLine()) != null){
                 
                 System.out.println(line);
                     
                 }
             
             
             
             
         } catch(IOException e){
             e.printStackTrace();
         }
         
         
         
         
     }
     
     
    
}
