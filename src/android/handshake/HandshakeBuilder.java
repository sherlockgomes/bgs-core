package com.red_folder.phonegap.plugin.backgroundservice.handshake;

public interface HandshakeBuilder extends Handshakedata {
	public abstract void setContent( byte[] content );
	public abstract void put( String name, String value );
}
