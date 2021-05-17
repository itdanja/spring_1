package spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Html 클라이언트에게 주기
    @GetMapping("/")  // 요청 rul 만들기  //   / : ip주소:port명
    public String index(){
        return "index"; // 문자열 index  ===> html 파일명
            // 타임리프 설치시 : templates 폴더에서 해당 html 파일명을 찾아서 돌려줌

    }

}
