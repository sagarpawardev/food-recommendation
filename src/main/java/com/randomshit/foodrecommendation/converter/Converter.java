package com.randomshit.foodrecommendation.converter;

import java.util.List;
import java.util.stream.Collectors;

public interface Converter<S, D> {
    D convert(S source);

    default List<D> convertAll( List<S> sources ){
        return sources.stream().map(this::convert).collect(Collectors.toList());
    }
}
