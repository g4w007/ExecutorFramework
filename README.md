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
```

## How to install Java 8, Java 11, or Java 17 on Linux machine

### Java 8
```sh
sudo apt update
sudo apt-get install openjdk-8-jdk
```

### Java 11
```sh
sudo apt update
sudo apt-get install openjdk-11-jdk
```

### Java 17
```sh
sudo apt update
sudo apt-get install openjdk-17-jdk
```