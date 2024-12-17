package project.domain.book.spi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import project.domain.book.model.BookType;

@Getter
@AllArgsConstructor
public class BookVO {


    private final String title;
    private final String content;
    private final String author;
    private final BookType Type;

//    @Override //Override 하는 이유 : 만약 다른 참조를 가지더라도 객체안의 필드 정보만 같으면 같은 객체로 판단하기 위해
//    public boolean equals(Object o) {
//        if (this == o) return true; // 주소까지 완전히 같은 객체(같은 참조를 가진다)라면 true
//        if (o == null || getClass() != o.getClass()) return false; // null 이거나 클래스 타입이 다르면 flase (클래스타입 확인 : getClass())
//        ReserchedBookVO that = (ReserchedBookVO) o; // Object 다운캐스팅
//        return title == that.title && content == that.content && author == that.author && id == that.id && Type == that.Type;
//    }
}
