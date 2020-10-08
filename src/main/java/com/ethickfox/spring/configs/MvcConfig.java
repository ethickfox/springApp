//package com.ethickfox.spring.configs;
//
//import org.springframework.boot.web.server.ConfigurableWebServerFactory;
//import org.springframework.boot.web.server.ErrorPage;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//public class MvcConfig extends WebMvcConfigurer {
//    @Override
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerCustomizer() {
//        return container ->{
//            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/"));
//        };
//    }
//}
