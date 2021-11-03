-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: bank transaction system
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account` (
  `Account_No` int(11) NOT NULL,
  `Account_Date` date DEFAULT NULL,
  `Account_Name` varchar(200) DEFAULT NULL,
  `Balance` float DEFAULT NULL,
  `Branch_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Account_No`),
  KEY `Branch_ID` (`Branch_ID`),
  CONSTRAINT `account_ibfk_1` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'2019-09-30','Florence',840174,9),(2,'2018-10-07','Myles',48169,9),(3,'2018-08-28','Meghan',689646,2),(4,'2018-09-08','Brendan',562308,3),(5,'2019-07-26','Emerson',71193,9),(6,'2018-11-20','Sharon',725468,5),(7,'2019-08-22','Colleen',100736,6),(8,'2019-11-13','Jarrod',164284,3),(9,'2020-01-28','Sawyer',111892,8),(10,'2020-04-19','Vaughan',92636,2),(11,'2019-08-19','Brady',242545,9),(12,'2019-04-02','Hope',408801,9),(13,'2019-01-16','Kadeem',24763,10),(14,'2019-10-31','Illana',733517,4),(15,'2019-12-26','Clio',703468,1),(16,'2020-03-09','Imogene',675759,4),(17,'2020-02-14','Preston',150258,2),(18,'2019-03-24','Marsden',88094,6),(19,'2018-06-20','Sage',709163,10),(20,'2019-10-29','Kimberly',590670,2),(21,'2019-04-11','Rose',161195,7),(22,'2019-10-17','Cody',166353,3),(23,'2018-07-08','Felix',535978,2),(24,'2020-02-14','Clinton',226132,9),(25,'2020-03-13','Francesca',614829,10),(26,'2018-11-29','Jacqueline',327019,5),(27,'2018-12-28','Shaine',159987,1),(28,'2020-01-22','Quail',905883,8),(29,'2019-10-05','Carol',341066,10),(30,'2018-07-05','Zorita',126695,2),(31,'2019-10-11','Steel',663378,1),(32,'2018-12-14','Melanie',999231,10),(33,'2020-01-19','Yardley',447212,10),(34,'2019-07-17','Jesse',865707,6),(35,'2019-08-27','Madonna',61286,5),(36,'2019-04-04','Sydnee',351779,10),(37,'2019-04-02','Steven',50408,6),(38,'2019-01-21','Deirdre',303086,10),(39,'2019-08-05','Kerry',450699,1),(40,'2018-08-01','Grant',106746,8),(41,'2018-07-03','Omar',331529,7),(42,'2019-05-22','Cathleen',251836,7),(43,'2018-10-15','Alexandra',423247,5),(44,'2019-10-13','Myles',296887,3),(45,'2019-05-02','Berk',164841,9),(46,'2019-04-30','Basia',791190,5),(47,'2018-11-18','Allistair',395390,4),(48,'2018-09-29','Cullen',562874,9),(49,'2018-09-28','Penelope',726528,6),(50,'2019-04-02','Autumn',31450,4);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_currency`
--

