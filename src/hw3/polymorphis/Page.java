package hw3.polymorphis;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Page {
    private String heading;
    private String text;


    protected Page(String heading,String text){
        this.heading=heading;
        this.text=text;
    }
    void addText(String info){
        if(info!=null && !info.equals(""))
        text+=info;
    }

    void deletePage(){
        this.text=null;
    }

    String viewPage(){
        return this.heading+ " \n " +this.text;
    }

    boolean searchWord(String word){
        return this.text.contains(word);
    }

    boolean containsDigits(){
        return this.heading.matches(".*\\d.*");
    }

}