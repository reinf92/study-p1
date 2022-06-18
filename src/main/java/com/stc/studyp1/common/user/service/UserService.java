package com.stc.studyp1.common.user.service;

import com.stc.studyp1.common.user.mapper.UserMapper;
import com.stc.studyp1.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<UserVO> selectList(UserVO vo) throws Exception {
        return userMapper.selectList(vo);
    }

    public UserVO selectOne(UserVO vo) throws Exception {
        return userMapper.selectOne(vo);
    }

    public int insert(UserVO vo) throws Exception {
        return userMapper.insert(vo);
    }

    public int update(UserVO vo) throws Exception {
        return userMapper.update(vo);
    }

    public int delete(UserVO vo) throws Exception {
        return userMapper.delete(vo);
    }
}