DROP TABLE IF EXISTS `account_currency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account_currency` (
  `Account_No` int(11) NOT NULL,
  `Currency` varchar(200) NOT NULL,
  PRIMARY KEY (`Account_No`,`Currency`),
  CONSTRAINT `account_currency_ibfk_1` FOREIGN KEY (`Account_No`) REFERENCES `account` (`Account_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_currency`
--

LOCK TABLES `account_currency` WRITE;
/*!40000 ALTER TABLE `account_currency` DISABLE KEYS */;
INSERT INTO `account_currency` VALUES (1,'EGP'),(2,'USD'),(3,'USD'),(4,'EUR'),(5,'USD'),(6,'CAD'),(7,'USD'),(8,'EGP'),(9,'EGP'),(10,'EGP'),(11,'USD'),(12,'EGP'),(13,'EGP'),(14,'EUR'),(15,'CAD'),(16,'USD'),(17,'EUR'),(18,'USD'),(19,'EUR'),(20,'CAD'),(21,'EGP'),(22,'CAD'),(23,'USD'),(24,'EUR'),(25,'EUR'),(26,'EGP'),(27,'CAD'),(28,'EUR'),(29,'CAD'),(30,'EUR'),(31,'USD'),(32,'CAD'),(33,'USD'),(34,'EUR'),(35,'EGP'),(36,'CAD'),(37,'USD'),(38,'CAD'),(39,'EUR'),(40,'USD'),(41,'USD'),(42,'USD'),(43,'EUR'),(44,'EUR'),(45,'EGP'),(46,'EUR'),(47,'USD'),(48,'EGP'),(49,'EUR'),(50,'EGP');
/*!40000 ALTER TABLE `account_currency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_makes_transaction`
--

DROP TABLE IF EXISTS `account_makes_transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account_makes_transaction` (
  `Account_No` int(11) DEFAULT NULL,
  `Transaction_ID` int(11) DEFAULT NULL,
  KEY `Account_No` (`Account_No`),
  KEY `Transaction_ID` (`Transaction_ID`),
  CONSTRAINT `account_makes_transaction_ibfk_1` FOREIGN KEY (`Account_No`) REFERENCES `account` (`Account_No`),
  CONSTRAINT `account_makes_transaction_ibfk_2` FOREIGN KEY (`Transaction_ID`) REFERENCES `transactionn` (`Transaction_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_makes_transaction`
--

LOCK TABLES `account_makes_transaction` WRITE;
/*!40000 ALTER TABLE `account_makes_transaction` DISABLE KEYS */;
INSERT INTO `account_makes_transaction` VALUES (1,23),(2,9),(3,42),(4,23),(5,43),(6,49),(7,35),(8,1),(9,18),(10,22),(11,39),(12,48),(13,29),(14,48),(15,43),(16,45),(17,2),(18,18),(19,43),(20,42),(21,26),(22,35),(23,24),(24,37),(25,24),(26,32),(27,22),(28,11),(29,4),(30,3),(31,16),(32,39),(33,26),(34,4),(35,13),(36,41),(37,29),(38,46),(39,1),(40,8),(41,48),(42,2),(43,23),(44,32),(45,46),(46,20),(47,41),(48,40),(49,29),(50,43);
/*!40000 ALTER TABLE `account_makes_transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account_uses_atm`
--

DROP TABLE IF EXISTS `account_uses_atm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account_uses_atm` (
  `Account_No` int(11) DEFAULT NULL,
  `ATM_ID` int(11) DEFAULT NULL,
  KEY `Account_No` (`Account_No`),
  KEY `ATM_ID` (`ATM_ID`),
  CONSTRAINT `account_uses_atm_ibfk_1` FOREIGN KEY (`Account_No`) REFERENCES `account` (`Account_No`),
  CONSTRAINT `account_uses_atm_ibfk_2` FOREIGN KEY (`ATM_ID`) REFERENCES `atm` (`ATM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_uses_atm`
--

LOCK TABLES `account_uses_atm` WRITE;
/*!40000 ALTER TABLE `account_uses_atm` DISABLE KEYS */;
INSERT INTO `account_uses_atm` VALUES (1,2),(2,7),(3,10),(4,19),(5,9),(6,20),(7,17),(8,7),(9,13),(10,2),(11,19),(12,16),(13,20),(14,11),(15,16),(16,13),(17,2),(18,12),(19,13),(20,12),(21,17),(22,19),(23,4),(24,15),(25,17),(26,16),(27,12),(28,15),(29,5),(30,13),(31,17),(32,11),(33,16),(34,17),(35,10),(36,13),(37,14),(38,8),(39,7),(40,4),(41,17),(42,10),(43,17),(44,7),(45,13),(46,17),(47,7),(48,5),(49,6),(50,5);
/*!40000 ALTER TABLE `account_uses_atm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atm`
--

DROP TABLE IF EXISTS `atm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `atm` (
  `ATM_ID` int(11) NOT NULL,
  `ATM_location` varchar(200) DEFAULT NULL,
  `Branch_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ATM_ID`),
  KEY `Branch_ID` (`Branch_ID`),
  CONSTRAINT `atm_ibfk_1` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atm`
--

LOCK TABLES `atm` WRITE;
/*!40000 ALTER TABLE `atm` DISABLE KEYS */;
INSERT INTO `atm` VALUES (1,'8025 Magnis Rd.',10),(2,'4217 In St.',2),(3,'Ap #169-8326 Velit St.',3),(4,'984-5820 Non, Av.',4),(5,'P.O. Box 538, 7954 Libero Rd.',9),(6,'528-4295 Rhoncus Ave',8),(7,'P.O. Box 229, 8746 Mi Ave',5),(8,'Ap #372-2867 Quis St.',8),(9,'826-5901 Vitae, Rd.',9),(10,'Ap #239-7332 Lacus. Av.',8),(11,'P.O. Box 820, 6627 Porttitor Rd.',8),(12,'954-7875 Felis, Rd.',10),(13,'9928 Vulputate, Rd.',4),(14,'P.O. Box 447, 363 Dolor Rd.',1),(15,'218-8477 Turpis Rd.',5),(16,'590-7599 Tellus. Rd.',7),(17,'816 Nec, St.',3),(18,'7413 Est Road',4),(19,'6539 Ac Ave',9),(20,'P.O. Box 686, 8976 Ultricies Rd.',9),(21,'1823 Cras Av.',5),(22,'252 Arcu. Rd.',10),(23,'5832 Et, Rd.',2),(24,'894-5211 Ante Ave',10),(25,'Ap #514-8254 Convallis Rd.',10),(26,'P.O. Box 819, 8498 Quam Road',5),(27,'P.O. Box 158, 7968 Volutpat. St.',1),(28,'P.O. Box 250, 7724 Ac Avenue',9),(29,'Ap #732-8951 Ut Av.',4),(30,'211-1058 Pellentesque St.',3),(31,'544-3487 Erat. Avenue',8),(32,'P.O. Box 535, 1058 Posuere Street',9),(33,'6902 Nisi. Street',4),(34,'555-3007 Justo Ave',2),(35,'8397 Lorem Av.',2),(36,'893-1191 Lacinia St.',10),(37,'7730 Commodo Rd.',8),(38,'Ap #106-6171 Auctor, Rd.',3),(39,'932-3240 Eu St.',8),(40,'4692 A, St.',4);
/*!40000 ALTER TABLE `atm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `branch` (
  `Branch_ID` int(11) NOT NULL,
  `Branch_Adress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`Branch_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (1,'Ap #605-871 Vel St.'),(2,'P.O. Box 812, 3828 Erat. St.'),(3,'P.O. Box 113, 8195 Fusce St.'),(4,'232-3103 Metus Road'),(5,'371-5299 Metus. Ave'),(6,'P.O. Box 979, 6685 Congue, Street'),(7,'418 Lacus. Ave'),(8,'P.O. Box 163, 2330 Eget, Street'),(9,'P.O. Box 766, 1044 Non, Rd.'),(10,'514-5821 In St.');
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch_manager`
--

DROP TABLE IF EXISTS `branch_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `branch_manager` (
  `BranchManager_EmployeeID` int(11) NOT NULL,
  PRIMARY KEY (`BranchManager_EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_manager`
--

LOCK TABLES `branch_manager` WRITE;
/*!40000 ALTER TABLE `branch_manager` DISABLE KEYS */;
INSERT INTO `branch_manager` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10);
/*!40000 ALTER TABLE `branch_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `elite_account`
--

DROP TABLE IF EXISTS `elite_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `elite_account` (
  `EliteAccount_No` int(11) NOT NULL,
  `SeniorBanker_EmployeeID` int(11) DEFAULT NULL,
  PRIMARY KEY (`EliteAccount_No`),
  KEY `SeniorBanker_EmployeeID` (`SeniorBanker_EmployeeID`),
  CONSTRAINT `elite_account_ibfk_1` FOREIGN KEY (`SeniorBanker_EmployeeID`) REFERENCES `senior_banker` (`SeniorBanker_EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elite_account`
--

LOCK TABLES `elite_account` WRITE;
/*!40000 ALTER TABLE `elite_account` DISABLE KEYS */;
INSERT INTO `elite_account` VALUES (19,1),(18,2),(10,3),(14,5),(11,6),(3,7),(5,10),(1,11),(8,12),(9,12),(7,14),(17,14),(4,15),(6,15),(2,16),(12,16),(13,18),(15,18),(20,18),(16,19);
/*!40000 ALTER TABLE `elite_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employee` (
  `Employee_ID` int(11) NOT NULL,
  `Employee_Name` varchar(200) DEFAULT NULL,
  `Branch_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Employee_ID`),
  KEY `Branch_ID` (`Branch_ID`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`Branch_ID`) REFERENCES `branch` (`Branch_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Hiram',10),(2,'Imogene',3),(3,'Myles',8),(4,'Kirby',8),(5,'Jana',8),(6,'Flynn',3),(7,'Shaeleigh',6),(8,'Noah',10),(9,'Colt',5),(10,'Myles',7),(11,'Laura',6),(12,'Hamilton',4),(13,'Jane',6),(14,'Jane',1),(15,'Wayne',6),(16,'Nigel',8),(17,'Chandler',9),(18,'Pandora',3),(19,'Vladimir',4),(20,'Harrison',5),(21,'Aquila',5),(22,'Yeo',5),(23,'Signe',6),(24,'Emerson',5),(25,'Keaton',3),(26,'Raphael',3),(27,'Charlotte',10),(28,'Winter',4),(29,'Lila',2),(30,'Chloe',8),(31,'Herrod',3),(32,'Shad',7),(33,'Raja',5),(34,'Illana',6),(35,'Emerald',6),(36,'Lysandra',2),(37,'Amal',4),(38,'Fallon',10),(39,'Rashad',5),(40,'Cleo',6),(41,'Jaden',10),(42,'Allegra',5),(43,'Aristotle',9),(44,'Clark',7),(45,'Kendall',8),(46,'Gay',9),(47,'Hiram',10),(48,'Otto',5),(49,'Ian',6),(50,'Paul',2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `highnetwork_account`
--

DROP TABLE IF EXISTS `highnetwork_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `highnetwork_account` (
  `HighNetworkAccount_No` int(11) NOT NULL,
  `BranchManager_EmployeeID` int(11) DEFAULT NULL,
  PRIMARY KEY (`HighNetworkAccount_No`),
  KEY `BranchManager_EmployeeID` (`BranchManager_EmployeeID`),
  CONSTRAINT `highnetwork_account_ibfk_1` FOREIGN KEY (`BranchManager_EmployeeID`) REFERENCES `branch_manager` (`BranchManager_EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `highnetwork_account`
--

LOCK TABLES `highnetwork_account` WRITE;
/*!40000 ALTER TABLE `highnetwork_account` DISABLE KEYS */;
INSERT INTO `highnetwork_account` VALUES (1,3),(10,3),(4,4),(5,4),(3,5),(7,6),(2,7),(6,7),(8,8),(9,8);
/*!40000 ALTER TABLE `highnetwork_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `senior_banker`
--

DROP TABLE IF EXISTS `senior_banker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `senior_banker` (
  `SeniorBanker_EmployeeID` int(11) NOT NULL,
  PRIMARY KEY (`SeniorBanker_EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `senior_banker`
--

LOCK TABLES `senior_banker` WRITE;
/*!40000 ALTER TABLE `senior_banker` DISABLE KEYS */;
INSERT INTO `senior_banker` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),(17),(18),(19),(20);
/*!40000 ALTER TABLE `senior_banker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactionn`
--

DROP TABLE IF EXISTS `transactionn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `transactionn` (
  `Transaction_ID` int(11) NOT NULL,
  `Transaction_Type` varchar(200) DEFAULT NULL,
  `Transaction_Amount` float DEFAULT NULL,
  `Transaction_Time` float DEFAULT NULL,
  `Transaction_Date` date DEFAULT NULL,
  `ATM_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Transaction_ID`),
  KEY `ATM_ID` (`ATM_ID`),
  CONSTRAINT `transactionn_ibfk_1` FOREIGN KEY (`ATM_ID`) REFERENCES `atm` (`ATM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactionn`
--

LOCK TABLES `transactionn` WRITE;
/*!40000 ALTER TABLE `transactionn` DISABLE KEYS */;
INSERT INTO `transactionn` VALUES (1,'Withdraw',1420,5,'2019-12-25',17),(2,'Deposit',6317,9,'2019-01-24',3),(3,'Deposit',3549,12,'2019-02-26',18),(4,'Deposit',2735,1,'2018-06-10',5),(5,'Withdraw',4778,5,'2019-04-11',5),(6,'Deposit',1008,11,'2019-12-18',7),(7,'Deposit',9948,2,'2018-10-08',10),(8,'Withdraw',1646,7,'2020-03-16',13),(9,'Withdraw',3894,5,'2019-03-23',7),(10,'Deposit',3063,1,'2020-05-06',18),(11,'Withdraw',5354,5,'2018-10-21',15),(12,'Withdraw',1560,5,'2018-05-29',12),(13,'Deposit',1807,10,'2019-05-14',14),(14,'Withdraw',5328,9,'2018-11-17',3),(15,'Withdraw',4249,11,'2018-10-10',18),(16,'Withdraw',3503,1,'2019-04-12',10),(17,'Deposit',3137,12,'2020-01-07',5),(18,'Deposit',6548,6,'2019-04-21',3),(19,'Withdraw',8329,8,'2019-06-24',5),(20,'Deposit',7404,5,'2020-02-21',9),(21,'Withdraw',6709,1,'2020-01-30',10),(22,'Deposit',1339,11,'2018-10-24',16),(23,'Deposit',214,7,'2018-08-25',11),(24,'Deposit',1593,11,'2018-10-26',16),(25,'Deposit',3661,2,'2019-01-22',6),(26,'Withdraw',8132,1,'2020-03-08',15),(27,'Withdraw',2189,11,'2019-04-16',9),(28,'Deposit',7868,5,'2018-10-07',19),(29,'Withdraw',3784,9,'2019-05-29',16),(30,'Deposit',7032,2,'2019-05-21',3),(31,'Deposit',9109,1,'2019-04-14',6),(32,'Withdraw',4093,2,'2018-07-29',15),(33,'Deposit',4760,9,'2018-10-11',20),(34,'Withdraw',5142,2,'2019-12-15',9),(35,'Withdraw',2463,2,'2018-07-31',19),(36,'Deposit',8982,5,'2019-07-07',2),(37,'Withdraw',6024,2,'2019-04-14',14),(38,'Deposit',4477,12,'2018-05-19',10),(39,'Deposit',1081,10,'2019-12-29',7),(40,'Deposit',8665,11,'2018-07-20',14),(41,'Deposit',2025,6,'2018-07-17',7),(42,'Withdraw',5077,1,'2019-09-26',14),(43,'Deposit',8498,3,'2019-10-15',13),(44,'Deposit',8796,7,'2018-07-27',11),(45,'Withdraw',8985,4,'2018-11-24',3),(46,'Withdraw',7138,2,'2019-07-02',17),(47,'Deposit',9392,4,'2019-06-05',7),(48,'Withdraw',3636,8,'2018-11-23',9),(49,'Deposit',3124,9,'2018-12-09',12),(50,'Deposit',9761,10,'2019-11-29',12);
/*!40000 ALTER TABLE `transactionn` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-10 19:49:03
