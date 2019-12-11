package com.np4hoola.hatchery.form;

import lombok.Builder;

@Builder
public class Behavior {
    private int type; //성향 타입
    private boolean optout; //광고거부여부
}
