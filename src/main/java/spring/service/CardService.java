package spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.domain.card.CardEntity;
import spring.domain.card.CardRepository;
import spring.web.dto.CardDto;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;

    // 카드 등록
    public void cardsave(CardDto cardDto){
       cardRepository.save( cardDto.toEntity() );
    }

    // 카드 모든 출력
    public List<CardDto> cardDtoList(){

        List<CardEntity> cardEntities = cardRepository.findAll();
        List<CardDto> cardDtoList = new ArrayList<>();

        for( CardEntity entity : cardEntities ){
            CardDto cardDto = CardDto.builder()
                    .id(entity.getId())
                    .cardname(entity.getCardname())
                    .cardcompany(entity.getCardcompany())
                    .cardpicture( entity.getCardpicture())
                    .cardcount( entity.getCardcount()).build();
            cardDtoList.add( cardDto );
        }
        return cardDtoList;
    }

    // 카드 조건 출력

    // 카드 수정

    // 카드 삭제
}
