package xyz.tianx.amaplocation;

import android.content.res.XResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;

public class amaplocation implements IXposedHookZygoteInit{

	@Override
	public void initZygote(StartupParam startupParam) throws Throwable {
		// TODO Auto-generated method stub
			String[] str=new String[]{"com.amap.android.location","com.android.location.fused"};
		    XResources.setSystemWideReplacement("android", "string", "config_networkLocationProviderPackageName", "com.amap.android.location");
		    XposedBridge.log("config_networkLocationProviderPackageName");
		    XResources.setSystemWideReplacement("android", "string", "config_geocoderProviderPackageName", "com.amap.android.location");
		    XposedBridge.log("config_geocoderProviderPackageName");
		    XResources.setSystemWideReplacement("android", "array", "config_locationProviderPackageNames",str);
		    XposedBridge.log("config_locationProviderPackageNames");
		    XposedBridge.log(str[1]);
		    XposedBridge.log(str[2]);
		
	}
	
	
	    
	    
	}


