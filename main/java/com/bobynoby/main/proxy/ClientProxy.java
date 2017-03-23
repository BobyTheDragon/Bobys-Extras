package com.bobynoby.main.proxy;

import com.bobynoby.init.BEXBlocks;
import com.bobynoby.init.BEXItems;

public class ClientProxy implements CommonProxy
{

	@Override
	public void init() {
		BEXItems.registerRenders();
		BEXBlocks.registerRenders();
	}

}
