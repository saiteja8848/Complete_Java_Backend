# Database - SQL vs NoSQL


<details>
<Summary>Database related Interview Questions</Summary>

##### Q1. Define database ? How many different types of databases and difference between them ?


##### Q2. Define Sql and concepts involved in it



##### Q3. Write a query to fetch the record of brand whose amount is increasing every year.
```
-->> Problem Statement:
Write a query to fetch the record of brand whose amount is increasing every year.


-->> Dataset:
drop table brands;
create table brands
(
    Year    int,
    Brand   varchar(20),
    Amount  int
);
insert into brands values (2018, 'Apple', 45000);
insert into brands values (2019, 'Apple', 35000);
insert into brands values (2020, 'Apple', 75000);
insert into brands values (2018, 'Samsung',15000);
insert into brands values (2019, 'Samsung',20000);
insert into brands values (2020, 'Samsung',25000);
insert into brands values (2018, 'Nokia', 21000);
insert into brands values (2019, 'Nokia', 17000);
insert into brands values (2020, 'Nokia', 14000);


-->> Solution:

with cte as
    (select *
    , (case when amount < lead(amount, 1, amount+1)
                                over(partition by brand order by year)
                then 1
           else 0
      end) as flag
    from brands)
select *
from brands
where brand not in (select brand from cte where flag = 0)
```


##### Q3. Write a query to fetch the record of brand whose amount is increasing every year.
https://www.youtube.com/watch?v=S5gX-LLAZIM&list=PLavw5C92dz9Fahr7taauUx5RnTfuGyL--&index=3ear.
</details>
