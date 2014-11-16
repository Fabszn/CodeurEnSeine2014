package repository;

import model.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactRepository {

    final static Map<Long, Contact> repo = new HashMap<Long, Contact>();

    public static Contact getContactById(final Long id) {
        repo.put(1l, new Contact("Jean", "Louis", 22));
        repo.put(2l, new Contact("Harri", "Covaire", 35));


        return repo.get(id);
    }
}
