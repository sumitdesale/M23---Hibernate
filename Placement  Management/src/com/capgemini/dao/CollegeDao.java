package com.capgemini.dao;

import com.capgemini.entities.College;


public interface CollegeDao 
{	
	College addCollege(College college) ;
	College updateCollege(College college);
	College searchCollege(int id);
	College deleteCollege(int id);
	

	public abstract void beginTransaction();
	public abstract void commitTransaction();


}
