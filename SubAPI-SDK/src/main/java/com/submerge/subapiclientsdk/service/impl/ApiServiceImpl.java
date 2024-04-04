package com.submerge.subapiclientsdk.service.impl;

import com.submerge.subapiclientsdk.client.SubApiClient;
import com.submerge.subapiclientsdk.exception.ApiException;
import com.submerge.subapiclientsdk.model.request.*;
import com.submerge.subapiclientsdk.model.response.*;
import com.submerge.subapiclientsdk.service.ApiService;
import com.submerge.subapiclientsdk.service.BaseService;

import lombok.extern.slf4j.Slf4j;


/**
 * @Author: Submerge
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(SubApiClient subApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(subApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(SubApiClient subApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(subApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public MoYuResponse moYu() throws ApiException {
        MoYuRequest request = new MoYuRequest();
        return request(request);
    }


    @Override
    public LoveResponse randomLoveTalk(SubApiClient subApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(subApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(SubApiClient subApiClient, HoroscopeRequest request) throws ApiException {
        return request(subApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(SubApiClient subApiClient, IpInfoRequest request) throws ApiException {
        return request(subApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(SubApiClient subApiClient, WeatherRequest request) throws ApiException {
        return request(subApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public NameResponse getUserName(NameRequest nameRequest) throws ApiException {
        return request(nameRequest);
    }

    @Override
    public NameResponse getUserName(NameRequest nameRequest, SubApiClient subApiClient) throws ApiException {
        return request(subApiClient, nameRequest);
    }
}
