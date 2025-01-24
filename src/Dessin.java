import java.util.ArrayList;
import java.util.List;

public class Dessin {

    private List<Forme> formes= new ArrayList<>();


    public Dessin() {
        formes.add(new Cercle());
    }

    public Dessin(Forme... formes) {
        for (int i = 0; i < formes.length; i++) {
            this.formes.add(formes[i]);
        }
        /*
        for (Forme forme : formes) {
            this.formes.add(forme);
        } */
    }

    public Dessin(List<Forme> formes) {
        this.formes = formes;
    }

    //calculer périmetre
    // additionner tous les périmetres de la liste
    // chercher chaque forme,   lui demander son périmetre,  l'ajouter à total
    public int getPerimetre(){
        int total = 0;
        for (Forme  f : this.formes){
            total += f.getPerimetre();
        }
        return total;
    }


    public void translate(int dx, int dy){
        for (Forme f : this.formes){
            f.translate(dx, dy);
        }
    }


    @Override
    public String toString() {
        return "Dessin{" +
                "formes=" + this.formes +
                '}';
    }

    public static void main(String[] args) {
        Dessin d = new Dessin(new Triangle(), new Rectangle(), new Rectangle(), new Cercle());
        System.out.println(d);

        System.out.println(d.getPerimetre());
    }
}
