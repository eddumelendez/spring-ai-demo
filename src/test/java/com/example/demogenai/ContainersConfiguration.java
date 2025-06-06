package com.example.demogenai;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.qdrant.QdrantContainer;

@TestConfiguration(proxyBeanMethods = false)
public class ContainersConfiguration {

	@Bean
	@ServiceConnection
	@RestartScope
	QdrantContainer qdrant() {
		return new QdrantContainer("qdrant/qdrant:v1.9.0");
	}

}