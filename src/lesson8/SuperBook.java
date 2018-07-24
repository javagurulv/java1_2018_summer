package lesson8;

import java.util.List;

public class SuperBook {

    private boolean isOpen;
    private List<Page> pages;
    private int currentPage;

    public SuperBook(List<Page> pages) {
        this.pages = pages;
        for (int i = 0; i < pages.size(); i++) {
            Page page = pages.get(i);
            page.definePageNumber(i);
        }
        this.isOpen = false;
        this.currentPage = 0;
    }

    public void open() {
        if (!this.isOpen) {
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
        Page page = pages.get(currentPage);
        return page.getText();
    }

    private boolean isALastPage() {
        return this.currentPage == pages.size() - 1;
    }

    private boolean isAFirstPage() {
        return this.currentPage == 1;
    }

}
