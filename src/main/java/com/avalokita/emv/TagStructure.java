package com.avalokita.emv;

public enum TagStructure {

	PRIMITIVE   ((byte)0b00000000),
	CONSTRUCTED ((byte)0b00100000);
	
	private final byte b;
	
	private TagStructure(byte b) { this.b = b; }
	
	public byte getByte() { return this.b; }

}
