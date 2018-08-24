package com.cg.service;

import java.util.List;

import com.cg.beans.Trainee;

public interface TraineeService {

	public Trainee addDetails(Trainee trainee);
	public Trainee getDetails(int traineeId);
	public List<Trainee> getAllDetails();
	public Trainee delete(int traineeId);
	public Trainee modify(Trainee trainee);
}
