package com.db.bases;

import com.db.clases.SQLGenerator;


public class MySQLObject {

	public static void main(String[] args) {

		OBJ demo = new OBJ();
		demo.setId("1");
		demo.setNombre("christmo");
		demo.setNumero(99);

		SQLGenerator g = new SQLGenerator();
		String sql = g.getInsert(demo);
		System.out.println("//"+sql);
		
		
		

	}

}
