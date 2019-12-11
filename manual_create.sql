#수동 생성을 원하신다면!
CREATE TABLE `zone` (
`seq` int(11) unsigned not null auto_increment comment 'Seq',
`width` int(4) unsigned not null default 0 comment '넓이',
`height` int(4) unsigned not null default 0 comment '높이',
`device` enum('P','M','A') not null default 'P' comment '디바이스타입(P피씨,M모바일,A앱)',
`useYN` enum('Y','N') not null default 'Y' comment '사용여부',
`regDate` datetime NOT NULL default CURRENT_TIMESTAMP comment '등록일시',
PRIMARY KEY (`seq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='영역';
