package com.mynotedocsApi.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KeyValueEntry {

	@Id
	@Column(name = "config_key")
	private String key;

	@Column(name = "config_value", columnDefinition = "TEXT")
	private String value;

	@Override
	public String toString() {
		return "Item{" +
				"key='" + key + '\'' +
				", value='" + value + '\'' +
				'}';
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public KeyValueEntry() {

	}

	public KeyValueEntry(String key, String value) {
		this.key = key;
		this.value = value;
	}

}
