package com.np4hoola.hatchery.service;

import com.np4hoola.hatchery.entity.Zone;
import com.np4hoola.hatchery.form.Behavior;

public interface BehaviorService {
    String makeUid(int rt, String ref);
    Behavior getBehavior(Zone zone, int rt, String ref, String uid);
}
