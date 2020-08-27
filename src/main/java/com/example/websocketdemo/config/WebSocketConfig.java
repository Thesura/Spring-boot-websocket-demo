package com.example.websocketdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer{

     public void registerStopmEndpoints(StompEndpointRegistry registry){
         registry.addEndpoint("/ws").withSockJS();
     }

     public void configureMessageBroker(MessageBrokerRegistry registry){
         registry.setApplicationDestnationPrefixes("/app");
         registry.enableSimpleBroker("/topic");
     }
}