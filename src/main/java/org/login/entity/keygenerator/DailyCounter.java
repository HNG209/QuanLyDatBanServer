package org.login.entity.keygenerator;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "daily_counter")
public class DailyCounter {
    @Id
    @Column(name = "counter_date")
    private LocalDate counterDate;

    @Column(name = "counter_value")
    private int counterValue;
}