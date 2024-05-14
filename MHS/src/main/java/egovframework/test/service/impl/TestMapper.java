package egovframework.test.service.impl;

import java.util.HashMap;
import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface TestMapper {

	List<HashMap<String, Object>> flow() throws Exception;
}
