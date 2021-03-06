/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core.jdbc.util;

public class JDBCTestSQL {
    
    public static final String SELECT_GROUP_BY_USER_ID_SQL = "SELECT user_id FROM t_order GROUP BY user_id";
    
    public static final String SELECT_ORDER_BY_USER_ID_SQL = "SELECT user_id FROM t_order WHERE status = 'init' ORDER BY user_id";
    
    public static final String SELECT_COUNT_ALIAS_SQL = "SELECT COUNT(*) AS orders_count FROM t_order";
}
