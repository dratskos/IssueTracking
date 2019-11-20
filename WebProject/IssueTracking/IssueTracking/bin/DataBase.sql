-- MySQL Script generated by MySQL Workbench
-- Sun Nov 17 17:22:47 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema newschema
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema newschema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `newschema` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `newschema` ;

-- -----------------------------------------------------
-- Table `newschema`.`issue`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `newschema`.`issue` (
  `IssueID` INT(11) NOT NULL,
  `IssueDescription` VARCHAR(45) NULL DEFAULT NULL,
  `IssueKind` VARCHAR(15) NULL DEFAULT NULL,
  `IssueAssignedTo` VARCHAR(45) NULL DEFAULT NULL,
  `DateOfCreated` VARCHAR(20) NULL DEFAULT NULL,
  `DateOfProccess` VARCHAR(20) NULL DEFAULT NULL,
  `LastUserOfProccess` VARCHAR(45) NULL DEFAULT NULL,
  `NameOfUserCreated` VARCHAR(45) NULL DEFAULT NULL,
  `Status` VARCHAR(15) NULL DEFAULT NULL,
  PRIMARY KEY (`IssueID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `newschema`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `newschema`.`user` (
  `UserID` INT(11) NOT NULL,
  `UserName` VARCHAR(20) NOT NULL,
  `UserDateOfBirth` VARCHAR(20) NOT NULL,
  `UserDepartment` VARCHAR(20) NULL DEFAULT NULL,
  `UserPassword` INT(11) NULL DEFAULT NULL,
  `UserEmail` VARCHAR(25) NULL DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  INDEX `idx_user_UserID` (`UserID` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
