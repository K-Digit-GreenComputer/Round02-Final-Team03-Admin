package shop.readmecorp.adminserverreadme.modules.book.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.readmecorp.adminserverreadme.modules.book.dto.BookDTO;
import shop.readmecorp.adminserverreadme.modules.user.dto.UserDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkUpdateRequest {

    private UserDTO user;

    private BookDTO book;

    private String pageNum;

    private String status;

}