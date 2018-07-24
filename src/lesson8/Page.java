package lesson8;

public class Page {

    private String text;
    private int pageNumber;

    public Page(String text) {
        this.text = text;
    }

    public void definePageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getText() {
        return this.text;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

}
