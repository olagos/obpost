/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.somonar.orrtiz;

import java.util.Map;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.ModelService;
import org.ofbiz.service.ServiceUtil;
import org.ofbiz.base.util.UtilXml;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class ShipmentToBPost {
   private static final String module = ProductsExportToEbay.class.getName();
   
  public static Map<String, Object> ConnectionToBPost(DispatchContext dctx, Map<String, Object> context) {
  
  Document itemDocument = UtilXml.makeEmptyXmlDocument("BPostDoc");
  Element BPostDocElem = itemDocument.getDocumentElement();
  BPostElem.setAttribute("xmlns", "urn:ebay:apis:eBLBaseComponents");


  } 

}
