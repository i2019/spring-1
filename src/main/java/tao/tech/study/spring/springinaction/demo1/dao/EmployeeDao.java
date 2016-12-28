package tao.tech.study.spring.springinaction.demo1.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import tao.tech.study.spring.springinaction.demo1.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 用spring管理的实例对象必须包含一个无参的构造参数,否则会抛出：
	 * java.lang.NoSuchMethodException: tao.tech.study.spring.springinaction.demo1.dao.EmployeeDao.<init>()
	 */
	public EmployeeDao() {
		super();
	}

	public EmployeeDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee getEmployeeById(Long id) {
		return jdbcTemplate.queryForObject(
				"select id, firstname, lastname, salary from employee where id=?",
				new RowMapper<Employee>() {
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Employee employee = new Employee();
						employee.setId(rs.getLong("id"));
						employee.setFirstName(rs.getString("firstname"));
						employee.setLastName(rs.getString("lastname"));
						employee.setSalary(rs.getBigDecimal("salary"));
						return employee;
					}
				}, id);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
/*
 * USE test;
 * 
 * CREATE TABLE `employee` ( `id` INTEGER NOT NULL, `firstName` CHAR(32) DEFAULT
 * NULL, `lastName` CHAR(32) DEFAULT NULL, `salary` DECIMAL(19,4) DEFAULT NULL,
 * PRIMARY KEY (`id`) ) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='员工';
 */