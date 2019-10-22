package com.pgz.agile.vo;

/**
 * 支付状态回调实体
 *
 * @author tyc
 * @date 2019-05-29
 */
public class StatusVO {

    /**
     * 状态  0.待支付 1.支付成功 2.支付完成 3.支付失败 4.订单取消
     */
    private Integer status;
    /**
     * 订货单id
     */
    private String workOrderId;
    /**
     * 备注
     */
    private String remark;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
