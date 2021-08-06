--Is SQL a general purpose programming/scripting language?
-- no, it's a query language. 
-- it is a scripting language. 
-- doing stuff within the contstraints of the overall language, database management system. 


-- have we used any conditional blocks yet?
-- There are extensions in SQL that allow us to do some programatiic logic , PL/pgSQL 
-- We can start creating procedures. 

insert into actor (actor_id, first_name,last_name,last_update) values 
	(400,'Bob','McBob',(select now()));
	

--my goal is to create a procedure that inserts into the actor table. 

create or replace procedure 
	insert_actor(f_name varchar(30), l_name varchar(30))
	language sql 
		as $$
		
		insert into actor (actor_id, first_name,last_name,last_update) values 
			(301,f_name,l_name,(select now()));

		$$;

call insert_actor('Bobby2','McBobby2');


create table fruits(
	fruit_id serial primary key,
	fruit_name varchar(30)
);

insert into fruits (fruit_name) values 
	('Kiwi'),
	('Apple'),
	('Banana');

drop table fruits;

