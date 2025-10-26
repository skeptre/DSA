import java.util.Scanner;

public class Message {
    private final Scanner scanner;

    public Message(){
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.print("Please enter your name: ");
        String name = this.scanner.nextLine();
        System.out.println(name);
    }
}
