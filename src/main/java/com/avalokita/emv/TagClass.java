package com.avalokita.emv;

public enum TagClass {
	
	UNIVERSAL        ((byte)0b00000000),
	APPLICATION      ((byte)0b01000000),
	CONTEXT_SPECIFIC ((byte)0b10000000),
	PRIVATE          ((byte)0b11000000);
	
	private final byte b;
	
	private TagClass(byte b) { this.b = b; }
	
	public byte getByte() { return this.b; }

}
