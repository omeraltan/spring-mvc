package com.spring.mvc.studies.tutorial;

/**
 *
 *      Spring implements MVC with the front controller pattern using its "DispatcherServlet".
 *      In a nutshell,
 *      the DispatcherServlet acts as the main controller to route requests to their intended destination.
 *      Model is nothing but the data of our application,
 *      View  is represented by any of the various template engines.
 *
 *      @EnableWebMvc :
 *      To enable Spring MVC support through a Java configuration class, we just add the "@EnableWebMvc" annotation.
 *      This will set up the basic support we need for an MVC project, such as
 *      1.  registering controllers
 *      2.  mappings
 *      3.  type converters
 *      4.  validation support
 *      5.  message converters
 *      6.  exception handling
 *
 *      If we want to customize this configuration, we need to implement the "WebMvcConfigurer"
 *
 *      @SpringBootApplication          :   This annotation adds the following other annotations:
 *          @Configuration              :   marks the class as a source of bean definitions.
 *          @EnableAutoConfiguration    :   tells the framework to add beans based on the dependencies on the classpath automatically.
 *          @ComponentScan              :   scans for other configurations and beans in the same package as the Application class or below.
 *
 */
