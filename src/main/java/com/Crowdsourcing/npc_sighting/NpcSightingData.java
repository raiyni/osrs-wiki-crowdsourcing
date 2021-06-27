package com.Crowdsourcing.npc_sighting;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.runelite.api.coords.WorldPoint;

@Data
@AllArgsConstructor
public class NpcSightingData
{
	private int npcId;
	private int rate;
	private boolean isSpawn;
	private boolean isInInstance;
	private WorldPoint location;
}
