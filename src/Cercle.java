public class Cercle extends Forme{

    private int rayon = 10;

    public Cercle() {
    }

    public Cercle(int rayon) {
        this.rayon = rayon;
    }

    public int getPerimetre(){
        return (int) (this.rayon*2 * Math.PI);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
