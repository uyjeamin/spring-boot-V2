package application_test;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import project.domain.book.model.Book;

public class BookTests {
    @Test
    @DisplayName("Book이 생성되는지 확인하는 테스트")
    public void testBookCreation() {
        // given
        Book book = Book.builder().title("자바의 신이되는법").author("유재민").build();

        // when, then
        Assertions.assertThat(book.getTitle()).isEqualTo("자바의 신이되는법");
        Assertions.assertThat(book.getAuthor()).isEqualTo("유재민");
    }
}
