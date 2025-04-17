public class Person {
    private String name;
    private int age;

    //Getter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setter
    public void setName(String newName){
        this.name=newName;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }

    public static void main(String[] args) {
        Person p=new Person();

        p.setName("John Cena");
        p.setAge(25);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
