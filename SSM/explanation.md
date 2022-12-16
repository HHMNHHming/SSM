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

​		Mybatis中的级联查询:一对一，一对多和多对多三种对应关系。数据库实体（JavaBean）之间的关系

ch7：一对一的对应关系。典型的就是  人和身份证；

ch7oneToMore: Mybatis中 一对多的级联查询   一对一的查询在上面文件夹中显示了。主要是体现在标签和sql上

​		一对多：根据用户的id去查，用户的订单。用户和订单的对应关系是一对多；

ch7moreToMore: Mybatis中 多对多的级联查询   查询Orders和Product所有的数据，这两者之间的关系是多对多的。

ch9：springmvc应用 1、dispathServlet  2、映射器   3、控制器  4、视图解析器 5、客户端

   这个web应用配置坑实在是多！

   建议使用idea的付费版开发，社区版会非常的麻烦。注意编译后的文件classes是不是空、配置tomcat、webapp的创建等····

   这章让我认识到了springmvc的工作流程，以及一个简单的springmvc使用社区版的创建过程。

ch10：Springmvc的控制器Controller

​	主要是SpringMVC的@RequestMapping、ServletAPi的参数讲解、@PathVariable、@RequestParam、@ModelAttribute 一些请求注解的初步认识。

​    转发是服务器内部的行为，转发必须是同一个Servlet容器下的URL，用户没感知。

​	重定向是客户端的行为，重定向是用户对服务器的二次请求，用户感受到地址栏的变化。

ch11a：SpringMVC前后端数据类型使用Converter接口实现相互转化。

ch11b：SpringMVC前后端数据类型使用Formatter接口实现相互转化。
