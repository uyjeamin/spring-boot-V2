package project.domain.book.persistence.repository.vo;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import project.domain.book.model.BookType;
import project.domain.book.spi.vo.BookVO;

@Getter
public class QueryBookVO extends BookVO {

    @QueryProjection // 쿼리dsl 한테 이것은 dto 변환을 위한 클래스라는것을 알려줌. 그러면 필요한 데이터 변환을 수행해줌.
    public QueryBookVO(String title, String content, String author, BookType Type) {
        super(title, content, author, Type);
    }
}
