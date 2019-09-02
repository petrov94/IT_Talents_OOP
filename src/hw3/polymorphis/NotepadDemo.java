package hw3.polymorphis;

public class NotepadDemo {
    public static void main(String[] args) {

        SimpleNotepad simple = new SimpleNotepad(10);
        SecuredNotepad secure = new SecuredNotepad(10,"12qwQW");
        ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad(10,"12qwQW");

        for (int i = 0; i < 10; i++) {
            simple.getPages()[i] = new Page("Page " + i, "\nSome text " + i + "\n");
            if (secure.getPages() != null){
                secure.getPages()[i] = new Page("Secure " + i);
            }
            if (esn.getPages() != null){
                esn.getPages()[i] = new Page("Electronic " + i);
            }

        }

        esn.stop();
        esn.addTextToSpecificPage(2,"String", "12qwQW");
        esn.start();

        simple.addTextToSpecificPage(2, "Gosho");
        simple.replaceSpecificPage(5, "Golf");
        simple.removeTextFromSpecificPage(1);
        simple.getPages()[3].searchWord("text");
        simple.searchWord("text");
        simple.printAllPagesWithDigits();

        simple.printAllContent();
        secure.printAllContent("12qwQW");
        esn.printAllContent("12qwQW");

    }
}
