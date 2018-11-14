package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 
 *
 * @author lichunfeng
 * @date 2018-11-12 05:01:50
 */
@Data
@Table(name = "user")
public class User   implements Serializable {

    private static final long serialVersionUID = 788106217415791587L;

    /** ID主键自增 */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /** 用户姓名 */
    @Column
    private String name;

    /** 登录名 */
    @Column
    private String loginName;

    /** 密码 */
    @Column
    private String password;

    /** 密码加密盐 */
    @Column
    private String salt;

    /** 用户类型（1管理员，2顾问） */
    @Column
    private Integer type;

    /** 员工号 */
    @Column
    private String employeeNumber;

    /** 职务 */
    @Column
    private String employeeTitle;

    /** 员工职级 */
    @Column
    private String employeeLevel;

    /** 邮箱地址 */
    @Column
    private String email;

    /** 钉钉ID */
    @Column
    private String dingtalkId;

    /** 用户昵称 */
    @Column
    private String nickName;

    /** 头像图片路径 */
    @Column
    private String headImage;

    /** 性别 */
    @Column
    private String sex;

    /** 出生日期 */
    @Column
    private LocalDate birthDate;

    /** 手机号 */
    @Column
    private String phoneNumber;

    /** 用户状态（1未启用，2锁定，3已过期，9正常） */
    @Column
    private Integer status;

    /** 是否部门主管（0否，1是） */
    @Column
    private Integer leaderFlag;

    /** 删除状态（0未删除，1已删除） */
    @Column
    private Integer deleteFlag;

    /** 备注 */
    @Column
    private String remark;

    /** 创建人ID */
    @Column
    private Integer creatorId;

    /** 创建时间 */
    @Column
    private LocalDateTime createdAt;

    /** 更新人 */
    @Column
    private Integer updateUserId;

    /** 更新时间 */
    @Column
    private LocalDateTime updatedAt;

}