package com.github.taj_ny.forgeannotationconfigexample.config.validator;

import com.github.taj_ny.forgeannotationconfig.element.property.PropertyConfigElement;
import com.github.taj_ny.forgeannotationconfig.validator.IValidator;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternValidator implements IValidator {
    @Override
    public boolean validate(PropertyConfigElement propertyConfigElement, String s) {
        try {
            Pattern.compile(s);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
