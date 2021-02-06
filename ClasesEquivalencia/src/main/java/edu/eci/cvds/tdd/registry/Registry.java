package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (p.isAlive() && p.getAge()>=18){
            result = RegisterResult.VALID;
        }
        return result;
    }

}
