/*
https://emvlab.org/emvtags/all/
https://www.openscdp.org/scripts/tutorial/emv/tlv.html

*/

package com.avalokita.emv;

public enum TagType {
	
	ACQUIRER_IDENTIFIER              ("9F01", TagSource.TERMINAL, TagDataFormat.NUMERIC, 6),
	ADDITIONAL_TERMINAL_CAPABILITIES ("9F40", TagSource.TERMINAL, TagDataFormat.BINARY , 5),
	AMOUNT_AUTHORISED_BINARY         ("81"  , TagSource.TERMINAL, TagDataFormat.BINARY , 4),
	AMOUNT_AUTHORISED_NUMERIC        ("9FC2", TagSource.TERMINAL, TagDataFormat.NUMERIC, 6),
	AMOUNT_OTHER_BINARY              ("9F04", TagSource.TERMINAL, TagDataFormat.BINARY , 4),
	AMOUNT_OTHER_NUMERIC             ("9F03", TagSource.TERMINAL, TagDataFormat.NUMERIC, 6),
	AMOUNT_REFERENCE_CURRENCY        ("9F3A", TagSource.TERMINAL, TagDataFormat.BINARY , 4),
	APPLICATION_CRYPTOGRAM           ("9F26", TagSource.ICC     , TagDataFormat.BINARY , 8),
	// ... and the rest, up to...
	UNPREDICTABLE_NUMBER             ("9F37", TagSource.TERMINAL, TagDataFormat.BINARY , 4),
	UPPER_CONSECUTIVE_OFFLINE_LIMIT  ("9F23", TagSource.ICC     , TagDataFormat.BINARY , 1);

	private final int value;
	private final TagSource source;
	private final TagDataFormat format;
	private final int dataLength;
	private final int typeLength;
	
	private TagType(String value, TagSource source, TagDataFormat format, int dataLength) {
		this.value = Integer.parseInt(value, 16);
		this.source = source;
		this.format = format;
		this.dataLength = dataLength;
		this.typeLength = value.length() / 2;
	}

	public final int numericValue() { return this.value; }	
	public final String stringValue() { return Integer.toHexString(this.value); }
	public final TagSource source() { return this.source; }
	public final TagDataFormat format() { return this.format; }
	public final int dataLength() { return this.dataLength; }
	public final int typeLength() { return this.typeLength; }
	
	public final TagClass tagClass() {
		// ****TODO work in progress
		return TagClass.APPLICATION;
	}

}
