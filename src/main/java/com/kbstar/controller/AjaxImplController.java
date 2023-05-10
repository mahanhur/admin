package com.kbstar.controller;

import com.kbstar.dto.Chart;
import com.kbstar.service.ChartService;
import com.kbstar.service.SalesService;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class AjaxImplController {
    @Autowired
    ChartService chartService;
    @RequestMapping("/chart01")
    public Object chart01() throws Exception {
        List<Chart> list = chartService.getMonthlyTotal();
        JSONArray fma = new JSONArray();
        JSONArray ma = new JSONArray();

        for(Chart c:list) {
            if(c.getGender().toUpperCase().equals("F")) {
                fma.add(c.getTotal());
            } else {
                ma.add(c.getTotal());
            }
        };
        JSONObject fmo = new JSONObject();
        JSONObject mo = new JSONObject();
        fmo.put("name", "Female");
        fmo.put("data", fma);
        mo.put("name", "Male");
        mo.put("data", ma);
        JSONArray data = new JSONArray();
        data.add(fmo);
        data.add(mo);

        return data;
    }
    @RequestMapping("/chart02")
    public Object chart02() throws Exception {
        List<Chart> list = chartService.getMonthlyTotal();
        JSONArray fma = new JSONArray();
        JSONArray ma = new JSONArray();

        for(Chart c:list) {
            if(c.getGender().toUpperCase().equals("F")) {
                fma.add(c.getTotal());
            } else {
                ma.add(c.getTotal());
            }
        };
        JSONObject fmo = new JSONObject();
        JSONObject mo = new JSONObject();
        fmo.put("name", "Female");
        fmo.put("data", fma);
        mo.put("name", "Male");
        mo.put("data", ma);
        JSONArray data = new JSONArray();
        data.add(fmo);
        data.add(mo);

        return data;
    }
}
