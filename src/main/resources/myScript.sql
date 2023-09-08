select product_name from third_homework.orders A
inner join third_homework.customers B
ON A.customer_id = B.id
where name ilike :name;