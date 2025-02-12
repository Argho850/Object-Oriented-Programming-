
    public class Book {
        String title;
        String author;
        int price;


        public Book() {
            this.title = "The rules of Brain";
            this.author = "Me";
            this.price = 235;
        }


        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 235;
        }


        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }


        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }

        public static void main(String[] args) {
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("1984", "Argho");
        book2.display();

        Book book3 = new Book("Bangla", "Munni", 300);
        book3.display();
    }
}


