FROM openjdk:8-jdk-alpine
ENV TZ=Asia/Shanghai
ENV JAVA_OPTS="-Xms256m -Xmx512m -Djava.security.egd=file:/dev/./urandom"
RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone && mkdir -p /app
WORKDIR /app
ADD target/springboot-docker-1.0.jar springboot-docker.jar
EXPOSE 8080
CMD java $JAVA_OPTS -jar springboot-docker.jar