package com.dumcoder.service;


import com.dumcoder.dao.Customer;

public interface CustomerService {

    public String addCustomerReturnValue();


    public void addCustomerThrowException()throws Exception;


    public void addCustomerAround(String name);
    public Customer addCustomer(Customer customer);

}
