package com.np4hoola.hatchery.form;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Banner {
    private int type; //배너 타입
    private String url; //랜딩 URL
    private String imgSrc; //이미지URL
    private int width; //넓이
    private int height; //높이
    private String alt; //이미지설명
}
