# SpringBootTestContainer
Spring Bootで作成したプロジェクトをDockerにて表示する

## 使用技術
---
Java : 17 <br>
Spring Boot : 3.0.5 <br>
thymeleaf<br>
spring-boot-starter-web<br>
lombok<br>
spring-boot-devtools<br>
Docker<br>
## Docker詳細
---
使用イメージ : openjdk:18 <br>
※ openjdk:17を使用すると xargs is not available が表示されるため18を使用 [参考](https://teratail.com/questions/q2cqw5zi4l49me)
## 起動方法
---
- クローン
```
git@github.com:yukishi24/SpringBootTestContainer.git
```

- docker-composeを起動
```
cd SpringBootTestContainer
docker-compose up -d
```

- 起動確認
```
docker ps -a
```

以下が表示されていれば起動してる
```
CONTAINER ID   IMAGE                         COMMAND    CREATED          STATUS          PORTS                    NAMES
42f2e3e25b00   springboottestcontainer-app   "jshell"   15 seconds ago   Up 14 seconds   0.0.0.0:8080->8080/tcp   java
```
- 起動したコンテナに入る
```
docker exec -it java /bin/sh
```
- Springの起動
```
sh-4.4# sh gradlew bootRun
```

[localhost](http://localhost:8080)に接続<br>
<br>
ブラウザに「Hello World」が表示されていれば成功
