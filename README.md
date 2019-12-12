[![codecov](https://codecov.io/gh/np4-hoola/hatchery/branch/master/graph/badge.svg)](https://codecov.io/gh/np4-hoola/hatchery)

## Synopsis

* hatchery 는 지면에서 온 Request를 받아 적절한 광고를 내보내기까지 전체 Production의 Controller 역할을 수행하는 서비스이다
* Rest API를 제공한다
* OpenJDK8, Springboot, Gradle

## Requirement
* 회사에서 버는 돈과 별개로 추가 수입을 벌어줄 광고 시스템을 구축한다

## Usage
* API
    1. GET > ad/banner : 지면에서 온 Request를 받아 배너를 리턴
        - zid (int / Required / 지면아이디)
        - rt (int / Required / RequestTime) 
        - ref (String / required / Referral URL)
        - uid (String / Not required / 사용자UID)

* Example
    - Request : GET ad/banner?zid=1&rt=1234567890&ref=https://www.daum.net&uid=abcdefghijklmnopqrstuvwxyz012345678901abcdefghijklmnopqrstuvwxyz
    - Response
        ~~~json
        {
            "어쩌고": [
               "저쩌고",
               "지화자"
            ]
        }
        ~~~
        
## Git branch model
* 개발시에는 Repository를 fork하여 사용한다
* 초기 개발시에는 master에서 개발하는 예외를 둔다 (fork master to origin master)
* 종단에는 https://nvie.com/posts/a-successful-git-branching-model/ 모델을 약간 변형하여 사용한다
* Long term 브랜치는 master, develop만 운영한다 (release 브랜치는 사용하지 않고 deploy시 tag를 통해 배포)

## with Docker
* 개발 시점에는 SpringBoot 내장 톰캣으로 구동한다
