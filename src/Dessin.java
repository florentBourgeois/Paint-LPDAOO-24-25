import java.util.ArrayList;
import java.util.List;

/**
 * Représente un dessin ; un ensemble de formes sur une page
 */
public class Dessin {

    /**
     * Liste des formes du dessin
     */
    private List<Forme> formes= new ArrayList<>();

    // constructeurs de la classe (vide, avec des formes, avec une liste de formes)
    public Dessin() {
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

    public void addForme(Forme f){
        this.formes.add(f);
    }

    /**
     * Calculer le périmètre total du dessin
     * @return
     */
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

    /**
     * Déplacer toutes les formes du dessin
     * @param dx déplacement en x
     * @param dy déplacement en y
     */
    public void translate(int dx, int dy){
        for (Forme f : this.formes){
            f.translate(dx, dy);
        }
    }


    /**
     * Générer le code HTML pour dessiner le dessin
     * @return
     */
    public String toHTMLCanvas(){
        /* cela tue votre ordinateur
        String res = "";
        for (Forme f : this.formes){
            res += "\n\t" + f.toHTMLCanvas();
        }
        */
        //StringBuilder est plus rapide pour concaténer des chaines
        StringBuilder sb = new StringBuilder();
        // pour chaque forme, on ajoute le code HTML de la forme
        for (Forme f : this.formes){
            sb.append("\n\t").append(f.toHTMLCanvas());
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return "Dessin{" +
                "formes=" + this.formes +
                '}';
    }


    public static void main(String[] args) {
        System.out.println("creation d'un dessin avec triangle, rectangle, rectangle, cercle");
        Dessin d = new Dessin(new Triangle(30,150,40), new Rectangle(20,30,40,150), new Rectangle(), new Cercle(50,200,200));
        System.out.println(d);

        System.out.println("périmetre du dessing : " + d.getPerimetre());

        System.out.println("en html : \n" + d.toHTMLCanvas());

        System.out.println("creation d'un dessin avec pleins de formes et affichage du html");
        Dessin random = UtlisDrawGenerator.genereRandomDessin(1000);
        System.out.println(random.toHTMLCanvas());


    }



}
