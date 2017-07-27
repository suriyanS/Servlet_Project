-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2017 at 02:20 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `adminlogin`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `username` varchar(50) NOT NULL,
  `userpass` varchar(50) NOT NULL,
  `user` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`username`, `userpass`, `user`) VALUES
('suriyan', 'Suriyan@4321', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `ex_user_login`
--

CREATE TABLE `ex_user_login` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `userpass` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ex_user_login`
--

INSERT INTO `ex_user_login` (`id`, `username`, `userpass`) VALUES
(1, 'suriyan', 'Suriyan@2607'),
(2, 'Deepika', 'Deepika@4321'),
(3, 'Deepika', 'Deepika@4321'),
(4, 'Deepika', 'Deepika@4321'),
(5, 'Deepika', 'Deepika@4321'),
(6, 'Deepika', 'Deepika@4321'),
(7, 'Deepika', 'Deepika@4321'),
(8, 'suriyan', 'Suriyan@2607'),
(9, 'Prakash', 'Prakash@4321'),
(10, 'Prakash', 'Prakash@4321'),
(11, 'Dhivya', 'Dhivya@1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ex_user_login`
--
ALTER TABLE `ex_user_login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ex_user_login`
--
ALTER TABLE `ex_user_login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
