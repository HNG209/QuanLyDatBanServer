package org.login.entity.keygenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "daily_customer_counter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DailyCustomerCounter {
    @Id
    @Column(name = "year")
    private int year;
    @Column(name = "countValue")
    private int counterValue;
}
