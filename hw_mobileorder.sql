CREATE DATABASE  IF NOT EXISTS `hw` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hw`;
-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: hw
-- ------------------------------------------------------
-- Server version	5.7.36-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mobileorder`
--

DROP TABLE IF EXISTS `mobileorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mobileorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `iphome13` int(11) DEFAULT NULL,
  `airpads` int(11) DEFAULT NULL,
  `phonecable` int(11) DEFAULT NULL,
  `phonecase` int(11) DEFAULT NULL,
  `protector` int(11) DEFAULT NULL,
  `sum` int(11) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mobileorder`
--

LOCK TABLES `mobileorder` WRITE;
/*!40000 ALTER TABLE `mobileorder` DISABLE KEYS */;
INSERT INTO `mobileorder` VALUES (1,'asd',1,1,1,1,1,32360,'2022年6月6日 上午5:22:15 '),(2,'asdf',1,1,2,0,0,30070,'2022年6月6日 上午1:12:38 '),(3,'asdf',0,0,0,0,0,0,'2022年6月6日 上午1:13:14 '),(4,'asdf',0,0,0,0,0,0,'2022年6月6日 上午1:13:55 '),(5,'asdf',0,0,0,0,0,0,'2022年6月6日 上午1:17:39 '),(6,'asdf',1,1,0,0,0,28890,'2022年6月6日 上午1:18:07 '),(7,'asdf',1,0,0,0,0,22900,'2022年6月6日 上午1:20:53 '),(8,'asd',1,0,0,0,0,22900,'2022年6月6日 上午1:21:40 '),(10,'asdf',1,0,0,0,0,22900,'2022年6月6日 上午1:22:35 '),(12,'asdf',1,2,0,4,1,42230,'2022年6月6日 上午1:27:13 '),(13,'asd',1,0,0,0,0,22900,'2022年6月6日 上午1:53:40 '),(14,'asd',1,0,0,0,0,22900,'2022年6月6日 上午1:54:16 '),(15,'asd',1,0,0,0,0,22900,'2022年6月6日 上午1:54:46 '),(16,'asd',1,0,0,0,0,22900,'2022年6月6日 上午2:00:50 '),(17,'asd',1,0,0,0,0,22900,'2022年6月6日 上午2:01:05 '),(18,'asd',1,0,0,0,0,22900,'2022年6月6日 上午2:01:21 '),(20,'qwe1103',1,0,0,0,0,22900,'2022年6月6日 上午4:52:36 '),(21,'asd',1,1,2,1,1,32950,'2022年6月6日 上午6:56:01 '),(22,'asd',1,1,2,1,1,32950,'2022年6月6日 上午6:58:04 ');
/*!40000 ALTER TABLE `mobileorder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-06  7:10:56
