package riskOfRelics.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch2;
import com.megacrit.cardcrawl.shop.ShopScreen;

@Deprecated
@SpirePatch2(
        clz=ShopScreen.class,
        method=SpirePatch.CLASS
)
public class YellowKeyFieldPatch
{
    //public static SpireField<StoreRelic> example = new SpireField<>(() -> null);
}
