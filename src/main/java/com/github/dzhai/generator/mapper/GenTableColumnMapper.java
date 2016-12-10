package com.github.dzhai.generator.mapper;

import com.github.dzhai.generator.model.GenTableColumn;
import com.github.dzhai.generator.model.GenTableColumnExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenTableColumnMapper {
    long countByExample(GenTableColumnExample example);

    int deleteByExample(GenTableColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GenTableColumn record);

    int insertSelective(GenTableColumn record);

    GenTableColumn selectOneByExample(GenTableColumnExample example);

    List<GenTableColumn> selectByExample(GenTableColumnExample example);

    PageList<GenTableColumn> selectByExample(GenTableColumnExample example, PageBounds pageBounds);

    GenTableColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GenTableColumn record, @Param("example") GenTableColumnExample example);

    int updateByExample(@Param("record") GenTableColumn record, @Param("example") GenTableColumnExample example);

    int updateByPrimaryKeySelective(GenTableColumn record);

    int updateByPrimaryKey(GenTableColumn record);
}