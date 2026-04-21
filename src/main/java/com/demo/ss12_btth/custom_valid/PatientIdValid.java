package com.demo.ss12_btth.custom_valid;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {PatientldValidate.class})
public @interface PatientIdValid {
    String message() default "Phải bắt đầu bằng BN-";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
