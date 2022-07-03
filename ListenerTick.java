package venuz.mod.Mod.modules.PFlyBypass;

import me.earth.earthhack.impl.event.events.misc.TickEvent;
import me.earth.earthhack.impl.event.listeners.ModuleListener;
import venuz.mod.Mod.modules.Api;

final class ListenerTick extends ModuleListener<FastFall, TickEvent>
{
    public ListenerTickPFlmodule)
    {
        super(module, TickEvent.class);
    }

    @Override
    public void invoke(TickEvent event) {
        if (Api.nullCheck()) return;
        if (mc.player.onGround) mc.player.motionY -= module.speed.getValue() / 5;
    }
}