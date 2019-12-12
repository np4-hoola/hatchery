package com.np4hoola.hatchery.rest;

import com.np4hoola.hatchery.entity.Zone;
import com.np4hoola.hatchery.form.Banner;
import com.np4hoola.hatchery.form.Behavior;
import com.np4hoola.hatchery.service.BannerService;
import com.np4hoola.hatchery.service.BehaviorService;
import com.np4hoola.hatchery.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ad")
public class AdRequest {

    @Autowired
    BehaviorService behaviorService;

    @Autowired
    ZoneService zoneService;

    @Autowired
    BannerService bannerService;

    @GetMapping(value = "/banner", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> render(@RequestParam(required = true) int zid,
                                         @RequestParam(required = true) int rt,
                                         @RequestParam(required = true) String ref,
                                         @RequestParam(required = false) String uid) throws Exception {
        Zone zone = zoneService.getZoneInfo(zid);

        if (ObjectUtils.isEmpty(zone)) {
            //TODO 영역의 정보가 없는 경우 처리
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        boolean newbie = false;
        if (StringUtils.isEmpty(uid)) {
            uid = behaviorService.makeUid(rt, ref);
            newbie = true;
        }
        Behavior behavior = behaviorService.getBehavior(zone, rt, ref, uid, newbie);
        Banner banner = bannerService.getBanner(zone, behavior);

        return new ResponseEntity<Object>(banner, HttpStatus.OK);
    }
}
