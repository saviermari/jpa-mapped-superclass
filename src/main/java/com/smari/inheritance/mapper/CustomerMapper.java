package com.smari.inheritance.mapper;

import com.smari.inheritance.dto.CustomerModel;
import com.smari.inheritance.enitity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public  CustomerModel convertEntityToModel(Customer entity){
        CustomerModel model = new CustomerModel();
        if(entity != null){
            if(entity.getId() != null) model.setId(entity.getId());
            model.setName(entity.getName());
            model.setAge(entity.getAge());
            model.setCity(entity.getCity());
            model.setSex(entity.getSex());
            model.setContactName(entity.getContactName());
            model.setCreatedBy(entity.getCreatedBy());
            model.setUpdatedBy(entity.getUpdatedBy());
            model.setCreatedTime(entity.getCreatedTime());
            model.setUpdatedTime(entity.getUpdatedTime());
        }
        return model;
    }

    public  Customer convertModelToEntity(CustomerModel model){
        Customer entity = new Customer();
        if(entity != null){
            if(model.getId() != null) entity.setId(entity.getId());
            entity.setName(model.getName());
            entity.setAge(model.getAge());
            entity.setCity(model.getCity());
            entity.setSex(model.getSex());
            entity.setContactName(model.getContactName());
            entity.setCreatedBy(model.getCreatedBy());
            entity.setUpdatedBy(model.getUpdatedBy());
        }
        return entity;

    }
}
