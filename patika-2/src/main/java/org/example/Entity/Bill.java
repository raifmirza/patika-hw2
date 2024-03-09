package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
public class Bill extends BaseEntity{
    private BigDecimal amount;

    public Bill(String name,LocalDate localDate){
        super(name,localDate);
    }
}
