package com.sundeep.admissionsservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sundeep.admissionsservice.models.Patient;

@RestController("/admissions")
public class AdmissionsResource {

	// A hardcoded list of patients
	List<Patient> patients = Arrays.asList(new Patient("P1", "Joseph", "Nigerian"),
			new Patient("P2", "Gabor", "Hungarian"));

	// getPatients() returns a list of patients

	@RequestMapping("/patients")
	public List<Patient> getPatients() {
		return patients;
	}
}
