package com.jimbolix.mapper;

import com.jimbolix.mapper.basic.BasicMapper;
import com.jimbolix.pojo.ItemsComments;
import com.jimbolix.pojo.vo.MyCommentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsCommentsMapperCustom extends BasicMapper<ItemsComments> {

    public void saveComments(Map<String, Object> map);

    public List<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map);

}