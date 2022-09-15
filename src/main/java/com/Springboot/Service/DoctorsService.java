package com.Springboot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.Entity.Doctors;
import com.Springboot.Repository.DoctorsRepository;

@Service
public class DoctorsService {
@Autowired
private DoctorsRepository repository;
public Doctors saveDoctors(Doctors ed)
{
	return repository.save(ed);
}
public List<Doctors>saveDoctors(List<Doctors>eds)
{
	return repository.saveAll(eds);
}
public List<Doctors>getDoctorss()
{
	return repository.findAll();
}
public Doctors getDoctorsById(int id)
{
	return repository.findById(id).orElse(null);
}
public Doctors getDoctorsByName(String name)
{
	return repository.findByName(name);
}
public String deleteDoctors(int id)
{
	repository.deleteById(id);
	return "University is removed"+id;
}
public Doctors updateDoctors(Doctors K)
{
	Doctors es=repository.findById(K.getId()).orElse(null);
	es.setName(K.getName());
	es.setSpecialist(K.getSpecialist());
	es.setSalary(K.getSalary());
	return repository.save(es);
}
public Optional<Doctors>getDoctors()
{
	return null;
}
}
