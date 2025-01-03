# ExecutorFramework

## How to get Spring project installed in GitHub Codespace

```sh
sudo apt update
sudo apt-get install openjdk-11-jdk

Y
sdk install springboot
cd ..
spring init --dependencies=web --java-version=11 --build=maven --groupId=com.example --artifactId=executor-demo --name=ExecutorFramework ExecutorFramework 

mvn clean install
mvn spring-boot:run

sudo apt update
sudo apt install mariadb-server


sudo service mysql start


sudo mysql_secure_installation // for securing, removing anonymous 


sudo mysql -u root -p
<pwd>

CREATE DATABASE executor_demo;
CREATE USER 'executor_user'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON executor_demo.* TO 'executor_user'@'localhost';
FLUSH PRIVILEGES;
EXIT;

mvn clean install
mvn spring-boot:run


## How to install Java 8 or Java 17 on Linux machine

### Java 8
```sh
sudo apt update
sudo apt-get install openjdk-8-jdk
```

### Java 17
```sh
sudo apt update
sudo apt-get install openjdk-17-jdk
```