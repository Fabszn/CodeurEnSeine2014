package service;

import model.Contact;
import repository.ContactRepository;

import java.util.Optional;

/**
 * Created by fsznajderman on 24/11/2014.
 */
public class ContactService {


    public Optional<Contact> getContactById(Integer id) {

        final ContactRepository cr = new ContactRepository();


        return Optional.ofNullable(cr.getContact(id));

    }
}
