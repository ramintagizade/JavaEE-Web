package com.ramintaghizada.designpatterns.demo1.model;

import java.util.List;

public class MySQLLogDAO implements LogDAO {
	/* (non-Javadoc)
	 * @see com.ramintaghizada.designpatterns.demo1.model.LogDAO#addEntry(java.lang.String)
	 */
	@Override
	public void addEntry(String message){
		
	}
	/* (non-Javadoc)
	 * @see com.ramintaghizada.designpatterns.demo1.model.LogDAO#getEntries()
	 */
	@Override
	public List<Log>getEntries(){
		return null;
	}
}
