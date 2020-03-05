package org.rh.seed;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;

@XmlRootElement
@RegisterForReflection
public class Contact {
    private String id;
    private String name;
    private String address;
    private String email;

    // For now just store contacts in memory.
    public static List<Contact> customerList = new ArrayList<>();

    public Contact() {}

    public Contact(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}