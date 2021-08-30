package com.revature.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    This is our first spring bean. It will supply messages of the day upon request
 */
public class MotdServiceBean {
    protected List<String> motds = new ArrayList<>();

    // we don't need to instantiate or assign this. Spring will do it for us via SETTER INJECTION
    protected int defaultMotdIndex;

    public String getMotd(int index){

        if(index < 0 || index >= motds.size()){
            return motds.get(defaultMotdIndex);
        }
        return motds.get(index);
    }

    // When this bean is instantiated, this method is triggered/invoked
    protected void initMotds(){
        motds.addAll(Arrays.asList("Good Morning",
                "It seems impossible until it's done",
                "You always pass failure on your way to success",
                "Positive anything is better than negative nothing",
                "The first step of the journey is always the most difficult"));

    }

    // invoke this method during instantiation
    public void setDefaultMotdIndex(int defaultMotdIndex) {
        this.defaultMotdIndex = defaultMotdIndex;
    }
}
