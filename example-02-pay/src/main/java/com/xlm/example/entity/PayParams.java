package com.xlm.example.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayParams {
    private String name;
    private BigDecimal amount;
}