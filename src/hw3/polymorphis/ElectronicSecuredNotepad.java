package hw3.polymorphis;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice{

    private boolean working;

    protected ElectronicSecuredNotepad(int pages, String password) {
        super(pages, password);
    }

    @Override
    public void start() {
        working=true;
    }

    @Override
    public void stop() {
        working=false;
    }

    @Override
    public boolean isStarted() {
        return working;
    }
    public void addTextToSpecificPage(int page, String text, String password) {
        if(isStarted()) super.addTextToSpecificPage(page,text,password);
        else System.out.println("You do not have permission to do that.");
    }


    public void replaceSpecificPage(int page, String text, String password) {
        if(isStarted()) super.replaceSpecificPage(page,text,password);
        else System.out.println("You do not have permission to do that.");
    }


    public void removeTextFromSpecificPage(int page, String password) {
        if(isStarted()) super.removeTextFromSpecificPage(page,password);
        else System.out.println("You do not have permission to do that.");
    }


    public void printAllContent(String password) {
        if(isStarted()) super.printAllContent(password);
        else System.out.println("You do not have permission to do that.");
    }
}
