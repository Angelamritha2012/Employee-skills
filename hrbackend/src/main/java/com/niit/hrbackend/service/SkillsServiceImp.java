package com.niit.hrbackend.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.hrbackend.dao.SkillsDao;
import com.niit.hrbackend.model.Skills;

@Service
public class SkillsServiceImp implements SkillsService {

	@Autowired
	SkillsDao skillsDao;

	 
	public void saveOrUpdateSkills(Skills skills) {
		// TODO Auto-generated method stub
		skillsDao.saveOrUpdateSkills(skills);
	}

	 
	public Skills getSkillsByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return skillsDao.getSkillsByEmployeeId(employeeId);
	}

	 
	public ArrayList<Skills> getAllSkilsOfAllEmployees() {
		// TODO Auto-generated method stub
		return skillsDao.getAllSkilsOfAllEmployees();
	}

	 
	public void deleteSkillsOfEmployee(int skillId) {
		// TODO Auto-generated method stub
		skillsDao.deleteSkillsOfEmployee(skillId);

	}

}
