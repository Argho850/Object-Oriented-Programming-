public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("1984", "Argho");
        book2.display();

        Book book3 = new Book("Bangla", "Munni", 300);
        book3.display();
    }
}