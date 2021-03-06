package com.strategicgains.syntaxe;

import java.util.List;

import com.strategicgains.syntaxe.validator.Validator;

public class InnerOneValidator
implements Validator<InnerOne>
{
    @Override
    public void perform(InnerOne object, List<String> errors, String prefix)
    {
    	InnerOne instance = (InnerOne) object;
    	errors.add("InnerOneValidator.perform() was called: " + instance.getStringValue());
    }
}
