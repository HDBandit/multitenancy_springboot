package com.hdbandit.multi_tenant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// we have to exclude the default configuration, because we want to provide 
// our multi tenant data source configuration.
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class App {

   public static void main(String[] args) {
       SpringApplication.run(App.class, args);
   }

}
