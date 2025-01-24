public class Rectangle extends Forme{

    private int longueur = 5;
    private int largeur;

    public Rectangle() {
        this.largeur = 10;
        this.longueur = 5;
    }

    public Rectangle(int largeur, int longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return "Je suis un rectangle avec une longueur de : " + this.longueur + " et une largeur " + this.largeur + " le perimetre = " + this.getPerimetre();
    }



    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(3,4);

        System.out.println(r);
        System.out.println(r2);
    }

    public int getLongueur() {
        return this.longueur;
    }

    public int getPerimetre(){
        return (this.largeur + this.longueur)*2;
    }



}
