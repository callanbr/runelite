package net.runelite.client.plugins.myfirstplugin;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;

@PluginDescriptor(
        name = "MyFirstPlugin",
        description = "My First Plugin"
)
public class MyFirstPlugin extends Plugin {
    @Inject
    private Client client;

    @Subscribe
    public void onStatChanged(StatChanged statChanged) {
        final Skill skill = statChanged.getSkill();
        final int xp = statChanged.getXp();
        int level = client.getRealSkillLevel(skill);
        System.out.println(skill.getName() + " at " + xp + " XP at level " + level);

    }

}
