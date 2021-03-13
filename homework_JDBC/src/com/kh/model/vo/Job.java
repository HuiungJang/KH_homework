package com.kh.model.vo;

import java.util.Objects;

public class Job {
    private String jobCode;
    private String jobName;

    public Job() {
    }

    public Job(String jobCode, String jobName) {
        this.jobCode = jobCode;
        this.jobName = jobName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return Objects.equals(jobCode, job.jobCode) && Objects.equals(jobName, job.jobName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobCode, jobName);
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobCode='" + jobCode + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
