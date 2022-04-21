import com.zipcodewilmington.phonebook.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("isaiah", "111-222-3333");
        phoneBook.add("marc", "111-212-3333");

        phoneBook.lookup("mark");

    }
}
