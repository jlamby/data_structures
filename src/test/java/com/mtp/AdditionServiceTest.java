package com.mtp;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jlamby
 *
 */
public class AdditionServiceTest {

    private AdditionService service;

    @Before
    public void before() {
        service = new AdditionService();
    }

    @Test
    public void one_plus_two_should_give_three() throws Exception {
        assertThat(service.sum(1,2), CoreMatchers.is(3));
    }

}
