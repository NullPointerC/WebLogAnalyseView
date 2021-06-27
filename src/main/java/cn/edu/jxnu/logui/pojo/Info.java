package cn.edu.jxnu.logui.pojo;

import lombok.Data;

/**
 * @author Ziqiang CAO
 * @email 1213409187@qq.com
 */
@Data
public class Info {
    /*日期*/
    private String logdate;
    /*访问量*/
    private Integer pv;
    /*新注册人数*/
    private Integer reguser;
    /*独立ip数*/
    private Integer ip;
    /*跳出数量*/
    private Integer jumper;
}
