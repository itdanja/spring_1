package spring.domain.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PostRepository extends JpaRepository<PostEntity , Long> {
                                                // 테이블명 , 기본키의 자료형

    // 제목 검색
    @Query( value = "SELECT p FROM PostEntity p where p.title Like %:search% ",
        countQuery = "SELECT COUNT(p.id) FROM PostEntity p where p.title Like %:search% ")
    Page<PostEntity> findAlltitle( String search , Pageable pageable);
    // 쿼리 ( value =  select p FROM 엔티티의클래스명 p where p.필드명 Like % :인수% " ,
    //      countQuerey = select count(p.id) FROM 엔티티의클래스명 p where p.필드명 Like % :인수% " )
        // 조건과 , 조건결과의 갯수 => pageable
    // 내용 검색
    @Query( value = "SELECT p FROM PostEntity p where p.contents Like %:search% ",
            countQuery = "SELECT COUNT(p.id) FROM PostEntity p where p.contents Like %:search% ")
    Page<PostEntity> findAllcontents( String search , Pageable pageable);


    // 작성자 검색
    @Query( value = "SELECT p FROM PostEntity p where p.name Like %:search% ",
            countQuery = "SELECT COUNT(p.id) FROM PostEntity p where p.name Like %:search% ")
    Page<PostEntity> findAllname( String search , Pageable pageable);


    // 번호 검색
    @Query( value = "SELECT p FROM PostEntity p where p.id  = :search ",
            countQuery = "SELECT COUNT(p.id) FROM PostEntity p where p.id = :search")
    Page<PostEntity> findAllid( Long search , Pageable pageable);


}
