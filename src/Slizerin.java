public class Slizerin {
    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int lustForPower;

    @java.lang.Override
    public java.lang.String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", lustForPower=" + lustForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public Slizerin(int cunning, int determination, int ambition, int inventiveness, int lustForPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }
}
