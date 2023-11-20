FROM java:8-jdk-alpine

COPY ./target/mail-svc-1.0.0.jar /usr/app/
COPY ./src/main/resources/ /etc/staffjoy/

WORKDIR /usr/app

RUN sh -c 'touch mail-svc-1.0.0.jar'

ENTRYPOINT ["java", "-jar", "mail-svc-1.0.0.jar"]