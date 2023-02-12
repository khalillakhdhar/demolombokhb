package com.example.demo.model.pc;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
@Data
@AllArgsConstructor
public class Ordinateur {
@Id
private long id;
@Column(nullable = false)
@NotBlank
private String marque,cpu,graphique;
@Column(nullable = false)
@NotBlank
private int ram;


}
