package com.github.naton1.rl.env.nh;

import static com.elvarg.util.ItemIdentifiers.ABYSSAL_WHIP;
import static com.elvarg.util.ItemIdentifiers.AHRIMS_STAFF_100;
import static com.elvarg.util.ItemIdentifiers.AMULET_OF_FURY;
import static com.elvarg.util.ItemIdentifiers.AMULET_OF_GLORY;
import static com.elvarg.util.ItemIdentifiers.AMULET_OF_TORTURE;
import static com.elvarg.util.ItemIdentifiers.ANGLERFISH;
import static com.elvarg.util.ItemIdentifiers.ARMADYL_CROSSBOW;
import static com.elvarg.util.ItemIdentifiers.ARMADYL_GODSWORD;
import static com.elvarg.util.ItemIdentifiers.BARROWS_GLOVES;
import static com.elvarg.util.ItemIdentifiers.BERSERKER_HELM;
import static com.elvarg.util.ItemIdentifiers.BERSERKER_RING;
import static com.elvarg.util.ItemIdentifiers.BLACK_DHIDE_BODY;
import static com.elvarg.util.ItemIdentifiers.CLIMBING_BOOTS;
import static com.elvarg.util.ItemIdentifiers.COOKED_KARAMBWAN;
import static com.elvarg.util.ItemIdentifiers.DARK_BOW;
import static com.elvarg.util.ItemIdentifiers.DIAMOND_BOLTS_E_;
import static com.elvarg.util.ItemIdentifiers.DRAGON_ARROW;
import static com.elvarg.util.ItemIdentifiers.DRAGON_CLAWS;
import static com.elvarg.util.ItemIdentifiers.DRAGON_DAGGER;
import static com.elvarg.util.ItemIdentifiers.DRAGON_JAVELIN;
import static com.elvarg.util.ItemIdentifiers.ELDER_MAUL_3;
import static com.elvarg.util.ItemIdentifiers.GRANITE_MAUL;
import static com.elvarg.util.ItemIdentifiers.HEAVY_BALLISTA;
import static com.elvarg.util.ItemIdentifiers.IMBUED_GUTHIX_CAPE;
import static com.elvarg.util.ItemIdentifiers.INFERNAL_CAPE;
import static com.elvarg.util.ItemIdentifiers.INFINITY_BOOTS;
import static com.elvarg.util.ItemIdentifiers.KODAI_WAND;
import static com.elvarg.util.ItemIdentifiers.MAGES_BOOK;
import static com.elvarg.util.ItemIdentifiers.MORRIGANS_JAVELIN;
import static com.elvarg.util.ItemIdentifiers.MYSTIC_ROBE_BOTTOM;
import static com.elvarg.util.ItemIdentifiers.MYSTIC_ROBE_TOP;
import static com.elvarg.util.ItemIdentifiers.NECKLACE_OF_ANGUISH;
import static com.elvarg.util.ItemIdentifiers.OCCULT_NECKLACE;
import static com.elvarg.util.ItemIdentifiers.OPAL_DRAGON_BOLTS_E_;
import static com.elvarg.util.ItemIdentifiers.RANGING_POTION_1_;
import static com.elvarg.util.ItemIdentifiers.RANGING_POTION_2_;
import static com.elvarg.util.ItemIdentifiers.RANGING_POTION_3_;
import static com.elvarg.util.ItemIdentifiers.RANGING_POTION_4_;
import static com.elvarg.util.ItemIdentifiers.RUNE_CROSSBOW;
import static com.elvarg.util.ItemIdentifiers.RUNE_DEFENDER;
import static com.elvarg.util.ItemIdentifiers.RUNE_PLATELEGS;
import static com.elvarg.util.ItemIdentifiers.RUNE_POUCH;
import static com.elvarg.util.ItemIdentifiers.SARADOMIN_BREW_4_;
import static com.elvarg.util.ItemIdentifiers.SEERS_RING_I_;
import static com.elvarg.util.ItemIdentifiers.SHARK;
import static com.elvarg.util.ItemIdentifiers.SPIRIT_SHIELD;
import static com.elvarg.util.ItemIdentifiers.STAFF_OF_THE_DEAD;
import static com.elvarg.util.ItemIdentifiers.SUPER_COMBAT_POTION_1_;
import static com.elvarg.util.ItemIdentifiers.SUPER_COMBAT_POTION_2_;
import static com.elvarg.util.ItemIdentifiers.SUPER_COMBAT_POTION_3_;
import static com.elvarg.util.ItemIdentifiers.SUPER_COMBAT_POTION_4_;
import static com.elvarg.util.ItemIdentifiers.SUPER_RESTORE_4_;
import static com.elvarg.util.ItemIdentifiers.TORMENTED_BRACELET;
import static com.elvarg.util.ItemIdentifiers.VESTAS_LONGSWORD;
import static com.elvarg.util.ItemIdentifiers.VOLATILE_NIGHTMARE_STAFF;
import static com.elvarg.util.ItemIdentifiers.ZURIELS_STAFF;
import static com.elvarg.util.ItemIdentifiers._3RD_AGE_MAGE_HAT;
import static com.elvarg.util.ItemIdentifiers._3RD_AGE_RANGE_COIF;
import static com.elvarg.util.ItemIdentifiers._3RD_AGE_RANGE_LEGS;
import static com.elvarg.util.ItemIdentifiers._3RD_AGE_RANGE_TOP;
import static com.elvarg.util.ItemIdentifiers._3RD_AGE_ROBE;
import static com.elvarg.util.ItemIdentifiers._3RD_AGE_ROBE_TOP;

