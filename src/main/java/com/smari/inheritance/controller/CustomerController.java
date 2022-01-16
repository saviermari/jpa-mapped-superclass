package com.smari.inheritance.controller;

import com.smari.inheritance.dto.CustomerModel;
import com.smari.inheritance.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/rest/v1/", produces = { MediaType.APPLICATION_JSON_VALUE })
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/customers")
    public CustomerModel createCustomer(@RequestBody CustomerModel model) {
        return service.createCustomer(model);
    }

    @PutMapping("/customers/{id}")
    public CustomerModel updateCustomer(@PathVariable Long id, @RequestBody CustomerModel model) {
        CustomerModel customer = service.getCustomer(id);
        if(customer == null){
            throw new RuntimeException("Customer Not Found");
        }
        model.setId(customer.getId());
        return service.updateCustomer(model);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) {
         service.deleteCustomer(id);
    }
    @GetMapping("/customers/{id}")
    public CustomerModel getCustomer(@PathVariable Long id) {
        return service.getCustomer(id);
    }

    @GetMapping("/customers")
    public List<CustomerModel> getAllCustomer() {
        return service.getAllCustomers();
    }

}
