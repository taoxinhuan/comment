package com.taoxinhuan.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.taoxinhuan.main.PO.Comment;

@Repository
public interface CMapper {
	/**
	 * @description:根据表明返回注释列表
	 * @param tableName
	 * @return
	 * @return List<Comment>
	 */
	List<Comment> getCommentsByTableName(@Param("tableName") String tableName);
}
