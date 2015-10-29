package com.decorator;

public class Room implements IRoom{

	@Override
	public String displayRoom() {
		return "Normal Room : ";
	}
}
