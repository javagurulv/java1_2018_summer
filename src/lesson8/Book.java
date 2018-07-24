package lesson8;

public class Book {

    private boolean isOpen;
    private String[] pages;
    private int currentPage;

    public Book(String[] pages) {
        this.pages = pages;
        this.isOpen = false;
        this.currentPage = 0;
    }

    public void open() {
        if (!isOpen) {
            this.isOpen = true;
            this.currentPage = 1;
        }
    }

    public void close() {
        if (isOpen) {
            this.isOpen = false;
            this.currentPage = 0;
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void listPageForward() {
        if (isOpen) {
            if (isALastPage()) {
                close();
            } else {
                this.currentPage += 1;
            }
        }
    }

    public void listPageBackward() {
        if (isOpen) {
            if (isAFirstPage()) {
                close();
            } else {
                this.currentPage -= 1;
            }
        }
    }

    public String readCurrentPage() {
        return this.pages[currentPage];
    }

    private boolean isALastPage() {
        return this.currentPage == pages.length - 1;
    }

    private boolean isAFirstPage() {
        return this.currentPage == 1;
    }
}
