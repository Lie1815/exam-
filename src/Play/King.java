package Play;

public class King extends Hero{

    private static int Kazna;
    public King(String type, int hp, String skill, int damage, int gold) {
        super(type, hp, skill, damage, gold);
    }

    public static int getKazna() {
        return Kazna;
    }

    public void setKazna(int Kazna) {
        this.Kazna = Kazna;
    }
}
