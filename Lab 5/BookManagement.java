public class AcademicBook extends Book{
 void displayBooklist() {
        super.displayBooklist();
    }
}
public class LiteratureBook extends Book{
 void displayBooklist() {
        super.displayBooklist();
    }
}
public class Author {
    String name;
    Author(String n){
        this.name=n;
    }
   public void writeBook(){
       System.out.println("noukadubi");
   }
}
public class Book {
    String title;
    int price;
    Author author1;
    Book(){
    }
    Book(String t,int p,Author a){
        this.title=t;
        this.price=p;
        this.author1=a;
    }
    void display(){
        System.out.println(this.title+" "+this.price);
    }
    void displayBooklist(){
        System.out.println("............");
    }
}
public class Main {
    public static void main(String[] args) {
        Author a1=new Author("Samsunnahar");
    Book b1= new Book("Habijabi",200,a1);
    b1.display();
    b1.displayBooklist();
    a1.writeBook();
    }
}
