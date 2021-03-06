package models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sunlights.common.utils.ArithUtil;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Project: financePlatform</p>
 * <p>Title: FundNav.java</p>
 * <p>Description: </p>
 * <p>Copyright (c) 2014 Sunlights.cc</p>
 * <p>All Rights Reserved.</p>
 * <p/>
 * //        fundcode	TEXT	主键（数米使用的基金代码）
 * //        aliascode	TEXT	基金代码
 * //        fundname	TEXT	基金名称（短）
 * //        fundnameabbr	TEXT	基金名称（长）
 * //        curr_date	TEXT	净值日期
 * //        fund_type	INT	基金类型
 * //        investment_type	INT	基金投资类型(配合基金类型使用)
 * //        netvalue	REAL	单位净值
 * //        total_netvalue	REAL	累计净值
 * //        percent	REAL	当日涨幅
 * //        income_per_ten_thousand	REAL	万份收益
 * //        percent_seven_days	REAL	七日年化
 * //        yield_1m	REAL	1个月收益
 * //        yield_3m	REAL	3个月收益
 * //        yield_6m	REAL	6个月收益
 * //        yield_12m	REAL	12个月收益
 * //        yield_this_year	REAL	今年以来收益
 * //        cgs_3_year	REAL	银河3年评级
 * //        lastest_total_asset	REAL	最新资产
 * //        on_sale	INTEGER	是否是数米代销
 * //        risk_level	STRING	基金风险等级
 * //        share_type	STRING	收费方式
 * //        purchase_state	INTEGER	是否可申购
 * //        subscribe_state	INTEGER	是否可认购
 * //        aip_state	INTEGER	是否可定投
 * //        recommendation	INTEGER	是否数米推荐基金
 * //        charge_rate_value	REAL	原始费率
 * //        discount	REAL	费率折扣
 * //        sale_charge_rate_value	REAL	销售费率
 * //        is_monetary	INTEGER	是否是货币基金
 * //        is_stf	INTEGER	是否是短期理财基金
 * //        purchase_limit_min	REAL	起购金额
 * //        redeem_limit_min	REAL 	起始赎回金额
 * //        rapid_redeem	INTEGER	是否支持快速赎回（T+0）
 * //        ia_guid	TEXT	基金公司GUID
 * //        fund_management_fees	TEXT	管理费率
 * //        fund_trustee_fees	TEXT	托管费率
 *
 * @author <a href="mailto:zhencai.yuan@sunlights.cc">yuanzhencai</a>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Entity
public class FundNav {
    @Id
    @javax.persistence.Column(name = "fundcode")
    private String fundcode;

    @javax.persistence.Column(name = "aliascode")
    private String aliascode;

    @javax.persistence.Column(name = "fundname")
    private String fundname;

    @javax.persistence.Column(name = "fundnameabbr")
    private String fundnameabbr;

    @javax.persistence.Column(name = "curr_date")
    private String currDate;

    @javax.persistence.Column(name = "fund_type")
    private Integer fundType;

    @javax.persistence.Column(name = "investment_type")
    private Integer investmentType;

    @javax.persistence.Column(name = "investment_duration")
    private Integer investmentDuration;

    @javax.persistence.Column(name = "netvalue")
    private BigDecimal netvalue;

    @javax.persistence.Column(name = "total_netvalue")
    private BigDecimal totalNetvalue;

    @javax.persistence.Column(name = "percent")
    private BigDecimal percent;

    @javax.persistence.Column(name = "income_per_ten_thousand")
    private BigDecimal incomePerTenThousand;

    @javax.persistence.Column(name = "percent_seven_days")
    private BigDecimal percentSevenDays;

    @javax.persistence.Column(name = "yield_1m")
    private BigDecimal yield1M;

    @javax.persistence.Column(name = "yield_3m")
    private BigDecimal yield3M;

    @javax.persistence.Column(name = "yield_6m")
    private BigDecimal yield6M;

    @javax.persistence.Column(name = "yield_12m")
    private BigDecimal yield12M;

    @javax.persistence.Column(name = "yield_this_year")
    private BigDecimal yieldThisYear;

