public class Library {
    Book[] books;
    int size;

    public Library() {
        this.books = new Book[10];
        this.size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i] == book) {
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", Publication Year: " + book.publicationYear);
        }
    }
}