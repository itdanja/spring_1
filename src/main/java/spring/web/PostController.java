package spring.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import spring.service.PostService;
import spring.web.dto.PostDto;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    // 1. 게시판 페이지 요청
    @GetMapping("/postlist")
    public String postlist(Model model){  // 모델 : 프론트에게 데이터 전달
        List<PostDto> postDtos = postService.postlist();
        model.addAttribute( "postDtos" , postDtos); // 모델 이름 , 모델에 넣을 변수/객체
        return "postlist";
    }
    // 2. 게시물 등록 페이지 요청
    @GetMapping("/postwrite")
    public String postwrite(){
        return "postwrite"; // 타임리프 HTML 요청
    }

    // 3. 게시물 등록 처리
    @PostMapping("/postwrite")
    public String postwrite_c( PostDto postDto ){
        postService.postsave( postDto );
        return "redirect:/postlist"; // URL 요청
    }

    // 4. 게시물 상세페이지 요청
    @GetMapping("/postview/{id}")
    public String postview(@PathVariable Long id  , Model model ) {
                           // 경로(url) 상에 변수 가져오기
        PostDto postDto = postService.postget( id );
        model.addAttribute( "postDto" , postDto);
        // 조회수 처리
        postService.countup(id);

        return "postview";

    }
    // 4. 게시물 수정 페이지 요청

    // 5. 게시물 수정 처리

    // 6. 게시물 삭제 처리



}
