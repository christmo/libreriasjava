package com.db.clases;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SQLGenerator {

	/**
	 * Realizar la cadena dinamica de insert dependeiendo del objeto que se
	 * envie, El nombre de la clase del Objeto tiene que corresponder al nombre
	 * de la tabla y el nombre de los atributos directamente al nombre de los
	 * campos
	 * 
	 * @param objInsert
	 * @return String
	 */
	public String getInsert(Object objInsert) {
		if (objInsert != null) {
			Class<?> clase = objInsert.getClass();
			Field[] campos = clase.getDeclaredFields();
			Method[] metodos = clase.getDeclaredMethods();
			
			for (Method m : metodos) {
				System.out.println(m.getName());
			}

			String insert = "insert into " + clase.getSimpleName() + "(";
			String values = ") values (";
			int contador = 1;
			for (Field c : campos) {
				try {
					if (c.getType().getSimpleName().equals("String")) {
						values += "'"
								+ clase.getDeclaredField(c.getName())
										.get(objInsert).toString() + "'";
					} else {
						values += clase.getDeclaredField(c.getName())
								.get(objInsert).toString();
					}
					if (contador < campos.length) {
						values += ",";
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}

				insert += c.getName();
				if (contador < campos.length) {
					insert += ",";
				}
				contador++;
			}

			insert += values + ")";

			return insert;
		}
		return null;
	}

}
