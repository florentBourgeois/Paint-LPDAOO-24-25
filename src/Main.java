import java.text.Normalizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(10,20);
        Triangle t = new Triangle();
        Cercle c = new Cercle();

        System.out.println(r);
        System.out.println(t);
        System.out.println(c);
        System.out.println(r2);

        System.out.println(t.getPerimetre());
        System.out.println(r.getPerimetre());
        System.out.println(c.getPerimetre());

        r = new Rectangle(100,1000);
        r = new Rectangle(100290,1000);
        r = new Rectangle(1020,1000);
        r = new Rectangle(1040,1000);
        r = new Rectangle(1500,1000);
        System.out.println(r);


        Forme f;
        f = new Cercle();
        System.out.println(f.getPerimetre());
        f = new Rectangle();
        System.out.println(f.getPerimetre());
        f = new Triangle();
        System.out.println(f.getPerimetre());

        r.setLongueur(999999);
        System.out.println(r);
        f = r;
        System.out.println(f.getPerimetre());
        //f.setLongueur(0);  // interdit, la forme ne sait pas faire setLongueur
    }
}