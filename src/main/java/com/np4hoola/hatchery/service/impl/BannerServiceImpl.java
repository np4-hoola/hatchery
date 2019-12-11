package com.np4hoola.hatchery.service.impl;

import com.np4hoola.hatchery.entity.Zone;
import com.np4hoola.hatchery.form.Banner;
import com.np4hoola.hatchery.form.Behavior;
import com.np4hoola.hatchery.service.BannerService;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {

    @Override
    public Banner getBanner(Zone zone, Behavior behavior) {
        //TODO 영역과 성향데이터를 기반으로 배너를 리턴해야함
        Banner banner = Banner.builder()
                .type(1)
                .url("https://www.coupang.com")
                .imgSrc("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxxk_Dv1J5tkCgrR5ewhD0gDQ1kHMX0i3slgZJ5_4dvcXFNdgj&s")
                .width(300)
                .height(168)
                .alt("퍼훌가즈아!")
                .build();
        return banner;
    }
}
