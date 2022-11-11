ch1:Spring入门，Spring核心容器四个；~~单元测试junit~~  spring写单元测试不好写，main函数测试···

ch2:依赖注入的两种方式  构造方法注入和setter方法注入

ch3:Bean实例化、Bean生命周期、Bean管理  

​		"BeanClass无参的构造方法调用中···"  这句话是因为只要加载配置文件applicationContext文件。

​		由于在配置文件中配置了BeanClass类的实例化（id = "beanClass"），所以会调用BeanClass的无参构造函数。

ch4:Aop、动态代理（JDK和Cglib）、~~Aspectj注解开发（这个俺不想写了···）~~

ch5:Spring对数据库的基本操作   jdbcTemplate的简单用法    ~~引出的数据库事务管理我就想写了~~

ch6:Mybatis半自动映射（Sql映射文件） Sql语句不在出现在业务代码中，放在xml文件中方便更改

​		使用Mybatis-config.xml的数据库配置，使用Mybatis原始的SqlSessionFactory接口来访问数据库

ch6x:Spring-Mybatis 整合    数据库使用Bean配置交给Spring管理，Sql映射文件用Mybatis

​		Spring中Bean自动装配（Spring注解与Spring XML装配的区别）。

​			<1>使用配置文件XML文件中的<context:component-scan>标签，自动扫描Bean即自动装配。

​			<2>@ComponentScan注解只能扫描注解中的@Component组件。这是Spring中组件的思想。

​				使用@ComponentScan注解的时候，它会扫描该包及子包的组件。会把@Component、@Service、				@Repository、@Contoroller注解的类（接口是不行的！）当做JavaBean注入到Spring容器中去。当做				对象交由Spring容器管理。

​			<3>使用Spring的ApplicationContext上下文加载。xml文件加载ClassPathXmlApplicationContext（）或				者是使用                                                                    注解加载AnnotationConfigApplicationContext（）

