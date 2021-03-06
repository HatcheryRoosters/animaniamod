package com.animania.addons.farm.common.entity.cows;

import net.minecraft.world.World;

public class CowLonghorn
{

	public static class EntityBullLonghorn extends EntityBullBase
	{

		public EntityBullLonghorn(World world)
		{
			super(world);
			this.cowType = CowType.LONGHORN;
		}

		@Override
		public int getPrimaryEggColor()
		{
			return 16763795;
		}

		@Override
		public int getSecondaryEggColor()
		{
			return 11227168;
		}

	}

	public static class EntityCowLonghorn extends EntityCowBase
	{

		public EntityCowLonghorn(World world)
		{
			super(world);
			this.cowType = CowType.LONGHORN;
		}

		@Override
		public int getPrimaryEggColor()
		{
			return 16763795;
		}

		@Override
		public int getSecondaryEggColor()
		{
			return 11227168;
		}

	}

	public static class EntityCalfLonghorn extends EntityCalfBase
	{

		public EntityCalfLonghorn(World world)
		{
			super(world);
			this.cowType = CowType.LONGHORN;
		}

		@Override
		public int getPrimaryEggColor()
		{
			return 16763795;
		}

		@Override
		public int getSecondaryEggColor()
		{
			return 11227168;
		}

	}

}