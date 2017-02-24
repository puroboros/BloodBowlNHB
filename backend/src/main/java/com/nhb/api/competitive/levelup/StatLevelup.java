package com.nhb.api.competitive.levelup;

import com.nhb.api.master.Stats;

public class StatLevelup extends Levelup{
	private Stats stat;

	public Stats getStat() {
		return stat;
	}

	public void setStat(Stats stat) {
		this.stat = stat;
	}

	@Override
	public String toString() {
		return "StatLevelup [stat=" + stat + "]";
	}
	
}
