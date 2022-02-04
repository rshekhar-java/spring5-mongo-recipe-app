package com.rs.springframework.domain;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * created by rs 2/2/2022.
 */
@Getter
@Setter
public class Category {
    private String id;
    private String description;
    private Set<Recipe> recipes;
}
