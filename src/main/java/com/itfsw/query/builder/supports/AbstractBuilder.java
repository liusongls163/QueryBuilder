/*
 * Copyright (c) 2017.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.itfsw.query.builder.supports;

import com.itfsw.query.builder.supports.model.JsonRule;

/**
 * ---------------------------------------------------------------------------
 * 构造类
 * ---------------------------------------------------------------------------
 * @author: hewei
 * @time:2017/10/30 15:44
 * ---------------------------------------------------------------------------
 */
public abstract class AbstractBuilder {
    private JsonRule rule; // 规则

    /**
     * 构造函数
     * @param rule
     */
    public AbstractBuilder(JsonRule rule) {
        this.rule = rule;
    }

    /**
     * 执行构建
     * @return
     */
    public abstract boolean build();
}
