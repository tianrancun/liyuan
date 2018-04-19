# liyuan
helloworld



CREATE TABLE `t_user` (
   `user_id` varchar(20) NOT NULL COMMENT '用户Id',
   `user_name` varchar(20) DEFAULT NULL COMMENT '登录用户名',
   `passowrd` varchar(20) DEFAULT NULL COMMENT '密码',
   `phone` varchar(50) DEFAULT NULL COMMENT '移动电话号码',
   `email` varchar(200) DEFAULT NULL,
   `gender` char(1) DEFAULT NULL COMMENT '0:女士\n1:男\n2:其他\n',
   PRIMARY KEY (`user_id`),
   UNIQUE KEY `user_name` (`user_name`) USING BTREE
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息\r\n'
