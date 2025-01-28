import java.util.Scanner;

public class Player implements Person{
    private String name;
    private String height;
    private String age;

    @Override
    public String getName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println(name);
        return this.name;
    }

    @Override
    public String getHeight(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your height?");
        String height = scan.nextLine();
        System.out.println(height);
        return this.height;
    }
    @Override
    public String getAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
        String age = scan.nextLine();
        System.out.println(age);
        return this.age;
    }

    @Override
    public Results getResults() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

}
