package com.lavasoft;

import java.net.InetAddress;

public class Main {

	public static void main(String[] args) throws Exception{
		GeoIPServiceSoap geoIp = new GeoIPServiceLocator().getGeoIPServiceSoap();
		String ip = InetAddress.getByName("www.lanacion.com").getHostAddress();
		System.out.println(geoIp.getIpLocation(ip));

	}

}
