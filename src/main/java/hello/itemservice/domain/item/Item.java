package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Item {

  // @NotNull(groups = UpdateCheck.class) //수정 요구사항 추가
    private Long id;

  //@NotBlank(groups = {SaveCheck.class, UpdateCheck.class}) // 빈 값, 공백만 있는 경우를 허용하지 않는다.
    private String itemName;

    //@NotNull(groups = {SaveCheck.class, UpdateCheck.class}) //null을 허용하지 않는다.
    //@Range(min = 1000, max = 1000000, groups = {SaveCheck.class, UpdateCheck.class})
    private Integer price;

    //@NotNull(groups = {SaveCheck.class, UpdateCheck.class})
   // @Max(value = 9999, groups = {SaveCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
