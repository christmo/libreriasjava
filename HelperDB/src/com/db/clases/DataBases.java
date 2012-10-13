package com.db.clases;

public enum DataBases {
	MySQL("com.db.clases.MySQLObject"), 
	MongoDB("org.datalib.clases.NoSQLObject");
	
	private final String dbClass;

	DataBases(String dbClass) {
		this.dbClass = dbClass;
	}

	public String getDbClass() {
		return dbClass;
	}

}
