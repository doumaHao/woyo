/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/4/2 22:40:20                            */
/*==============================================================*/


drop table if exists car_info;

drop table if exists driver_order;

drop table if exists driver_share_info;

drop table if exists evaluate_info;

drop table if exists passer_detail;

drop table if exists passer_order;

drop table if exists passer_share_info;

drop table if exists provincial_city;

drop table if exists user_address;

drop table if exists user_info;

/*==============================================================*/
/* Table: car_info                                              */
/*==============================================================*/
create table car_info
(
   id                   bigint(20) not null auto_increment comment 'id',
   idno                 varchar(20) comment '车主身份证号',
   car_no               varchar(10) comment '车牌号',
   car_no_img           varchar(200) comment '车牌照片',
   car_type             varchar(2) comment '车类型 01-轿车 02-SUV 03-MPV 04-大巴 05-货车',
   engine_no            varchar(40) comment '发动机号',
   brand_id             bigint(20) comment '车辆品牌id',
   model_id             bigint(20) comment '车辆型号id',
   car_color            varchar(10),
   car_img              varchar(200) comment '车辆照片',
   primary key (id)
);

alter table car_info comment '司机表';

/*==============================================================*/
/* Table: driver_order                                          */
/*==============================================================*/
create table driver_order
(
   id                   bigint(20) not null auto_increment,
   driver_share_id      bigint(20) comment '司机需求id',
   passer_share_id      bigint(20) comment '乘客需求id',
   consume_seat         int(3) comment '消耗座位数',
   order_price          decimal(16,4) comment '订单价格',
   order_time           datetime comment '订单时间',
   order_status         varchar(2) comment '订单状态 01-已下单 02-已付款 03-已取消 04-已完成 05-已评价',
   primary key (id)
);

alter table driver_order comment '司机订单表';

/*==============================================================*/
/* Table: driver_share_info                                     */
/*==============================================================*/
create table driver_share_info
(
   id                   bigint(20) not null auto_increment,
   idno                 varchar(20) comment '身份证号',
   car_no               varchar(20) comment '车牌号',
   contract_type        varchar(2) comment '拼车方式 01-拼车 02-包车',
   setoff_time          datetime comment '发车时间',
   departure_id         varchar(100) comment '发车地点',
   destination_id       varchar(100) comment '目的地',
   totel_seat           int(2) comment '总座位数 不带司机',
   remainder_seat       int(2) comment '剩余座位数',
   publish_time         datetime comment '发布时间',
   total_price          decimal comment '总价 包车价',
   unit_price           decimal comment '单价 拼车',
   no_contract          char(1) comment '是否可包车 0-不可 1-可以',
   complete_flg         char(1) comment '是否完成 0-未完成 1-完成',
   remarks              varchar(200),
   primary key (id)
);

alter table driver_share_info comment '司机需求表';

/*==============================================================*/
/* Table: evaluate_info                                         */
/*==============================================================*/
create table evaluate_info
(
   id                   bigint(20) not null auto_increment,
   evaluate_type        varchar(2) comment '评价种类 01-司机对乘客评价 02-乘客对司机评价',
   idno                 varchar(20) comment '评价对象身份证号',
   elavater_idno        varchar(20) comment '评价者身份证',
   driver_order_id      bigint(20) comment '评价依旧司机订单',
   passer_order         bigint(20) comment '评价依据乘客订单',
   evaluate_score       int(3) comment '评价分数',
   evaluate_time        datetime comment '评价时间',
   evaluate_content     varchar(500) comment '评价内容',
   primary key (id)
);

alter table evaluate_info comment '评价信息表';

/*==============================================================*/
/* Table: passer_detail                                         */
/*==============================================================*/
create table passer_detail
(
   id                   bigint(20) not null auto_increment,
   passer_share_id      bigint(20),
   idno                 varchar(20) comment '身份证号',
   name                 varchar(20) comment '姓名',
   price_status         varchar(2) comment '乘客票价状态 01-全票 02-半价票 03-免费票',
   primary key (id)
);

alter table passer_detail comment '乘客需求人表';

/*==============================================================*/
/* Table: passer_order                                          */
/*==============================================================*/
create table passer_order
(
   id                   bigint(20) not null auto_increment,
   passer_share_id      bigint(20),
   driver_share_id      bigint(20),
   consume_seat         int(3),
   order_price          decimal(16,4),
   order_time           datetime,
   order_status         varchar(2),
   primary key (id)
);

alter table passer_order comment '乘客订单表';

/*==============================================================*/
/* Table: passer_share_info                                     */
/*==============================================================*/
create table passer_share_info
(
   id                   bigint(20) not null auto_increment,
   main_passer          varchar(20) comment '主要负责人身份证号',
   car_type             varchar(2) comment '需求车辆种类',
   need_seat            int(3) comment '需求座位数',
   need_time            datetime comment '需求时间',
   need_status          varchar(2) comment '需求状态 01-未完成 02-完成',
   primary key (id)
);

alter table passer_share_info comment '乘客需求表';

/*==============================================================*/
/* Table: provincial_city                                       */
/*==============================================================*/
create table provincial_city
(
   id                   bigint(20) not null auto_increment comment 'id',
   type                 varchar(2) comment '省市区类型 01-省 02-市 03-区',
   name                 varchar(20) comment '省市区名称',
   parent_id            bigint(20) comment '父节点id',
   primary key (id)
);

alter table provincial_city comment '省市区表';

/*==============================================================*/
/* Table: user_address                                          */
/*==============================================================*/
create table user_address
(
   id                   bigint(20) not null auto_increment comment 'id',
   idno                 varchar(20) comment '身份证号',
   province_id          varchar(20) comment '省id',
   city_id              varchar(20) comment '市id',
   area_id              varchar(20) comment '区id',
   area_info            varchar(100) comment '具体县街道等其他信息',
   last_use_date        datetime comment '上次使用时间',
   use_times            int(8) comment '总共使用次数',
   primary key (id)
);

alter table user_address comment '用户地址表';

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
   score                int(3) comment '用户评分',
   reg_type             varchar(2) comment '注册方式 01-微信公众号 02-PC网页 03-APP',
   reg_time             datetime comment '注册时间',
   last_login_time      datetime comment '最后一次登录时间',
   login_times          int(8) comment '登录次数',
   state                char(1) comment '状态 0-冻结 1-生效 2-注销',
   primary key (id)
);

alter table user_info comment '用户表';

