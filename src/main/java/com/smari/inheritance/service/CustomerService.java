package com.smari.inheritance.service;

import com.smari.inheritance.dto.CustomerModel;

import java.util.List;

public interface CustomerService {
    public CustomerModel createCustomer(CustomerModel model);
    public CustomerModel getCustomer(Long id);

    CustomerModel updateCustomer(CustomerModel model);

    List<CustomerModel> getAllCustomers();

    void deleteCustomer(Long id);
}
