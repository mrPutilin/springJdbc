select product_name from orders A
inner join customers B
ON A.customer_id = B.id
where name ilike :name;