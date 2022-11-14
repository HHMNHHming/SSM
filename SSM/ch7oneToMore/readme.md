数据表user，用来数据库查询的一个表

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `sex` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `number` char(9) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_un` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='使用spring测试用的一个实体表';



数据库表orders，和user表组合起来就是一对多的关系

create table orders (
id tinyint(2) not null auto_increment,
ordersn varchar(10) collate utf8_unicode_ci default null,
user_id int(2) default null,
primary key (id),
key user_id (user_id),
constraint user_id foreign key (user_id) references user (id)
);