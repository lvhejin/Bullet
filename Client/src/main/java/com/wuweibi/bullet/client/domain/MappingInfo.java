package com.wuweibi.bullet.client.domain;/**
 * Created by marker on 2019/4/10.
 */

import lombok.Data;

import java.util.Date;

/**
 * @author marker
 * @create 2019-04-10 16:25
 **/
@Data
public class MappingInfo {


    private Long id;
    private Long deviceId;
    private String domain;
    private Integer port;

    /**
     * 远端端口
     */
    private Integer remotePort;

    /**
     * 服务器地址
     * （null 为本机）
     */
    private String host;

    private Long userId;

    /** 协议 1 HTTP */
    private Integer protocol;

    /** 备注 */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

}