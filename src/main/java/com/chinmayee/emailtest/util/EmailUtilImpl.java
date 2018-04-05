/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinmayee.emailtest.util;

import com.chinmayee.emailtest.pojo.Employee;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cpdas
 */
@RestController
@RequestMapping(value="/email")
public class EmailUtilImpl implements EmailUtilInterface {

    @RequestMapping(value="/generateMail", method = RequestMethod.GET)
    @Override
    public String generateEmail(Employee e) {
        StringBuffer email = new StringBuffer();
        email.append(e.getFirstName()).append(".").append(e.getLastName());
        email.append("@").append(e.getDepartment()).append(".").append("oracle.com");
        System.out.println("Hello World test");
        return email.toString();
    }

    @RequestMapping("/generatePassword")
    @Override
    public String generatePassword() {
        return getRandomString();
    }
 
    private String getRandomString() {
        String CHARSTRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder randStr = new StringBuilder();
        Random rnd = new Random();
        while (randStr.length() < 12) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARSTRING.length());
            randStr.append(CHARSTRING.charAt(index));
        }
        return randStr.toString();
    }
}
