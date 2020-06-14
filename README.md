# 数据库原理课程设计 个人财务系统
## 特别感谢

本项目基于Start Bootstrap - SB Admin 2制作了前端页面，对原作者David Miller表示感谢。

源码出处：[https://github.com/BlackrockDigital/startbootstrap-sb-admin-2](https://github.com/BlackrockDigital/startbootstrap-sb-admin-2)

## 下载与运行

需保证运行环境内有Java配置。

获取项目：

```
git clone https://github.com/ShawnZhou2000/Personal-finance-system.git
```

或点击Download Zip打包下载到本地。

运行项目：

```
在IntelliJ IDEA中打开此项目，耐心等待依赖环境初始化完成后，找到src/mainjava/com.qlu.keshe/KesheApplication.java运行项目。
项目成功启动后，在浏览器内输入localhost:8090/toLogin即可进入登录界面。
```

## 开发环境

SpringBoot 2.2.5 release

Java jdk 1.8

MyBatis-Plus 3.2.0

MySQL 8.0

Thymeleaf 1.5.10 release

BootStrap 4

编码设计：

- IntelliJ IDEA Community Edition 2020.1.1

- DCloud HbuilderX 2.6.5

数据库管理：Navicat Premium 15.0.14

运行环境：

操作系统：Microsoft Windows 10 Home Version 1909

测试浏览器：Google Chrome 83.0.4103.97

## 项目简介

个人财务系统是一款帮助用户简单记账，生成报表，辅助财务管理的综合解决方案。旨在代替传统的纸质记账方式，借助信息化和数据库技术，可以将财务管理任务整合至线上进行，提供众多实用功能，助力个人财务有序管理。

### 用户注册登录

本系统支持用户进行账号注册和用户登录。只有用户登录成功才能使用各项功能。

### 财务支出信息增删改查询

在财务支出信息模块中，支持信息的增删改查功能。

- 信息增加：可以增加一条支出

- 信息删除：可以删除一条支出 

- 信息修改：可以修改某次支出的数量

- 信息查询：可以通过备注查询支出记录

### 财务收入增删改查询

在财务收入信息模块中，支持信息的增删改查功能。

- 信息增加：可以增加一条收入

- 信息删除：可以删除一条收入

- 信息修改：可以修改某次收入的数量

- 信息查询：可以通过备注查询收入记录

### 按照任意时间段生成财务报表

在生成财务报表模块中，支持用户输入一个合法的时间段，系统按照此时间段生成详细财务报表清单，包括总收入，总支出和当前剩余资金。

### 生成财务预警信息

在生成财务预警信息模块中，支持用户自定义设置预警值，当个人财务结余小于预警值时，将会弹出预警信息。