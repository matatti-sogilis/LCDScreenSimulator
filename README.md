# LCDScreenSimulator
LCD Screen Simulator for Bee Buzziness

## Prerequisite

- [OpenJDK](https://openjdk.java.net/) (v8+)
- [Maven](https://maven.apache.org/) (v3+)

```bash
sudo apt install openjdk-8-jdk
sudo apt install maven
```

## Build

```bash
mvn clean package
```

## Execute

```bash
java -jar target/lcd-screen-simulator-0.0.1-SNAPSHOT.jar <inputNumber>
```