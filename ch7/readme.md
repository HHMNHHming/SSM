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



