import java.util.Scanner;

public class Main {

    static Scanner scan ;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book newBook = new DigitalBook("Nuestra parte de Noche ", "Mariana Enriquez" , 123, 456);
        Book newBook2 = new PhysicalBook("Harry Potter and the chamber of secrets", "J.k. Rowling", 1, "Salamandra", false);


        System.out.println(newBook2.toString());
    }
}