import java.util.Scanner;

class Library{
    String[] av_books;
    int no_of_books;

    Library(){
        this.no_of_books = 0;
        this.av_books = new String[100];
    }    

    public void showAvailaleBook() {
        boolean anyBookAvailable = false;
        System.out.println("Available books are:");
        for (String book : this.av_books) {
            if (book != null) {
                System.out.println("--> " + book);
                anyBookAvailable = true;
            }
        }
        if (!anyBookAvailable) {
            System.out.println("No books available.");
        }
    }


    public void addBook(String book){
        this.av_books[no_of_books] = book;
        no_of_books++;
        System.out.println("\""+book + "\" has been added.");
    }

    public void issueBook(String book){
        for (int i = 0; i < this.av_books.length; i++) {
            if(this.av_books[i] != null && this.av_books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.av_books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    public void returnBook(String book){
        addBook(book);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Library centralLibrary = new Library();
            int choice;
            do {
                System.out.println("Press 1 : to show available books in the library");
                System.out.println("Press 2 : to add a book to the library");
                System.out.println("Press 3 : to issue a book from the library");
                System.out.println("Press 4 : to return a book to the library");
                System.out.println("Press 0 : to close the program");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1 -> centralLibrary.showAvailaleBook();
                    case 2 -> {
                        System.out.println("Submit the book you want to add:");
                        centralLibrary.addBook(sc.nextLine());
                    }
                    case 3 -> {
                        System.out.println("Find the book you want to issue:");
                        centralLibrary.issueBook(sc.nextLine());
                    }
                    case 4 -> {
                        System.out.println("Return the book:");
                        centralLibrary.returnBook(sc.nextLine());
                    }
                    case 0 -> System.exit(0);
                    default -> System.out.println("Please enter a valid choice!");
                }
                sc.nextLine();
            } while (choice != 0);
        }
    }
}
