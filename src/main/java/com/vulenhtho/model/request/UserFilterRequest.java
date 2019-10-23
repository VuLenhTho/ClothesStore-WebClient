package com.vulenhtho.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class UserFilterRequest {
    private Integer totalPages;
    private Integer currentPage;
    List<UserRequest> users;
}
