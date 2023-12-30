package github.m1hono.fishingoverhaul.network;

import net.minecraft.world.phys.Vec3;

public record MinigameResultPacket(boolean success, Vec3 bobberPos) {
}
