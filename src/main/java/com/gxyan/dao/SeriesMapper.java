package com.gxyan.dao;

import com.gxyan.pojo.Series;

import java.util.List;

public interface SeriesMapper {
    int deleteByPrimaryKey(Integer seriesId);

    int insert(Series record);

    int insertSelective(Series record);

    Series selectByPrimaryKey(Integer seriesId);

    int updateByPrimaryKeySelective(Series record);

    int updateByPrimaryKey(Series record);

    List<Series> selectSeriesByBrand(Integer brandId);
}