import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

    static List<Customer> customer = new ArrayList<>();

    public String name;
    public String email;
    public int creditCard;

    Customer(String name, String email, int creditCard){
        this.name = name;
        this.email = email;
        this.creditCard = creditCard;
    }

    public static void main_addNewClient() {

        String name , email;
        int creditCard;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        name = s.nextLine();

        System.out.print("Enter your email: ");
        email = s.nextLine();

        System.out.print("Enter year: ");
        creditCard = s.nextInt();
    }

    Customer c = new Customer(name, email, creditCard);
    
    //customer.add(c);
}
