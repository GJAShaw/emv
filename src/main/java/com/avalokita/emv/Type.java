package com.avalokita.emv;

public enum Type {
	
	ACQUIRER_IDENTIFIER              ("9F01", Source.TERMINAL, Format.NUMERIC, 6),
	ADDITIONAL_TERMINAL_CAPABILITIES ("9F40", Source.TERMINAL, Format.BINARY , 5),
	AMOUNT_AUTHORISED_BINARY         ("81"  , Source.TERMINAL, Format.BINARY , 4),
	AMOUNT_AUTHORISED_NUMERIC        ("9FC2", Source.TERMINAL, Format.NUMERIC, 6),
	AMOUNT_OTHER_BINARY              ("9F04", Source.TERMINAL, Format.BINARY , 4),
	AMOUNT_OTHER_NUMERIC             ("9F03", Source.TERMINAL, Format.NUMERIC, 6),
	AMOUNT_REFERENCE_CURRENCY        ("9F3A", Source.TERMINAL, Format.BINARY , 4),
	APPLICATION_CRYPTOGRAM           ("9F26", Source.ICC     , Format.BINARY , 8),
	// ... and the rest, up to...
	UNPREDICTABLE_NUMBER             ("9F37", Source.TERMINAL, Format.BINARY , 4),
	UPPER_CONSECUTIVE_OFFLINE_LIMIT  ("9F23", Source.ICC     , Format.BINARY , 1);

	private final int value;
	private final Source source;
	private final Format format;
	private final int length;
	
	private Type(String value, Source source, Format format, int length) {
		this.value = Integer.parseInt(value, 16);
		this.source = source;
		this.format = format;
		this.length = length;
	}

	public final int numericValue() { return this.value; }	
	public final String stringValue() { return Integer.toHexString(this.value); }

}
