# JDBC 미니 프로젝트

### 순서

1. 주제선정
2. DB : 테이블
    
    ✅ 꼭 들어가야 하는 것
    
    DB: JOIN, TRIGGER(선택), PROCEDURE 만들어야 함
    JAVA: 스레드, 소켓(선택, 왠만하면 넣기, ex 채팅)
    
    1. 개념적 모델링: 테이블명(엔티티), 필드(속성), 관계
    2. 논리적 모델링: 조인, pk, fk, 필드명 등
    3. 물리적 모델링: forward, reverse 중 선택
    4. 역할분담 → 제출!
    5. 설계도(UI) 상의
    6. 패키지: 파일명 정함 (공통적으로 작업할 파일명!) 
3. 프로그램 작성
4. 발표 PPT
    1. skills: js, mydbc, jdbc 등 
    2.  EER 다이어그램
    3. 발표: 기능 얘기해야함(어떤 기법으로 어떻게 구현했다~)

#### <프로젝트 기준>
- user입장에서 이 웹을 사용하고 싶은가? 10점
- 디자인이 깔끔하고 보기 편한 디자인인가? 10점
- 시연을 마친후 질문 시 발표자가 막히는 부분이 있는가? 10점
- 시연할 때 프로그램이 에러없이 제대로 돌아가는가? 10점
- 웹 기능이 개발자입장에서 써보고싶은가? 10점


