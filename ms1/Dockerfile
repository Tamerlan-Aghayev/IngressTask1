FROM alpine:3.18.3
RUN apk add --no-cache openjdk17
RUN apk add --no-cache tzdata
COPY build/libs/ms1-1.0..jar /app/
COPY gradle.properties /app/gradle.properties
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/ms1-1.0..jar"]
