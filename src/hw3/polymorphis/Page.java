package hw3.polymorphis;

public class Page {
    private String heading;
    private String text;


    protected Page(String heading) {
        this.heading = heading;
    }

    protected Page(String heading, String text) {
        this.heading = heading;
        this.text = text;
    }

    void addText(String info) {
        if (info != null && !info.equals(""))
            text += info;
    }

    void deletePage() {
        this.text = null;
    }

    String viewPage() {
        return this.heading + " \n " + this.text;
    }

    boolean searchWord(String word) {
        return this.text.contains(word);
    }

    public boolean containsDigits() {
        boolean isDigit = false;
        if (this.text != null) {
            for (char ch : this.text.toCharArray()) {
                if (ch >= '0' && ch <= '9') {
                    isDigit = true;
                    break;
                }
            }
        }

        return isDigit;
    }

}