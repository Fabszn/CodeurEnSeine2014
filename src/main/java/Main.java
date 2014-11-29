import model.Contact;
import service.ContactService;

import java.util.Optional;

/**
 * Created by fsznajderman on 11/11/2014.
 */
public class Main {


    public static void main(String[] args) {
        final ContactService cs = new ContactService();

        System.out.println(cs.getContactById(2)
                .filter(c -> c.getAge()<35)
                .map(c -> "Age = " + c.getAge())
                .orElse("Contact not found"));

//        final Optional<Contact> c = ;
//
//        if (c.isPresent()) {
//            System.out.println("Age = " + c.get().getAge());
//        } else {
//            System.out.println("Contact not found");
//        }


    }


}
