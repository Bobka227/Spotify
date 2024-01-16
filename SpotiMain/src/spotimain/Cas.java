

package spotimain;


public class Cas {
   
    private int minuty;
    private int sec;

    public Cas(int minuty, int sec) {
        this.minuty = minuty;
        this.sec = sec;
    }

    public int getMinuty() {
        return minuty;
    }

    public int getSec() {
        return sec;
    }
    
    public int PrevedNaSecundy(){
        int prevod =0;
        
        prevod = minuty * 60 + sec;
        
        return prevod;
    }

    @Override
    public String toString() {
        return "Cas{" + "minuty=" + minuty + ", sec=" + sec + '}';
    }
    
    
    
}
