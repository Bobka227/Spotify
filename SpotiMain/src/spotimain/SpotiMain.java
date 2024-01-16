
package spotimain;


public class SpotiMain {

    public static void main(String[] args) {
        
        Cas c1 = new Cas(3,14);
        Cas c2 = new Cas(4,15);
        Cas c3 = new Cas(2,45);
        Playlist pl1 = new Playlist("Upce hudba");
        
        Song s1 = new Song("IC3PEAK","blood and tears", c1, "darkpop");
        Song s2 = new Song("BMTH","Sleepwalking", c2, "metalcore");
        Song s3 = new Song("Bad Omens","Like a Villian", c3, "Rock");
        
        pl1.PridejSong(s1);
        pl1.PridejSong(s2);
        pl1.PridejSong(s3);
        
        
        pl1.VypisSongy();
        
        System.out.println(" ");
        pl1.NajdiNejdelsiSkladbu();
        
        
        System.out.println("Prumer: " +  pl1.DelkaDohromady());
        
        pl1.ulozPlaylistDoSouboru("spotifydata.csv");
        
        
       pl1.NactiSoubor("spotifydata.csv");
           
        
    }
    
}
