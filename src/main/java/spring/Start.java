package spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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








}
