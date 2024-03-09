package org.example.Service;

import lombok.NoArgsConstructor;
import org.example.Entity.Bill;
import org.example.Entity.Customer;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
public class CustomerServiceImpl implements CustomerService{
    private Set<Customer> customerList;
    @Override
    public Set<Customer> listCustomers() {
        return customerList;
    }

    @Override
    public Customer save(Customer customer) {
        if(this.customerList == null){
            this.customerList = new LinkedHashSet<>();
        }
        customerList.add(customer);
        return customer;
    }

    @Override
    public Set<Customer> filter(char c) {
        Set<Customer> filtered = this.customerList.stream()
                .filter(customer -> customer.getName().toLowerCase().indexOf(c) !=-1).collect(Collectors.toSet());
        return filtered;
    }

    @Override
    public Customer order(Bill bill) {
        return null;
    }
}
