package spring.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.domain.card.CardEntity;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class CardDto {

    Long id;
    String cardname;
    String cardcompany;
    String cardlink;
    String cardpicture;
    int cardcount;

    @Builder
    public CardDto(Long id, String cardname, String cardcompany, String cardlink, String cardpicture, int cardcount) {
        this.id = id;
        this.cardname = cardname;
        this.cardcompany = cardcompany;
        this.cardlink = cardlink;
        this.cardpicture = cardpicture;
        this.cardcount = cardcount;
    }
    // Dto ----->  엔티티
    public CardEntity toEntity(){
        return CardEntity.builder()
                .cardname( cardname)
                .cardcompany( cardcompany)
                .cardlink( cardlink)
                .cardpicture( cardpicture)
                .cardcount( cardcount).build();
    }

}
