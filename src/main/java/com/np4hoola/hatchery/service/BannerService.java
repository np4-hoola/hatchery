package com.np4hoola.hatchery.service;

import com.np4hoola.hatchery.entity.Zone;
import com.np4hoola.hatchery.form.Banner;
import com.np4hoola.hatchery.form.Behavior;

public interface BannerService {
    Banner getBanner(Zone zone, Behavior behavior);
}
