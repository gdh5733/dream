/*
 Navicat Premium Data Transfer

 Source Server         : 47.114.133.106-mysql
 Source Server Type    : MySQL
 Source Server Version : 50648
 Source Host           : 47.114.133.106:3306
 Source Schema         : gaodehan

 Target Server Type    : MySQL
 Target Server Version : 50648
 File Encoding         : 65001

 Date: 20/06/2020 15:49:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT '密码',
  `sex` tinyint(4) NOT NULL DEFAULT '0' COMMENT '性别 0=女 1=男',
  `deleted` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '删除标志,默认零不删除,1删除',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

SET FOREIGN_KEY_CHECKS = 1;
