-- MySQL dump 10.13  Distrib 5.5.15, for osx10.6 (i386)
--
-- Host: localhost    Database: tagsobe
-- ------------------------------------------------------
-- Server version	5.5.15

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
-- Table structure for table `Booking`
--

DROP TABLE IF EXISTS `Booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Booking` (
  `username` varchar(255) DEFAULT NULL,
  `hotel` int(11) DEFAULT NULL,
  `checkinDate` datetime DEFAULT NULL,
  `checkoutDate` datetime DEFAULT NULL,
  `creditCard` varchar(255) DEFAULT NULL,
  `creditCardName` varchar(255) DEFAULT NULL,
  `creditCardExpiryMonth` int(11) DEFAULT NULL,
  `creditCardExpiryYear` int(11) DEFAULT NULL,
  `smoking` varchar(255) DEFAULT NULL,
  `beds` int(11) DEFAULT NULL,
  `amenities` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Booking`
--

LOCK TABLES `Booking` WRITE;
/*!40000 ALTER TABLE `Booking` DISABLE KEYS */;
/*!40000 ALTER TABLE `Booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customer` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES ('keith',NULL,'Keith',1),('erwin',NULL,'Erwin',2),('jeremy',NULL,'Jeremy',3),('scott',NULL,'Scott',4);
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Hotel`
--

DROP TABLE IF EXISTS `Hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Hotel` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `price` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `BookingId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Hotel`
--

LOCK TABLES `Hotel` WRITE;
/*!40000 ALTER TABLE `Hotel` DISABLE KEYS */;
INSERT INTO `Hotel` VALUES (1,199,'Westin Diplomat','3555 S. Ocean Drive','Hollywood','FL','33019','USA',NULL),(2,60,'Jameson Inn','890 Palm Bay Rd NE','Palm Bay','FL','32905','USA',NULL),(3,199,'Chilworth Manor','The Cottage, Southampton Business Park','Southampton','Hants','SO16 7JF','UK',NULL),(4,120,'Marriott Courtyard','Tower Place, Buckhead','Atlanta','GA','30305','USA',NULL),(5,180,'Doubletree','Tower Place, Buckhead','Atlanta','GA','30305','USA',NULL),(6,450,'W Hotel','Union Square, Manhattan','NY','NY','10011','USA',NULL),(7,450,'W Hotel','Lexington Ave, Manhattan','NY','NY','10011','USA',NULL),(8,250,'Hotel Rouge','1315 16th Street NW','Washington','DC','20036','USA',NULL),(9,300,'70 Park Avenue Hotel','70 Park Avenue','NY','NY','10011','USA',NULL),(10,300,'Conrad Miami','1395 Brickell Ave','Miami','FL','33131','USA',NULL),(11,80,'Sea Horse Inn','2106 N Clairemont Ave','Eau Claire','WI','54703','USA',NULL),(12,90,'Super 8 Eau Claire Campus Area','1151 W Macarthur Ave','Eau Claire','WI','54701','USA',NULL),(13,160,'Marriot Downtown','55 Fourth Street','San Francisco','CA','94103','USA',NULL),(14,200,'Hilton Diagonal Mar','Passeig del Taulat 262-264','Barcelona','Catalunya','08019','Spain',NULL),(15,210,'Hilton Tel Aviv','Independence Park','Tel Aviv','','63405','Israel',NULL),(16,240,'InterContinental Tokyo Bay','Takeshiba Pier','Tokyo','','105','Japan',NULL),(17,130,'Hotel Beaulac',' Esplanade L?opold-Robert 2','Neuchatel','','2000','Switzerland',NULL),(18,140,'Conrad Treasury Place','William & George Streets','Brisbane','QLD','4001','Australia',NULL),(19,230,'Ritz Carlton','1228 Sherbrooke St','West Montreal','Quebec','H3G1H6','Canada',NULL),(20,460,'Ritz Carlton','Peachtree Rd, Buckhead','Atlanta','GA','30326','USA',NULL),(21,220,'Swissotel','68 Market Street','Sydney','NSW','2000','Australia',NULL),(22,250,'Meli? White House','Albany Street','Regents Park London','','NW13UP','Great Britain',NULL),(23,210,'Hotel Allegro','171 West Randolph Street','Chicago','IL','60601','USA',NULL);
/*!40000 ALTER TABLE `Hotel` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-01-03 10:37:55
