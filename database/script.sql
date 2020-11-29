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

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
                            `id` int(10) NOT NULL AUTO_INCREMENT,
                            `title` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
                            `year` int(50) DEFAULT NULL,
                            `publisher` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
                            `author` varchar(200) CHARACTER SET utf8 DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

INSERT INTO book (title, year, publisher, author)
VALUES ('Spring Boot Cookbook', 1999, 'Packt Publishing - ebooks Account', 'Alex Antonov');
INSERT INTO book (title, year, publisher, author)
VALUES ('Deep Learning: A Technical Approach To Artificial Intelligence For Beginners', 2018, 'CreateSpace Independent Publishing Platform', 'Leonard Eddison');
INSERT INTO book (title, year, publisher, author)
VALUES ('The DevOps Handbook: How to Create World-Class Agility Reliability and Security in Technology Organizations', 2018, 'IT Revolution Press', 'Gene Kim, Patrick Debois, John Willis, Jez Humble');
INSERT INTO book (title, year, publisher, author)
VALUES ('Strategic IT Management: A Toolkit for Enterprise Architecture Management', 2019, 'Springer', 'Inge Hanschke');
INSERT INTO book (title, year, publisher, author)
VALUES ('Oracle PL/SQL Programming Fundamentals: A Tutorial by Examples', 2014, 'CreateSpace Independent Publishing Platform', 'Djoni Darmawikarta');