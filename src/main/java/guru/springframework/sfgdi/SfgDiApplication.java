package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println("------- Primary");
        System.out.println(myController.sayHello());

        System.out.println("------- Property");
        PropertyInjectedController propInjCont = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propInjCont.getGreeting());

        System.out.println("------- Setter");
        SetterInjectedController settInjCont = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(settInjCont.getGreeting());

        System.out.println("------- Constructor");
        ConstructorInjectedController constInjCont = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constInjCont.getGreeting());
    }

}
