public class Hogwarts {
    private int witchcraft;
    private int transgress;

    @java.lang.Override
    public java.lang.String toString() {
        return "Hogwarts{" +
                "witchcraft=" + witchcraft +
                ", transgress=" + transgress +
                '}';
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public Hogwarts(int witchcraft, int transgress) {
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }
}
