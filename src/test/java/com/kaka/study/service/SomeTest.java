package com.kaka.study.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @Auther: kaka
 * @Date: 2019/1/2 16:25
 * @Description:
 */
public class SomeTest {



    @Test
    public void testMockito(){
        Integer a = 1;
        Mockito.anyLong();
        Assertions.assertThat(a).isEqualTo(1);
    }
}
