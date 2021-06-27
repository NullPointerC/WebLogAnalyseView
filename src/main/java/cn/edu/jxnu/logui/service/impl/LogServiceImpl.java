package cn.edu.jxnu.logui.service.impl;

import cn.edu.jxnu.logui.pojo.Info;
import cn.edu.jxnu.logui.repository.LogRepository;
import cn.edu.jxnu.logui.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Ziqiang CAO
 * @email 1213409187@qq.com
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;
    @Override
    public List<Info> getAllInfo() {
        return logRepository.getAllInfo();
    }

    @Override
    public Info getInfoByDate(String date) {
        return logRepository.getInfoByDate(date);
    }
}
