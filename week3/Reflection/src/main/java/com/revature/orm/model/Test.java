package com.revature.orm.model;

import com.revature.orm.annotations.Column;
import com.revature.orm.annotations.Entity;
import com.revature.orm.annotations.Id;

@Entity(tableName= "test_table")
public class Test {
	
	@Id(columnName = "test_id")
	private int id;
	
	@Column(columnName = " test_field_1")
	private String testfield1;
	
	@Column(columnName = "test_field_2")
	private String testField2;
	

}
