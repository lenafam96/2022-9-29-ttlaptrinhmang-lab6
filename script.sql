DROP DATABASE IF EXISTS `qlsv`;

CREATE DATABASE `qlsv`;

DROP TABLE IF EXISTS `qlsv`.`sinhvien`;

CREATE TABLE `qlsv`.`sinhvien` (
  `ma` varchar(20) NOT NULL,
  `hoten` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `diemtb` float(5),
  PRIMARY KEY (`ma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `qlsv`.`sinhvien` (`ma`, `hoten`,`diemtb`) VALUES
('19103200001','Nguyễn Thị Nga',8),
('19103200002','Nguyễn Minh Thành',9),
('19103200003','Nguyễn Thanh Tâm',10);