/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinmayee.emailtest.util;

import com.chinmayee.emailtest.pojo.Employee;

public interface EmailUtilInterface {
    public String generateEmail(Employee e);
    public String generatePassword();
    
}
