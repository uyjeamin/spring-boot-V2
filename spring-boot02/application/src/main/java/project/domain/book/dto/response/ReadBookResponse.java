package project.domain.book.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter //response dto 도 Getter 를 붙여줘야 클라에서 값을 반환받을 수 있음. 아니면 406 오류
public class ReadBookResponse {
    private long id;

    private String title;

    private String content;
}
