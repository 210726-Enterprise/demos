package com.revature.orm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/*
 * Annotations in Java are a type of marker interface
 * 
 *Annnotations start with @
 *Annotations do not change the ACTION of a compiled program
 *Annotations help to associate metadata to the program elements (constructors, fields, methods, classes)
 *Annotations can change the way a program is treated by the compiler
 */
@Target(ElementType.TYPE)
@Retention (RetentionPolicy.RUNTIME)
public @interface Entity {
	String tableName();
}

/*
Retention policies
    - Source (annotation accessible during compilation)
    - Class (annotation accessible during class loading)
    - Runtime (annotation accessible during runtime)
        - used the most in ORM

Target
    - Tells when annotation is valid to be used
*/

