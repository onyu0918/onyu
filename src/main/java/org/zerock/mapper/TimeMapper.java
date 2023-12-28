package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

//org.zeock.mapper.TimeMapper.getTime2 -> sqlsession

public interface TimeMapper {

	// ;がありません
	@Select("select sysdate from dual")
	String getTime();
	
	String getTime2();
}
