package com.example.sample.dto;

import com.example.sample.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

	private String id;
	private String username;
	private String address;
	private int age;
}
