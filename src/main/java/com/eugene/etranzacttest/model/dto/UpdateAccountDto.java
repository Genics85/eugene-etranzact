package com.eugene.etranzacttest.model.dto;

import lombok.Data;

@Data
public class UpdateAccountDto {
    Long id;
    Long userId;
    Long amount;
}
