package com.robynsilber.documentfactory;
import java.util.ArrayList;
import java.util.List;

import com.robynsilber.document.CSVDocument;
import com.robynsilber.document.Document;
import com.robynsilber.document.TXTDocument;
import com.robynsilber.document.XMLDocument;

public abstract class AbstractDocumentFactory {
	
	public static final int TXT = 0;
	public static final int CSV = 1;
	public static final int XML = 2;
	
	protected static final List<Document> documentList = new ArrayList<Document>();
	
	protected Document createDocument(int type, String pathname){
		
		switch(type){
			case TXT: return new TXTDocument(pathname);
			case CSV: return new CSVDocument(pathname);
			case XML: return new XMLDocument(pathname);
			default: break;
		}
		return null;
	}
	
	abstract Document manufactureDocument(int type, String path);

}
