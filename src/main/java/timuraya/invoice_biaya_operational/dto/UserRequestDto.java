package timuraya.invoice_biaya_operational.dto;

import lombok.Data;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 05/06/22
 **/
@Data
public class UserRequestDto {
    private Long biodataId;
    private String username;
    private String password;
}
