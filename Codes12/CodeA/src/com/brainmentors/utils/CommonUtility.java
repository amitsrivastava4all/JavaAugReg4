package com.brainmentors.utils;

import java.util.ResourceBundle;

public interface CommonUtility {
	final ResourceBundle rb = ResourceBundle.getBundle("config");
		public static String getUserFilePath(){
			return rb.getString("userfilepath");
		}
}
