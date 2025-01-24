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
        return "Forme{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