> 참고자료
>> [이클립스 깃허브 연동](https://ssj9902.tistory.com/entry/%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4-git-%EC%97%B0%EB%8F%99-%EB%B8%8C%EB%9E%9C%EC%B9%98-%EC%83%9D%EC%84%B1-%EC%9D%B4%EB%8F%99), [깃허브 레파지토리 연결끊기](https://xodgl2.tistory.com/16), [깃허브 연동 영상](https://youtu.be/1G-8C_RoleM?si=HFL0fJhhZI8l6tXd)

>> 윈도우 빌더: [버튼에 이미지 넣기](https://hansol94.tistory.com/33), [이벤트 넣기](https://gimmesome.tistory.com/116)


## 깃허브 사용법

main에서 내 브랜치로 가져오기

- 내 브랜치 선택 → 깃 레파지토리에서 머지 → main 선택 후 머지

<img src="/01. 활동/01-1. img/이클립스_깃허브 연동1.png">
<img src="/01. 활동/01-1. img/이클립스_깃허브 연동2.png">


### 이용할 수 있는 java기능

- 스레드로 사진 몇초에 한번 띄우기
- JTable 만들기 → java fx ui layout을 통해 테이블 형식 만들 수 있음(ui는 아직 중요한게 아님)
- 회원가입, 로그인
- DB, JDBC구현
- 이벤트 리스너

### 참고자료

[프로젝트 정리 예시](https://github.com/matrixpower1004/fastcampus-baseball) [웹페이지 기획 예시](https://yslab.kr/148) [게시판 만들기](https://lazychoi.github.io/project/2212_javaswing.html)

[슈팅게임](https://blog.naver.com/dosem321/220360191912), [오목](https://arajo.tistory.com/282), [완전게임](https://kimasill.tistory.com/entry/%EA%B2%8C%EC%9E%84%EA%B0%9C%EB%B0%9C-%EA%B2%8C%EC%9E%84-%ED%9A%8C%EC%82%AC-%ED%83%80%EC%9D%B4%EC%BF%A4GameDevTycoon)구현예, [리듬게임](https://terianp.tistory.com/80), [오셀로](https://siloam72761.tistory.com/entry/JAVA-%EC%98%A4%EC%85%80%EB%A1%9C-%EA%B2%8C%EC%9E%84-%EB%A7%8C%EB%93%A4%EA%B8%B0-%EA%B8%B0%EB%8A%A5-%EA%B5%AC%ED%98%842), [버블게임](https://jaewon2336.tistory.com/157?category=529695)

### 구현가능 목록

- 회원관리(필수!) 로그인 출석(방명록, 포인트)
- 포인트 이벤트 구매 거래
- 게시판(공지사항, 거래게시판, 스크린샷 게시판, 동영상 게시판 등…)
- 채팅, 쪽지, 메일
- 계산기
- 쇼핑몰(흔함)
- 캘린더(일정기록)
- 싸이월드형태? 일기 기록
- 게임? [바둑](https://blog.naver.com/wusemr2/222193161899) 테트리스 랭킹 상점 인벤토리 [리듬게임](https://github.com/SeJonJ/java-game-DynamicMusic)(음악재생 포함) 초성 추리 축구
- 아바타 꾸미기, 고양이 키우기, 퍼피레드…
- 회계장부, 은행 적금 기록 → 돈이 쌓일때마다 UI로 금화쌓이는 식이면 어떻까..
- 고양이가 화면에 돌아다니면 귀여울듯..
- 정보를 입력하고 out하면 보고서로 출력되는 프로그램
- 티켓팅 사이트

게임으로 한다면 [아르피아](https://m.blog.naver.com/zeimer/222862364984) 이런느낌으로 미니게임이 모여있는 식이면 어떨까..

[기능]

1. 회원
2. 미니게임(3~4종): 바둑, 오목, 테트리스. 리듬게임(방향키로?),  초성. 축구, [푸시푸시](https://www.happycampus.com/report-doc/13288946/)
3. 게임 포인트: 상점, 인벤토리
4. 랭킹
5. 채팅, 쪽지
6. 아바타: 본인 옷, 장비, 애완동물, 아바타 룸? 등
7. 게시판: 공지사항, 자유게시판, 스크린샷 게시판 등
8. 이벤트: 출석체크, 

[상세]

1. 첫 화면: 로그인(회원가입 → 필수 입력 서식)
2. 메인화면: 게임 입장 / 마이페이지 / 랭킹 / 게시판 / 전체 채팅방 / 이벤트(출석 및 출석체크 시 랜덤 포인트(10~50p) 받음)
3. 게임을 이기면 포인트를 얻는다(+10p)
4. 1시간 동안 랭킹 1위를 유지하면 포인트를 얻는다(+50p)
5. 게임은 1:1: 바둑, 오목, 테트리스, 체스 / 1인: 초성, 테트리스, 타자, 공튀기기 등
6. 게임을 하며 서로 채팅을 할 수 있다(텍스트. 아이콘도?)
7. 유저 개인 페이지가 존재하며, 아바타와 능력치, 업적(우승 기록, 순위), 소개말 등을 확인 가능하다
8. 유저 개인 페이지에서 얻은 포인트와 사용내역은 확인 가능하다
9. 상점을 통해 포인트 사용이 가능하며, 아이디 꾸미기(명패같은), 아바타 꾸미기, 개인 페이지 꾸미기 등이 가능하다

미니프로젝트(오목)

1. 회원가입, 로그인 : DB 연결
2. 오목게임: 이차원 배열 사용
3. 게임 중 채팅 : 네트워크 입출
4. 10초이내 안두면 랜덤하게 돌이 놓여지며 턴을 넘김: 쓰레드 사용
5. 공지사항 및 자유게시판 : DB연결, 글쓰기/글 수정/삭제 기능 구현
6. 스크린샷 게시판: 데이터 입출력(inputStream)

### 기타 아이디어
- 캐치마인드
- 노래재생목록(드로그 앤 드랍) 음량이 일정하게 유지
- 미로게임(미니맵 또는 이동지멱 반경만 화면에 표시되도록?
- 출석이벤트 - now() 현재시간 기준 cnt++?
- 인형뽑기
- 도트게임 구현
- 통계프로그램
- 건강관리 - 회윈가입 시 나이,몸무게,키 입력, 그에맞는 운동과 목표, 달성 정도 등 +받을수있는 복지혜택? 복지달력, 성과달력
- 여행계획 - 세부일정, 지도, 환전 등 추천 여행지, 경로존재
- 국내 행사 달력 - 추천 관광 경로, 가는법([네이버 지도](https://dlagusgh1.tistory.com/m/989) 삽입), 특산물 등
- 그날의 날씨 정보를 가져와 옷, 우산 등 추천?
- 핸드폰, 노트북 등 스펙비교
- 랜덤 점심거리 추천(주변, 지도첨부)

<img src="/01. 활동/01-1. img/아이디어 기획서 양식.png" width="300">

[프로젝트 기획서_중간.hwp](JDBC%20%E1%84%86%E1%85%B5%E1%84%82%E1%85%B5%20%E1%84%91%E1%85%B3%E1%84%85%E1%85%A9%E1%84%8C%E1%85%A6%E1%86%A8%E1%84%90%E1%85%B3%20b939ae1bb83d446bb11a7ddcffc45ddb/%25ED%2594%2584%25EB%25A1%259C%25EC%25A0%259D%25ED%258A%25B8_%25EA%25B8%25B0%25ED%259A%258D%25EC%2584%259C_%25EC%25A4%2591%25EA%25B0%2584.hwp)

## 느낀점

1. 협업을 경험해봐서 좋음(깃허브도 이용)>각자 맡은 부분이 달라 conflict문제는 많이 발생하지 않음. 규모가 커지면 이를 해결할 능력 필요.
2. 수업에서 배운 내용을 직접 사용해 봐서 좋음 > 실제 사용 시 문제가 되는 부분들도 경험해봄
3. 자바프레임으로 만들었지만 HTML, css를 이용해서도 만들어보고 싶음
4. 어려운점은 기획할때와 달리 구현이 어려운 기능도 있고 기능추가했다고 생각했는데 빠지는 부분이 있는 등 기획의 어려움을 느낌
5. DB를 데스크탑으로 해서 외부접속 불가, 컴퓨터 꺼짐 등의 문제 발생 시 대처가 어려움. 다음 플젝땐 공용저장소 사용 및 보안관리에 대비해야겠음
6. 부족한 시간에 맡은 역할을 해내려하느라 다른 팀원의 코드들을 자세히 보지 못한게 아쉬움. 추후 플젝땐 전반적인 기능구현 및 이슈에 관한 사항을 체크할 수 있도록 하고싶음
7. 여러 클래스 간의 데이터 저장(get,set) 및 사용(private, public)에 대한 정확한 이해가 안되있어 초반에 어려움을 겪음. 수업땐 대체로 하나의 클래스나 패키지 안에서 해서 여러 패키지와 클래스, 메소드를 만들어 사용해본 경험이 인상적. 덕분에 java 객체에 대한 이해를 할 수 있었음
8. 날씨, 지도 등 외부API를 사용하는 것도 해보고 싶었음. 여러 기능을 구현할 수 있는 역량상승 필요

### 느낀점 요약

| 구분 | 내용 |
| --- | --- |
| `좋은점` |깃허브를 이용한 **협업** 경험<br>배운 내용을 직접 사용해 보는 경험 |
| `아쉬운점` | 기획한 내용과 실제 구현 시 차이 발생<br>외부 접속 가능 DB 구축 미흡 |
| `향후 방전 방향` | 외부 API도 사용해보고 싶음<br>HTML, CSS 등 이용해서도 만들어보고 싶음 |
