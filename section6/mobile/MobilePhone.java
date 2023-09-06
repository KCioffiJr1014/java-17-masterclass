package section6.mobile;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) < 0) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position >= 0) {
            myContacts.set(position, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        for (Contact search : myContacts) {
            if (search.getName().equals(contact.getName())) {
                myContacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    private int findContact(Contact contact) {
        return (myContacts.contains(contact) ? myContacts.indexOf(contact) : -1);
    }

    private int findContact(String name) {
        for(Contact contact : myContacts) {
            if(contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactStr) {
        int position = findContact(contactStr);
        return (position < 0 ? null : myContacts.get(position));
    }

    public void printContacts() {
        int count = 1;
        System.out.println("Contact List:");
        for (Contact contact: myContacts) {
            System.out.print(count + ". " + contact.getName() + " -> " + contact.getPhoneNumber() + "\n");
            count++;
        }
    }
}
