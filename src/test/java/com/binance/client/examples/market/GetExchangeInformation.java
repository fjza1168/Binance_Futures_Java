package com.binance.client.examples.market;

import com.alibaba.fastjson.JSONObject;
import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.market.ExchangeInformation;

public class GetExchangeInformation {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        ExchangeInformation ei  = syncRequestClient.getExchangeInformation();
        System.out.println(ei);
        System.out.println(JSONObject.toJSONString(ei));
    }
}
