/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : pfms

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 23/04/2022 16:07:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for income
-- ----------------------------
DROP TABLE IF EXISTS `income`;
CREATE TABLE `income`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `money` double(11, 2) NULL DEFAULT NULL,
  `update_time` date NULL DEFAULT NULL,
  `comment` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of income
-- ----------------------------
INSERT INTO `income` VALUES (1, 1, 50.00, '2020-06-12', 'test');
INSERT INTO `income` VALUES (2, 1, 20.00, '2020-06-12', 'demoData');
INSERT INTO `income` VALUES (3, 1, 100.00, '2020-06-12', 'demoData');
INSERT INTO `income` VALUES (5, 1, 21.05, '2020-06-12', 'demoData');
INSERT INTO `income` VALUES (6, 1, 35.80, '2020-06-13', 'demoData');
INSERT INTO `income` VALUES (7, 1, 123.00, NULL, '3232');
INSERT INTO `income` VALUES (8, 1, 111.00, '2020-06-13', '111');
INSERT INTO `income` VALUES (9, 1, 2344352.00, '2020-05-07', '345');

-- ----------------------------
-- Table structure for pay
-- ----------------------------
DROP TABLE IF EXISTS `pay`;
CREATE TABLE `pay`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL,
  `money` double(11, 2) NULL DEFAULT NULL,
  `update_time` date NULL DEFAULT NULL,
  `comment` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pay
-- ----------------------------
INSERT INTO `pay` VALUES (2, 1, 60.00, '2020-06-12', 'demoData');
INSERT INTO `pay` VALUES (4, 1, 200.00, '2020-06-12', 'demoData');
INSERT INTO `pay` VALUES (5, 1, 50.00, '2020-06-12', 'demoData');
INSERT INTO `pay` VALUES (6, 1, 55.55, '2020-06-14', 'demoData');
INSERT INTO `pay` VALUES (7, 1, 55.55, '2020-06-13', 'demoData');
INSERT INTO `pay` VALUES (8, 1, 123.00, '2000-10-08', '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `warn` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456', 0);
INSERT INTO `user` VALUES (2, 'demoData', 'demoData', 0);
INSERT INTO `user` VALUES (3, '3', '3', 100);

SET FOREIGN_KEY_CHECKS = 1;
