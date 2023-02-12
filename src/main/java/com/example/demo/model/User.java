package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
*/
@Data
@Entity(name = "utilisateur")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
@Column(nullable = false,length = 30)
private String nom;
@Column(nullable = false)
private String mdp;










}
