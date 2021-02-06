package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateIsAlive() {
        Person p = new Person();
        p.setAlive(false);
        Assert.assertEquals(RegisterResult.DEAD, registry.registerVoter(p));
    }

    @Test
    public void validateIsAliveAndUnderAge(){
        Person p = new Person();
        p.setAge(17);
        Assert.assertEquals(RegisterResult.UNDERAGE, registry.registerVoter(p));
    }

    @Test
    public void validateInvalidAge(){
        Person p = new Person();
        p.setAge(-1);
        Assert.assertEquals(RegisterResult.INVALID_AGE, registry.registerVoter(p));
    } 

    @Test  
    public void validateInvalidAge2(){
        Person p = new Person();
        p.setAge(0);
        Assert.assertEquals(RegisterResult.INVALID_AGE, registry.registerVoter(p));
    } 

    @Test  
    public void validateInvalidAge3(){
        Person p = new Person();
        p.setAge(125);
        Assert.assertEquals(RegisterResult.INVALID_AGE, registry.registerVoter(p));
    } 

    @Test  
    public void validateInvalidAge4(){
        Person p = new Person();
        p.setAge(126);
        Assert.assertEquals(RegisterResult.INVALID_AGE, registry.registerVoter(p));
    } 

    @Test  
    public void validateInvalidAge5(){
        Person p = new Person();
        p.setAge(1000);
        Assert.assertEquals(RegisterResult.INVALID_AGE, registry.registerVoter(p));
    } 

    @Test
    public void validateInvalidId(){
        Person p = new Person();
        p.setId(-1);
        Assert.assertEquals(RegisterResult.INVALID_ID, registry.registerVoter(p));
    }

    @Test
    public void validateInvalidId2(){
        Person p = new Person();
        p.setId(0);
        Assert.assertEquals(RegisterResult.INVALID_ID, registry.registerVoter(p));
    }

    @Test
    public void validateInvalidId3(){
        Person p = new Person();
        p.setId(1020834179);
        Assert.assertEquals(RegisterResult.INVALID_ID, registry.registerVoter(p));
    }

    @Test
    public void validateInvalidId4(){
        Person p = new Person();
        p.setId(-1020831972);
        Assert.assertEquals(RegisterResult.INVALID_ID, registry.registerVoter(p));
    }

    @Test
    public void validateDuplicatedID(){
        Person p = new Person();
        Person p1 = new Person();
        p.setId(123);
        p1.setId(123);
        registry.registerVoter(p);
        Assert.assertEquals(RegisterResult.DUPLICATED, registry.registerVoter(p1));
    }

}