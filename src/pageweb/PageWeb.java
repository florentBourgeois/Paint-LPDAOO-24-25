package pageweb;

import java.util.ArrayList;
import java.util.List;

public class PageWeb {
    private final String header = "<body>";
    private final String footer = "</body>";
    private List<Tag> tags = new ArrayList<>();

    public String toHTML(){
        String res = "";
        for (Tag t : tags){
            res += "\n\t" + t.toHTML();
        }

        return header + res + footer;
    }

}
