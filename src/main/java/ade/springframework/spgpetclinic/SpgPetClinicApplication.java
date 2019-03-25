package ade.springframework.spgpetclinic;

import ade.springframework.spgpetclinic.controller.ConstructorInjection;
import ade.springframework.spgpetclinic.controller.MyController;
import ade.springframework.spgpetclinic.controller.PropertyInjectionController;
import ade.springframework.spgpetclinic.controller.SetterInjection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpgPetClinicApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjection.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjection.class).sayHello());
    }

}
