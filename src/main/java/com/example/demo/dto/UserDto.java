package com.example.demo.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 *
 * @author lichunfeng
 * @date 2018-11-12 05:01:50
 */
@Data
public class UserDto   implements Serializable {

    private static final long serialVersionUID = 615628532891342200L;

    /** ID主键自增 */
    private Integer id;

    /** 用户姓名 */
    private String name;

    /** 登录名 */
    private String loginName;

    /** 密码 */
    private String password;

    /** 密码加密盐 */
    private String salt;

    /** 用户类型（1管理员，2顾问） */
    private Integer type;

    /** 员工号 */
    private String employeeNumber;

    /** 职务 */
    private String employeeTitle;

    /** 员工职级 */
    private String employeeLevel;

    /** 邮箱地址 */
    private String email;

    /** 钉钉ID */
    private String dingtalkId;

    /** 用户昵称 */
    private String nickName;

    /** 头像图片路径 */
    private String headImage;

    /** 性别 */
    private String sex;

    /** 出生日期 */
    private LocalDate birthDate;

    /** 手机号 */
    private String phoneNumber;

    /** 用户状态（1未启用，2锁定，3已过期，9正常） */
    private Integer status;

    /** 是否部门主管（0否，1是） */
    private Integer leaderFlag;

    /** 删除状态（0未删除，1已删除） */
    private Integer deleteFlag;

    /** 备注 */
    private String remark;

    /** 创建人ID */
    private Integer creatorId;

    /** 创建时间 */
    private LocalDateTime createdAt;

    /** 更新人 */
    private Integer updateUserId;

    /** 更新时间 */
    private LocalDateTime updatedAt;

}