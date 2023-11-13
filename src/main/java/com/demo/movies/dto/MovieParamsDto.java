package com.demo.movies.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieParamsDto {

    private Integer page;

    private boolean topTenRevenue;

    private Integer year;
}
