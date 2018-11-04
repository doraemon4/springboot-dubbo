以前在2016年的时候自己写了一个基于springmvc，xml配置的一个demo
[dubbo+zookeeper+spring mvc+mybatis+mysql实现rpc面向服务编程搭建教程](http://www.zuidaima.com/share/2841778527063040.htm),
在周末的时候自己做了下基于springboot的实现。使用注解的时候遇到了一个问题，在provider的启动类必须加 **@EnableDubbo** 注解才能生效，但是我的消费者没加注解为什么可以生效呢？
# springboot-dubbo
使用springboot搭建dubbo分布式
* 基于xml配置实现生产者和消费者
* 基于注解实现实现生产者和消费者  
## 第一步：开启zookeeper
zkServer start    
## 第二步：运行provider
![Image text](https://github.com/doraemon4/springboot-dubbo/blob/master/png/provider.png)
## 第三步：运行consumer
![Image text](https://github.com/doraemon4/springboot-dubbo/blob/master/png/consumer.png)
## 第四步：运行dubbo-admin监控
![Image text](https://github.com/doraemon4/springboot-dubbo/blob/master/png/dubbo-admin.png)  
监控效果：  
![Image text](https://github.com/doraemon4/springboot-dubbo/blob/master/png/监控.png)
## 第五步：消费者调用服务
![Image text](https://github.com/doraemon4/springboot-dubbo/blob/master/png/调用.png)  
参考了1.https://github.com/xiaoze-smirk/dubbo-springboot 看到他使用了 **@EnableDubbo** 的注解  
参考了2.https://github.com/apache/incubator-dubbo-spring-boot-project 没有使用 **@EnableDubbo** 的注解
