package com.risesin.service.aritle;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.aritle.serviceImpl.SharingServiceImpl;
import com.risesin.service_api.modules.aritle.entity.Sharing;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SharingServiceImplTest extends RisesinServiceApplicationTests {


    @Autowired
    private SharingServiceImpl sharingServiceImpl;

    private Sharing sharing;

    @Before
    public void setUp() throws Exception {
        sharing = new Sharing();
    }

    @Test
    public void findAll() {
        List<Sharing> all = sharingServiceImpl.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void findSearch() {
    }

    @Test
    public void testFindSearch() {
    }

    @Test
    public void findById() {
        Sharing byId = sharingServiceImpl.findById(1L);
        Assert.assertNotNull(byId);
    }

    @Test
    public void add() {
        sharing.setCount(10L);
        sharing.setArtId(2L);
        sharing.setLink("link");
        sharing.setMethod("method");
        sharingServiceImpl.add(sharing);
    }

    @Test
    public void update() {
        sharing.setCount(10L);
        sharing.setArtId(2L);
        sharing.setLink("link");
        sharing.setMethod("method");
        sharingServiceImpl.add(sharing);
    }

    @Test
    public void deleteById() {
        sharingServiceImpl.deleteById(1L);
    }
}