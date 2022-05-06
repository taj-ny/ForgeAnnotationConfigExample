package com.github.taj_ny.forgeannotationconfigexample.config.category;

import com.github.taj_ny.forgeannotationconfig.ConfigProperty;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Patterns {
    @ConfigProperty
    private Pattern pattern = Pattern.compile(".");

    @ConfigProperty
    private Pattern[] patternArray = {Pattern.compile("."), Pattern.compile(".")};

    @ConfigProperty
    private List<Pattern> patternList = Arrays.asList(Pattern.compile("."));
}