import com.elvarg.game.content.PrayerHandler;
import com.elvarg.game.model.MagicSpellbook;
import com.elvarg.game.model.container.impl.Equipment;
import java.util.List;

public class NhLmsZerkLoadout extends DynamicNhLoadout {

    @Override
    public CombatStats getCombatStats() {
        return CombatStats.builder()
                .attackLevel(75)
                .strengthLevel(99)
                .defenceLevel(45)
                .rangedLevel(99)
                .prayerLevel(99)
                .magicLevel(99)
                .hitpointsLevel(99)
                .build();
    }

    @Override
    public int[] getRangedGear() {
        return new int[] {
            RUNE_CROSSBOW,
            BLACK_DHIDE_BODY,
            RUNE_PLATELEGS,
            BERSERKER_HELM,
            IMBUED_GUTHIX_CAPE,
            AMULET_OF_GLORY,
            SPIRIT_SHIELD,
            BARROWS_GLOVES,
            CLIMBING_BOOTS,
            BERSERKER_RING,
            DIAMOND_BOLTS_E_
        };
    }

    @Override
    public int[] getMageGear() {
        return new int[] {
            AHRIMS_STAFF_100,
            MYSTIC_ROBE_TOP,
            MYSTIC_ROBE_BOTTOM,
            BERSERKER_HELM,
            IMBUED_GUTHIX_CAPE,
            AMULET_OF_GLORY,
            SPIRIT_SHIELD,
            BARROWS_GLOVES,
            CLIMBING_BOOTS,
            BERSERKER_RING,
            DIAMOND_BOLTS_E_
        };
    }

    @Override
    public int[] getMeleeGear() {
        return new int[] {
            ABYSSAL_WHIP,
            BLACK_DHIDE_BODY,
            RUNE_PLATELEGS,
            BERSERKER_HELM,
            IMBUED_GUTHIX_CAPE,
            AMULET_OF_GLORY,
            RUNE_DEFENDER,
            BARROWS_GLOVES,
            CLIMBING_BOOTS,
            BERSERKER_RING,
            DIAMOND_BOLTS_E_
        };
    }

    @Override
    public int[] getMeleeSpecGear() {
        return new int[] {
            DRAGON_DAGGER,
            BLACK_DHIDE_BODY,
            RUNE_PLATELEGS,
            BERSERKER_HELM,
            IMBUED_GUTHIX_CAPE,
            AMULET_OF_GLORY,
            RUNE_DEFENDER,
            BARROWS_GLOVES,
            CLIMBING_BOOTS,
            BERSERKER_RING,
            DIAMOND_BOLTS_E_
        };
    }

    @Override
    public PrayerHandler.PrayerData[] getRangedPrayers() {
        return new PrayerHandler.PrayerData[] {PrayerHandler.PrayerData.EAGLE_EYE, PrayerHandler.PrayerData.STEEL_SKIN};
    }

    @Override
    public PrayerHandler.PrayerData[] getMagePrayers() {
        return new PrayerHandler.PrayerData[] {
            PrayerHandler.PrayerData.MYSTIC_MIGHT, PrayerHandler.PrayerData.STEEL_SKIN
        };
    }

