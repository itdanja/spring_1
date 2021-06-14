package spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // Jpa 연결 확인
@SpringBootApplication // @ 어노테이션 주입  : 해당클래스에게 스프링부트 프로그램 제공
public class Start {
    public static void main(String[] args) {
        SpringApplication.run( Start.class  , args );
                            // 현재 클래스명.class , 메인 배열명
    }
//    이클립스 : java 에디터 	무료
//    인텔리제이 : java 에디터 	java만 무료 / 나머지 유료
//
//	1. 인텔리제이 Community [ 무료 ]
//            2. 다운로드
//
//	3. 그레이들 프로젝트
//		1. 그레이들 : 빌드 자동화 시스템

//	4. 프레임워크[미리 작성된코드]  vs  라이브러리[미리 작성된코드] vs API
//		[ 제품들의 틀 ]		[ 제품들 만들기 위한 도구 ]	[인터페이스]
//
//   5. spring    [ 스프링 프레임워크 ]
//
//   6. springboot
//		1. 톰캣 지원 [ 서버 ]  기본 port : 8080  -->
//      2. 라이브러리 간소화
//		3. 의존성 최신화
//
//	7. dependency : 의존성 [ 프로젝트로 라이브러리 가져오기 ]
//	8. @ : 어노테이션   vs  상속
//    어노테이션 : 미리 만들어진 프로그램을 주입해서 빠른 코딩
//	9. 그레이들 빌드 방법 :  1. spring.io    2.직접 작성   3. 유료버전
    
    ///  프로젝트 구조 ////
//    MVC모델 : 모델[java]-뷰[프론트]-컨트롤러[java]
//    // 대규모 프로젝트 : 유지보수 효율성
//    // 프론트가 변경 되도라도 java 실행
//    // 협업
//
//    DTO : 여러개 변수를 묶어서 이동하기 위한 객체
//
//
//    클라이언트 <----DTO---> controller <------DTO------> Service <-----DTO-------> Repository  <------DOMAIN-------> DB
//			*제어			*java로직			* DB인터페이스
//    페이지요청/응답		   서비스

//  10. 실행시 get , bulider 등 롬북에서 오류 발생시
//      - 터미널에  그레이들 버전 내리기
        // gradlew wrapper --gradle-version 4.10.2





    //  라이브러리
////        1.//  스프링부트 웹 라이브러리 가져오기 =>  관련된 @ 제공 받을수 있다
////        compile('org.springframework.boot:spring-boot-starter-web')
//                1. @SpringBootApplication :  스프링부트 관련 어노테이션
//                2. @GetMapping :
//                3. @PostMapping :
//
////        2.// 타임리프 : java <----->  프론트엔드 연결
////        compile('org.springframework.boot:spring-boot-starter-thymeleaf')
//                // 태그 안에서 사용
//              // 1. <html xmlns:th="http://www.thymeleaf.org" lang="en"> 해당 html 타임리프 사용
                // 2. html에 특정 html 포함시키기
                        // 포함할 html 태그에 이름 부여  : header
//                        <body th:fragment="header">
//
//                        // 포함할 위치 에 fragment 이름 불러오기  : index
//                        <div th:replace="/header :: header"></div>
                // 3. th 문법
                        // 0. ${변수명}
                        // 0. @{URL}
                        // 1. th:text   <>text:값<>
                        // 2. th:value  < value:값 >
                        // 3. th:if     조건문
                        // 4. th:each   반복문
                        // 5. ${session} : 해당 세션 호출

////        3.// JPA : 관계형 데이터베이스 사용
////        compile('org.springframework.boot:spring-boot-starter-data-jpa')
//                1. @Entity // DB 테이블 관계
//                    1. @Id // javax // 기본키
//                    2. @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto
//                    3. @Column // 필드 속성

//                2. db 생성시간 , 수정시간 자동주입
//                        1. @EnableJpaAuditing
//                        2. @CreatedDate Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.
//                        3. @LastModifiedDate 조회한 Entity의 값을 변경할 때 시간이 자동 저장됩니다.
//                        4. @MappedSuperclass
//                        5. @EntityListeners(AuditingEntityListener.class)
    
//                2. 인터페이스 생성
//                    1.  interface MemberRepository extends JpaRepository<엔티티명 , 엔티티 기본키의 자료형>
//                3. sql 메소드
//                    1. Repository.save : 저장
//                    2. Repository.findAll() : 모든 레코드 출력

//                4. @Transactional // 트랜잭션
//                    트랜잭션 성질
//                    1. 일관성 [ 일관성 있는 DB 상태 유지 ]
//                    2. 원자성 [ 실행하는 작업중을 하나로 간주 ] // 모두 성공 혹은 실패
//                    3. 격리성 [ 다른 트랜잭션 영향X ]
//                    4. 지속성 [ 작업 성공했을때 항상 저장 ]

////        4.// H2 : 관계형 데이터베이스 관리 시스템 = mysql워크벤치 역활
////        compile('com.h2database:h2')
//
////        5.// 롬복 : 생성자 , get , set , 필드 등
////        compile('org.projectlombok:lombok')
//                1. @Getter
//                2. @Setter
//                3. @Builder
//                4. @NoArgsConstructor
//                5. @RequiredArgsConstructor

//
//    *API : 게시판, 회원 , 제품 , 댓글
//    // 이동되는 필드[변수] 많을경우
//    DTO : 여러개 이동되는 필드를 묶음처리  Data Transfer Object
//    entity : DB 테이블 맵핑[연결]
//            ------------------------- MVC 모델 -------------------------------
//            1. 프론트[ 클라이언트 : html ]
//    입력
//	2. controller [ 제어 ]
//    프론트 <----> service  연결
//	3. service [ 로직 ]
//    CRUD 등
//	4. Repository
//    DB 연결 인터페이스
//	5. DB
//------------------------ 1. 엔티티 설계 --------------------------
//            1.Replyentity : 클래스 설계
//		1. 댓글번호 : 식별용 => id [ 기본키 , 자동번호 ]
//            2. 댓글내용 : replycontents => String
//		3. 댓글작성자 : replyname => String
//		4. 게시판번호 : postid => Long
//		5. 작성일/수정일 => BaseTime 상속받기
//	2. Repository : 인터페이스
//-----------------------2. service <-----> controller   -------------------
//            1.
//




}
