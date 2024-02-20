FROM alpine:3.18.3
RUN apk add --no-cache openjdk17
RUN apk add --no-cache tzdata
COPY build/libs/ms2-1.0.560fd7d.jar /app/
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-jar", "/app/ms2-1.0.560fd7d.jar"]
