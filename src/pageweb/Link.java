package pageweb;

public class Link {

    String text = "google";
    String href = "www.google.com";

    Link(){}

    Link(String textDuLien, String href){
        this.text = textDuLien;
        this.href = href;
    }

    public String toHTML(){
        return "<a href='" + this.href + "'>" + this.text + "</a>";
    }

    public static void main(String[] args) {
        Link a = new Link();
        System.out.println(a.toHTML());
    }

}
