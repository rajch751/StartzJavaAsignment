package com.startzplay.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Thumbnail {
	
	private String url;
	private Long width;
	private Long height;
	private String title;
	private String[] assetTypes;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getWidth() {
		return width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}
	public Long getHeight() {
		return height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getAssetTypes() {
		return assetTypes;
	}
	public void setAssetTypes(String[] assetTypes) {
		this.assetTypes = assetTypes;
	}
	
	

}
