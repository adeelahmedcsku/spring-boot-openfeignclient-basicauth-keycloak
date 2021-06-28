package it.edea.eboarding.mygos.transit.presentation.openFeignClient.config;


import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfiguration {
       @Bean
       @ConditionalOnProperty(name = {
               "portassets.basicauth.username", "portassets.basicauth.password"
       })
      public BasicAuthRequestInterceptor basicAuthRequestInterceptor(@Value("${portassets.basicauth.username}") String username,
                                                                     @Value("${portassets.basicauth.password}") String password) {

        return new BasicAuthRequestInterceptor(username, password);
    }
}
