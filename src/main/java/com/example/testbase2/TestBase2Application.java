package com.example.testbase2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestBase2Application {

    public static void main(String[] args) {
        SpringApplication.run(TestBase2Application.class, args);

        System.out.println("Код ветки С");
    }

    //Новый метод ветки A
    public void metodA(){
        System.out.println("A");
    }

    //Новый метод ветки B
    public void metodB(){
        System.out.println("B");
    }

}
