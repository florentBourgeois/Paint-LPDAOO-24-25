import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UtlisDrawGenerator {

    public static Dessin genereRandomDessin(int nbrShapes){

        List<Forme> formes = new ArrayList<>();
        for (int i = 0; i < nbrShapes; i++) {

            int x = ThreadLocalRandom.current().nextInt(0, 600 + 1);
            int y = ThreadLocalRandom.current().nextInt(0, 600 + 1);
            int randomType = ThreadLocalRandom.current().nextInt(0, 3 + 1);
            switch (randomType){
                case 0 : formes.add(new Rectangle(10,20, x, y)); break;
                case 1 : formes.add(new Triangle(10, x, y)); break;
                case 2 : formes.add(new Cercle(5,x,y)); break;
                default:
            }
        }
        return  new Dessin(formes);
    }

    public static void main(String[] args) {
        Dessin d = genereRandomDessin(100);
        System.out.println(d);
    }

}
