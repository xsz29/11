package com.example.gims.Entity;

import lombok.Data;

@Data
public class Resume {
    private int resume_id;
    private int stu_id;
    private String stu_name;
    private String stu_phone;
    private String stu_email;
    private String stu_address;
    private String stu_experience;
    private String stu_self_assessment;

}
