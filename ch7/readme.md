person和idcard是一对一的关系

数据表 person

CREATE TABLE `person` (
  `id` tinyint(2) NOT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `idcard_id` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idcard_id` (`idcard_id`),
  CONSTRAINT `idcard_id` FOREIGN KEY (`idcard_id`) REFERENCES `idcard` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



数据表idcard

CREATE TABLE `idcard` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `code` varchar(18) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



创建数据库以后，别忘记给数据库表增加几条数据
INSERT INTO test.person (id,name,age,idcard_id) VALUES
(1,'小王',18,1)
,(2,'老付',25,3)
,(3,'小黄',22,2)
;
INSERT INTO test.idcard (code) VALUES
('131181200004141071')
,('131181199902101079')
,('6221230921162X')
;

INSERT INTO spring_test.`user` (name,sex,`number`) VALUES
('xiaowang','男','183206223')
,('xiaofei','男','183206219')
,('wangxiaoming','女','183206204')
,('wangxiaoming','女','183206222')
,('wangxiaoming','女','183206202')
,('wangxiaoming','女','183206206')
,('wangxiaoming','女','183')
,('xiaoming','男','1832065')
;
INSERT INTO spring_test.orders (ordersn,user_id) VALUES
('1',1)
,('2',1)
,('3',2)
;

INSERT INTO spring_test.orders_detail (orders_id,product_id) VALUES
(1,1)
,(1,2)
,(1,3)
,(2,3)
;


INSERT INTO spring_test.product (id,name,price) VALUES
(1,'小麻花',8.9)
,(2,'薯片',5.8)
,(3,'西瓜',10.8)
;


