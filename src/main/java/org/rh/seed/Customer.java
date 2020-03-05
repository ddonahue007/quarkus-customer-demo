package org.rh.seed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Customer {
    private CustomerDataService dataService = CustomerDataService.getInstance();

    @GET
    public List<Contact> getCustomers() {
        return dataService.getCustomerList();
    }

    @POST
    public String createCustomer(Contact newCustomer) {
        return dataService.addCustomer(newCustomer);
    }

    @GET
    @Path("{id}")
    public Contact getCustomer(@PathParam("id") String id) {
        return dataService.getCustomerById(id);
    }

    @DELETE
    @Path("{id}")
    public String delete(@PathParam("id") String id) { return dataService.deleteCustomer(id); }
}