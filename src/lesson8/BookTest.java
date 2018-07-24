package lesson8;

public class BookTest {

    public static void main(String[] args) {
        shouldBeClosedRightAfterCreation();
        openMethodShouldChangeStateToOpen();
        shouldReturnTitleWhenBookIsClosed();
        shouldChangeToClosedStateWhenListForwardLastPage();
        shouldChangeToClosedStateWhenListBackwardFirstPage();
        shouldReadCurrentPage();
    }

    private static void shouldBeClosedRightAfterCreation() {
        String[] pages = new String[]{"Title", "Page1", "Page2"};
        Book book = new Book(pages);
        checkTestResult(!book.isOpen(), "shouldBeClosedRightAfterCreation");
    }

    private static void shouldReturnTitleWhenBookIsClosed() {
        String[] pages = new String[]{"Title", "Page1", "Page2"};
        Book book = new Book(pages);
        checkTestResult(book.readCurrentPage().equals("Title"), "shouldReturnTitleWhenBookIsClosed");
    }

    private static void shouldReadCurrentPage() {
        String[] pages = new String[]{"Title", "Page1", "Page2"};
        Book book = new Book(pages);
        book.open();
        book.listPageForward();
        checkTestResult(book.readCurrentPage().equals("Page2"), "shouldReadCurrentPage");
    }

    private static void openMethodShouldChangeStateToOpen() {
        String[] pages = new String[]{"Title", "Page1", "Page2"};
        Book book = new Book(pages);
        book.open();
        checkTestResult(book.isOpen(), "openMethodShouldChangeStateToOpen");
    }

    private static void shouldChangeToClosedStateWhenListForwardLastPage() {
        String[] pages = new String[]{"Title", "Page1"};
        Book book = new Book(pages);
        book.open();
        book.listPageForward();
        checkTestResult(!book.isOpen(), "shouldChangeToClosedStateWhenListForwardLastPage");
    }

    private static void shouldChangeToClosedStateWhenListBackwardFirstPage() {
        String[] pages = new String[]{"Title", "Page1"};
        Book book = new Book(pages);
        book.open();
        book.listPageBackward();
        checkTestResult(!book.isOpen(), "shouldChangeToClosedStateWhenListBackwardFirstPage");
    }

    private static void checkTestResult(boolean result,
                                        String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
