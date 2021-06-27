package cn.edu.jxnu.logui.repository;

/**
 * @author Ziqiang CAO
 * @email 1213409187@qq.com
 */

import cn.edu.jxnu.logui.pojo.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LogRepository {

    @Select("SELECT * FROM techbbs_logs_stat")
    List<Info> getAllInfo();

    @Select("SELECT * FROM techbbs_logs_stat WHERE logdate = #{date}")
    Info getInfoByDate(@Param("date")String date);

}
