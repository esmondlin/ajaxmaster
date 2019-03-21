package com.javatechie.spring.ajax.api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ServiceResponse<T> {
	
	
	public ServiceResponse(String string, Book book) {
		this.status = string;
		this.data = book;
	}
	
	public ServiceResponse(String string, List<Book> book) {
		this.status = string;
		this.listdata = book;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Book getData() {
		return data;
	}

	public void setData(Book data) {
		this.data = data;
	}

	public List<Book> getListdata() {
		return listdata;
	}

	public void setListdata(List<Book> listdata) {
		this.listdata = listdata;
	}
	private String status;
	private Book data;
	private List<Book> listdata;

}
