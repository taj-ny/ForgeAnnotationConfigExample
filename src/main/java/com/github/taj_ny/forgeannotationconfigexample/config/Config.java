package com.github.taj_ny.forgeannotationconfigexample.config;

import com.github.taj_ny.forgeannotationconfig.ConfigCategory;
import com.github.taj_ny.forgeannotationconfig.ConfigProperty;
import com.github.taj_ny.forgeannotationconfigexample.config.category.Patterns;
import com.github.taj_ny.forgeannotationconfigexample.config.typeadapter.PatternTypeAdapter;
import com.github.taj_ny.forgeannotationconfigexample.config.validator.EvenIntegerValidator;
import com.github.taj_ny.forgeannotationconfigexample.config.validator.PatternValidator;

import java.io.File;
import java.util.regex.Pattern;

// The default main category name is "general" without a comment. You don't need to specify this annotation.
@ConfigCategory(name = "general", comment = "The main category.")
public class Config extends com.github.taj_ny.forgeannotationconfig.Config {
    @ConfigProperty(showInGui = false)
    private int configVersion = 1;


    @ConfigProperty(name = "boolean")
    private boolean bool = false;

    @ConfigProperty(name = "int")
    private int integer = 4;

    @ConfigProperty(validator = EvenIntegerValidator.class)
    private int evenInt = 6;

    @ConfigProperty(name = "double")
    private double double_ = 0.5812;

    // This language key is specified in src/main/resources/assets/forgeannotationconfigexample/lang/en_US.lang
    @ConfigProperty(languageKey = "category.forgeannotationconfigexample.string")
    private String string = "A string.";

    @ConfigCategory(name = "Patterns", comment = "A category with patterns.")
    private Patterns patterns = new Patterns();


    public Config(File configFile) {
        super(configFile);
        // Register type adapters and validators.
        registerTypeAdapter(Pattern.class, PatternTypeAdapter.class);
        registerValidator(Pattern.class, new PatternValidator());
        // Initialize properties. Adapters and validators cannot be registered beyond this point.
        initialize();
        // Load values from the configuration file.
        load();
    }
}
