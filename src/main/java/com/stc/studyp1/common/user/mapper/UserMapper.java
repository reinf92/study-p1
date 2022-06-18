package com.stc.studyp1.common.user.mapper;

import com.stc.studyp1.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<UserVO> selectList(UserVO vo);

    UserVO selectOne(UserVO vo);

    int insert(UserVO vo);

    int update(UserVO vo);

    int delete(UserVO vo);
}
