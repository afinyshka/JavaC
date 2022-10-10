package Seminar_11;

import java.util.ArrayList;
import java.util.List;

// import Seminar_11.*;

public class PhoneBook {
    private List<Contact> contactBook;

    public PhoneBook() {
        contactBook = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        if (!contactBook.contains(contact)) {
            contactBook.add(contact);
            // TODO info that add contact
        }
    }

    public void removeContact(Contact contact) {
        if (contactBook.contains(contact)) {
            contactBook.remove(contact);
            // TODO info that remove contact
        }
    }

    public Contact getContactInfo(String findText) {
        for (int i = 0; i < contactBook.size(); i++) {
            if (contactBook.get(i).toString().contains(findText)) {
                return contactBook.get(i);
            }
        }
        return null;
    }

    public boolean hasContact(String findText) {
        if (contactBook != null) {
            for (int i = 0; i < contactBook.size(); i++) {
                if (contactBook.get(i).toString().contains(findText)) {
                    return true;
                }
            }
        }
        return false;
    }

}
