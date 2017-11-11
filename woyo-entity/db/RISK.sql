/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/11/11 16:20:34                          */
/*==============================================================*/


drop table if exists user_info;

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   bigint(20) not null auto_increment comment 'id',
   login                varchar(30) comment '登录名',
   password             varchar(30) comment '密码',
   telphone             varchar(20) comment '手机号',
   name                 varchar(30) comment '姓名',
   idno                 varchar(20) comment '身份证号',
   sex                  varchar(1) comment '性别 1-男 2-女',
   birthday             int(3) comment '生日',
   native_place         varchar(30) comment '籍贯',
   qq                   varchar(20) comment 'qq',
   wechar               varchar(20) comment '微信',
   mail                 varchar(30) comment '邮箱',
   reg_type             varchar(2) comment '注册方式 01-微信公众号 02-PC网页 03-APP',
   reg_time             datetime comment '注册时间',
   primary key (id)
);

alter table user_info comment '用户表';

