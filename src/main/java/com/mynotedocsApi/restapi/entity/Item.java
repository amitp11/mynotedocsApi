package com.mynotedocsApi.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "item")
public class Item {

	@Id
	private String key;

	@Column(columnDefinition = "TEXT")
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

	public Item() {

	}

	public Item(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Item item = (Item) o;
		return Objects.equals(key, item.key) && Objects.equals(value, item.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}
}
