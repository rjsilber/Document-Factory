package com.robynsilber.document;
import java.io.File;

public abstract class Document {
	
	protected File file;
	protected String filePathname;

	public void setFile(File newFile){
		this.file = newFile;
	}
	
	public File getFile(){
		return file;
	}
	
	public String getFilePathname(){
		return filePathname;
	}
	
	
}
