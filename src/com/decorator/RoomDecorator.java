package com.decorator;

public abstract class RoomDecorator implements IRoom{

	private IRoom roomToBeDecorated;
	
	public RoomDecorator(IRoom roomToBeDecorated) {
		this.roomToBeDecorated = roomToBeDecorated;
	}
	
	
	public String displayRoom() {
		return roomToBeDecorated.displayRoom();
	}

}
