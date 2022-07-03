package venuz.mod.Mod.modules.PFlyBypass;

import me.earth.earthhack.api.module.data.DefaultData;

final class PFlyData extends DefaultData<PFlyBypass>
{
    public FastFallData(FastFall module) {
        super(module);
    }

    @Override
    public int getColor() {
        return 0xffffffff;
    }

    @Override
    public String getDescription() {
        return "cc bypass";
    }
