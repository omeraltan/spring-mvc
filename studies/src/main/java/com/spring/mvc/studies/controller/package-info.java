package com.spring.mvc.studies.controller;

/**
 *
 *      Controller architecture:
 *      At a very high level, the main responsibilities include:
 *      1. intercepting incoming requests
 *      2. converting the payload of the request to the internal structure
 *      3. sending the data to Model for further processing
 *      4. getting processed data from the Model, and advancing that data to the View for rendering.
 *      5. getting processed data from the Model, and advancing that data to the View for rendering
 *
 *      External -> Dispatcher Servlet -> Handler Mapping -> Controller -> Model
 *      External -> Dispatcher Servlet -> View Resolver
 *
 *      Model    -> Controller -> Dispatcher Servlet -> External
 *      Model    -> Controller -> Dispatcher Servlet -> View Resolver -> External
 */
