package com.kbstar.service;

import com.kbstar.dto.Chart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.KBService;
import com.kbstar.mapper.ChartMapper;
import com.kbstar.mapper.CustMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class ChartService{

    @Autowired
    ChartMapper chartMapper;
    public List<Chart> getMonthlyTotal() throws Exception{
        return chartMapper.getMonthlyTotal();
    }
}
