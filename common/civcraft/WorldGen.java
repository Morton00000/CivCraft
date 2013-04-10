package civcraft;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import civcraft.lib.BlockIDs;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider

	chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case -1:
				generateNether();
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				generateEnd();
				break;
		}
	}

	public void generateNether() {
		// we're not doing ore ore in the nether
	}

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		int i;

		// Tin
		for (i = 0; i < 2; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 0, 4, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Copper
		for (i = 0; i < 4; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(72);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 1, 6, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Platinum
		for (i = 0; i < 2; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(32);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 2, 3, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Silver
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(54);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 3, 3, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Aluminum
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(54);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 4, 5, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Titanium
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(24);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 5, 3, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Lead
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 6, 5, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Mercury
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 7, 4, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Zinc
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 8, 3, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Tungsten
		for (i = 0; i < 1; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(48);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 9, 2, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Uranium
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(16);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE, 10, 2, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Graphite
		for (i = 0; i < 3; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE_GRAPHITE, 0, 5, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Saltpeter
		for (i = 0; i < 4; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE_SALTPETER, 0, 5, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}

		// Sulfur
		for (i = 0; i < 4; i++) {
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(64);
			int randPosZ = chunkZ + rand.nextInt(16);

			new WorldGenMinable(BlockIDs.ORE_SULFUR, 0, 5, 1).generate(world, rand, randPosX, randPosY, randPosZ);
		}
	}

	public void generateEnd() {
		// we're not going to generate in the end either
	}
}
