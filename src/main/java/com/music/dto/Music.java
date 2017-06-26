package com.music.dto;

import java.util.List;

public class Music<T> {
	private String title;
	private List<T> list;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", list=" + list + "]";
	}
}
