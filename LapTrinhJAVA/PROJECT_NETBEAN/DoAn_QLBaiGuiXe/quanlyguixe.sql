-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 13, 2025 at 05:41 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlyguixe`
--

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `idHoaDon` int(11) NOT NULL,
  `idVe` int(11) NOT NULL,
  `ngayGioNhan` datetime NOT NULL,
  `tongTien` decimal(10,2) NOT NULL,
  `idTaiKhoan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`idHoaDon`, `idVe`, `ngayGioNhan`, `tongTien`, `idTaiKhoan`) VALUES
(1, 1, '2025-01-11 12:00:00', 100000.00, 2),
(2, 2, '2025-01-11 13:00:00', 50000.00, 3),
(4, 5, '2025-01-12 04:32:20', 20000.00, 1),
(5, 2, '2025-01-12 04:32:43', 380000.00, 1),
(6, 2, '2025-01-12 06:34:02', 420000.00, 1),
(17, 48, '2024-12-01 12:00:00', 80000.00, 1),
(18, 49, '2024-12-03 12:30:00', 60000.00, 2),
(19, 50, '2024-12-05 10:15:00', 60000.00, 3),
(20, 51, '2024-12-07 15:45:00', 84000.00, 3),
(21, 52, '2024-12-10 17:20:00', 80000.00, 1),
(22, 53, '2024-12-15 20:30:00', 80000.00, 2),
(23, 54, '2024-12-20 22:00:00', 60000.00, 3),
(24, 55, '2024-12-21 14:30:00', 90000.00, 2),
(25, 56, '2024-12-24 19:45:00', 100000.00, 1),
(26, 57, '2024-12-28 22:30:00', 80000.00, 2),
(27, 1, '2025-01-12 17:49:11', 660000.00, 1),
(28, 1, '2025-01-13 22:43:23', 1240000.00, 1),
(29, 5, '2025-01-13 22:43:28', 840000.00, 1),
(30, 58, '2025-01-13 22:43:52', 560000.00, 1),
(31, 2, '2025-01-13 22:43:54', 1220000.00, 1),
(32, 59, '2025-01-13 22:46:32', 560000.00, 1),
(33, 55, '2024-11-13 17:16:28', 12000.00, 3),
(34, 67, '2025-01-13 23:38:29', 20000.00, 1),
(35, 69, '2025-01-13 23:39:34', 20000.00, 1),
(36, 68, '2025-01-13 23:40:45', 20000.00, 1);

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `idKhachHang` int(11) NOT NULL,
  `hoTen` varchar(100) NOT NULL,
  `soDienThoai` varchar(15) NOT NULL,
  `diaChi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`idKhachHang`, `hoTen`, `soDienThoai`, `diaChi`) VALUES
(1, 'Nguyen Van A', '0912345678', '123 Tran Phu, Ha Noi'),
(2, 'Tran Thi B', '0987654321', '456 Le Loi, Ho Chi Minh'),
(3, 'Le Van C', '0909090909', 'Hồ Chí Minh'),
(4, 'khNEW', '0896754321', 'ABC');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `idTaiKhoan` int(11) NOT NULL,
  `tenDangNhap` varchar(50) NOT NULL,
  `matKhau` varchar(100) NOT NULL,
  `vaiTro` enum('QuanLy','NhanVien') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`idTaiKhoan`, `tenDangNhap`, `matKhau`, `vaiTro`) VALUES
(1, 'admin', '1', 'QuanLy'),
(2, 'nhanvien1', '123456', 'NhanVien'),
(3, 'nhanvien2', '123456', 'NhanVien'),
(4, 'USER', '12345', 'NhanVien'),
(5, 'ưqeqw', '123', 'NhanVien');

-- --------------------------------------------------------

--
-- Table structure for table `veguixe`
--

CREATE TABLE `veguixe` (
  `idVe` int(11) NOT NULL,
  `idXe` int(11) NOT NULL,
  `idViTri` int(11) NOT NULL,
  `ngayGioGui` datetime NOT NULL,
  `trangThai` varchar(10) NOT NULL DEFAULT 'ON',
  `idTaiKhoan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `veguixe`
--

