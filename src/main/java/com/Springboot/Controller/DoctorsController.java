package com.Springboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.Entity.Doctors;
import com.Springboot.Service.DoctorsService;

@RestController
public class DoctorsController {
	@Autowired
	private DoctorsService Service;
	
	@PostMapping("/doctor")
	public Doctors addDoctors(@RequestBody Doctors K)
	{
		return Service.saveDoctors(K);
	}
	@PostMapping("/doctors")
	public List<Doctors>addElectronics(@RequestBody List <Doctors> m)
	{
		return Service.saveDoctors(m);
	}
	@GetMapping("/Doctors")
	public Optional<Doctors> findAllDoctors()
	{
		return Service.getDoctors();
	}
	@GetMapping("/Doctors/{id}")
	public Doctors findDoctorsById(@PathVariable Integer id)
	{
		return Service.getDoctorsById(id);
	}
	@GetMapping("/Doctors/{name}")
	public Doctors findDoctorsByName(@PathVariable String name)
	{
		return Service.getDoctorsByName(name);
	}
	@PostMapping("/update")
	public Doctors updateDoctors(@RequestBody Doctors K)
	{
		return Service.saveDoctors(K);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDoctors(@PathVariable int id)
	{
		return Service.deleteDoctors(id);
	}
}
