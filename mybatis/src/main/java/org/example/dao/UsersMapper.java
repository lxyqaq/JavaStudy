package org.example.dao;

import org.example.model.Users;

/**
 * @InterfaceName UsersMapper
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/12/30 21:56
 * @Version 1.0
 */
public interface UsersMapper {
    Users loadById(Integer id);
}
