CREATE DATABASE IF NOT EXISTS `idealix_database`;
USE `idealix_database`;

CREATE TABLE IF NOT EXISTS `responsible` (
   `id` int(8) NOT NULL AUTO_INCREMENT,
   `name` varchar(180) NOT NULL,
   `email` varchar(180) NOT NULL,
   `password` varchar(60) NOT NULL,
   `picture` varchar(200) NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `classification` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `gender` enum('f','m') NOT NULL,
  `age` int(3) NOT NULL,
  `imc` decimal(4,2) NOT NULL,
  `percentile` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `child` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(180) NOT NULL,
  `birthday` date NOT NULL,
  `gender` enum('f','m') NOT NULL,
  `responsible_id` int(8) NOT NULL,
  `classification_id` int(8) NOT NULL,
  `picture` varchar(200) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_child_responsible_idx` (`responsible_id`),
  KEY `fk_child_classification1_idx` (`classification_id`),
  CONSTRAINT `fk_child_classification` FOREIGN KEY (`classification_id`) REFERENCES `classification` (`id`),
  CONSTRAINT `fk_child_responsible` FOREIGN KEY (`responsible_id`) REFERENCES `responsible` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `history` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `age` int(8) NOT NULL,
  `height` decimal(3,2) NOT NULL,
  `weight` decimal(5,2) NOT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `child_id` int(8) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_history_child_idx` (`child_id`),
  CONSTRAINT `fk_history_child` FOREIGN KEY (`child_id`) REFERENCES `child` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
