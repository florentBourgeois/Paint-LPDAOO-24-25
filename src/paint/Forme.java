package paint;

/**
 * Classe abstraite paint.Forme   qui représente une forme géométrique
 * toutes les formes ont une position x et y, un périmètre et une représentation en HTML Canvas et peuvent être déplacées
 */
public abstract class Forme {

    private int x = 10;
    protected int y = 50;

    public Forme() {
    }

    public Forme(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract int getPerimetre();
    public abstract String toHTMLCanvas();

    public int getX(){
        return this.x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void translate(int dx, int dy){
        this.x = this.x +dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "paint.Forme{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
