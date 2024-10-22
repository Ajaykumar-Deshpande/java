package com.xworkz.form.service;

import com.xworkz.form.dto.CollegeAdmissionDTO;
import com.xworkz.form.servlet.CollegeAdmission;

public interface CollageAdmissionService {
	
	boolean validateAndSave(CollegeAdmissionDTO collegeAddmissionDTO);

}