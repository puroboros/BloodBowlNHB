package com.nhb.api.competitive.injuries;

import com.nhb.api.master.Stats;

public class StatInjury extends Injury{
	private Stats stat;

	public Stats getStat() {
		return stat;
	}

	public void setStat(Stats stat) {
		this.stat = stat;
	}
}
