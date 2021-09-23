package me.sfiguz7.extratools.lists;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.sfiguz7.extratools.ExtraTools;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class ETItems {

    /* Category */
    public static final ItemGroup extra_tools = new ItemGroup(new NamespacedKey(ExtraTools.getInstance(),
        "extra_tools"),
        new CustomItemStack(Material.DIAMOND_AXE, "&4额外工具")
    );
    /* Items */
    public static final SlimefunItemStack HAMMER = new SlimefunItemStack("HAMMER",
        Material.IRON_PICKAXE,
        "&c铁锤",
        "",
        "&9粉碎方块"
    );
    /* Machines */
    public static final SlimefunItemStack GOLD_TRANSMUTER = new SlimefunItemStack("GOLD_TRANSMUTER",
        Material.YELLOW_TERRACOTTA,
        "&6黄金转化器",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    );
    public static final SlimefunItemStack ELECTRIC_COMPOSTER = new SlimefunItemStack("ELECTRIC_COMPOSTER",
        Material.MAGENTA_TERRACOTTA,
        "&c电动堆肥机",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        "&8\u21E8 &7速度: 1x",
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    );
    public static final SlimefunItemStack ELECTRIC_COMPOSTER_2 = new SlimefunItemStack("ELECTRIC_COMPOSTER_2",
        Material.MAGENTA_TERRACOTTA,
        "&c电动堆肥机 &7(&eII&7)",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        "&8\u21E8 &7速度: 4x",
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(50)
    );
    public static final SlimefunItemStack COBBLESTONE_GENERATOR = new SlimefunItemStack("COBBLESTONE_GENERATOR",
        Material.POLISHED_ANDESITE,
        "&c圆石发生器",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(36)
    );
    public static final SlimefunItemStack VAPORIZER = new SlimefunItemStack("VAPORIZER",
        Material.RED_STAINED_GLASS,
        "&c蒸馏器",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(32)
    );
    public static final SlimefunItemStack CONCRETE_FACTORY = new SlimefunItemStack("CONCRETE_FACTORY",
        Material.BLACK_CONCRETE,
        "&4混凝土搅拌机",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(16)
    );
    public static final SlimefunItemStack PULVERIZER = new SlimefunItemStack("PULVERIZER",
        Material.ORANGE_TERRACOTTA,
        "&c方块过筛机",
        "",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        "&8\u21E8 &7速度: 1x",
        LoreBuilder.powerBuffer(256),
        LoreBuilder.powerPerSecond(18)
    );
    private ETItems() {
    }
}