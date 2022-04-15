package com.lts.eduservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lts.eduservice.entity.EduTeacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface teacherDao extends BaseMapper<EduTeacher> {
}
