package com.robynsilber.document;


public class CSVDocument extends Document implements DocumentInterface {

	public CSVDocument(String pathname){
		this.filePathname = pathname + ".csv";
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
