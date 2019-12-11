package com.np4hoola.hatchery.service.impl;

import com.np4hoola.hatchery.entity.Zone;
import com.np4hoola.hatchery.form.Behavior;
import com.np4hoola.hatchery.service.BehaviorService;
import org.springframework.stereotype.Service;

@Service
public class BehaviorServiceImpl implements BehaviorService {

    @Override
    public String makeUid(int rt, String ref) {
        //TODO 실제 UID를 만드는 로직이 필요
        return "abcdefghijklmnopqrstuvwxyz012345678901abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public Behavior getBehavior(Zone zone, int rt, String ref, String uid) {
        int type = 4885; //TODO zone, ref, uid를 토대로 성향에 대한 정의(static final) 및 가져오는 것(getBehaviorType) 구현 필요
        Behavior behavior = Behavior.builder()
                .type(type)
                .optout(false)
                .build();
        return behavior;
    }
}
