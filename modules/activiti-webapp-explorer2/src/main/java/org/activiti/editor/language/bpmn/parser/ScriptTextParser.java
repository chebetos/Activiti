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
package org.activiti.editor.language.bpmn.parser;

import javax.xml.stream.XMLStreamReader;

import org.activiti.editor.language.bpmn.model.BaseElement;
import org.activiti.editor.language.bpmn.model.ScriptTask;

/**
 * @author Tijs Rademakers
 */
public class ScriptTextParser extends BaseChildElementParser {
	
  public String getElementName() {
    return "script";
  }
  
  public void parseChildElement(XMLStreamReader xtr, BaseElement parentElement) throws Exception {
    if (parentElement instanceof ScriptTask == false) return;
    
    ((ScriptTask) parentElement).setScript(xtr.getElementText());
  }
}
