# gulimall
谷粒商城


# nacos
### 下载地址
https://github.com/alibaba/nacos/releases?expanded=true&page=2&q=1.1.3
使用1.1.3版本，windows下载nacos-server-1.1.3.zip
### 使用方式
0. 启动下载的nacos，默认端口8848
1. 引入包
``` java
        <!-- 服务注册/发现-->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
```
2. 服务新增注册链接
``` java
spring:
  cloud:
    nacos:
      discovery:
        server-addr: 127.0.0.1:8848
  application:
    name: xxx-module
```
3. 启动类增加注册到nacos注解
@EnableDiscoveryClient
