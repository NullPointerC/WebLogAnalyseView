package cn.edu.jxnu.logui.service;

import cn.edu.jxnu.logui.pojo.Info;


import java.util.List;

/**
 * @author Ziqiang CAO
 * @email 1213409187@qq.com
 */
public interface LogService {

    List<Info> getAllInfo();


    Info getInfoByDate(String date);
}
