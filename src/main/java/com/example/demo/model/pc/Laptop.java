package com.example.demo.model.pc;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;

@Entity
@Data

public class Laptop extends Pc {
private double autonomie;

}
