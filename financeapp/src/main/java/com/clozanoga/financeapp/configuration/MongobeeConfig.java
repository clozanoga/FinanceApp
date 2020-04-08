package com.clozanoga.financeapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.mongobee.Mongobee;

@Configuration
public class MongobeeConfig {

//	  @Autowired
//	  public MongobeeConfig(@Value("${spring.data.mongodb.database}") String databaseName, @Value("${spring.data.mongodb.uri}") String databaseUri,
//	      @Value("${application.property.mongobee.changelog.path}") String changeLogPath) {
//	    this.databaseName = databaseName;
//	    this.databaseUri = databaseUri;
//	    this.changeLogPath = changeLogPath;
//	  }
	
	@Bean
	public Mongobee mongobee() {
		Mongobee runner = new Mongobee("mongodb://localhost:27017/financedb");
		runner.setDbName("financedb");
		runner.setChangeLogsScanPackage("com.clozanoga.financeapp.changelogs");
		
		return runner;
	}
	
}
