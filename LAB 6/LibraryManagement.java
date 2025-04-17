class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    void displayBook() {
        System.out.println("Book: " + title);
    }
}
class Member {
    String name;

    Member(String name) {
        this.name = name;
    }
}

class Library {
    private Book[] books; // Composition: Library owns books

    Library(String[] bookTitles) {
        books = new Book[bookTitles.length];
        for (int i = 0; i < bookTitles.length; i++) {
            books[i] = new Book(bookTitles[i]);
        }
    }

    void showBooks() {
        for (Book book : books) {
            book.displayBook();
        }
    }
}
class LibrarySystem {
    private Member member; // Aggregation: LibrarySystem can have a member

    LibrarySystem(Member member) {
        this.member = member;
    }

    void showMember() {
        System.out.println("Library Member: " + member.name);
    }
}
public class Main {
    public static void main(String[] args) {
        // Composition Example: Library has Books
        String[] bookTitles = {"The Alchemist", "1984", "Java Programming"};
        Library library = new Library(bookTitles);
        System.out.println("Library Books:");
        library.showBooks();

        System.out.println();

        // Aggregation Example: LibrarySystem has a Member
        Member member = new Member("Alice");
        LibrarySystem system = new LibrarySystem(member);
        system.showMember();
    }
}
