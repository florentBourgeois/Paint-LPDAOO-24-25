package pageweb;

public class Title implements Tag {

    String text = "Hello world";
    int lvl = 1;

    Title(){}

    Title(String textDuTitre, int lvl){
        this.text = textDuTitre;
        this.lvl = lvl;
    }

    @Override
    public String toHTML(){
        return "<h"+lvl+">" + this.text + "</h"+lvl+">";
    }

}
