FROM maven:3.3-jdk-8 as builder
WORKDIR /usr/src/mymaven
copy . .
RUN mvn clean install

FROM jdk8
COPY --from=builder /usr/src/mymaven/target/auth-demo-0.0.1-SNAPSHOT.jar ./auth-demo.jar
RUN java -jar auth-demo.jar
