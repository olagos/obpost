Document BPostDocument = UtilXml.makeEmptyXmlDocument("BPostDoc");
Element BPostDocElem = BPostDocument.getDocumentElement();
BPostRequestElem.setAttribute("xmlns", "urn:ebay:apis:eBLBaseComponents");
//Debug.logInfo("The generated string is ======= " + UtilXml.writeXmlDocument(BPostDocument), module);
