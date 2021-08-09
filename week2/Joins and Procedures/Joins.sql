select count(*) from album;

select count(*) from artist;

-- INNER JOIN 

select b.album_id , b.title , a."name" from album b inner join artist a on a.artist_id = b.artist_id;

select artist."name" as "aritst", album.title as "album" from artist, album 
	where artist.artist_id = album.artist_id ;

select count(*) from album a inner join artist b on a.artist_id = b.artist_id;

-- LEFT JOIN

select * from artist a left outer join album b on a.artist_id = b.album_id ;

select * from artist a left outer join album b on a.artist_id = b.artist_id ;

select * from album a left outer join artist b on a.artist_id = b.artist_id;

-- RIGHT JOIN

select * from album a right join artist b on a.artist_id = b.artist_id;

-- FULL JOIN 
select count(*) from artist a full join album a2 on a.artist_id = a2.album_id ;

-- SELF JOIN
select b.album_id , b.title , a.title from album b inner join album a on a.artist_id = b.artist_id;

select * from employee e;

-- this time on the employee table 
select first_name from (select e2.first_name, e2.last_name , e.first_name as "boss-name", e.last_name 
from employee e, employee e2 where e.employee_id = e2.reports_to) as "employee-join" where "boss-name" = 'Andrew';


-- CROSS JOIN 
select * from album a cross join artist a2;