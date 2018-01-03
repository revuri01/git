package com.springprogramming.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprogramming.web.dao.Details;
import com.springprogramming.web.dao.DetailsDAO;

@Service("detailsService")
public class DetailsService {

	private DetailsDAO dao;

	@Autowired
	public void setDao(DetailsDAO dao) {
		this.dao = dao;
	}

	public List<Details> getCurrent() {

		return dao.getDetails();
	}

}
