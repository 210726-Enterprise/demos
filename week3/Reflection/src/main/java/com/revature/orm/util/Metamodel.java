package com.revature.orm.util;

import com.revature.orm.annotations.Column;
import com.revature.orm.annotations.Entity;
import com.revature.orm.annotations.Id;
import com.revature.orm.annotations.JoinColumn;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Metamodel<T> {

    private Class<T> clazz;
    private IdField primaryKeyField;
    private List<ColumnField> columnFields;
    private List<ForeignKeyField> foreignKeyFields;

    public static <T> Metamodel<T> of(Class<T> clazz) {
        if (clazz.getAnnotation(Entity.class) == null) {
            throw new IllegalStateException("Cannot create Metamodel object! Provided class, " + clazz.getName() + "is not annotated with @Entity");
        }
        return new Metamodel<>(clazz);
    }

    public Metamodel(Class<T> clazz) {
        this.clazz = clazz;
        this.columnFields = new LinkedList<>();
        this.foreignKeyFields = new LinkedList<>();
    }

    public String getClassName() {
        return clazz.getName();
    }

    public String getSimpleClassName() {
        return clazz.getSimpleName();
    }

    public IdField getPrimaryKey() {

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Id primaryKey = field.getAnnotation(Id.class);
            if (primaryKey != null) {
                return new IdField(field);
            }
        }
        throw new RuntimeException("Did not find a field annotated with @Id in: " + clazz.getName());
    }

    public List<ColumnField> getColumns() {

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Column column = field.getAnnotation(Column.class);
            if (column != null) {
                columnFields.add(new ColumnField(field));
            }
        }

        if (columnFields.isEmpty()) {
            throw new RuntimeException("No columns found in: " + clazz.getName());
        }

        return columnFields;
    }

    public List<ForeignKeyField> getForeignKeys() {

        List<ForeignKeyField> foreignKeyFields = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        
        for (Field field : fields) {
        	
            JoinColumn column = field.getAnnotation(JoinColumn.class);
            
            if (column != null) {
                foreignKeyFields.add(new ForeignKeyField(field));
            }
        }

        return foreignKeyFields;

    }

}
