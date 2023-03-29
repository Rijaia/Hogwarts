public class Puffenduy {
    private int industriousness;
    private int loyalty;
    private int honesty;

    @java.lang.Override
    public java.lang.String toString() {
        return "Puffenduy{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Puffenduy(int industriousness, int loyalty, int honesty) {
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
}
