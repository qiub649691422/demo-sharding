/*
 * <P> Copyright (c) 2021. LiQiubo.  版权所有 李秋波 </p>.
 *
 */

package com.demo.sharding;

import com.demo.sharding.model.Province;
import com.demo.sharding.service.ProvinceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ShardingApplication.class)
public class BroadcastTableApplicationTests {
    @Autowired
    private ProvinceService provinceService;

    @Test
    public void test() {
        Province pro = new Province();
        pro.setId(2222);
        pro.setName("上海");
        provinceService.save(pro);
    }
}
