package com.ktz.oauthdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Client implements Serializable{
    @NonNull
    private Long id;
    private String clientName;
    private String clientId;
    private String clientSecret;
}
