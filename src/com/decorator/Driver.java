package com.decorator;

public class Driver {

	public static void main(String[] args) {
		IRoom room =  new Room();            
		
		System.out.println(room.displayRoom());

		IRoom decoratedRoom = new ColorDecorator(room);
		
		System.out.println(decoratedRoom.displayRoom());;
		
		decoratedRoom = new FurnitureDecorator(decoratedRoom);
		
		System.out.println(decoratedRoom.displayRoom());
		
		
		IRoom r = new ColorDecorator(new FurnitureDecorator(new Room()));
		System.out.println(r.displayRoom());
		
		
	}

}
