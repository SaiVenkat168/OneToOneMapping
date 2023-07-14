package com.onetoone.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Items")
public class Item 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private int year;

	public Item(int year) {
		super();
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
