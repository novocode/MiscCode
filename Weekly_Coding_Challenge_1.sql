create table worker (
	worker_id int primary key,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	salary int not null,
	joining_date timestamp,
	department varchar(30)
);

create table bonus (
	worker_ref_id int references worker(worker_id),
	bonus_date timestamp,
	bonus_amount int
);

create table title (
	worker_ref_id int references worker(worker_id),
	worker_title varchar(30) not null,
	affected_from timestamp
);

select first_name, last_name from worker 
where salary >= 50000 and salary <= 100000;

select department, count(*) from worker
group by department 
order by count desc;

select * from worker
full join bonus on worker.worker_id = bonus.worker_ref_id;

select * from worker
full join title on worker.worker_id = title.worker_ref_id;

select * from worker 
where  worker_id = (
	select worker_id 
	from (
		select *, row_number() over (order by salary) as fifth_highest from worker
	) as foo
	where fifth_highest = 5
);