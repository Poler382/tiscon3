package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Size(max = 60)
    private String kanjiNameL;

    @NotBlank
    @Size(max = 60)
    private String kanjiNameF;


    @NotBlank
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaNameL;

    @NotBlank
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaNameF;

    @NotBlank
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetNameL;

    @NotBlank
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetNameF;



    @NotBlank
    @Size(max = 10)
    @Pattern(regexp = "\\d{4}$")
    private String dateOfBirth1;

    @NotBlank
    @Size(max = 10)
    @Pattern(regexp = "\\d{1,2}$")
    private String dateOfBirth2;

    @NotBlank
    @Size(max = 10)
    @Pattern(regexp = "\\d{1,2}$")
    private String dateOfBirth3;


    @NotBlank
    @Size(max = 6)
    private String gender;

    @NotBlank
    @Size(max = 8)
    @Pattern(regexp = "^[0-9]{3}$")
    private String zipCode1;

    @NotBlank
    @Size(max = 8)
    @Pattern(regexp = "^[0-9]{4}$")
    private String zipCode2;


    @NotBlank
    @Size(max = 40)
    private String pref21;

    @NotBlank
    @Size(max = 40)
    private String addr22;

    @NotBlank
    @Size(max = 40)
    private String addr23;


    @NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}$")
    private String homePhoneNumber1;

    @NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^[0-9]{2,4}$")
    private String homePhoneNumber2;

    @NotBlank
    @Size(max = 13)
    @Pattern(regexp = "^[0-9]{4}$")
    private String homePhoneNumber3;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090))$")
    private String mobilePhoneNumber1;

    @Size(max = 13)
    @Pattern(regexp = "^([0-9]{4})$")
    private String mobilePhoneNumber2;

    @Size(max = 13)
    @Pattern(regexp = "^([0-9]{4})?$")
    private String mobilePhoneNumber3;

    @NotBlank
    @Size(max = 255)
    @Email
    private String emailAddress1;

    @NotBlank
    @Size(max = 255)
    @Email
    private String emailAddress2;

    @NotBlank
    @Size(max = 20)
    private String spouse;

    @NotBlank
    @Size(max = 20)
    private String houseClassification;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank
    @Size(max = 120)
    private String job;

    @NotBlank
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

}
