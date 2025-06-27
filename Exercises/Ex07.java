
import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("name=").append(name);
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }
    

}
class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        System.out.println("The book has been added to the Library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to "+ issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}
public class Ex07 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithm", "CLRS");
        bk.add(b1);
        Book b2 = new Book("Algorithm2", "CLRS2");
        bk.add(b2);
        Book b3 = new Book("Algorithm3", "CLRS3");
        bk.add(b3);
        Library l = new Library(bk);
        l.addBook(new Book("Algorithm4", "CLRS4"));
        System.out.println(l.books);
         l.issueBook(b2, "Harry");
        System.out.println(l.books);
    }
}
