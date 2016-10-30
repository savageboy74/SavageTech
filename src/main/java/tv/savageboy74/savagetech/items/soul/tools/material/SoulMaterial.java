package tv.savageboy74.savagetech.items.soul.tools.material;

/*
 * SoulMaterial.java
 * Copyright (C) 2016 Savage - github.com/savageboy74
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;

public class SoulMaterial
{
    public static ItemTool.ToolMaterial soulMatterTool = EnumHelper.addToolMaterial("soulMatter", 5, 4096, 16.0F, 6.0F, 24);
    public static ItemTool.ToolMaterial soulMatterSword = EnumHelper.addToolMaterial("soulMatterSword", 5, 4096, 16.0F, 20.0F, 24);
    //public static ItemArmor.ArmorMaterial soulArmorArmor = EnumHelper.addEnum(ItemArmor.ArmorMaterial.class, "soulArmor", 88, new int[]{8, 12, 12, 8}, 28, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
}
