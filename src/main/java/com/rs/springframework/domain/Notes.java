package com.rs.springframework.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * created by rs 2/2/2022.
 */
@Getter
@Setter
public class Notes {

    private String id;
    private Recipe recipe;
    private String recipeNotes;

}
