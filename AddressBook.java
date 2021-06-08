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
                case 2:
                    System.out.println("Enter the first name with which you want to edit:");
                    String previousFirstName = scanner.next();
                    System.out.println("Enter the first name which you want to replace:");
                    String replacedFirstName = scanner.next();
                    System.out.println("Array list before modifying:"+personList);
                    for( int i = 0;i<=personList.size()-1;i++)
                    {
                        Person fname = personList.get(i);
                        if(fname.getFirstName().equals(previousFirstName))
                            personList.get(i).setFirstName(replacedFirstName);
                    }
                    System.out.println("Array list after modifying:"+personList);
                    break;

                default:
                    System.out.println("Please enter valid input");
            }
        }
    }
}
