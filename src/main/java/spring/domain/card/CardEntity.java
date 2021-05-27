package spring.domain.card;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.domain.BasTime;
import spring.web.dto.CardDto;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CardEntity extends BasTime {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Long id;

    @Column
    String cardname;

    @Column
    String cardcompany;

    @Column
    String cardlink;

    @Column
    String cardpicture;

    @Column
    int cardcount;

    @Builder
    public CardEntity(Long id, String cardname, String cardcompany, String cardlink, String cardpicture, int cardcount) {
        this.id = id;
        this.cardname = cardname;
        this.cardcompany = cardcompany;
        this.cardlink = cardlink;
        this.cardpicture = cardpicture;
        this.cardcount = cardcount;
    }
    // 업데이트 메소드
    public void Cardupdate(CardDto cardDto){
        this.cardname = cardDto.getCardname();
        this.cardcompany = cardDto.getCardcompany();
        this.cardlink = cardDto.getCardlink();
        this.cardpicture = cardDto.getCardpicture();
    }
    // 조회수 메소드
    public void Cardcount( ){
        this.cardcount++;
    }








}
