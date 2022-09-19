package com.capgemini.services;

import com.capgemini.entities.Placement;

public interface PlacementService 
{
	public abstract Placement addPlacement(Placement placement);
	public abstract Placement updatePlacement(Placement placement);
	public abstract Placement searchPlacement(int id);
	public abstract boolean cancelPlacement(int id);

}
