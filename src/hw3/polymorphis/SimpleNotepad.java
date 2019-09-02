package hw3.polymorphis;

public class SimpleNotepad implements INotepad {

    private Page [] pages;
    private int count;

    protected SimpleNotepad(int pages){
        this.pages = new Page [pages] ;
        count=pages;
    }

    @Override
    public void addTextToSpecificPage(int page, String text) {
        if(page>=0 && page<=this.count && text!=null && !text.isEmpty())
        pages[page].addText(text);
    }

    @Override
    public void replaceSpecificPage(int page, String text) {
        if(page>=0 && page<=this.count && text!=null && !text.isEmpty()){
            pages[page].deletePage();
            pages[page].addText(text);
        }
    }

    @Override
    public void removeTextFromSpecificPage(int page) {
        if(page>=0 && page<=this.count){
            pages[page].deletePage();
        }
    }

    @Override
    public void printAllContent() {
        for(Page page : this.pages){
            page.viewPage();
        }
    }
}
