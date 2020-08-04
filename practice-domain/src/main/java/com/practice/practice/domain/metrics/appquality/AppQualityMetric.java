package com.practice.practice.domain.metrics.appquality;

import com.practice.practice.domain.metrics.MainMetric;
import com.practice.practice.domain.metrics.MainMetricType;
import com.practice.practice.domain.metrics.devquality.BugMetric;
import com.practice.practice.domain.user.UserProfile;

public class AppQualityMetric extends MainMetric {

    private AppMetric appMetric;

    public AppQualityMetric(UserProfile metricOwner){
        this.metricOwner = metricOwner;
        metricOwner.setAppQualityMetric(this);
        this.metricMainType = MainMetricType.APP_QUALITY;
    }

    @Override
    public double getWeight() {
        return metricOwner.getWeight().getAppQualityWeight();
    }
}
