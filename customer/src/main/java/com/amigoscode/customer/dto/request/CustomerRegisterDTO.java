package com.amigoscode.customer.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerRegisterDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6831058410381684454L;

    private String firstName;
    private String lastName;
    private String email;

}
