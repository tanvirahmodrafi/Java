public class Book {
    String title;
    String auther;
    String ISBN;
    int copiesAvailable;
    int copiesBorrowed;

    Book(String title, String auther, String ISBN, int copiesAvailable) {
        this.title = title;
        this.auther = auther;
        this.ISBN = ISBN;
        this.copiesAvailable = copiesAvailable;
        copiesBorrowed = 0;
    }

    boolean borrowBook() {
        if (copiesAvailable <= 0) {
            return false;
        } else {
            copiesBorrowed++;
            copiesAvailable--;
            return true;
        }
    }

    boolean returnBook(){
        if(copiesBorrowed <= 0){
            return false;
        }else{
            copiesBorrowed--;
            copiesAvailable++;
            return true;
        }
    }

    void displayBookInfo(){
        System.out.println("Title of the Book is: " + title);
        System.out.println("Auther's name: " + auther);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available Books: " + copiesAvailable);
        System.out.println("Borrowed Books: " + copiesBorrowed);
    }


    public static void main(String[] args) {
        Book JBook = new Book("Java Book", "john Doe", "123456789", 5);
        JBook.displayBookInfo();
        

    }

}
