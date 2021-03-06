package com.sunlights.op.service;

import com.sunlights.common.vo.PageVo;
import com.sunlights.op.vo.PurchaseStatisticsVo;
import com.sunlights.op.vo.TradeSummaryVo;

import java.util.List;

/**
 * Created by Yuan on 2015/3/26.
 */
public interface PurchaseStatisticsService {
	public List<PurchaseStatisticsVo> findFirstPurchaseVos(PageVo pageVo);
	public List<PurchaseStatisticsVo> findUnPurchaseVos(PageVo pageVo);
	public List<TradeSummaryVo> findTradeSummaryVos(PageVo pageVo);
}
