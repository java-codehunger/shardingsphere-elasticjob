/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.elasticjob.lite.lifecycle.api;

import io.elasticjob.lite.lifecycle.domain.JobBriefInfo;

import java.util.Collection;

/**
 * Job statistics API.
 */
public interface JobStatisticsAPI {
    
    /**
     * Get jobs total count.
     *
     * @return jobs total count.
     */
    int getJobsTotalCount();
    
    /**
     * Get all jobs brief info.
     *
     * @return all jobs brief info.
     */
    Collection<JobBriefInfo> getAllJobsBriefInfo();
    
    /**
     * Get job brief info.
     *
     * @param jobName job name
     * @return job brief info
     */
    JobBriefInfo getJobBriefInfo(String jobName);
    
    /**
     * Get jobs brief info.
     *
     * @param ip server IP address
     * @return jobs brief info
     */
    Collection<JobBriefInfo> getJobsBriefInfo(String ip);
}