package com.submerge.subapiinterface.controller;

import cn.hutool.json.JSONUtil;
import com.submerge.subapiclientsdk.exception.ApiException;
import com.submerge.subapiclientsdk.model.params.*;
import com.submerge.subapiclientsdk.model.response.NameResponse;
import com.submerge.subapiclientsdk.model.response.RandomWallpaperResponse;
import com.submerge.subapiclientsdk.model.response.ResultResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.submerge.subapiinterface.utils.RequestUtils.buildUrl;
import static com.submerge.subapiinterface.utils.RequestUtils.get;
import static com.submerge.subapiinterface.utils.ResponseUtils.baseResponse;
import static com.submerge.subapiinterface.utils.ResponseUtils.responseToMap;


/**
 * @Author: Submerge
 * @Date: 2023年08月16日 11:29
 * @Version: 1.0
 * @Description:
 */
@RestController
@RequestMapping("/")
public class ServiceController {
    /**
     * 获取名称
     *
     * @param nameParams 名称
     * @return json
     */
    @GetMapping("/name")
    public NameResponse getName(NameParams nameParams) {
        return JSONUtil.toBean(JSONUtil.toJsonStr(nameParams), NameResponse.class);
    }

    /**
     * 随机情话
     *
     * @return 情话
     */
    @GetMapping("/loveTalk")
    public String randomLoveTalk() {
        return get("https://api.vvhan.com/api/text/love?type=json");
    }

    /**
     * 随机毒鸡汤
     *
     * @return 鸡汤
     */
    @GetMapping("/poisonousChickenSoup")
    public String getPoisonousChickenSoup() {
        return get("https://api.btstu.cn/yan/api.php?charset=utf-8&encode=json");
    }

    /**
     * 随机壁纸
     *
     * @param randomWallpaperParams
     * @return wallpaper
     * @throws ApiException
     */
    @GetMapping("/randomWallpaper")
    public RandomWallpaperResponse randomWallpaper(RandomWallpaperParams randomWallpaperParams) throws ApiException {
        String baseUrl = "https://api.btstu.cn/sjbz/api.php";
        String url = buildUrl(baseUrl, randomWallpaperParams);
        if (StringUtils.isAllBlank(randomWallpaperParams.getLx(), randomWallpaperParams.getMethod())) {
            url = url + "?format=json";
        } else {
            url = url + "&format=json";
        }
        return JSONUtil.toBean(get(url), RandomWallpaperResponse.class);
    }

    /**
     * 摸鱼日历
     * @return
     * @throws ApiException
     */
    @GetMapping("/moYu")
    public String moYu() throws ApiException {
        return get("https://api.vvhan.com/api/moyu?type=json");
    }

    /**
     * 星座运势
     *
     * @param horoscopeParams
     * @return
     * @throws ApiException
     */
    @GetMapping("/horoscope")
    public ResultResponse getHoroscope(HoroscopeParams horoscopeParams) throws ApiException {
        String response = get("https://api.vvhan.com/api/horoscope", horoscopeParams);
        Map<String, Object> fromResponse = responseToMap(response);
        boolean success = (boolean) fromResponse.get("success");
        if (!success) {
            ResultResponse baseResponse = new ResultResponse();
            baseResponse.setData(fromResponse);
            return baseResponse;
        }
        return JSONUtil.toBean(response, ResultResponse.class);
    }

    /**
     * IP归属地
     *
     * @param ipInfoParams
     * @return
     */
    @GetMapping("/ipInfo")
    public ResultResponse getIpInfo(IpInfoParams ipInfoParams) {
        return baseResponse("https://api.vvhan.com/api/ipInfo", ipInfoParams);
    }

    /**
     * 天气
     *
     * @param weatherParams
     * @return
     */
    @GetMapping("/weather")
    public ResultResponse getWeatherInfo(WeatherParams weatherParams) {
        return baseResponse("https://api.vvhan.com/api/weather", weatherParams);
    }
}
