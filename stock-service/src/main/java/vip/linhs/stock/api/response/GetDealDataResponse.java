package vip.linhs.stock.api.response;

import lombok.Data;

@Data
public class GetDealDataResponse {

    /**
     * 买卖类别-买
     */
    public static final String B = "B";
    /**
     * 买卖类别-卖
     */
    public static final String S = "S";

    /**
     * 委托编号
     */
    private String Wtbh;
    /**
     * 成交编号
     */
    private String Cjbh;
    /**
     * 成交价格
     */
    private String Cjjg;
    /**
     * 成交数量
     */
    private String Cjsl;
    /**
     * 证券代码
     */
    private String Zqdm;
    /**
     * 成交时间 HHmmss
     */
    private String Cjsj;
    /**
     * 委托数量
     */
    private String Wtsl;

    /**
     * 买卖类别
     *
     * @see #B
     * @see #S
     */
    private String Mmlb;

    /**
     * 证券名称
     */
    private String Zqmc;
    /**
     * 成交时间
     */

    private String Cjsj2;
    /**
     * 买卖
     */

    private String Mmsm;

    /**
     * 成交价格
     */
    private String Cjje;

    /**
     * 市值
     */
    private String Market;

    /**
     * 挂单代码
     */
    private String Gddm;

    private String Dwc;

    private String Cjrq;

    private String Cpbm;

    private String Cpmc;

    private String Cjlx;

    /**
     * 委托价格
     */
    private String Wtjg;

    private String Sbhtxh;

    private String Zqyjlx;



    private String Mmlb_ex;

    private String Mmlb_bs;




}
