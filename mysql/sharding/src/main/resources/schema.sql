CREATE DATABASE IF NOT EXISTS daydayup_0;
CREATE DATABASE IF NOT EXISTS daydayup_1;

USE daydayup_0;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orders_0
-- ----------------------------
DROP TABLE IF EXISTS `orders_0`;
CREATE TABLE `orders_0` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for orders_2
-- ----------------------------
DROP TABLE IF EXISTS `orders_2`;
CREATE TABLE `orders_2` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for orders_4
-- ----------------------------
DROP TABLE IF EXISTS `orders_4`;
CREATE TABLE `orders_4` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for orders_6
-- ----------------------------
DROP TABLE IF EXISTS `orders_6`;
CREATE TABLE `orders_6` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for order_config
-- ----------------------------
DROP TABLE IF EXISTS `order_config`;
CREATE TABLE `order_config` (
                                `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
                                `pay_timeout` int(11) DEFAULT NULL COMMENT '支付超时时间;单位：分钟',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单配置表';

SET FOREIGN_KEY_CHECKS = 1;


USE daydayup_1;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for orders_1
-- ----------------------------
DROP TABLE IF EXISTS `orders_1`;
CREATE TABLE `orders_1` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=400675304294580226 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for orders_3
-- ----------------------------
DROP TABLE IF EXISTS `orders_3`;
CREATE TABLE `orders_3` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for orders_5
-- ----------------------------
DROP TABLE IF EXISTS `orders_5`;
CREATE TABLE `orders_5` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

-- ----------------------------
-- Table structure for orders_7
-- ----------------------------
DROP TABLE IF EXISTS `orders_7`;
CREATE TABLE `orders_7` (
                            `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                            `user_id` int(16) DEFAULT NULL COMMENT '用户编号',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='订单表';

SET FOREIGN_KEY_CHECKS = 1;