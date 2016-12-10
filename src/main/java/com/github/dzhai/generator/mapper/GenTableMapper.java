package com.github.dzhai.generator.mapper;

import com.github.dzhai.generator.model.GenTable;
import com.github.dzhai.generator.model.GenTableExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GenTableMapper {
    long countByExample(GenTableExample example);

    int deleteByExample(GenTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GenTable record);

    int insertSelective(GenTable record);

    GenTable selectOneByExample(GenTableExample example);

    List<GenTable> selectByExample(GenTableExample example);

    PageList<GenTable> selectByExample(GenTableExample example, PageBounds pageBounds);

    GenTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GenTable record, @Param("example") GenTableExample example);

    int updateByExample(@Param("record") GenTable record, @Param("example") GenTableExample example);

    int updateByPrimaryKeySelective(GenTable record);

    int updateByPrimaryKey(GenTable record);
}