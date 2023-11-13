package com.demo.movies.repository.specification;

import com.demo.movies.dto.MovieParamsDto;
import com.demo.movies.model.Movie;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class MovieSpecification implements Specification<Movie> {

    private final MovieParamsDto criteria;

    public MovieSpecification(MovieParamsDto movieParams) {
        this.criteria = movieParams;
    }

    @Override
    public Predicate toPredicate(Root<Movie> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        final List<Predicate> predicates = new ArrayList<>();
        query.distinct(true);

        if(criteria.isTopTenRevenue()) {
            query.orderBy(criteriaBuilder.desc(root.get("revenue")));
        }

        if(criteria.getYear() != null) {
            predicates.add(criteriaBuilder.and(criteriaBuilder.equal(root.get("year"), criteria.getYear())));
        }

        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
    }

}
