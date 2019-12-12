package com.np4hoola.hatchery.service.impl;

import com.np4hoola.hatchery.entity.Zone;
import com.np4hoola.hatchery.repository.ZoneRepository;
import com.np4hoola.hatchery.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ZoneServiceImpl implements ZoneService {

    @Autowired
    private ZoneRepository zoneRepository;

    public Zone getZoneInfo(int zid) {
        Optional<Zone> maybeZone = zoneRepository.findById(zid);
        if (maybeZone.isPresent()) {
            return maybeZone.get();
        } else {
            return null;
        }
    }
}
