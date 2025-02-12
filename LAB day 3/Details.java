public class Details {
    String name;
    int id;
    String address;

    public Details(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;

    }
    public static void main(String[] args){
        Details d1 = new Details("Argho Saha" , 232 , "Jashore");
        System.out.println(d1.name);
        System.out.println(d1.id);
        System.out.print(d1.address);
    }

}