package lesson8;

import java.util.ArrayList;
import java.util.List;

public class SuperBookTest {

    public static void main(String[] args) {
        listUsageExample();


    }

    private static void shouldBeClosedRightAfterCreation() {
        List<Page> pages = new ArrayList<>();

        Page page0 = new Page("Title");
        pages.add(page0);

        Page page1 = new Page("Page1");
        pages.add(page1);

        Page page2 = new Page("Page2");
        pages.add(page2);

        SuperBook book = new SuperBook(pages);
        checkTestResult(!book.isOpen(), "shouldBeClosedRightAfterCreation");
    }

    private static void checkTestResult(boolean result,
                                        String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

    private static void listUsageExample() {
        List<Page> pages = new ArrayList<>();
        //List<Page> pages = new LinkedList<>();

        Page page1 = new Page("text1");
        pages.add(page1);

        Page page2 = new Page("text2");
        pages.add(page2);

        System.out.println("Size = " + pages.size());
        System.out.println("IsEmpty = " + pages.isEmpty());

        Page pageFromList = pages.get(0);

        for (Page page : pages) {
            System.out.println("Page text = " + page.getText());
        }
        for (int i = 0; i < pages.size(); i++) {
            Page currentPage = pages.get(i);
            System.out.println("Page text = " + currentPage.getText());
        }
    }

}
