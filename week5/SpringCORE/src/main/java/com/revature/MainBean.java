package com.revature;

import com.revature.service.MotdServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBean {

    // no properties here EXCEPT FOR some service that this class calls upon to do some work
    private MotdServiceBean motdServiceBean;

    // Dependency injection via CONSTRUCTOR INJECTION

    public MainBean(MotdServiceBean motdServiceBean){
        this.motdServiceBean = motdServiceBean;
    }

    public static void main(String[] args) {

        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");

        MainBean mainBean = ac.getBean("MainBean", MainBean.class);

        System.out.println(mainBean.motdServiceBean.getMotd(-10));
        System.out.println(mainBean.motdServiceBean.getMotd(2));

        MotdServiceBean motdServiceBean = ac.getBean("MotdServiceBean", MotdServiceBean.class);

        System.out.println(motdServiceBean.getMotd(1));

    }



}
