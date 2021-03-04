Spring 和 Mybatis 的集成
步骤：
1.创建maven项目
2.加入maven依赖
    1）spring依赖
    2）mybatis依赖
    3）mysql驱动
    4）spring的事务依赖
    5）mybatis和spring集成的依赖：mybatis官方提供的，用来在spring中创建mybatis的
        SqlSessionFactory 和dao 类的对象
3.创建实体类
4.创建dao接口和mapper映射文件
5.创建mybatis的主配置文件
6.创建Service接口和实现类，属性是dao
7.创建spring的配置文件：声明mybatis的对象交给spring管理
    1）数据源DataSource
    2）SqlSessionFactory
    3）Dao对象
    4）声明自定义的service
8.创建测试类，获取Service对象，通过Service调用dao完成数据库的访问
