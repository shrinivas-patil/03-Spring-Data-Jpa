package com.BusStop;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.BusStop.entity.Bus;
import com.BusStop.entity.Stop;
import com.BusStop.repository.BusRepository;
import com.BusStop.repository.StopRepository;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	private BusRepository busRepo;

	@Autowired
	private StopRepository stopRepo;

	@Test
    public void createBusWithStops() {
        Stop s1 = new Stop();
        s1.setStopName("Majestic");

        Stop s2 = new Stop();
        s2.setStopName("BTM Layout");

        Stop s3 = new Stop();
        s3.setStopName("Electronic City");

        stopRepo.saveAll(Arrays.asList(s1, s2, s3));

        Bus b1 = new Bus();
        b1.setBusName("Bus 101");
        b1.setStops(Arrays.asList(s1, s2));

        Bus b2 = new Bus();
        b2.setBusName("Bus 202");
        b2.setStops(Arrays.asList(s2, s3));

        busRepo.saveAll(Arrays.asList(b1, b2));
    }
}
