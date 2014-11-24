package service;

import model.Contact;
import repository.ContactRepository;

/**
 * Created by fsznajderman on 24/11/2014.
 */
public class ContactService {


    public Contact getContactById(Integer id) {

        final ContactRepository cr = new ContactRepository();


        return cr.getContact(id);

    }
}
