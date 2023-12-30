package github.m1hono.fishingoverhaul.network;

import net.minecraft.world.phys.Vec3;

public record MinigamePacket(float catchChance, Vec3 bobberPos) {
}
