USE daydayup;

DROP TABLE IF EXISTS ecs;
CREATE TABLE ecs
(
    id          BIGINT      NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    name        VARCHAR(64) NOT NUll COMMENT '名称',
    cpu         INT         NOT NUll COMMENT 'cpu 核数(核)',
    memory      VARCHAR(50) NULL     DEFAULT NULL COMMENT '内存大小(G)',
    create_time DATETIME    NOT NUll DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    create_by   VARCHAR(50) NOT NULL COMMENT '创建人',
    tenant_id   BIGINT      NOT NULL DEFAULT 1 COMMENT '所属租户',
    PRIMARY KEY (id)
) ENGINE = INNODB;

CREATE UNIQUE INDEX idx ON ecs (name);

