package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.domain.MemberEntity;
import spring.domain.MemberRepository;
import spring.web.dto.MemberDto;

import java.util.ArrayList;
import java.util.List;

@Service // 해당 클래스는 서비스 관련된 데이터 제공
@RequiredArgsConstructor
public class MemberService {
    // 해당 엔티티를 연결 해줄 repository
    private final MemberRepository memberRepository ; // member 엔티티 연결 객체
        // final : 상수 : 고정값 => 정의
    // 회원 저장
    public Long membersave( MemberDto memberDto ){

       return memberRepository.save( memberDto.toEntity()  ).getId();
                    // sql insert ----> save( )
    }

    // 회원 출력
    public List<MemberDto> memberlist(){

        // 모든 엔티티 가져오기 . findall()
        List<MemberEntity> memberEntityList = memberRepository.findAll(); // sql select -------> 모든 레코드 호출
        //  dto 리스트 선언
        List<MemberDto> memberDtoList = new ArrayList<>();

        for( MemberEntity temp :  memberEntityList ) {
            // for(  클래스명 임시객체명 : 리스트명 )  : 리스트내 개수만큼 임시객체에 하나씩 대입

                                // for( int i = 0 ; i<memberEntityList.size ; i++ ){
                                //   MemberEntity temp = memberEntityList[i];
                                //      }
            // 엔티티 ---> dto
            MemberDto memberDto = MemberDto.builder()
                    .id( temp.getId() )
                    .memberid( temp.getMemberid() )
                    .password(temp.getPassword())
                    .name( temp.getName())
                    .email( temp.getEmail()).build();
            memberDtoList.add( memberDto);
        }
        return memberDtoList;
    }

    // 회원 로그인

    // 회원 탈퇴

    // 회원 정보


}
