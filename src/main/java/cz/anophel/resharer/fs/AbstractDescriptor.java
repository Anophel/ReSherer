package cz.anophel.resharer.fs;

import java.time.LocalDateTime;

public abstract class AbstractDescriptor implements IDescriptor {

	private long uid;
	
	private String name;
	
	private LocalDateTime lastModif;
	
	public AbstractDescriptor(long uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
		touch();
	}

	public long getUid() {
		return uid;
	}

	protected void setUid(long uid) {
		this.uid = uid;
		touch();
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
		touch();
	}

	public LocalDateTime getLastmodif() {
		return lastModif;
	}
	
	protected void touch() {
		lastModif = LocalDateTime.now();
	}

	protected boolean touch(boolean succes) {
		if (succes)
			lastModif = LocalDateTime.now();
		return succes;
	}

	public LocalDateTime getLastModif() {
		return lastModif;
	}
}
