package spring.domain.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity , Long> {
                                                // 테이블명 , 기본키의 자료형

    // 확인
    @Query( value = "SELECT * FROM post WHERE title = ?1", nativeQuery = true )
    Page<PostEntity> findAllsearch( String title , Pageable pageable);


}
