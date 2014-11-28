package com.sunlights.account.service.rewardrules;

import com.sunlights.account.AccountConstant;
import com.sunlights.account.vo.RewardResultVo;
import com.sunlights.common.MsgCode;
import com.sunlights.common.Severity;
import com.sunlights.common.vo.Message;

/**
 * Created by Administrator on 2014/11/24.
 */
public class RegisterObtainRewardRule extends AbstractObtainRewardRule{

    @Override
    public String getScene() {
        return AccountConstant.ACTIVITY_REGISTER_SCENE_CODE;
    }


    @Override
    public RewardResultVo validate(String custId) {
        RewardResultVo rewardResultVo = rewardFlowService.getLastObtainRewars(custId, this.getScene());

        if(rewardResultVo != null) {
            RewardResultVo vo = new RewardResultVo();
            Message message = new Message(Severity.INFO, MsgCode.ALREADY_REGISTER);
            vo.setStatus(AccountConstant.ACTIVITY_CUSTONER_STATUS_FORBIDDEN);
            vo.setReturnMessage(message);
            vo.setNotGet(0L);
            vo.setAlreadyGet(0L);
            return vo;
        }

        return super.validate(custId);
    }

    @Override
    public RewardResultVo signValue4Obtain(RewardResultVo vo, Long rewardAmtResult) {
        Message message = new Message(Severity.INFO, MsgCode.OBTAIN_SUCC);
        vo.setReturnMessage(message);
        vo.setScene(this.getScene());
        vo.setAlreadyGet(rewardAmtResult);
        vo.setNotGet(0L);
        vo.setStatus(AccountConstant.ACTIVITY_CUSTONER_STATUS_FORBIDDEN);
        return vo;
    }
}