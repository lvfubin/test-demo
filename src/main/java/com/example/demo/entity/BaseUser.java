package com.example.demo.entity;

/**
 * Created by com.huizhi.edu.show.MybatisCodeGenerate on 2017-06-06
 */
public class BaseUser implements java.io.Serializable {

    // Fields

    // 睿智的 用户id ，若是学生则是：teacherUserId,若是老师则是：teacherUserId,全局唯一的
    private String ruiZhiUserId;
    // 用户类型(1是学生，2是教师，3是管理员)
    private Integer userRole;
    // 帐号,全局唯一的
    private String loginName;
    // 密码
    private String password;
    // 用户全名，真实姓名
    private String userFullName;
    // 学生学号,如20161758,或者教师工号，如：1545615
    private String userNo;
    // 教师id或学生id，这是睿智那边传过来的id，老师跟学生可能有相同的值
    private Long teacherOrStudentId;
    // 教师职称,如初级，高级等,若是其他角色则为空
    private String teacherRank;
    // 所在学校id
    private Long schoolId;
    // 老师的教授科目,若是学生则为空
    private Long subjectId;
    // 学生的入学年份,若为其他角色则为空
    private String entranceSchoolYear;
    // 性别,0:男，1：女
    private Integer gender;
    // 年龄
    private Integer age;
    // 民族
    private String nation;
    // 地址
    private String address;
    // 创建时间
    private Long createTime;
    // 修改时间
    private Long updateTime;
    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public BaseUser() {
    }

    /**
     * full constructor
     */
    public BaseUser(String ruiZhiUserId, Integer userRole, String loginName, String password, String userFullName, String userNo, Long teacherOrStudentId, String teacherRank, Long schoolId, Long subjectId, String entranceSchoolYear, Integer gender, Integer age, String nation, String address, Long createTime, Long updateTime, String remark) {
        this.ruiZhiUserId = ruiZhiUserId;
        this.userRole = userRole;
        this.loginName = loginName;
        this.password = password;
        this.userFullName = userFullName;
        this.userNo = userNo;
        this.teacherOrStudentId = teacherOrStudentId;
        this.teacherRank = teacherRank;
        this.schoolId = schoolId;
        this.subjectId = subjectId;
        this.entranceSchoolYear = entranceSchoolYear;
        this.gender = gender;
        this.age = age;
        this.nation = nation;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    // Property accessors

    /**
     * 睿智的 用户id ，若是学生则是：teacherUserId,若是老师则是：teacherUserId,全局唯一的
     */
    public String getRuiZhiUserId() {
        return this.ruiZhiUserId;
    }

    /**
     * 睿智的 用户id ，若是学生则是：teacherUserId,若是老师则是：teacherUserId,全局唯一的
     */
    public void setRuiZhiUserId(String ruiZhiUserId) {
        this.ruiZhiUserId = ruiZhiUserId;
    }

    /**
     * 用户类型(1是学生，2是教师，3是管理员)
     */
    public Integer getUserRole() {
        return this.userRole;
    }

    /**
     * 用户类型(1是学生，2是教师，3是管理员)
     */
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    /**
     * 帐号,全局唯一的
     */
    public String getLoginName() {
        return this.loginName;
    }

    /**
     * 帐号,全局唯一的
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户全名，真实姓名
     */
    public String getUserFullName() {
        return this.userFullName;
    }

    /**
     * 用户全名，真实姓名
     */
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    /**
     * 学生学号,如20161758,或者教师工号，如：1545615
     */
    public String getUserNo() {
        return this.userNo;
    }

    /**
     * 学生学号,如20161758,或者教师工号，如：1545615
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    /**
     * 教师id或学生id，这是睿智那边传过来的id，老师跟学生可能有相同的值
     */
    public Long getTeacherOrStudentId() {
        return this.teacherOrStudentId;
    }

    /**
     * 教师id或学生id，这是睿智那边传过来的id，老师跟学生可能有相同的值
     */
    public void setTeacherOrStudentId(Long teacherOrStudentId) {
        this.teacherOrStudentId = teacherOrStudentId;
    }

    /**
     * 教师职称,如初级，高级等,若是其他角色则为空
     */
    public String getTeacherRank() {
        return this.teacherRank;
    }

    /**
     * 教师职称,如初级，高级等,若是其他角色则为空
     */
    public void setTeacherRank(String teacherRank) {
        this.teacherRank = teacherRank;
    }

    /**
     * 所在学校id
     */
    public Long getSchoolId() {
        return this.schoolId;
    }

    /**
     * 所在学校id
     */
    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * 老师的教授科目,若是学生则为空
     */
    public Long getSubjectId() {
        return this.subjectId;
    }

    /**
     * 老师的教授科目,若是学生则为空
     */
    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 学生的入学年份,若为其他角色则为空
     */
    public String getEntranceSchoolYear() {
        return this.entranceSchoolYear;
    }

    /**
     * 学生的入学年份,若为其他角色则为空
     */
    public void setEntranceSchoolYear(String entranceSchoolYear) {
        this.entranceSchoolYear = entranceSchoolYear;
    }

    /**
     * 性别,0:男，1：女
     */
    public Integer getGender() {
        return this.gender;
    }

    /**
     * 性别,0:男，1：女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 年龄
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 民族
     */
    public String getNation() {
        return this.nation;
    }

    /**
     * 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 创建时间
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "BaseUser{" +
                "ruiZhiUserId='" + ruiZhiUserId + '\'' +
                ", userRole=" + userRole +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", userNo='" + userNo + '\'' +
                ", teacherOrStudentId=" + teacherOrStudentId +
                ", teacherRank='" + teacherRank + '\'' +
                ", schoolId=" + schoolId +
                ", subjectId=" + subjectId +
                ", entranceSchoolYear='" + entranceSchoolYear + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}