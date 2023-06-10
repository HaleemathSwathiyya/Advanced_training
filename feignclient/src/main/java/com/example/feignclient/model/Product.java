package com.example.feignclient.model;

import java.math.BigDecimal;

//import javax.persistence.Column;
//
///* 
// * 
// *  select next_val as id_val from hibernate_sequence for update
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
// * 
// * 
// * Hibernate: drop table if exists hibernate_sequence
//Hibernate: drop table if exists product
//Hibernate: create table hibernate_sequence (next_val bigint) engine=InnoDB
//Hibernate: insert into hibernate_sequence values ( 1 )
//Hibernate: create table product (product_id bigint not null, description varchar(255), name varchar(255), price decimal(19,2), qty integer not null, primary key (product_id)) engine=InnoDB
// * 
// * 
// * Homework - Sequence and Table.
// * 
// * */
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private long productId;
	private String name;
	private String category;
	private String brand;
	private double price;
	
	

}
