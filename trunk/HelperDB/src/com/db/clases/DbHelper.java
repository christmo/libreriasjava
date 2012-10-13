package com.db.clases;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DbHelper {

	private String dbClassName;

	DataBaseUnit bd;

	public DbHelper(DataBases dbTarget) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		Class<?> reflectionClass = null;
		switch (dbTarget) {
		case MySQL:
			this.dbClassName = dbTarget.getDbClass();
			System.out.println(dbTarget.getDbClass());
			reflectionClass = Class.forName(dbClassName);
//			Constructor<?> userConstructor = reflectionClass.getConstructor(new Class[] {String.class});
			bd = (DataBaseUnit) reflectionClass.newInstance();
			break;
		case MongoDB:
			this.dbClassName = dbTarget.getDbClass();
			System.out.println(dbTarget.getDbClass());
			reflectionClass = Class.forName(dbClassName);
			bd = (DataBaseUnit) reflectionClass.newInstance();
			break;
		}

	}
	
	public DataBaseUnit getBd() {
		return bd;
	}

	public String getDbClassName() {
		return dbClassName;
	}

	public void setDbClassName(String dbClassName) {
		this.dbClassName = dbClassName;
	}

}
