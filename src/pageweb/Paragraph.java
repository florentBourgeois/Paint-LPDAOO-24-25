package pageweb;

public class Paragraph implements  Tag {

    String text = "Hello world";

    Paragraph(){}

    Paragraph(String textDuParagraph){
        this.text = textDuParagraph;
    }

    public String toHTML(){
        return "<p>" + this.text + "</p>";
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}