    @Override
    public PrayerHandler.PrayerData[] getMeleePrayers() {
        return new PrayerHandler.PrayerData[] {
            PrayerHandler.PrayerData.INCREDIBLE_REFLEXES,
            PrayerHandler.PrayerData.ULTIMATE_STRENGTH,
            PrayerHandler.PrayerData.STEEL_SKIN
        };
    }

    @Override
    public NhEnvironmentParams.FightType getFightType() {
        return NhEnvironmentParams.FightType.LMS;
    }

    @Override
    protected int[] getDefaultInventoryItems() {
        return new int[] {
            SUPER_COMBAT_POTION_4_,
            RANGING_POTION_4_,
            SUPER_RESTORE_4_,
            SARADOMIN_BREW_4_,
            COOKED_KARAMBWAN,
            COOKED_KARAMBWAN,
            RUNE_POUCH,
        };
    }

    @Override
    protected int getFillItem() {
        return SHARK;
    }

    @Override
    protected void applyRandomization(final RandomizerContext randomizerContext) {
        // 20% chance to randomize karam count
        if (randomizerContext.getRandom().nextInt(5) == 1) {
            final int karams = randomizerContext.getRandom().nextInt(4);
            randomizerContext.swapInventoryQuantity(COOKED_KARAMBWAN, karams);
        }
        // 10% chance to have AGS
        if (randomizerContext.getRandom().nextInt(10) == 1) {
            randomizerContext.setSpec(Equipment.WEAPON_SLOT, ARMADYL_GODSWORD);
        }
        // 10% chance to have ballista
        if (randomizerContext.getRandom().nextInt(10) == 1) {
            randomizerContext.setRange(Equipment.WEAPON_SLOT, HEAVY_BALLISTA);
            randomizerContext.setAll(Equipment.AMMUNITION_SLOT, DRAGON_JAVELIN);
        }
        // 10% chance to have armadyl crossbow
        else if (randomizerContext.getRandom().nextInt(10) == 1) {
            randomizerContext.setRange(Equipment.WEAPON_SLOT, ARMADYL_CROSSBOW);
            // 50% chance to have dragon opal bolt
            if (randomizerContext.getRandom().nextInt(2) == 1) {
                randomizerContext.setAll(Equipment.AMMUNITION_SLOT, OPAL_DRAGON_BOLTS_E_);
            }
        }
        // 5% chance to have morrigan javelin
        else if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setRange(Equipment.WEAPON_SLOT, MORRIGANS_JAVELIN);
        }
        // 3% chance to have dark bow
        else if (randomizerContext.getRandom().nextInt(100) < 3) {
            randomizerContext.setRange(Equipment.WEAPON_SLOT, DARK_BOW);
            randomizerContext.setAll(Equipment.AMMUNITION_SLOT, DRAGON_ARROW);
        }
        // 5% chance to have dragon claws
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setSpec(Equipment.WEAPON_SLOT, DRAGON_CLAWS);
        }
        // 5% chance to have VLS spec
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setSpec(Equipment.WEAPON_SLOT, VESTAS_LONGSWORD);
        }
        // 5% chance to have VLS main
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMelee(Equipment.WEAPON_SLOT, VESTAS_LONGSWORD);
        }
        // 5% chance to have elder maul
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMelee(Equipment.WEAPON_SLOT, ELDER_MAUL_3);
        }
        // 3% chance to have AGS main
        if (randomizerContext.getRandom().nextInt(100) < 3) {
            randomizerContext.setMelee(Equipment.WEAPON_SLOT, ARMADYL_GODSWORD);
        }
        // 5% chance to have gmaul
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setSpec(Equipment.WEAPON_SLOT, GRANITE_MAUL);
        }
        // 5% chance to have infernal cape
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setRange(Equipment.CAPE_SLOT, INFERNAL_CAPE);
            randomizerContext.setMelee(Equipment.CAPE_SLOT, INFERNAL_CAPE);
            randomizerContext.setSpec(Equipment.CAPE_SLOT, INFERNAL_CAPE);
        }
        // 5% chance to have kodai wand
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.WEAPON_SLOT, KODAI_WAND);
        }
        // 5% chance to have zuriel staff
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.WEAPON_SLOT, ZURIELS_STAFF);
        }
        // 5% chance to have occult
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.AMULET_SLOT, OCCULT_NECKLACE);
        }
        // 5% chance to have mages book
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.SHIELD_SLOT, MAGES_BOOK);
        }
        // 5% chance to have seers ring i
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.RING_SLOT, SEERS_RING_I_);
        }
        // 5% chance to have staff of the dead
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.WEAPON_SLOT, STAFF_OF_THE_DEAD);
        }
        // 5% chance to have volatile nightmare staff
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.WEAPON_SLOT, VOLATILE_NIGHTMARE_STAFF);
        }
        // 5% chance to have amulet of fury
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.swapAll(AMULET_OF_GLORY, AMULET_OF_FURY);
        }
        // 5% chance to have amulet of torture
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMelee(Equipment.AMULET_SLOT, AMULET_OF_TORTURE);
            randomizerContext.setSpec(Equipment.AMULET_SLOT, AMULET_OF_TORTURE);
        }
        // 5% chance to have anguish
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setRange(Equipment.AMULET_SLOT, NECKLACE_OF_ANGUISH);
        }
        // 5% chance to have tormented bracelet
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.HANDS_SLOT, TORMENTED_BRACELET);
        }
        // 5% chance to have 3rd age hat
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.HEAD_SLOT, _3RD_AGE_MAGE_HAT);
        }
        // 5% chance to have 3rd age robe top
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.BODY_SLOT, _3RD_AGE_ROBE_TOP);
        }
        // 5% chance to have 3rd age robe bottom
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.LEG_SLOT, _3RD_AGE_ROBE);
        }
        // 5% chance to have 3rd age range coif
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setRange(Equipment.HEAD_SLOT, _3RD_AGE_RANGE_COIF);
        }
        // 5% chance to have 3rd age range top
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.swapAll(BLACK_DHIDE_BODY, _3RD_AGE_RANGE_TOP);
        }
        // 5% chance to have 3rd age range bottom
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.swapAll(RUNE_PLATELEGS, _3RD_AGE_RANGE_LEGS);
        }
        // 5% chance to have infinity boots
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.setMage(Equipment.FEET_SLOT, INFINITY_BOOTS);
        }
        // 5% chance to have no super combat
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.swapInventoryQuantity(SUPER_COMBAT_POTION_4_, 0);
        }
        // 5% chance to vary super combat doses
        else if (randomizerContext.getRandom().nextInt(20) == 1) {
            final List<Integer> itemIds = List.of(
                    SUPER_COMBAT_POTION_4_, SUPER_COMBAT_POTION_3_, SUPER_COMBAT_POTION_2_, SUPER_COMBAT_POTION_1_);
            final int index = randomizerContext.getRandom().nextInt(itemIds.size());
            randomizerContext.swapInventory(SUPER_COMBAT_POTION_4_, itemIds.get(index));
        }
        // 5% chance to have no ranged potion
        if (randomizerContext.getRandom().nextInt(20) == 1) {
            randomizerContext.swapInventoryQuantity(RANGING_POTION_4_, 0);
        }
        // 5% chance to vary super ranged pot doses
        else if (randomizerContext.getRandom().nextInt(20) == 1) {
            final List<Integer> itemIds =
                    List.of(RANGING_POTION_4_, RANGING_POTION_3_, RANGING_POTION_2_, RANGING_POTION_1_);
            final int index = randomizerContext.getRandom().nextInt(itemIds.size());
            randomizerContext.swapInventory(RANGING_POTION_4_, itemIds.get(index));
        }
        // 10% chance to randomize brew count
        if (randomizerContext.getRandom().nextInt(10) == 1) {
            // Now randomize brews from 0 to 2, and adjust potions accordingly
            final int brewCount = randomizerContext.getRandom().nextInt(3);
            // Cut brews in half, and randomly add an extra
            final int restoreCount = (int) Math.ceil(brewCount / 2D)
                    + randomizerContext.getRandom().nextInt(2);
            randomizerContext.swapInventoryQuantity(SARADOMIN_BREW_4_, brewCount);
            randomizerContext.swapInventoryQuantity(SUPER_RESTORE_4_, restoreCount);
        }
        // 10% chance to use veng
        if (randomizerContext.getRandom().nextInt(10) == 1) {
            randomizerContext.setSpellbookOverride(MagicSpellbook.LUNAR);
        }
        // 10% chance to use anglers (note: anglers aren't available in LMS but may help to better
        // generalize)
        if (randomizerContext.getRandom().nextInt(10) == 1) {
            randomizerContext.setFillItemOverride(ANGLERFISH);
        }
    }
}
