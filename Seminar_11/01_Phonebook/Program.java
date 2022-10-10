package Seminar_11;

public class Program {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        Contact maks1 = new Contact("Maks", "Ivanov", "89031112233", null);
        Contact lisha1 = new Contact("Lisha", "Sergeev", "89031112244", null);
        Contact sisha1 = new Contact("Sisha", "Lergeev", "89031112255", null);
        phoneBook.addContact(maks1);
        phoneBook.addContact(lisha1);
        phoneBook.addContact(sisha1);

        // if (phoneBook.hasContact("y")) {
        //     System.out.println("===");
        //     System.out.println(phoneBook.getContactInfo("y"));
        //     System.out.println("===");
        // } else {
        //     System.out.println("===");
        //     System.out.println("No contact");
        //     System.out.println("===");
        // }
        
        Contact contact = phoneBook.getContactInfo("Ser");
        System.out.println(contact==null? "No contact" : contact.toString());
    }

}
