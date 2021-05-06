package com.skc.multipledb;

import com.skc.multipledb.admissions.Admission;
import com.skc.multipledb.admissions.AdmissionRepository;
import com.skc.multipledb.appointments.Appointment;
import com.skc.multipledb.appointments.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class MultipledbApplication {

	@Autowired
	private AdmissionRepository admissionRepository;

	@Autowired
	private AppointmentRepository appointmentRepository;

	@PostConstruct
	public void addAppointmentsData() {
		appointmentRepository.saveAll(Stream.of(
				new Appointment(101, "Teh first appointment ever"),
				new Appointment(102, "Appointment with a Dentist"))
				.collect(Collectors.toList()));
	}
	@GetMapping("/getAppointments")
	public List<Appointment> getAppointmens(){

		return appointmentRepository.findAll();
	}

	@PostConstruct
	public void addAdmissionsData() {
		admissionRepository.saveAll(Stream.of(
				new Admission(101, "Teh first admission ever"),
				new Admission(102, "Admission with a Dentist"))
				.collect(Collectors.toList()));
	}
	@GetMapping("/getAdmissions")
	public List<Admission> getAdmission(){
		return admissionRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(MultipledbApplication.class, args);
	}

}
