/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinmayee.emailtest.util;

import com.chinmayee.emailtest.pojo.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author chinmayee
 */
public class EmailutilImplTest {
    Employee emp = new Employee();
    EmailUtilImpl obj = new EmailUtilImpl();
    
    @Before
    public void init(){
        emp.setFirstName("Chinmayee");
        emp.setLastName("Das");
        emp.setDepartment("Fusion");
    }
    
    @Test
    public void testGenerateEmail() {
        Assert.assertEquals("Chinmayee.Das@Fusion.oracle.com", obj.generateEmail(emp));
    }
    
    @Test
    public void testGeneratePassword() {
        Assert.assertEquals(12, obj.generatePassword().length());
    }
}
