package com.decorator;

public class ColorDecorator extends RoomDecorator {

	public ColorDecorator(IRoom roomToBeDecorated) {
		super(roomToBeDecorated);
	}

	public String displayRoom() {
		return super.displayRoom() + addColors();
	}

	private String addColors() {
		return "  Blue Color";
	}

}
