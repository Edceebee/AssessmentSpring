package com.assessment.solution.service;

import org.springframework.stereotype.Service;

@Service
public interface SolutionService {
    String calculateDistance(Double lat1, Double long1, Double lat2, Double long2 );
}
