package com.kbstar.chart;

import com.kbstar.dto.Chart;
import com.kbstar.service.ChartService;
import com.kbstar.service.CustService;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class MonthlyTotalTest {

    @Autowired
    ChartService chartService;
    @Test
    void contextLoads() {
        // [{},{}]
        try {
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

                log.info(String.valueOf(data));
        } catch (Exception e) {
            log.info("monthlytotal error-----------------------------");
            e.printStackTrace();
        }
        }
    }

