package com.kcc.lib_project.domain.book.mapper;

import com.kcc.lib_project.domain.book.vo.OwnBookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OwnBookMapper {

    int createOwnBook(OwnBookVo ownBookVo);
    Optional<OwnBookVo> selectOwnBookDetailByCallNumber(String callNumber);
    List<OwnBookVo> selectRecentlyTopTenOwnBooks();
    List<OwnBookVo> selectPopularTopTenOwnBooks();
}
