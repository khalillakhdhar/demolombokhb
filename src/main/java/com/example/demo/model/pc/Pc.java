package com.example.demo.model.pc;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class Pc extends Ordinateur {
String propietaire;
}
