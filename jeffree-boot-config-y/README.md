# 一、本课程目标
SpringBoot的常用配置

resources\application.properties

# 二、常用配置
## 1、固定端口
server.port=9090

## 2、随机端口
（1）同一个服务器上，防止端口冲突。
（2）微服务(Spring Cloud / Dubbo)：开发人员不用知道IP和端口。
实际应用中，基本都是用随机端口的。
```
server.port=9090
```

# 三、自定义配置
@value注解
简化读取properties的配置值，Spring支持@Value注解的方式来获取。
简化、灵活

# 四、作业
