package io.github.feylostt.originsbyleah.registry;

import io.github.apace100.origins.origin.Origin;
import io.github.feylostt.originsbyleah.OriginsByLeah;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

import java.util.HashMap;
import java.util.Map;

public class ModDamageTypes {
	public static final RegistryKey<DamageType> WATERBENDING = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, OriginsByLeah.identifier("waterbending"));

	private static final Map<RegistryKey<DamageType>, DamageSource> damageSourceCache = new HashMap<>();

	public static DamageSource getSource(DamageSources damageSources, RegistryKey<DamageType> damageType) {
		return damageSourceCache.computeIfAbsent(damageType, damageSources::create);
	}
}
