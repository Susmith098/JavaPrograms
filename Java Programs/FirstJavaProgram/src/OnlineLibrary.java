

class library{
    String[] books;
    int no_of_books;

    library(){

        System.out.println("-----Online Library-----");
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println( book+" Book has been added to library successfully!");
    }

    void showAvailableBooks(){
        System.out.println("Available books: ");
        for (String item: this.books) {
            if(item == null){
                continue;
            }
            System.out.println("*" + item);
        }
    }

    void issueBooks(String book){
        for(int i =0; i<this.books.length; i++){
            if(this.books[i] == book){
                System.out.println(book+" book has issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.printf("*" + book);
        System.out.println(" This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {

        library l = new library();
        l.addBook("Think and Grow");
        l.addBook("Think Rich");
        l.addBook("Think");
        l.showAvailableBooks();
        l.issueBooks("Think");
        l.showAvailableBooks();
        l.returnBook("Think");
    }
}
