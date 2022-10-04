package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Detalle {

	private int iddetalle;
	private int idventas;
	private int idproducto;
	private int precio;
	private int cantidad;
	
}
