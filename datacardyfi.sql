-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: datacardyfi
-- ------------------------------------------------------
-- Server version	8.2.0

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
-- Table structure for table `tbl_10th_marksheet_ocr_data`
--

DROP TABLE IF EXISTS `tbl_10th_marksheet_ocr_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_10th_marksheet_ocr_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `school_name` varchar(255) NOT NULL,
  `percentage` float NOT NULL,
  `subject_list` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `tbl_10th_marksheet_ocr_data_chk_1` CHECK (json_valid(`subject_list`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_10th_marksheet_ocr_data`
--

LOCK TABLES `tbl_10th_marksheet_ocr_data` WRITE;
/*!40000 ALTER TABLE `tbl_10th_marksheet_ocr_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_10th_marksheet_ocr_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_12th_marksheet_ocr_data`
--

DROP TABLE IF EXISTS `tbl_12th_marksheet_ocr_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_12th_marksheet_ocr_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `school_name` varchar(255) NOT NULL,
  `percentage` float NOT NULL,
  `subject_list` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `tbl_12th_marksheet_ocr_data_chk_1` CHECK (json_valid(`subject_list`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_12th_marksheet_ocr_data`
--

LOCK TABLES `tbl_12th_marksheet_ocr_data` WRITE;
/*!40000 ALTER TABLE `tbl_12th_marksheet_ocr_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_12th_marksheet_ocr_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_5th_sem_marksheet_ocr_data`
--

DROP TABLE IF EXISTS `tbl_5th_sem_marksheet_ocr_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_5th_sem_marksheet_ocr_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `college_name` varchar(255) NOT NULL,
  `course` varchar(255) NOT NULL,
  `cgpa` float NOT NULL,
  `cpi` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_5th_sem_marksheet_ocr_data`
--

LOCK TABLES `tbl_5th_sem_marksheet_ocr_data` WRITE;
/*!40000 ALTER TABLE `tbl_5th_sem_marksheet_ocr_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_5th_sem_marksheet_ocr_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_6th_sem_marksheet_ocr_data`
--

DROP TABLE IF EXISTS `tbl_6th_sem_marksheet_ocr_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_6th_sem_marksheet_ocr_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `college_name` varchar(255) NOT NULL,
  `course` varchar(255) NOT NULL,
  `cgpa` float NOT NULL,
  `cpi` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_6th_sem_marksheet_ocr_data`
--

LOCK TABLES `tbl_6th_sem_marksheet_ocr_data` WRITE;
/*!40000 ALTER TABLE `tbl_6th_sem_marksheet_ocr_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_6th_sem_marksheet_ocr_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_aadhar_ocr_data`
--

DROP TABLE IF EXISTS `tbl_aadhar_ocr_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_aadhar_ocr_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `aadhar_number` bigint NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `student_address` varchar(255) NOT NULL,
  `student_city` varchar(255) NOT NULL,
  `student_state` varchar(255) NOT NULL,
  `student_pincode` varchar(255) NOT NULL,
  `student_contry` varchar(255) NOT NULL,
  `student_dob` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_aadhar_ocr_data`
--

LOCK TABLES `tbl_aadhar_ocr_data` WRITE;
/*!40000 ALTER TABLE `tbl_aadhar_ocr_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_aadhar_ocr_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_colleges`
--

DROP TABLE IF EXISTS `tbl_colleges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_colleges` (
  `id` int NOT NULL AUTO_INCREMENT,
  `university_id` int NOT NULL,
  `college` varchar(255) NOT NULL,
  `is_self_finance` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_colleges`
--

LOCK TABLES `tbl_colleges` WRITE;
/*!40000 ALTER TABLE `tbl_colleges` DISABLE KEYS */;
INSERT INTO `tbl_colleges` VALUES (1,101,'College 1',1),(2,102,'College 2',0),(3,101,'College 3',0),(4,102,'College 4',1);
/*!40000 ALTER TABLE `tbl_colleges` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_lc_ocr_data`
--

DROP TABLE IF EXISTS `tbl_lc_ocr_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_lc_ocr_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `school_name` varchar(255) NOT NULL,
  `student_dob` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_lc_ocr_data`
--

LOCK TABLES `tbl_lc_ocr_data` WRITE;
/*!40000 ALTER TABLE `tbl_lc_ocr_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_lc_ocr_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_ocr_verification_data`
--

DROP TABLE IF EXISTS `tbl_ocr_verification_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_ocr_verification_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `aadhar_name_verifed` tinyint(1) NOT NULL,
  `aadhar_address_verified` tinyint(1) NOT NULL,
  `aadhar_no_verified` tinyint(1) NOT NULL,
  `10th_name_verified` tinyint(1) NOT NULL,
  `10th_marks_verified` tinyint(1) NOT NULL,
  `10th_verified_marks_list` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `10th_percentage_verified` tinyint(1) NOT NULL,
  `10th_school_name_verified` tinyint(1) NOT NULL,
  `12th_marks_verified` tinyint(1) NOT NULL,
  `12th_verified_marks_list` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `12th_name_verified` tinyint(1) NOT NULL,
  `12th_percentage_verified` tinyint(1) NOT NULL,
  `12th_school_name_verified` tinyint(1) NOT NULL,
  `college_name_verified` tinyint(1) NOT NULL,
  `university_name_verifed` tinyint(1) NOT NULL,
  `5th_sem_cgpa_verified` tinyint(1) NOT NULL,
  `5th_sem_cpi_verified` tinyint(1) NOT NULL,
  `6th_sem_cgpa_verified` tinyint(1) NOT NULL,
  `6th_sem_cpi_verified` tinyint(1) NOT NULL,
  `lc_name_verified` tinyint(1) NOT NULL,
  `lc_school_name_verified` tinyint(1) NOT NULL,
  `caste_certi_name_verified` tinyint(1) NOT NULL,
  `caste_certi_date_verified` tinyint(1) NOT NULL,
  `non_craemy_layer_name_verified` tinyint(1) NOT NULL,
  `non_creamy_layer_date_verified` tinyint(1) NOT NULL,
  `aadhar_dob_verified` tinyint(1) NOT NULL,
  `lc_dob_verified` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `tbl_ocr_verification_data_chk_1` CHECK (json_valid(`10th_verified_marks_list`)),
  CONSTRAINT `tbl_ocr_verification_data_chk_2` CHECK (json_valid(`12th_verified_marks_list`))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_ocr_verification_data`
--

LOCK TABLES `tbl_ocr_verification_data` WRITE;
/*!40000 ALTER TABLE `tbl_ocr_verification_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_ocr_verification_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_program`
--

DROP TABLE IF EXISTS `tbl_program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_program` (
  `program_code` int NOT NULL AUTO_INCREMENT,
  `college_id` int NOT NULL,
  `program_name` varchar(255) NOT NULL,
  `program_fees` int NOT NULL COMMENT 'In Rupees',
  `program_duration` int NOT NULL COMMENT 'In Years',
  PRIMARY KEY (`program_code`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_program`
--

LOCK TABLES `tbl_program` WRITE;
/*!40000 ALTER TABLE `tbl_program` DISABLE KEYS */;
INSERT INTO `tbl_program` VALUES (1,1,'BSCIT',20000,3),(2,1,'MSCIT',27000,2),(3,2,'MSCIT',3000,2),(4,2,'BSCIT',3000,3),(5,3,'BSCIT',2000,3),(6,3,'MSCIT',2200,2),(7,4,'MSCIT',30000,2),(8,4,'BSCIT',17500,3);
/*!40000 ALTER TABLE `tbl_program` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_student_acadamic_data`
--

DROP TABLE IF EXISTS `tbl_student_acadamic_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_student_acadamic_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `previous_program` varchar(255) NOT NULL,
  `qualifying_university` varchar(255) NOT NULL,
  `qualifying_board` varchar(255) NOT NULL,
  `graduation_class` varchar(255) NOT NULL,
  `last_college` varchar(255) NOT NULL,
  `yearly_based_graduation` varchar(255) NOT NULL,
  `5th_sem_totalattampt` varchar(255) NOT NULL,
  `6th_sem_totalattampt` varchar(255) NOT NULL,
  `5th_sem_aggregate_marks` varchar(255) NOT NULL,
  `6th_sem_aggregate_marks` varchar(255) NOT NULL,
  `5th_sem_external_marks` varchar(255) NOT NULL,
  `6th_sem_external_marks` varchar(255) NOT NULL,
  `graduation_attampt` varchar(255) NOT NULL,
  `final_year_cgpa_graduation` varchar(255) NOT NULL,
  `total_cgpa` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_student_acadamic_data`
--

LOCK TABLES `tbl_student_acadamic_data` WRITE;
/*!40000 ALTER TABLE `tbl_student_acadamic_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_student_acadamic_data` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_student_attachments`
--

DROP TABLE IF EXISTS `tbl_student_attachments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_student_attachments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `aadharcard_front` varchar(255) NOT NULL,
  `aadharcard_rear` varchar(255) NOT NULL,
  `6th_sem_marksheet` varchar(255) NOT NULL,
  `5th_sem_marksheet` varchar(255) NOT NULL,
  `leaving_certi` varchar(255) NOT NULL,
  `caste_certi` varchar(255) NOT NULL,
  `non_creamylayer_certi` varchar(255) NOT NULL,
  `passport_size_photo` varchar(255) NOT NULL,
  `sign` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_student_attachments`
--

LOCK TABLES `tbl_student_attachments` WRITE;
/*!40000 ALTER TABLE `tbl_student_attachments` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_student_attachments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_student_master`
--

DROP TABLE IF EXISTS `tbl_student_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_student_master` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) NOT NULL,
  `program` longtext NOT NULL,
  `college` longtext NOT NULL,
  `email` varchar(255) NOT NULL,
  `mobile_number` bigint NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_student_master`
--

LOCK TABLES `tbl_student_master` WRITE;
/*!40000 ALTER TABLE `tbl_student_master` DISABLE KEYS */;
INSERT INTO `tbl_student_master` VALUES (1,'biken','BSCIT','College 1','biken@gmail.com',7894561230,'Biken@123'),(6,'Vivek More','MSCIT','College 2','vivek@gmail.com',7410258963,'Vivek@123');
/*!40000 ALTER TABLE `tbl_student_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_student_personal_data`
--

DROP TABLE IF EXISTS `tbl_student_personal_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_student_personal_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `DOB` date NOT NULL,
  `category` varchar(255) NOT NULL,
  `religion` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `blood_group` varchar(255) NOT NULL,
  `aadhar_no` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `pincode` varchar(255) NOT NULL,
  `permanent_address` varchar(255) NOT NULL,
  `permanent_city` varchar(255) NOT NULL,
  `parmanent_state` varchar(255) NOT NULL,
  `parmanent_pincode` varchar(255) NOT NULL,
  `disabillity` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_student_personal_data`
--

LOCK TABLES `tbl_student_personal_data` WRITE;
/*!40000 ALTER TABLE `tbl_student_personal_data` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_student_personal_data` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-29 11:21:42
