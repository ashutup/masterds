package com.design.patterns;

public enum EnumSingleton {

	INSTANCE;

	private String infoString;

	private String getInfoString() {
		return infoString;
	}

	public void setInfoString(String infoString) {
		this.infoString = infoString;
	}

	EnumSingleton() {
	}

	public EnumSingleton getInstance() {
		return INSTANCE;
	}

	public int doSomeComplexProcessing() {
		// some heavy logic goes here
		return infoString.length();
	}

	public static void main(String[] args) {
		EnumSingleton.INSTANCE.getInstance().setInfoString("Hello World !!");
		System.out.println(EnumSingleton.INSTANCE.getInstance().hashCode()
				+ " "
				+ EnumSingleton.INSTANCE.getInstance().getInfoString()
				+ " "
				+ EnumSingleton.INSTANCE.getInstance()
						.doSomeComplexProcessing());

		EnumSingleton.INSTANCE.getInstance().setInfoString(
				"Another random string");
		System.out.println(EnumSingleton.INSTANCE.getInstance().hashCode()
				+ " "
				+ EnumSingleton.INSTANCE.getInstance().getInfoString()
				+ " "
				+ EnumSingleton.INSTANCE.getInstance()
						.doSomeComplexProcessing());

	}

}
