package com.robynsilber.documentfactory;
import java.io.File;
import java.util.Formatter;

import com.robynsilber.document.Document;

public class DocumentFactory extends AbstractDocumentFactory {
	
	@Override
	public Document manufactureDocument(int type, String path){

		Document doc = createDocument(type, path);
		
		if(doc != null){
			File newFile = new File(doc.getFilePathname());
			if(!newFile.exists()){
				try{
					Formatter fileFormatter = new Formatter(doc.getFilePathname());
					doc.setFile(newFile);
					documentList.add(doc);
					fileFormatter.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		return doc;
	}
	

}