    @javax.persistence.Column(name = "cgs_3_year")
    private BigDecimal cgs3Year;

    @javax.persistence.Column(name = "lastest_total_asset")
    private BigDecimal lastestTotalAsset;

    @javax.persistence.Column(name = "on_sale")
    private Integer onSale;

    @javax.persistence.Column(name = "risk_level")
    private String riskLevel;

    @javax.persistence.Column(name = "share_type")
    private String shareType;

    @javax.persistence.Column(name = "purchase_state")
    private Integer purchaseState;

    @javax.persistence.Column(name = "subscribe_state")
    private Integer subscribeState;

    @javax.persistence.Column(name = "aip_state")
    private Integer aipState;

    @javax.persistence.Column(name = "recommendation")
    private Integer recommendation;

    @javax.persistence.Column(name = "charge_rate_value")
    private BigDecimal chargeRateValue;

    @javax.persistence.Column(name = "discount")
    private BigDecimal discount;

    @javax.persistence.Column(name = "sale_charge_rate_value")
    private BigDecimal saleChargeRateValue;

    @javax.persistence.Column(name = "is_monetary")
    private Integer isMonetary;

    @javax.persistence.Column(name = "is_stf")
    private Integer isStf;

    @javax.persistence.Column(name = "purchase_limit_min")
    private BigDecimal purchaseLimitMin;

    @javax.persistence.Column(name = "redeem_limit_min")
    private BigDecimal redeemLimitMin;

    @javax.persistence.Column(name = "rapid_redeem")
    private Integer rapidRedeem;

    @javax.persistence.Column(name = "ia_guid")
    private String iaGuid;

    @javax.persistence.Column(name = "fund_management_fees")
    private String fundManagementFees;

