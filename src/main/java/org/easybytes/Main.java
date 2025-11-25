package org.easybytes;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Vehicle vehicle =  new Vehicle();
        vehicle.setName("honda city");
        System.out.println("Vehicle name from the non-spring context is = " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from the Spring context is = " + veh.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring context is = " + hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring context is = " + num);


    }
}
