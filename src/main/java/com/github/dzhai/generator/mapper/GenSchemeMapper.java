package com.github.dzhai.generator.mapper;

import com.github.dzhai.generator.model.GenScheme;
import com.github.dzhai.generator.model.GenSchemeExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenSchemeMapper {
    long countByExample(GenSchemeExample example);

    int deleteByExample(GenSchemeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GenScheme record);

    int insertSelective(GenScheme record);

    GenScheme selectOneByExample(GenSchemeExample example);

    List<GenScheme> selectByExample(GenSchemeExample example);

    PageList<GenScheme> selectByExample(GenSchemeExample example, PageBounds pageBounds);

    GenScheme selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GenScheme record, @Param("example") GenSchemeExample example);

    int updateByExample(@Param("record") GenScheme record, @Param("example") GenSchemeExample example);

    int updateByPrimaryKeySelective(GenScheme record);

    int updateByPrimaryKey(GenScheme record);
}