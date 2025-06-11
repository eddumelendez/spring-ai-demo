# Spring AI demo

## Prerequisites

* [Docker Desktop with Model Runner enabled](https://docs.docker.com/ai/model-runner/#enable-docker-model-runner)
* Java 21

## How to run

```bash
./mvnw spring-boot:test-run
```

`Qdrant` and `Grafana LGTM` containers will be started automatically.

## How to use

```bash
http :8080/help
```

or

```bash
http :8080/help message=="How many modules are available in Testcontainers for Java?"
```

NOTE: If the service is configured in Testcontainers Desktop, you can access to Qdrant dashboard http://localhost:6333/dashboard and Grafana Dashboard http://localhost:3000/
