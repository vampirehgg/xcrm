package com.dimon.xcrm.pojo;

import java.util.Date;

public class Xlogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XLOGIN.XLOGIN_ID
     *
     * @mbggenerated
     */
    private Long xloginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XLOGIN.XLOGIN_LOCALIP
     *
     * @mbggenerated
     */
    private String xloginLocalip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XLOGIN.XLOGIN_NETIP
     *
     * @mbggenerated
     */
    private String xloginNetip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XLOGIN.XLOGIN_LOGINTIME
     *
     * @mbggenerated
     */
    private Date xloginLogintime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XLOGIN.XLOGIN_LOGOUTTIME
     *
     * @mbggenerated
     */
    private Date xloginLogouttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XLOGIN.XLOGIN_IPADDR
     *
     * @mbggenerated
     */
    private String xloginIpaddr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XLOGIN.XLOGIN_ID
     *
     * @return the value of XLOGIN.XLOGIN_ID
     *
     * @mbggenerated
     */
    public Long getXloginId() {
        return xloginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XLOGIN.XLOGIN_ID
     *
     * @param xloginId the value for XLOGIN.XLOGIN_ID
     *
     * @mbggenerated
     */
    public void setXloginId(Long xloginId) {
        this.xloginId = xloginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XLOGIN.XLOGIN_LOCALIP
     *
     * @return the value of XLOGIN.XLOGIN_LOCALIP
     *
     * @mbggenerated
     */
    public String getXloginLocalip() {
        return xloginLocalip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XLOGIN.XLOGIN_LOCALIP
     *
     * @param xloginLocalip the value for XLOGIN.XLOGIN_LOCALIP
     *
     * @mbggenerated
     */
    public void setXloginLocalip(String xloginLocalip) {
        this.xloginLocalip = xloginLocalip == null ? null : xloginLocalip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XLOGIN.XLOGIN_NETIP
     *
     * @return the value of XLOGIN.XLOGIN_NETIP
     *
     * @mbggenerated
     */
    public String getXloginNetip() {
        return xloginNetip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XLOGIN.XLOGIN_NETIP
     *
     * @param xloginNetip the value for XLOGIN.XLOGIN_NETIP
     *
     * @mbggenerated
     */
    public void setXloginNetip(String xloginNetip) {
        this.xloginNetip = xloginNetip == null ? null : xloginNetip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XLOGIN.XLOGIN_LOGINTIME
     *
     * @return the value of XLOGIN.XLOGIN_LOGINTIME
     *
     * @mbggenerated
     */
    public Date getXloginLogintime() {
        return xloginLogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XLOGIN.XLOGIN_LOGINTIME
     *
     * @param xloginLogintime the value for XLOGIN.XLOGIN_LOGINTIME
     *
     * @mbggenerated
     */
    public void setXloginLogintime(Date xloginLogintime) {
        this.xloginLogintime = xloginLogintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XLOGIN.XLOGIN_LOGOUTTIME
     *
     * @return the value of XLOGIN.XLOGIN_LOGOUTTIME
     *
     * @mbggenerated
     */
    public Date getXloginLogouttime() {
        return xloginLogouttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XLOGIN.XLOGIN_LOGOUTTIME
     *
     * @param xloginLogouttime the value for XLOGIN.XLOGIN_LOGOUTTIME
     *
     * @mbggenerated
     */
    public void setXloginLogouttime(Date xloginLogouttime) {
        this.xloginLogouttime = xloginLogouttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XLOGIN.XLOGIN_IPADDR
     *
     * @return the value of XLOGIN.XLOGIN_IPADDR
     *
     * @mbggenerated
     */
    public String getXloginIpaddr() {
        return xloginIpaddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XLOGIN.XLOGIN_IPADDR
     *
     * @param xloginIpaddr the value for XLOGIN.XLOGIN_IPADDR
     *
     * @mbggenerated
     */
    public void setXloginIpaddr(String xloginIpaddr) {
        this.xloginIpaddr = xloginIpaddr == null ? null : xloginIpaddr.trim();
    }
}