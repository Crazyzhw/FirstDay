package day02;

public class NameVersion {
	private   String name;
	private   String version;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public NameVersion(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}
	/**
	 * @param name
	 */
	public NameVersion(String name) {
		super();
		this.name = name;
	}
	public NameVersion() {
		super();
	}
	@Override
	public String toString() {
		return "NameVersion [name=" + name /*+ ", version=" + version*/ + "]";
	}
	
}
