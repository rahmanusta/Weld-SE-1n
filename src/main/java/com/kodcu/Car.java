package com.kodcu;

import javax.enterprise.inject.Default;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 3/22/13
 * Time: 5:31 PM
 * To change this template use File | Settings | File Templates.
 */
@Default // Optional
public class Car implements Vehicle {

    public String work() {
        return "Car is working in "+ sayVelocity()+" kmh.";
    }

    public int sayVelocity(){

        return ThreadLocalRandom.current().nextInt(20, 240) ;
    }

}
