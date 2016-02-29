package com.robynsilber.document;


public class XMLDocument extends Document implements DocumentInterface{
	
	public XMLDocument(String pathname){
		this.filePathname = pathname + ".xml";
		this.file = null;
	}
	
	@Override
	public void open() {

	}

	@Override
	public void close() {

	}

	@Override
	public void save() {

	}
}
