/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.engine.impl.db.upgrade;

import org.activiti.engine.impl.db.DbSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;


/**
 * @author Tom Baeyens
 */
public interface DbUpgradeStep {

  void execute(SqlSession sqlSession, DbSqlSessionFactory dbSessionFactory) throws Exception;

}