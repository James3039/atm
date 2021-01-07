package vip.linhs.stock.api.response;

import lombok.Data;

@Data
public class GetStockListResponse {
    /**
     * 证券代码
     */
    private String Zqdm;
    /**
     * 证券数量
     */
    private String Zqsl;
    /**
     * 最新价格
     */
    private String Zxjg;
    /**
     * 可用数量
     */
    private String Kysl;
    /**
     * 成本价格
     */
    private String Cbjg;
    /**
     * 累计盈亏
     */
    private String Ljyk;
    /**
     * 名字
     */
    private String Zqmc;



}
