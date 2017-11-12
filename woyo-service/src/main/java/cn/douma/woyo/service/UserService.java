package cn.douma.woyo.service;

import cn.douma.woyo.db.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<UserInfo> list();

}
