package com.github.taj_ny.forgeannotationconfigexample.config.typeadapter;

import com.github.taj_ny.forgeannotationconfig.Config;
import com.github.taj_ny.forgeannotationconfig.typeadapter.TypeAdapter;
import com.github.taj_ny.forgeannotationconfig.util.TypeToken;

import java.util.regex.Pattern;

public class PatternTypeAdapter extends TypeAdapter<Pattern, String> {
    public PatternTypeAdapter(Config config, TypeToken typeToken) {
        super(config, typeToken, Pattern.class, String.class);
    }

    @Override
    public Pattern toA(String s) {
        return Pattern.compile(s);
    }

    @Override
    public String toB(Pattern pattern) {
        return pattern.pattern();
    }
}
