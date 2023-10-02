package com.eugene.etranzacttest.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;

}
