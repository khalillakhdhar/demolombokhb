package com.example.demo.model.pc;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Macbook extends Pc {
private String securityCode;

}
