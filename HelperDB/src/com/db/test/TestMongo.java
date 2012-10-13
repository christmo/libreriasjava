package com.db.test;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.clases.DataBases;
import com.db.clases.DbHelper;
import com.db.clases.MySQLObject;

public class TestMongo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) {
		MySQLObject m = new MySQLObject();
		try {
			ResultSet r = m.doSelect("Select user from user");
			while(r.next()){
				System.out.println(r.getString(1));
			}
			m.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		DbHelper dataLayer;
		/*try {
			dataLayer = new DbHelper(DataBases.MySQL);
			dataLayer.getBd().openConnection();
			dataLayer.getBd().doSelect("select * from user");
			dataLayer.getBd().closeConnection();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			Mongo m = new Mongo("localhost", 27017);
			char[] pass = "paganini".toCharArray();
			
			DB db = m.getDB("usuarios");
			boolean auth = db.authenticate("santiago", pass);
			//m.dropDatabase("usuarios");
			
			DBCollection coll = db.getCollection("usuarios");
			BasicDBObject doc = new BasicDBObject();

			
	        
	        //Estudiante 1
	        BasicDBObject info = new BasicDBObject();

	        info.put("nombre", "marco");
	        info.put("apellido", "Plascencia");

	        doc.put("estudiante", info);
	        
	        
	        
	        //Estudiante 2
	        BasicDBObject info2 = new BasicDBObject();

	        info2.put("nombre", "Yoder");
	        info2.put("apellido", "Aguirre");

	        doc.put("estudiante", info2);

	        //INSERT
	        coll.insert(info);
	        //coll.insert(info2);
		
			
			System.out.println("Autorizacion mongo db "+auth);
			if(auth){
				//SELECT ALL
				DBCursor cursor = coll.find();
				System.out.println("--------------------Elementos de la coleccion-----------------------");
				try {
		            while(cursor.hasNext()) {
		                System.out.println(cursor.next());
		            }
		        } finally {
		            cursor.close();
		        }
				
				//SELECT BY NAME
				System.out.println("--------------------------query  parameters---------------------------");
				BasicDBObject query = new BasicDBObject();

		        query.put("nombre", "Yoder");

		        cursor = coll.find(query);
		        try {
		            while(cursor.hasNext()) {
		                System.out.println(cursor.next());
		            }
		        } finally {
		            cursor.close();
		        }
			}

			
			System.out.println("--------------------------update document---------------------------");
			
			BasicDBObject newDocument3 = new BasicDBObject().append("$set", 
					new BasicDBObject().append("nombre", "Luis"));
			
			/*BasicDBObject newDocument = new BasicDBObject();
			newDocument.put("nombre", "Juanita");
			newDocument.put("apellido", "apellido_nuevo");
			coll.update(new BasicDBObject().append("nombre", "Santiago"), newDocument3,false,true);*/
			
			/*DBCursor cursor = coll.find();
			try {
	            while(cursor.hasNext()) {
	                System.out.println(cursor.next());
	            }
	        } finally {
	            cursor.close();
	        }
			
			System.out.println("--------------------------delete document---------------------------");
			coll.remove(new BasicDBObject().append("nombre", "marco"));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
