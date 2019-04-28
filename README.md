基于SpringBOOT的SSM模板，外加SpringDataJPA模块。前端是layui。
如果创建表等操作可以采用SpringDataJPA。 SpringDataJPA的分页与mybatis的分页不同。SpringData的分页参考message模块。mybatis的分页参考user模块。
使用的时候拷贝src/main/resources/application.sample.properties重命名为application.properties即可。

1. 昨日运动步数排名，采用右连接查询 (默认查询当日的，可以选择日期进行查询)
SELECT username,fullname,stepnumber FROM USER LEFT JOIN diet_step_record ON user.username = diet_step_record .creatorusername WHERE diet_step_record.remark = "2019-04-05" ORDER BY stepnumber desc