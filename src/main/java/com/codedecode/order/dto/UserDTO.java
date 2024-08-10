package com.codedecode.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int userId;
    // private String userName;     //Username and password are not required to place and order
    // private String userPassword;
    private String address;
    private String city;

}

// public class UserDTO {

//     private int userId;
//     private String userName;
//     private String userPassword;
//     private String address;
//     private String city;

// }