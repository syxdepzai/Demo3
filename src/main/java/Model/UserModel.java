package Model;

import lombok.Data;


@Data
public class UserModel {

   
    private String username;

  
    private String password;

    private String role;  // Ví dụ, có thể là "USER" hoặc "ADMIN"
}
