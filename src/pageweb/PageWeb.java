package pageweb;

import java.util.ArrayList;
import java.util.List;

public class PageWeb {
    private final String header = "<body>";
    private final String footer = "</body>";
    private List<Tag> tags = new ArrayList<>();

    public PageWeb() {
    }

    PageWeb(List<Tag> tags){
        this.tags = tags;
    }

    public void addTag(Tag t){
        this.tags.add(t);
    }


    public String toHTML(){
        String res = "";
        for (Tag t : tags){
            res += "\n\t" + t.toHTML();
        }
        return header + res + footer;
    }


    public static void main(String[] args) {
        PageWeb page = new PageWeb();
        System.out.println(page.toHTML());

        Paragraph p = new Paragraph();
        page.addTag(p);
        System.out.println(page.toHTML());

        page.addTag(new Paragraph("le second paragraph"));
        page.addTag(new Paragraph("le troisieme paragraph"));
        System.out.println("-----plusieurs paragraphes---------");
        System.out.println(page.toHTML());
        page.addTag(new Title());
        page.addTag(new Img());
        page.addTag(new Link());
        System.out.println("-----plusieurs tags---------");
        System.out.println(page.toHTML());



    }
}
