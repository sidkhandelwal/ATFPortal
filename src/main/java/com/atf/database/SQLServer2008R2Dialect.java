package com.atf.database;

import org.hibernate.dialect.SQLServer2008Dialect;
import java.sql.Types;

import org.hibernate.dialect.function.NoArgSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class SQLServer2008R2Dialect extends SQLServer2008Dialect{
	
	
	public SQLServer2008R2Dialect() {
//		registerColumnType(Types.NVARCHAR, "nvarchar");
//		registerColumnType(Types.LONGVARCHAR, "ntext");
//		
//		registerColumnType( Types.NVARCHAR, "nvarchar(MAX)" );

		
		registerHibernateType( Types.LONGNVARCHAR, StandardBasicTypes.STRING.getName() );
		registerHibernateType( Types.NVARCHAR, StandardBasicTypes.STRING.getName() );
		
		
		
	}
	
	

}
