package com.kodcu;

import javax.inject.Inject;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created with IntelliJ IDEA. User: usta Date: 3/22/13 Time: 5:33 PM To change
 * this template use File | Settings | File Templates.
 */
public class Gallery {

    @Inject   // Injection point
    private Vehicle vehicle;

    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();
        Gallery gallery = weldContainer.instance().select(Gallery.class).get();
        
        String message= gallery.vehicle.work();
        System.out.println("> "+message);
    }
}
