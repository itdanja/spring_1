package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.domain.post.PostEntity;
import spring.domain.post.PostRepository;
import spring.web.dto.PostDto;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor // final 상수 => 자동 정의
public class PostService {

    private final PostRepository postRepository;

    // 1. 게시물 저장
    public void postsave(PostDto postDto){
        // 인수로 들어온 dto -> entity -> save 메소드에 넣어주기
        postRepository.save( postDto.toEntity() );
    }
    // 2. 게시물 모든 출력
    public List<PostDto> postlist(){
        // 모든 entity 반환
        List<PostEntity> postEntities =  postRepository.findAll();
        // 모든 entity -> 모든 dto
        List<PostDto> postDtos = new ArrayList<>();

        for( PostEntity temp : postEntities ){

            PostDto postDto = PostDto.builder()
                    .id(temp.getId())
                    .title(temp.getTitle())
                    .contents(temp.getContents())
                    .name(temp.getName())
                    .count(temp.getCount())
                    .createDate( temp.getCreateDate())
                    .build();
            postDtos.add( postDto);
        }
        return postDtos;
    }

    // 3. 게시물 개별 출력

    // 4. 게시물 수정

    // 5. 게시물 삭제


}
