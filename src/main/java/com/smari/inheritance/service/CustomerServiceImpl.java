package com.smari.inheritance.service;

import com.smari.inheritance.dao.CustomerRepository;
import com.smari.inheritance.dto.CustomerModel;
import com.smari.inheritance.enitity.Customer;
import com.smari.inheritance.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository repository;

    @Autowired
    private CustomerMapper mapper;

    @Override
    public CustomerModel createCustomer(CustomerModel model) {
        return mapper.convertEntityToModel(repository.save(mapper.convertModelToEntity(model)));
    }

    @Override
    public CustomerModel getCustomer(Long id) {
        Optional<Customer> entity = repository.findById(id);
        Customer customer = null;
        if(entity.isPresent()){
            return mapper.convertEntityToModel(entity.get());
        }
        return null;
    }

    @Override
    public CustomerModel updateCustomer(CustomerModel model) {
        return mapper.convertEntityToModel(repository.save(mapper.convertModelToEntity(model)));
    }

    @Override
    public List<CustomerModel> getAllCustomers() {
        List<Customer> customers = repository.findAll();
        List<CustomerModel>  customerModels = customers.stream().map(mapper::convertEntityToModel).collect(Collectors.toList());
        return customerModels;
    }

    @Override
    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }
}
