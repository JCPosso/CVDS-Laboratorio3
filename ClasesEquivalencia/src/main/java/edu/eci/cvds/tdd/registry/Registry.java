package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

public class Registry {

    private HashMap<Integer, Person> voters;

    public Registry(){
        voters = new HashMap<Integer, Person>();
    }

    public RegisterResult registerVoter(Person p) {
        RegisterResult result = RegisterResult.VALID;
        if(!p.isAlive())
            result = RegisterResult.DEAD;
        else if(p.getAge() <= 0 || p.getAge() >= 125)
                result = RegisterResult.INVALID_AGE;
        else if(p.getAge() < 18)
            result = RegisterResult.UNDERAGE;
        else if(p.getId() <= 0 || String.valueOf(p.getId()).length() > 9)
            result = RegisterResult.INVALID_ID;
        else if(voters.containsKey(p.getId()))
            result = RegisterResult.DUPLICATED;
        else
            voters.put(p.getId(), p);
        
        return result;
    }
}
