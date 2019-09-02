package hw3.polymorphis;

public class SecuredNotepad extends SimpleNotepad{

    private String password;

    protected SecuredNotepad(int pages, String password) {
        super(pages);
        this.password=password;
    }


    public void addTextToSpecificPage(int page, String text, String password) {
        if(validatePassword(password)) super.addTextToSpecificPage(page,text);
        else System.out.println("NARUSHITELLLL!!!!");
    }


    public void replaceSpecificPage(int page, String text, String password) {
        if(validatePassword(password)) super.replaceSpecificPage(page,text);
        else System.out.println("NARUSHITELLLL!!!!");
    }


    public void removeTextFromSpecificPage(int page, String password) {
        if(validatePassword(password)) super.removeTextFromSpecificPage(page);
        else System.out.println("NARUSHITELLLL!!!!");
    }


    public void printAllContent(String password) {
        if(validatePassword(password)) super.printAllContent();
        else System.out.println("NARUSHITELLLL!!!!");
    }

    boolean validatePassword(String password){
        return this.password.equals(password);
    }


}
