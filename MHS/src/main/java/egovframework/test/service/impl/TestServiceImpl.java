package egovframework.test.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestMapper mapper;
	
	@Override
	public List<HashMap<String, Object>> aaaa() throws Exception{
		return mapper.flow();
	}
	
}
