package com.db.clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DataBaseUnit {

	protected Connection conexion;
	
	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public abstract boolean openConnection() throws ClassNotFoundException, SQLException;

	public abstract boolean closeConnection() throws SQLException;

	public boolean doInset(String sql) throws SQLException {
		Statement st = conexion.createStatement();
		st.executeQuery(sql);
		st.close();
		return true;
	}

	public ResultSet doSelect(String sql) throws SQLException, ClassNotFoundException {
		openConnection();
		Statement st = conexion.createStatement();
		System.out.println("Consulta OK");
		ResultSet r = st.executeQuery(sql);
		st.close();
//		closeConnection();
		return r;
	}

	public boolean doUdate(String sql) throws SQLException {
		Statement st = conexion.createStatement();
		st.executeQuery(sql);
		st.close();
		return true;
	}

	public boolean doDelete(String sql) throws SQLException {
		Statement st = conexion.createStatement();
		st.executeQuery(sql);
		st.close();
		return true;
	}

}
