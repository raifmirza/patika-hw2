package org.example;

import org.example.Entity.Customer;
import org.example.Service.CustomerService;
import org.example.Service.CustomerServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Customer customer1 = new Customer("Raif Mirza","Erten", LocalDate.of(2013,12,12));
        Customer customer2 = new Customer("Ceyhun","James", LocalDate.of(2015,12,12));
        Customer customer3 = new Customer("Abdülsamed","Yanbakan", LocalDate.of(2017,12,12));
        Customer customer4 = new Customer("Joe","Doe", LocalDate.of(2011,12,12));
        Customer customer5 = new Customer("Cevher","Dünkalkan", LocalDate.of(2010,12,12));
        CustomerService customerService = new CustomerServiceImpl();
        customerService.save(customer1);
        customerService.save(customer2);
        customerService.save(customer3);
        customerService.save(customer4);
        customerService.save(customer5);
        System.out.println("List of Customers");
        System.out.println(customerService.listCustomers());
        System.out.println("Filtering customer names with character 'c' ");
        System.out.println(customerService.filter('c'));
    }
}