    @javax.persistence.Column(name = "fund_trustee_fees")
    private String fundTrusteeFees;

    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "create_time")
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "update_time")
    private Date updateTime;

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode;
    }

    public String getAliascode() {
        return aliascode;
    }

    public void setAliascode(String aliascode) {
        this.aliascode = aliascode;
    }

    public String getFundname() {
        return fundname;
    }

    public void setFundname(String fundname) {
        this.fundname = fundname;
    }

    public String getFundnameabbr() {
        return fundnameabbr;
    }

    public void setFundnameabbr(String fundnameabbr) {
        this.fundnameabbr = fundnameabbr;
    }

    public String getCurrDate() {
        return currDate;
    }

    public void setCurrDate(String currDate) {
        this.currDate = currDate;
    }

    public Integer getFundType() {
        return fundType;
    }

    public void setFundType(Integer fundType) {
        this.fundType = fundType;
    }

    public Integer getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(Integer investmentType) {
        this.investmentType = investmentType;
    }

    public BigDecimal getNetvalue() {
        return netvalue;
    }

    public void setNetvalue(BigDecimal netvalue) {
        this.netvalue = ArithUtil.round(netvalue, 5);
    }

    public BigDecimal getTotalNetvalue() {
        return totalNetvalue;
    }

    public void setTotalNetvalue(BigDecimal totalNetvalue) {
        this.totalNetvalue = ArithUtil.round(totalNetvalue, 5);
    }

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = ArithUtil.round(percent, 5);
    }

    public BigDecimal getIncomePerTenThousand() {
        return incomePerTenThousand;
    }

    public void setIncomePerTenThousand(BigDecimal incomePerTenThousand) {
        this.incomePerTenThousand = ArithUtil.round(incomePerTenThousand, 5);
    }

    public BigDecimal getPercentSevenDays() {
        return percentSevenDays;
    }

    public void setPercentSevenDays(BigDecimal percentSevenDays) {
        this.percentSevenDays = ArithUtil.round(percentSevenDays, 5);
    }

    public BigDecimal getYield1M() {
        return yield1M;
    }

    public void setYield1M(BigDecimal yield1M) {
        this.yield1M = ArithUtil.round(yield1M, 5);
    }

    public BigDecimal getYield3M() {
        return yield3M;
    }

    public void setYield3M(BigDecimal yield3M) {
        this.yield3M = ArithUtil.round(yield3M, 5);
    }

    public BigDecimal getYield6M() {
        return yield6M;
    }

    public void setYield6M(BigDecimal yield6M) {
        this.yield6M = ArithUtil.round(yield6M, 5);
    }

    public BigDecimal getYield12M() {
        return yield12M;
    }

    public void setYield12M(BigDecimal yield12M) {
        this.yield12M = ArithUtil.round(yield12M, 5);
    }

    public BigDecimal getYieldThisYear() {
        return yieldThisYear;
    }

    public void setYieldThisYear(BigDecimal yieldThisYear) {
        this.yieldThisYear = ArithUtil.round(yieldThisYear, 5);
    }

    public BigDecimal getCgs3Year() {
        return cgs3Year;
    }

    public void setCgs3Year(BigDecimal cgs3Year) {
        this.cgs3Year = ArithUtil.round(cgs3Year, 5);
    }

    public BigDecimal getLastestTotalAsset() {
        return lastestTotalAsset;
    }

    public void setLastestTotalAsset(BigDecimal lastestTotalAsset) {
        this.lastestTotalAsset = ArithUtil.round(lastestTotalAsset, 5);
    }

    public Integer getOnSale() {
        return onSale;
    }

    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public Integer getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(Integer purchaseState) {
        this.purchaseState = purchaseState;
    }

    public Integer getSubscribeState() {
        return subscribeState;
    }

    public void setSubscribeState(Integer subscribeState) {
        this.subscribeState = subscribeState;
    }

    public Integer getAipState() {
        return aipState;
    }

    public void setAipState(Integer aipState) {
        this.aipState = aipState;
    }

    public Integer getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Integer recommendation) {
        this.recommendation = recommendation;
    }

    public BigDecimal getChargeRateValue() {
        return chargeRateValue;
    }

    public void setChargeRateValue(BigDecimal chargeRateValue) {
        this.chargeRateValue = ArithUtil.round(chargeRateValue, 5);
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = ArithUtil.round(discount, 5);
    }

    public BigDecimal getSaleChargeRateValue() {
        return saleChargeRateValue;
    }

    public void setSaleChargeRateValue(BigDecimal saleChargeRateValue) {
        this.saleChargeRateValue = ArithUtil.round(saleChargeRateValue, 5);
    }

    public Integer getIsMonetary() {
        return isMonetary;
    }

    public void setIsMonetary(Integer isMonetary) {
        this.isMonetary = isMonetary;
    }

    public Integer getIsStf() {
        return isStf;
    }

    public void setIsStf(Integer isStf) {
        this.isStf = isStf;
    }

    public BigDecimal getPurchaseLimitMin() {
        return purchaseLimitMin;
    }

    public void setPurchaseLimitMin(BigDecimal purchaseLimitMin) {
        this.purchaseLimitMin = ArithUtil.round(purchaseLimitMin, 5);
    }

    public BigDecimal getRedeemLimitMin() {
        return redeemLimitMin;
    }

    public void setRedeemLimitMin(BigDecimal redeemLimitMin) {
        this.redeemLimitMin = ArithUtil.round(redeemLimitMin, 5);
    }

    public Integer getRapidRedeem() {
        return rapidRedeem;
    }

    public void setRapidRedeem(Integer rapidRedeem) {
        this.rapidRedeem = rapidRedeem;
    }

    public String getIaGuid() {
        return iaGuid;
    }

    public void setIaGuid(String iaGuid) {
        this.iaGuid = iaGuid;
    }

    public String getFundManagementFees() {
        return fundManagementFees;
    }

    public void setFundManagementFees(String fundManagementFees) {
        this.fundManagementFees = fundManagementFees;
    }

    public String getFundTrusteeFees() {
        return fundTrusteeFees;
    }

    public void setFundTrusteeFees(String fundTrusteeFees) {
        this.fundTrusteeFees = fundTrusteeFees;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getInvestmentDuration() {
        return investmentDuration;
    }

    public void setInvestmentDuration(Integer investmentDuration) {
        this.investmentDuration = investmentDuration;
    }
}

