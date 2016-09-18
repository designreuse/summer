/*
 * Copyright 2016 Cnlyml
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.lyml.summer.account.service;

import me.lyml.summer.account.entity.User;
import me.lyml.summer.account.repository.UserDao;
import me.lyml.summer.base.repository.BaseDao;
import me.lyml.summer.base.service.BaseService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @ClassName: UserService
 * @author: cnlyml
 * @date: 2016/9/5 9:47
 */
@Component
public class UserService extends BaseService<User, Long> {
    @Resource
    private UserDao dao;

    public User findUserByUserName(String userName){
        return dao.findUserByUserName(userName);
    }

    @Override
    public BaseDao<User, Long> dao() {
        return dao;
    }
}