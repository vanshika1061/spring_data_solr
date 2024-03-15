package com.springsolr.api.model;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "employee")
public class Employee {
	public Employee(int i, String string, String[] strings) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Field
	private int id;
	@Field
	private String name;
	@Field
	private String[] address;

}