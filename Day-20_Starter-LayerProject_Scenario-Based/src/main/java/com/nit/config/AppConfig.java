package com.nit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nit.model.Actor;

@Configuration
@PropertySource("classpath:actor.properties")
public class AppConfig {
	
	@Bean(name = "actor")
	Actor actor( @Value("${actor.id}") int id,
			@Value("${actor.name}") String name,
			@Value("${actor.movies}") String movies) {
		Actor actor = new Actor();
		actor.setId(id);
		actor.setName(name);
		actor.setMovies(movies);
		return actor;
	}
}
