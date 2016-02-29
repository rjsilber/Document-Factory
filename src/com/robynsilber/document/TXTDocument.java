package com.robynsilber.document;


public class TXTDocument extends Document implements DocumentInterface {

	public TXTDocument(String path){
		this.filePathname = path + ".txt";
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
