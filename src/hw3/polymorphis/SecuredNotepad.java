package hw3.polymorphis;

public class SecuredNotepad extends SimpleNotepad {

    private String password;

    protected SecuredNotepad(int pages, String password) {
        super(pages);
        if(!isPasswordMatchRules(password)) throw new IllegalArgumentException();
        this.password = password;
    }


    public void addTextToSpecificPage(int page, String text, String password) {
        if (validatePassword(password)) super.addTextToSpecificPage(page, text);
        else System.out.println("NARUSHITELLLL!!!!");
    }


    public void replaceSpecificPage(int page, String text, String password) {
        if (validatePassword(password)) super.replaceSpecificPage(page, text);
        else System.out.println("NARUSHITELLLL!!!!");
    }


    public void removeTextFromSpecificPage(int page, String password) {
        if (validatePassword(password)) super.removeTextFromSpecificPage(page);
        else System.out.println("NARUSHITELLLL!!!!");
    }


    public void printAllContent(String password) {
        if (validatePassword(password)) super.printAllContent();
        else System.out.println("NARUSHITELLLL!!!!");
    }

    boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    boolean isPasswordMatchRules(String password){
        if(password.length()<5) return false;
        boolean checks [] = new boolean[3];

        for(char ch : password.toCharArray()){
            if(Character.isDigit(ch)){
                checks[0]=true;
            }else if(Character.isLowerCase(ch)){
                checks[1]=true;
            }else if(Character.isUpperCase(ch)){
                checks[2]=true;
            }
        }
        if(checks[0] && checks[1] && checks[2]) return true;
        return false;
    }


}
