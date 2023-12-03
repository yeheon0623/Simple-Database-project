-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: musicdata
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `album_producer`
--

DROP TABLE IF EXISTS `album_producer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `album_producer` (
  `albumIdentifier` int NOT NULL AUTO_INCREMENT,
  `ssn` char(10) DEFAULT NULL,
  `copyrightDate` date DEFAULT NULL,
  `speed` int DEFAULT NULL,
  `title` char(30) DEFAULT NULL,
  PRIMARY KEY (`albumIdentifier`),
  KEY `ssn` (`ssn`),
  CONSTRAINT `album_producer_ibfk_1` FOREIGN KEY (`ssn`) REFERENCES `musicians` (`ssn`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album_producer`
--

LOCK TABLES `album_producer` WRITE;
/*!40000 ALTER TABLE `album_producer` DISABLE KEYS */;
INSERT INTO `album_producer` VALUES (1,'1234567890','2023-01-01',120,'Greatest Hits'),(2,'2345678901','2023-02-01',90,'Piano Solos'),(3,'3456789012','2023-03-01',180,'Violin Virtuoso'),(4,'4567890123','2023-04-01',200,'Drum Beats'),(5,'5678901234','2023-05-01',110,'Flute Melodies'),(6,'0126345678','2022-03-07',125,'Rhythmic Horizons'),(7,'3457688901','2023-03-07',110,'Epic Anthems'),(8,'4560789012','2022-06-23',150,'Vocal Vibes');
/*!40000 ALTER TABLE `album_producer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-28  0:26:54
