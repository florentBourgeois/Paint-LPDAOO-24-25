import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UtilsHTML {


    /**
     * permet de transposer le html passé en paramettre dans le fichier Ressources/index.html
     * @param html
     */
    public static void writeHTMLToIndex(String html){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Ressources/index.html"));
            writer.write(html);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("ecriture dans le fichier index.html echouée\n" + e);
        }
    }


    public static void main(String[] args) {
        System.out.println("test de la fonction de création de fichier ");
        writeHTMLToIndex("<h1>Incroyable</h1>");
    }
}