package com.loosecoupling.convert.springinversioncontrol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCCouplingExample {
    public static void main(String[] args) {

        // Earlier we use to manually instantiate and passes Obj ref to UserManger class.
        // Now,instantiating 'Databaseproviders' through spring container(IOC)
        // and we were passing the bean via constructor injection.

        ApplicationContext context =
                new ClassPathXmlApplicationContext("springInversionOfContol.xml");
        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerUserData");
        System.out.println(userManagerWithDB.getUserInfo());

        // getting Bean2 from spring container
        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWebData");
        System.out.println(userManagerWithWS.getUserInfo());

       //getting Bean3 from spring container
        UserManager userManagerWithNewDB= (UserManager) context.getBean("userManagerNewData");
        System.out.println(userManagerWithNewDB.getUserInfo());

    }

}
