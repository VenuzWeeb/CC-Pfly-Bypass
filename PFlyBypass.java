package venuz.mod.Mod.modules.PFlyBypass;

import me.earth.earthhack.api.module.Module;
import me.earth.earthhack.api.module.util.Category;
import me.earth.earthhack.api.setting.Setting;
import me.earth.earthhack.api.setting.settings.NumberSetting;
import venuz.mod.Mod.modules.Notify;

public class PFlyBypass extends Module
{
    public PFlyBypass()
    {
        super("Packt Fly Bypass", Category.Movement);
        this.listeners.add(new ListenerTick(this));
        this.setData(new PFlyData(this));
    }

    protected final Setting<Integer> speed =
            register(new NumberSetting<>("speed", 10, 1, 15));

    @Override
    public void onEnable(){
        Notify.enable("Packt Fly Bypass");
    }

    @Override
    public void onDisable(){
        Notify.disable("Packt Fly Bypass");
    }

}
