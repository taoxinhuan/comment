/**   
 * Copyright © 2019 哈皮电子商务有限公司. All rights reserved.
 */
package com.taoxinhuan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.taoxinhuan.main.PO.Comment;
import com.taoxinhuan.main.dao.CMapper;

/**
 * @description
 * @author taoxinhuan
 * @date 2019年2月19日 下午4:10:16
 */
@RestController
public class CommentController {
	@Autowired
	private CMapper CMapper;
	
	@RequestMapping(value = "/comments/getUnionComments/{tableName}", method = RequestMethod.GET)
	public String getComments(@PathVariable("tableName") String tableName) {
		List<Comment> comments = CMapper.getCommentsByTableName(tableName);
		String result = "";
		if (CollectionUtils.isNotEmpty(comments)) {
			for (Comment comment : comments) {
				result = result + comment.getName() + "、";
			}
		}
		System.err.println(result);
		return result;
	}
}
