/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.16-log : Database - generator-code
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`generator-code` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `generator-code`;

/*Table structure for table `gen_scheme` */

DROP TABLE IF EXISTS `gen_scheme`;

CREATE TABLE `gen_scheme` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(200) DEFAULT NULL COMMENT '名称',
  `category` varchar(200) DEFAULT NULL COMMENT '分类',
  `package_name` varchar(500) DEFAULT NULL COMMENT '生成包路径',
  `module_name` varchar(50) DEFAULT NULL COMMENT '生成模块名',
  `sub_module_name` varchar(50) DEFAULT NULL COMMENT '生成子模块名',
  `function_name` varchar(100) DEFAULT NULL COMMENT '生成功能名',
  `function_name_simple` varchar(100) DEFAULT NULL COMMENT '生成功能名（简写）',
  `function_author` varchar(100) DEFAULT NULL COMMENT '生成功能作者',
  `gen_table_id` int(11) DEFAULT NULL COMMENT '生成表编号',
  `g_type` int(11) DEFAULT NULL COMMENT '生成策略',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记（0：正常；1：删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gen_scheme` */

/*Table structure for table `gen_table` */

DROP TABLE IF EXISTS `gen_table`;

CREATE TABLE `gen_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `comments` varchar(200) DEFAULT NULL COMMENT '描述',
  `class_name` varchar(50) DEFAULT NULL COMMENT '实体类名称',
  `parent_table` varchar(50) DEFAULT NULL COMMENT '关联父表',
  `parent_table_fk` varchar(50) DEFAULT NULL COMMENT '关联父表外键',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记（0：正常；1：删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gen_table` */

/*Table structure for table `gen_table_column` */

DROP TABLE IF EXISTS `gen_table_column`;

CREATE TABLE `gen_table_column` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `gen_table_id` int(11) DEFAULT NULL COMMENT '归属表id',
  `name` varchar(200) DEFAULT NULL COMMENT '名称',
  `comments` varchar(500) DEFAULT NULL COMMENT '描述',
  `jdbc_type` varchar(100) DEFAULT NULL COMMENT 'JDBC类型',
  `mybatis_jdbc_type` varchar(100) DEFAULT NULL COMMENT 'mybatisJDBC类型',
  `java_type` varchar(100) DEFAULT NULL COMMENT 'JAVA类型',
  `java_field` varchar(100) DEFAULT NULL COMMENT 'JAVA字段名',
  `is_pk` tinyint(1) DEFAULT NULL COMMENT '是否主键(1：是、0：否)',
  `is_null` tinyint(1) DEFAULT NULL COMMENT '是否可为空(1：是、0：否)',
  `is_insert` tinyint(1) DEFAULT NULL COMMENT '是否为插入字段(1：是、0：否)',
  `is_edit` tinyint(1) DEFAULT NULL COMMENT '是否编辑字段(1：是、0：否)',
  `is_list` tinyint(1) DEFAULT NULL COMMENT '是否列表字段(1：是、0：否)',
  `is_query` tinyint(1) DEFAULT NULL COMMENT '是否查询字段(1：是、0：否)',
  `query_type` varchar(100) DEFAULT NULL COMMENT '字典类型',
  `show_type` varchar(100) DEFAULT NULL COMMENT '字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）',
  `dict_type` varchar(100) DEFAULT NULL COMMENT '字典类型',
  `settings` varchar(300) DEFAULT NULL COMMENT '其它设置（扩展字段JSON）',
  `sort` int(11) DEFAULT NULL COMMENT '排序（升序）',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标记（0：正常；1：删除）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gen_table_column` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
