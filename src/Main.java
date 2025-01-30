import java.util.Scanner;
public class Main implements Spec{
    public static void main(String[] args){
        Player p1 = new Player();
        System.out.println("Player stuff");
        System.out.println("Name: " + p1.getName());
        System.out.println("Height: " + p1.getHeight());
        System.out.println("Age: " + p1.getAge());
    }
}
