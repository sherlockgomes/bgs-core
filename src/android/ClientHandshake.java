package com.red_folder.phonegap.plugin.backgroundservice;

public interface ClientHandshake extends Handshakedata {
	/**returns the HTTP Request-URI as defined by http://tools.ietf.org/html/rfc2616#section-5.1.2*/
	public String getResourceDescriptor();
}
