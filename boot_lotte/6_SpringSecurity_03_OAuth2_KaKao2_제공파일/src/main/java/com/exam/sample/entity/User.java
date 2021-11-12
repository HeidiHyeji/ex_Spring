package com.exam.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 소셜 로그인 사용자 정보 저장

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TB_USER")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String email;
	private String picture;
	private String role = "ROLE_USER";

	public User update(String name, String picture) {
		this.name = name;
		this.picture = picture;

		return this;
	}
}
