package com.netflix.priam.backup.identity.token;

import com.google.common.collect.ListMultimap;
import com.netflix.priam.identity.PriamInstance;
import com.netflix.priam.identity.token.IPreGeneratedTokenRetriever;

public class FakePreGeneratedTokenRetriever implements
		IPreGeneratedTokenRetriever {

	@Override
	public PriamInstance get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocMap(ListMultimap<String, PriamInstance> locMap) {
		// TODO Auto-generated method stub
		
	}

}
