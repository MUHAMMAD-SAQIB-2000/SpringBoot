package com.webdevelopment.ModuleFour;

public enum EventType {
	CONFERENCE("Conference"),
	MEETUP("Meetup"),
	WORKSHOP("Workshop"),
	SOCIAL("Social"),
	NOTDEFINED("Not defined");
	
	private final String displayName;

	private EventType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	
}
