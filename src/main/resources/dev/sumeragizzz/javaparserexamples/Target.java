package dev.sumeragizzz.javaparserexamples;

public class Target {

	private String value;

	public Target(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void run() {
		System.out.println(value);
	}

}
