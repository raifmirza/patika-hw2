package org.example.Entity;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
public class Customer extends BaseEntity{
    private String surname;
    private List<Bill> billList;
    public Customer(String name,String surname,LocalDate localDate){
        super(name,localDate);
        this.surname = surname;
    }
    public void addToList(Bill bill){
        if(this.billList == null){
            this.billList = new ArrayList<>();
        }
        this.billList.add(bill);
    }

    @Override
    public String toString() {
        return "Customer{" + "name= " + getName() +
                " surname='" + surname + '\'' +
                ", billList=" + billList + " createDate= " + getCreatedDate()+
                '}';
    }
}
