package org.example.Service;

import org.example.Entity.Bill;
import org.example.Entity.Customer;

import java.util.List;
import java.util.Set;

public interface CustomerService {
    public Set<Customer> listCustomers();
    public Customer save(Customer customer);
    public Set<Customer> filter(char c);
    public Customer order(Bill bill);
}
