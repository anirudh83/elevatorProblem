package com.anirudh.practice.java;

import java.util.concurrent.PriorityBlockingQueue;


/**
 * 
 * @author anirudh
 *
 */
public class Elevator {
	
	private int currentFloor;
	private Direction direction;
	private PriorityBlockingQueue<ServiceRequest> requests;
	
	public Elevator() {
		currentFloor = 0;
		direction = Direction.UP;
		requests = new PriorityBlockingQueue<ServiceRequest>();
	}
	
	public void acceptRequests(ServiceRequest request){
		requests.add(request);
	}
	
	private void prioritizeRequest(){
		for (ServiceRequest request : requests) {
			request.getCurrentFloor();
			request.getDestinationFloor();
			
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public Direction getDirection() {
		return direction;
	}
	
}
