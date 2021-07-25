# Application Monitoring using Prometheus and Grafana Dashboard

## Requirements

- Maven
- JDK 8+
- Docker Runtime

## Start-up the Spring Boot App

`mvn spring-boot:run`

## Start Prometheus Server

`docker run -d --name=prometheus -p 9090:9090 -v <insert-directory-location>\prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml`

Verify prometheus is up from browser at `http:localhost:9090`

## Start Grafana 

`docker run -d -p 3000:3000 grafana/grafana`

Verify grafana is up from browser at `http:localhost:3000`

## JVM Statistics Dashboard in Grafana
![JVM Statistics](https://github.com/hemrajanilavesh/actuator-prometheus-grafana-dashboard/blob/main/jvm-dashboard-1.PNG)

![JVM Statistics](https://github.com/hemrajanilavesh/actuator-prometheus-grafana-dashboard/blob/main/jvm-dashboard-2.PNG)

## References
- [App Monitoring using Spring Boot Actuator](https://levelup.gitconnected.com/application-monitoring-using-spring-boot-actuators-part-1-dab8576f4db6)
- [JWORKS TECH BLOG](https://ordina-jworks.github.io/monitoring/2020/11/16/monitoring-spring-prometheus-grafana.html)
