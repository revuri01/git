package com.springprogramming.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.springsource.tcserver.serviceability.request.DataSource;

@Component("detailsDAO")
public class DetailsDAO {

	private NamedParameterJdbcTemplate jdbctemplate;
	
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbctemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public List<Details> getDetails() {
		return jdbctemplate.query("select * from example", new RowMapper<Details>() {

			public Details mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Details d = new Details();
				d.setId(rs.getInt("id"));
				d.setName(rs.getString("name"));
				d.setEmail(rs.getString("email"));
				d.setText(rs.getString("email"));
				return d;
			}
		});
	}

}
