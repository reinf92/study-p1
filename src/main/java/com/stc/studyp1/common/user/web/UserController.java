package com.stc.studyp1.common.user.web;

import com.stc.studyp1.domain.UserVO;
import com.stc.studyp1.common.user.service.UserService;
import com.stc.studyp1.common.util.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserVO>> selectList(UserVO vo) throws Exception {
        return ResponseEntity.ok(userService.selectList(vo));
    }

    @GetMapping("/user")
    public ResponseEntity<UserVO> selectOne(UserVO vo) throws Exception {
        return ResponseEntity.ok(userService.selectOne(vo));
    }

    @PostMapping("/user")
    public ResultVO insert(@RequestBody UserVO vo) throws Exception {
        ResultVO resultVO = new ResultVO();
        int result = userService.insert(vo);
        if (result > 0) {
            resultVO.setOk(true);
            resultVO.setMessage("");
        }
        return resultVO;
    }

    @PutMapping("/user")
    public ResultVO update(@RequestBody UserVO vo) throws Exception {
        ResultVO resultVO = new ResultVO();
        int result = userService.update(vo);
        if (result > 0) {
            resultVO.setOk(true);
            resultVO.setMessage("");
        }
        return resultVO;
    }

    @DeleteMapping("/user")
    public ResultVO delete(@RequestBody UserVO vo) throws Exception {
        ResultVO resultVO = new ResultVO();
        int result = userService.delete(vo);
        if (result > 0) {
            resultVO.setOk(true);
            resultVO.setMessage("");
        }
        return resultVO;
    }
}
