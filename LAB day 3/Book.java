
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
    }

