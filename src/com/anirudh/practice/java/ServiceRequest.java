package com.anirudh.practice.java;

/**
 * 
 * @author anirudh
 *
 */
public class ServiceRequest {
	
	private int currentFloor;
	private int destinationFloor;
	
	public ServiceRequest(int currentFloor,int destinationFloor) {
		this.currentFloor=currentFloor;
		this.destinationFloor=destinationFloor;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getDestinationFloor() {
		return destinationFloor;
	}

}
