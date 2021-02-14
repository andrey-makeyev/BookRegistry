CREATE DATABASE  IF NOT EXISTS `bookregistry` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `bookregistry`;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookregistry`
--

DROP TABLE IF EXISTS `author`;
DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE `author` (
                          `author_id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                          `name` VARCHAR(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `book` (
                        `id` MEDIUMINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        `author_id` SMALLINT UNSIGNED NOT NULL,
                        `title` VARCHAR(200) NOT NULL,
                        `year` SMALLINT NOT NULL,
                        `publisher` varchar(50) NOT NULL,
                        KEY `author_id` (`author_id`),
                        CONSTRAINT `fk_book_author`
                            FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`)
                                ON DELETE CASCADE
                                ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

INSERT INTO author (name) VALUES ('Alex Antonov');
INSERT INTO author (name) VALUES ('Leonard Eddison');
INSERT INTO author (name) VALUES ('Gene Kim, Patrick Debois, John Willis, Jez Humble');
INSERT INTO author (name) VALUES ('Patrick Debois');
INSERT INTO author (name) VALUES ('John Willis');
INSERT INTO author (name) VALUES ('Jez Humble');
INSERT INTO author (name) VALUES ('Inge Hanschke');
INSERT INTO author (name) VALUES ('Djoni Darmawikarta');

INSERT INTO book (author_id, title, year, publisher)
VALUES (LAST_INSERT_ID(), 'Spring Boot Cookbook', 1999, 'Packt Publishing - ebooks Account');
INSERT INTO book (author_id, title, year, publisher)
VALUES (LAST_INSERT_ID(), 'Deep Learning: A Technical Approach To Artificial Intelligence For Beginners', 2018, 'CreateSpace Independent Publishing Platform');
INSERT INTO book (author_id, title, year, publisher)
VALUES (LAST_INSERT_ID(), 'The DevOps Handbook: How to Create World-Class Agility Reliability and Security in Technology Organizations', 2018, 'IT Revolution Press');
INSERT INTO book (author_id, title, year, publisher)
VALUES (LAST_INSERT_ID(), 'Strategic IT Management: A Toolkit for Enterprise Architecture Management', 2019, 'Springer');
INSERT INTO book (author_id, title, year, publisher)
VALUES (LAST_INSERT_ID(), 'Oracle PL/SQL Programming Fundamentals: A Tutorial by Examples', 2014, 'CreateSpace Independent Publishing Platform');