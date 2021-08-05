package com.assessment.solution.service;

import org.springframework.stereotype.Service;

@Service
public class SolutionServiceImpl implements SolutionService {
    @Override
    public String calculateDistance(Double lat1, Double long1, Double lat2, Double long2) {


            lat1 = Math.toRadians(lat1);
            long1 = Math.toRadians(long1);
            lat2 = Math.toRadians(lat2);
            long2 = Math.toRadians(long2);

            double R = 6371.01;
            double distance = R *  Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2));


            return String.format("%.2f", + distance) + "km";
        }
    }


