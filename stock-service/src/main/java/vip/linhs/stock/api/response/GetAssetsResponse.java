package vip.linhs.stock.api.response;

import lombok.Data;

import java.util.List;

@Data
public class GetAssetsResponse {

    /**
     * 总资产
     */
    private String Zzc;

    private String Zxsz;

    /**
     * 可用资金
     */
    private String Kyzj;

    /**
     * 可取资金
     */
    private String Kqzj;

    /**
     * 冻结资金
     */
    private String Djzj;

    private String Zjye;

    private String Money_type;

    private String Drckyk;

    private String Ljyk;

    private List<F303S> F303S;


}
