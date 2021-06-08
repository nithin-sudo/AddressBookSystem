package details;
import model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

public class AddressBook {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        boolean isExit = false;
        List<Person> personList = new ArrayList<>(10);
        while (!isExit) {
            System.out.println("Enter options 1.Add\n2.Edit\n3.Delete\n4.show Contact \n5.Exit");
            int userInput = scanner.nextInt();
            Person person = new Person();
            switch (userInput) {
                case 1:
                    System.out.println("Enter fname:");
                    person.setFirstName(scanner.next());
                    System.out.println("Enter lname:");
                    person.setLastName(scanner.next());
                    System.out.println("Enter address:");
                    person.setAddress(scanner.next());
                    System.out.println("Enter city:");
                    person.setCity(scanner.next());
                    System.out.println("Enter state:");
                    person.setState(scanner.next());
                    System.out.println("Enter email:");
                    person.setEmail(scanner.next());
                    System.out.println("Enter zip code:");
                    person.setZip(scanner.next());
                    System.out.println("Enter phoneNo:");
                    person.setPhoneNo(scanner.next());
                    personList.add(person);
                    break;

                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
