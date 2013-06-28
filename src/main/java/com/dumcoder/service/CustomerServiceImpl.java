package com.dumcoder.service;

import com.dumcoder.dao.Customer;


public class CustomerServiceImpl implements CustomerService {


    public String addCustomerReturnValue(){
        System.out.println("addCustomerReturnValue() is running ");
        return "abc";
    }

    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running ");
        throw new Exception("Generic Error");
    }

    public void addCustomerAround(String name){
        System.out.println("addCustomerAround() is running, args : " + name);

    }

    @Override
    public Customer addCustomer(Customer customer) {
        System.out.println("addCustomer() is running ");
        customer.setId(88888);
        return customer;
    }
}
