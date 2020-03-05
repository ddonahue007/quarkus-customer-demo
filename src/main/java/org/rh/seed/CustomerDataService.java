package org.rh.seed;

import java.util.List;
import java.util.UUID;

public class CustomerDataService {
    private static CustomerDataService ourInstance = new CustomerDataService();

    public static CustomerDataService getInstance() {
        return ourInstance;
    }

    public String addCustomer(Contact customer) {
        String newId =  UUID.randomUUID().toString();
        customer.setId(newId);
        Contact.customerList.add(customer);
        return newId;
    }

    public String deleteCustomer(String custId) {
        for(Contact cust : Contact.customerList) {
            if(cust.getId().equals(custId)) {
                Contact.customerList.remove(Contact.customerList.indexOf(cust));
                return "removed customer: " + custId;
            }
        }

        return "customer " + custId + " does not exists";
    }

    public List<Contact> getCustomerList() {
        return Contact.customerList;
    }

    public Contact getCustomerById(String id) {
        for (Contact customer : Contact.customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }

        return null;
    }


}
