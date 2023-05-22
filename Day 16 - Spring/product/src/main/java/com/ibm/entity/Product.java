package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Product {

	@Id
	@GeneratedValue
	private int code;
	@Column(length=20)
	private String name;
	@Column
	private double price;
	@Column
	private int stock;
}
