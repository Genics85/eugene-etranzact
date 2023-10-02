package com.eugene.etranzacttest.model;

import com.eugene.etranzacttest.enums.AccountTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    Long id;

    @OneToOne
    Customer customer;

    Long balance;

    @Enumerated(EnumType.STRING)
    AccountTypeEnum type;

}
