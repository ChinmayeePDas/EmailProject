/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.chinmayee.emailtest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author chinmayee
 */
@SpringBootApplication
@ComponentScan("com.chinmayee.emailtest.util")
public class EmailMain {
    public static void main(String[] args) {
        System.out.println("Inside main1");
        SpringApplication.run(EmailMain.class, args);
    }
}

