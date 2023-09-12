# 使用 name 索引 125ms
select * from ecs where name like '76f34643%';

# 索引失效 7 s 824 ms
select * from ecs where name like '%76f34643%';

