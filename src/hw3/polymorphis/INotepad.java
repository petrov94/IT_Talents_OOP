package hw3.polymorphis;

public interface INotepad {

    void addTextToSpecificPage(int page, String text);

    void replaceSpecificPage(int page, String text);

    void removeTextFromSpecificPage(int page);

    void printAllContent();

    boolean searchWord(String word);

    void printAllPagesWithDigits();

}
