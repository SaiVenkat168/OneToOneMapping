package com.onetoone.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Students")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Item item;
	
	
	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Student(String name, Item item) {
		super();
		this.name = name;
		this.item = item;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student() {
		super();
	}	
}
