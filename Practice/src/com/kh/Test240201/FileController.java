package com.kh.Test240201;

public class FileController {
	
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		fd.fileSave(file, sb.toString());
		
		
		StringBuilder strb = new StringBuilder();
		strb.append(file);
		String str = strb.toString();
	}
	
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
		
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		String st = sb.toString();
		fd.fileEdit(file, st);
		
		
	}
	

}
