import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    private ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        boolean isExist = false;
        for (String entry : PhoneList) {
            String[] parts = entry.split(" : ");
            if (parts[0].equals(name)) {
                isExist = true;
                if (!parts[1].equals(phone)) {
                    entry += " : " + phone;
                    PhoneList.set(PhoneList.indexOf(entry), entry);
                }
                break;
            }
        }
        if (!isExist) {
            PhoneList.add(name + " : " + phone);
        }
    }

    @Override
    void removePhone(String name) {
        PhoneList.removeIf(entry -> entry.startsWith(name + " : "));
    }

    @Override
    void updatePhone(String name, String newphone) {
        for(int i = 0; i< PhoneList.size(); i++) {
            String entry = PhoneList.get(i);
            if (entry.startsWith(name + " : ")) {
                PhoneList.set(i, name + " : " + newphone);
                break;
            }
        }
    }

    @Override
    void searchPhone(String name) {
        for(String entry: PhoneList) {
            String[] parts = entry.split(" : ");
            if (parts[0].equals(name)) {
                System.out.println("Phone number of " + name + " is: " + parts[1]);
                return;
            }
            System.out.println("Name not found.");
        }

    }

    @Override
    void sort() {
        Collections.sort(PhoneList, Comparator.comparing(s -> s.split(":")[0]));
    }
}