INSERT INTO `veguixe` (`idVe`, `idXe`, `idViTri`, `ngayGioGui`, `trangThai`, `idTaiKhoan`) VALUES
(1, 1, 1, '2025-01-11 08:00:00', 'OFF', 2),
(2, 2, 2, '2025-01-11 09:00:00', 'OFF', 3),
(4, 1, 1, '2025-01-12 03:22:11', 'OFF', 1),
(5, 3, 5, '2025-01-12 03:48:44', 'OFF', 1),
(6, 2, 2, '2025-01-12 06:33:56', 'OFF', 1),
(7, 3, 6, '2024-01-13 16:03:03', 'OFF', 1),
(48, 1, 1, '2024-12-01 08:00:00', 'OFF', 1),
(49, 2, 2, '2024-12-03 09:30:00', 'OFF', 2),
(50, 3, 2, '2024-12-05 07:15:00', 'OFF', 3),
(51, 3, 2, '2024-12-07 11:45:00', 'OFF', 3),
(52, 1, 1, '2024-12-10 13:20:00', 'OFF', 1),
(53, 1, 1, '2024-12-15 16:30:00', 'OFF', 2),
(54, 2, 1, '2024-12-20 19:00:00', 'OFF', 3),
(55, 1, 1, '2024-12-21 10:00:00', 'OFF', 2),
(56, 2, 1, '2024-12-24 14:45:00', 'OFF', 1),
(57, 2, 2, '2024-12-28 18:30:00', 'OFF', 2),
(58, 1, 7, '2025-01-12 17:48:51', 'OFF', 1),
(59, 1, 6, '2025-01-12 17:48:55', 'OFF', 1),
(60, 1, 5, '2025-01-12 17:48:58', 'OFF', 1),
(61, 1, 2, '2025-01-12 17:49:00', 'OFF', 1),
(62, 5, 1, '2025-01-13 22:43:15', 'OFF', 1),
(63, 1, 6, '2025-01-13 22:46:30', 'OFF', 1),
(64, 1, 5, '2025-01-13 22:53:28', 'OFF', 1),
(65, 2, 5, '2024-02-13 17:15:50', 'OFF', 2),
(66, 1, 6, '2025-01-13 23:36:48', 'OFF', 1),
(67, 2, 1, '2025-01-13 23:37:21', 'OFF', 1),
(68, 2, 1, '2025-01-13 23:38:39', 'OFF', 1),
(69, 2, 5, '2025-01-13 23:39:27', 'OFF', 1);

-- --------------------------------------------------------

--
-- Table structure for table `vitriguixe`
--

CREATE TABLE `vitriguixe` (
  `idViTri` int(11) NOT NULL,
  `tenViTri` varchar(50) NOT NULL,
  `trangThai` enum('Trong','DangSuDung') NOT NULL DEFAULT 'Trong'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `vitriguixe`
--

INSERT INTO `vitriguixe` (`idViTri`, `tenViTri`, `trangThai`) VALUES
(1, 'Vi Tri 1', 'Trong'),
(2, 'Vi Tri 2', 'Trong'),
(5, 'Vị Trí 3', 'Trong'),
(6, 'Vị Trí 4', 'Trong'),
(7, 'Vị Trí 5', 'Trong');

-- --------------------------------------------------------

--
-- Table structure for table `xekhachhang`
--

CREATE TABLE `xekhachhang` (
  `idXe` int(11) NOT NULL,
  `bienSoXe` varchar(20) NOT NULL,
  `idKhachHang` int(11) NOT NULL,
  `loaiXe` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `xekhachhang`
--

INSERT INTO `xekhachhang` (`idXe`, `bienSoXe`, `idKhachHang`, `loaiXe`) VALUES
(1, '30A-12345', 1, 'Xe O To'),
(2, '59D-67890', 2, 'Xe May'),
(3, '33C-11223', 3, 'Xe Tai'),
(5, '123B-16526', 1, 'Xe Moto');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`idHoaDon`),
  ADD KEY `idVe` (`idVe`),
  ADD KEY `idTaiKhoan` (`idTaiKhoan`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`idKhachHang`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`idTaiKhoan`);

--
-- Indexes for table `veguixe`
--
ALTER TABLE `veguixe`
  ADD PRIMARY KEY (`idVe`),
  ADD KEY `idXe` (`idXe`),
  ADD KEY `idViTri` (`idViTri`),
  ADD KEY `idTaiKhoan` (`idTaiKhoan`);

--
-- Indexes for table `vitriguixe`
--
ALTER TABLE `vitriguixe`
  ADD PRIMARY KEY (`idViTri`);

--
-- Indexes for table `xekhachhang`
--
ALTER TABLE `xekhachhang`
  ADD PRIMARY KEY (`idXe`),
  ADD KEY `idKhachHang` (`idKhachHang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `idHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `idKhachHang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `taikhoan`
--
ALTER TABLE `taikhoan`
  MODIFY `idTaiKhoan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `veguixe`
--
ALTER TABLE `veguixe`
  MODIFY `idVe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;

--
-- AUTO_INCREMENT for table `vitriguixe`
--
ALTER TABLE `vitriguixe`
  MODIFY `idViTri` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `xekhachhang`
--
ALTER TABLE `xekhachhang`
  MODIFY `idXe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `hoadon_ibfk_1` FOREIGN KEY (`idVe`) REFERENCES `veguixe` (`idVe`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `hoadon_ibfk_2` FOREIGN KEY (`idTaiKhoan`) REFERENCES `taikhoan` (`idTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `veguixe`
--
ALTER TABLE `veguixe`
  ADD CONSTRAINT `veguixe_ibfk_1` FOREIGN KEY (`idXe`) REFERENCES `xekhachhang` (`idXe`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `veguixe_ibfk_2` FOREIGN KEY (`idViTri`) REFERENCES `vitriguixe` (`idViTri`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `veguixe_ibfk_3` FOREIGN KEY (`idTaiKhoan`) REFERENCES `taikhoan` (`idTaiKhoan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `xekhachhang`
--
ALTER TABLE `xekhachhang`
  ADD CONSTRAINT `xekhachhang_ibfk_1` FOREIGN KEY (`idKhachHang`) REFERENCES `khachhang` (`idKhachHang`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
