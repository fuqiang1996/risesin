package com.risesin.service.aritle;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.aritle.serviceImpl.BusinessTrackingImpl;
import com.risesin.service_api.modules.aritle.entity.BusinessTrack;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class BusinessTrackingImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private BusinessTrackingImpl businessTracking;

    private BusinessTrack businessTrack;

    @Before
    public void setUp() throws Exception {
        businessTrack = new BusinessTrack();
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void add() {
        businessTrack.setAction("action");
        businessTrack.setArtId(1L);
        businessTrack.setLink("link");
        businessTrack.setTempUserIp("120.0.0.1");
        businessTrack.setUserId(2L);
        businessTracking.add(businessTrack);
    }

    @Test
    public void update() {
        businessTrack.setAction("action11111111");
        businessTrack.setArtId(1L);
        businessTrack.setLink("link11111111111111");
        businessTrack.setTempUserIp("120.0.0.2");
        businessTrack.setUserId(2L);
        businessTrack.setId(3L);
        businessTracking.add(businessTrack);
    }

    @Test
    public void deleteById() {
        businessTracking.deleteById(3L);
    }
}