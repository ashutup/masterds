package com.decorator;

public class FurnitureDecorator extends RoomDecorator{

	public FurnitureDecorator(IRoom roomToBeDecorated) {
		super(roomToBeDecorated);
	}
	
	public String displayRoom(){
		return super.displayRoom() + addFurniture();
	}
	
	
	public String addFurniture(){
		return "['SOFA','DINING TABLE']";
	}

}
