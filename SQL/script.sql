create table books
(
    bookID     int(100) auto_increment comment '书ID'
        primary key,
    bookName   varchar(100) not null comment '书名',
    bookCounts int          not null comment '数量',
    detail     varchar(200) not null comment '描述'
)
    charset = utf8mb4;


