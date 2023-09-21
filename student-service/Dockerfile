from openjdk
Label maintainer = "abc@gmail.com"
Expose 8082
Workdir /app
COPY target/studentservice.jar /app/studentservice.jar
ENTRYPOINT ["java","-jar","studentservice.jar"]