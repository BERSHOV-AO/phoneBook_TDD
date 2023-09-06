import java.util.*;

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

    public String findByNumber(String number) {
        for (Map.Entry<String, String> entryPhoneBook : mapPhoneBook.entrySet()) {
            if (entryPhoneBook.getValue().equals(number)) {
                return entryPhoneBook.getKey();
            }
        }
        return null;
    }

    public String findByName(String name) {
        return mapPhoneBook.get(name);
    }

    public String printAllNames() {
        List<String> listNameSorted = new ArrayList<>(mapPhoneBook.keySet());
        Collections.sort(listNameSorted);
        return String.join(", ", listNameSorted);
    }
}
