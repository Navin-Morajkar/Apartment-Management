-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 28, 2021 at 10:59 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `aptdb`
--
CREATE DATABASE IF NOT EXISTS `aptdb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `aptdb`;

-- --------------------------------------------------------

--
-- Table structure for table `activities`
--

DROP TABLE IF EXISTS `activities`;
CREATE TABLE `activities` (
  `date` date NOT NULL,
  `activityname` varchar(20) NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `activities`
--

INSERT INTO `activities` (`date`, `activityname`, `time`) VALUES
('2021-12-01', 'Meeting', '06:08:21');

-- --------------------------------------------------------

--
-- Table structure for table `logins`
--

DROP TABLE IF EXISTS `logins`;
CREATE TABLE `logins` (
  `name` varchar(20) DEFAULT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logins`
--

INSERT INTO `logins` (`name`, `username`, `password`) VALUES
('Saish', 'a1', '123'),
('user1', 'test', '123');

-- --------------------------------------------------------

--
-- Table structure for table `rents`
--

DROP TABLE IF EXISTS `rents`;
CREATE TABLE `rents` (
  `username` varchar(10) NOT NULL,
  `duedate` date DEFAULT NULL,
  `dueamount` int(11) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rents`
--

INSERT INTO `rents` (`username`, `duedate`, `dueamount`, `status`) VALUES
('a1', '2021-12-23', 1577, 'UNPAID'),
('a1', '2021-12-24', 9000, 'PAID'),
('a1', '2021-12-25', 5200, 'PAID'),
('a1', '2021-12-26', 6990, 'UNPAID');

-- --------------------------------------------------------

--
-- Table structure for table `tenants`
--

DROP TABLE IF EXISTS `tenants`;
CREATE TABLE `tenants` (
  `username` varchar(10) DEFAULT NULL,
  `fullname` varchar(20) DEFAULT NULL,
  `flatno` varchar(5) DEFAULT NULL,
  `phoneno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tenants`
--

INSERT INTO `tenants` (`username`, `fullname`, `flatno`, `phoneno`) VALUES
('a1', 'Jon Doe', 'a1', 879796800);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logins`
--
ALTER TABLE `logins`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `rents`
--
ALTER TABLE `rents`
  ADD KEY `username` (`username`);

--
-- Indexes for table `tenants`
--
ALTER TABLE `tenants`
  ADD KEY `username` (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rents`
--
ALTER TABLE `rents`
  ADD CONSTRAINT `rents_ibfk_1` FOREIGN KEY (`username`) REFERENCES `logins` (`username`);

--
-- Constraints for table `tenants`
--
ALTER TABLE `tenants`
  ADD CONSTRAINT `tenants_ibfk_1` FOREIGN KEY (`username`) REFERENCES `logins` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
