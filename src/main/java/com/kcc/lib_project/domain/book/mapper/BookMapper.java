package com.kcc.lib_project.domain.book.mapper;

import com.kcc.lib_project.domain.book.vo.BookVo;
import com.kcc.lib_project.domain.book.vo.EntireBookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    int createBook(BookVo bookVo);
    List<EntireBookVo> selectRecentlyTopTenBooks();
    List<EntireBookVo> selectPopularTopTenBooks();
}
