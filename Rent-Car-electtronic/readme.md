# EV RENT CAR team project

## Intro

- 환경을 생각하는 고객을 위한 전기차 전문 렌트 서비스 입니다.
- 전기차 충전소 위치 및 주변 편의시설 정보도 한번에 제공해주는 서비스 입니다.



## Tech Stack

- **Spring boot**
- **Gradle**
- **MyBatis**
- **Fetch API**
- **jQuery**
- **mySQL**

## API

> **Booking**

- 차량예약 `POST /user/booking/create`
- 예약차량 상세조회 `GET /user/booking/detail/{carnumber}`
- 차종 검색  `GET /user/booking/search/{category}`
- 예약가능 차량 조회 `GET /user/booking/searchList/{category}`
- 전체 차량조회`GET /user/booking/list`
- 예약조회 `GET /user/booking/read/{user_id}`
- 예약 페이지 메인 `GET /user/booking/main`

>**CarInfo**

- `GET /admin/carinfo/mapupdate/{carnumber}`
- `POST /carinfo/mapupdate`
- `GET /admin/carinfo/optupdate/{carnumber}`
- `GET /admin/carinfo/optupdate/{carnumber}`
- `GET /admin/carinfo/updateFile/{carnumber}`
- `GET /admin/carinfo/updateFile/{carnumber}`
- `GET /admin/carinfo/delete/{carnumber}`
- `GET /carinfo/update`
- `POST /admin/carinfo/update/{carnumber}`
- `GET /user/carinfo/read/{carnumber}`
- `POST /carinfo/create`
- `GET /carinfo/create`
- `GET /carinfo/list`
- 

>**Kakao**

- `GET /kakao_url/{lng}/{lat}`
- `GET /facilities/{lng}/{lat}`
- `POST /facilities/create`

> **List(자유게시판)**

- `POST /user/contents/list/delete`
- `GET /user/contents/list/update`
- `POST /user/contents/list/update`
- `POST /user/contents /list/{listno}`
- `GET /user/contents/list/read`
- `GET /user/contents/list/create`
- `POST /user/contents/list/create`
- `GET /user/contents/list`

> **Log in**

- `POST /exception/user/delete`
- `GET /exception/user/delete`
- `GET /exception/admin/user/read`
- `GET /exception/admin/user/list`
- `POST /exception/user/update`
- `GET/exception/user/update`
- `GET /exception/lic`
- `GET /exception/user/pwfind`
- `GET /exception/user/idfind`
- `POST /exception/user/create`
- `POST /exception/user/createForm`
- `GET /exception/user/agree`
- `GET /exception/user/logout`
- `POST/exception/user/login`
- `GET /exception/user/login`

>**Notice**

- `GET /`
- `GET /notice/fileDown`
- `POST /admin/notice/deletefile`
- `GET /admin/notice/update`
- `POST /admin/notice/update`
- `POST /admin/notice/delete`
- `GET /admin/notice/delete`
- `GET /admin/notice/create`
- `POST /admin/notice/create`
- `GET /notice/read`
- `GET /notice/list`

> **Support**



## Service process



## ERD

![ev_rent_car_ERD](D:\Github_upload\project\Rent-Car-electtronic\img\ev_rent_car_ERD.png)
