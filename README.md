# gulimall
谷粒商城


# 服务注册和发现- nacos
### 下载地址
https://github.com/alibaba/nacos/releases?expanded=true&page=2&q=1.1.3
使用1.1.3版本，windows下载nacos-server-1.1.3.zip
### 服务发现 - 使用方式
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

# 使用Nacos作为配置中心 - Nacos
### 使用方式
1. 引入依赖
``` java
	 <!-- 配置中心 -->
	<dependency>
		<groupId>com.alibaba.cloud</groupId>
		<artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
	</dependency>
```
2. 创建一个bootstrap.yml，他会优先于application...
``` java
spring:
  application:
    name: xxx
  cloud:
    nacos:
      config:
        server-addr: localhost:8848
```
3. 需要给配置中心默认添加一个 数据集（Data id） 
	程序默认会引用 (spring.application.name).properties
4. 到Nacos添加任何配置
5. 动态获取配置
	@RefreshScope：动态获取并刷新配置
	@Value("${...}")： 获取配置
	如果配置中心和当前应用配置了相同项，优先使用配置中心的配置。
### 细节
1. 命名空间：配置隔离
	默认 public（保留空间）：默认新增的所有配置都在public
	指定命名空间 
``` java
    spring.cloud.nacos.config.namespace=....
```
2. 配置集：所有配置的集合
3. 配置集ID：类似文件名 Data ID
4. 配置分组：其实就是Data ID再进行分组
	指定分组 
``` java
    spring.cloud.nacos.config.group=...
```
# 远程调用 - Feign
### 使用方式
1.  引入open-feign
 ``` java
    <dependency>
		<groupId>org.springframework.cloud</groupId>
		<artifactId>spring-cloud-starter-openfeign</artifactId>
	</dependency>
```
2. 编写一个接口，告诉SpringCloud这个接口需要调用远程服务
3. 声明接口中每个方法都是调用哪个远程服务的哪个请求
4. 开启远程调用功能 @EnableFeignClients(basePackages = "xxx")

# 开发整合
1. 前端项目设置默认请求端口 lcoalhost:88/api/...
2. 88对应后台gateway，后台gateway对应api进行断言，对应nacos-applicationName转发到对应服务进行请求（也就是说，通过gateway进行转发的服务需要注意注册到Nacos，并和gateway设置转发的服务-服务名对应）
3. 浏览器端跨域访问会有跨域问题，跨域请求会有跨域预检Option，可统一在gateway进行跨域放行
