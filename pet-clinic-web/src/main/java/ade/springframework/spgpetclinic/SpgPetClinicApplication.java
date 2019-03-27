package ade.springframework.spgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpgPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ade.springframework.spgpetclinic.SpgPetClinicApplication.class, args);
      //  MyController controller = (MyController) ctx.getBean("myController");
//        controller.hello();
//        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjection.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjection.class).sayHello());
    }

}
