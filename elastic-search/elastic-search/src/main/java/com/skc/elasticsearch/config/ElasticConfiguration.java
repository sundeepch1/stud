package com.skc.elasticsearch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.skc.elasticsearch.repository")
public class ElasticConfiguration {

//	@Bean
//	Node nodeBuilder() {
//		return NodeBuilder.nodeBuilder().node();;
//	}
}
