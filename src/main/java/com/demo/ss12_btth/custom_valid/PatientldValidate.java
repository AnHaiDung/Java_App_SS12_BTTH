package com.demo.ss12_btth.custom_valid;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Scanner;

public class PatientldValidate implements ConstraintValidator<PatientIdValid, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.startsWith("BN-");
    }
}
