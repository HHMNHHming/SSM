ch1:Spring入门，Spring核心容器四个；~~单元测试junit~~  spring写单元测试不好写，main函数测试···

ch2:依赖注入的两种方式  构造方法注入和setter方法注入

ch3:Bean实例化、Bean生命周期、Bean管理  

​		"BeanClass无参的构造方法调用中···"  这句话是因为只要加载配置文件applicationContext文件。

​		由于在配置文件中配置了BeanClass类的实例化（id = "beanClass"），所以会调用BeanClass的无参构造函数。

ch4:Aop、动态代理（JDK和Cglib）、~~Aspectj注解开发（这个俺不想写了···）~~

ch5:Spring对数据库的基本操作   jdbcTemplate的简单用法    ~~引出的数据库事务管理我就想写了~~

ch6:Mybatis半自动映射（Sql映射文件） Sql语句不在出现在业务代码中，放在xml文件中方便更改

ch6x:Spring-Mybatis 整合    数据库使用Bean配置交给Spring管理，Sql映射文件用Mybatis

