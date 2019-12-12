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
    public Behavior getBehavior(Zone zone, int rt, String ref, String uid, boolean newbie) {
        //TODO newbie인 경우 기본값(무성향)으로 리턴하도록 로직 추가 필요
        //TODO zone, ref, uid를 토대로 성향에 대한 정의(static final) 및 가져오는 것(getBehaviorType) 구현 필요
        int type = 4885; //로직 없으니 그냥 하정우 성향
        Behavior behavior = Behavior.builder()
                .type(type)
                .optout(false)
                .build();
        return behavior;
    }
}
