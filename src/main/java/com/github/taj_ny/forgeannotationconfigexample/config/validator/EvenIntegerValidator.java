package com.github.taj_ny.forgeannotationconfigexample.config.validator;

import com.github.taj_ny.forgeannotationconfig.element.property.PropertyConfigElement;
import com.github.taj_ny.forgeannotationconfig.validator.IValidator;

public class EvenIntegerValidator implements IValidator {
    @Override
    public boolean validate(PropertyConfigElement propertyConfigElement, String value) {
        return Integer.parseInt(value) % 2 == 0;
    }
}
