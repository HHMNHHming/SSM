数据库表
各章节紧密相连，学者还需慢慢提高自己。  不要想一飞冲天。

person和idcard;这两个表是为了说明Mybatis**一对一**关联关系的使用。

user和orders;这两个表是为了说明Mybatis**一对多**关联关系的使用。

product和orders_detail;这两个表是为了说明Mybatis**多对多**关联关系的使用。
   订单和商品之间的关系:多对多

create table product(
id tinyint(2) not null,
name varchar(50) collate utf8_unicode_ci default null,
price double default null,
primary key (id)
)

create table orders_detail(
id tinyint(2) not null auto_increment,
orders_id tinyint(2) default null,
product_id tinyint(2) default null,
primary key(id),
key orders_id (orders_id),
key product_id (product_id),
constraint orders_id foreign key(orders_id) references orders(id),
constraint product_id foreign key(product_id) references product(id)
)