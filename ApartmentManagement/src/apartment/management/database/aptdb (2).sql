-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2022 at 03:35 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

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
('2022-01-22', 'Emergency Meeting', '20:00:00'),
('2022-01-30', 'Monthly Meeting', '20:00:00'),
('2022-02-16', 'Annual Get-Together', '15:00:00'),
('2022-02-28', 'Monthly Meeting', '20:00:00'),
('2022-02-18', 'Cleaning', '09:00:00'),
('2022-03-30', 'Monthly Meeting', '20:00:00'),
('2022-01-28', 'Festival Planning ', '20:00:00'),
('2022-03-03', 'Audit Meeting', '19:30:00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
