package com.sai.WebFluxPlayground;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

   @Test
   public void testMono(){
      Mono<String> monoString = Mono.just("sai").log();
      monoString.subscribe(System.out::println);
   }

   @Test
   public void testMono1(){
      Mono<?> monoString = Mono.just("sai")
              .then(Mono.error(new RuntimeException("Exception")))
              .log();
      monoString.subscribe(System.out::println);
   }

   @Test
   public void testMono2(){
      Mono<?> monoString = Mono.just("sai")
              .then(Mono.error(new RuntimeException("Exception")))
              .log();
      monoString.subscribe(System.out::println, e -> System.out.println(e.getMessage()));
   }

   @Test
   public void testFlux(){
      Flux<String> stringFlux = Flux.just("Spring", "Spring Boot", "Hibernate", "Test")
              .concatWithValues("Flux")
              .log();
//      publisher
//      5 onNext calls are triggered
//      consumer via subscribe()
      stringFlux.subscribe(System.out::println);
   }

   @Test
   public void reactiveFlowTest(){
      Flux<?> stringFlux = Flux.just("Spring", "Spring Boot", "Hibernate", "Test")
              .concatWithValues("Flux")
              .concatWith(Mono.error(new RuntimeException("Exception")))
              .concatWithValues("Flow")
              .log();
      stringFlux.subscribe(System.out::println);
   }

}
