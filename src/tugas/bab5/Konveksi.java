package methodstatic;
public class Konveksi {
    private int diskonPA, diskonPB, diskonPC; 
    private final int maxPA = 100000; 
    private final int maxPB = 125000; 
    private final int maxPC = 175000;
    public int getDiscPA() {
        return this.diskonPA;
}
    public int getDiscPB() {
        return this.diskonPB;
}
    public int getDiscPC() {
        return this.diskonPC;
}
    public boolean addBeliA(int jum) {
        if (jum < 100) {
            this.diskonPA = this.maxPA;
            return true;
        } else {
            this.diskonPA = this.maxPA - 5000;
            return false;
        }
}
    public boolean addBeliB(int jum) {
        if (jum < 100) {
            this.diskonPB = this.maxPB;
            return true;
        } else {
            this.diskonPB = this.maxPB - 5000;
            return false;
        }
}
    public boolean addBeliC(int jum) {
        if (jum < 100) {
            this.diskonPC = this.maxPC;
            return true;
            } else {
            this.diskonPC = this.maxPC - 15000;
            return false;
}
    }
}