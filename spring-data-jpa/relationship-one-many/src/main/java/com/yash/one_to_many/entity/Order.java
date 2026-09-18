package com.yash.one_to_many.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
	
	@Id
	private Long orderId;
	
	private LocalDate datePurchased;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private OrderStatus orderStatus;
}
