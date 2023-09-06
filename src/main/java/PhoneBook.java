import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, String> mapPhoneBook;

    PhoneBook() {
        this.mapPhoneBook = new HashMap<>();
    }

    public int add(String name, String number) {
        if (!mapPhoneBook.containsKey(name)) {
            mapPhoneBook.put(name, number);
        }
        return mapPhoneBook.size();
    }
}
