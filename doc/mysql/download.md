## 安装指南：macOS 上的 MySQL
- []

### 1. 下载 MySQL Community Server

访问 [MySQL 下载页面](https://downloads.mysql.com/archives/community/)

- 注意: 操作系统的版本

### 2. 配置环境变量

- 打开你的用户主目录下的配置文件（例如，.bash_profile 或 .zshrc）
```js
// 注意执行这个
source ~/.bash_profile   # 或 source ~/.zshrc
```
- 快捷方式

```js
export PATH="$PATH:/usr/local/mysql/bin"
```

### 3.连接到 MySQL 服务器
- 如今版本都是可以直接操作这个执行
```shell
mysql -u用户名 -p密码 [-h数据库服务ip地址 -p端口号]
```