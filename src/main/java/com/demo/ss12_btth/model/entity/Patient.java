package com.demo.ss12_btth.model.entity;

import com.demo.ss12_btth.custom_valid.PatientIdValid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Scanner;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @PatientIdValid
    private String id;

    @NotBlank(message = "Họ tên không được để trống")
    @Size(min = 5, max = 50, message = "Họ tên từ 5-50 ký tự")
    private String fullName;

    @NotNull(message = "Ngày sinh không được để trống")
    @Past(message = "Ngày sinh phải là ngày trong quá khứ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @Pattern(regexp = "^0\\d{9}$", message = "Số điện thoại phải đúng 10 số và bắt đầu bằng 0")
    private String phone;

    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;

    @NotBlank(message = "Triệu chứng không được để trống")
    private String symptoms;

    @NotNull(message = "Ngày nhập viện không được để trống")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date admissionDate;
}
