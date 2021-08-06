select * from customer c ;

-- What is a function?
-- It's a way to perform an action. A complex action in a single commpact word, a single word. 
-- Can take in parameters. e.g. count, 
-- functions can return data or modify and return data. 


-- A function is used to represent a block of logic. 
-- We can invoke the block of logic with a single line of code and pass in that information to the 
--	block of logic. 
-- A function can take in values and return values. 

-- function vs method 
--  a funciton associated with an object is a method. 

-- function vs stored procedure. 
-- stored procedure can also take in a value, but it does not return anything. 

select * from customer;
select COUNT(*) from customer;
select SUM(customer_id) from customer;

select count(*) as total_customers, upper(lower(upper(country))) as country from customer 
	where char_length(first_name) > 5 
	group by country having count(*) > 1;

--scalar function takes in one value and returns a single value, e.g. upper, char_length 
--agregate funciton takes in multiple values/records, returns a single value, count(*), sum(), avg()

select now(); 
--where acts on single records. 
--having acts on groups 
