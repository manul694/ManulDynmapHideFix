package com.github.manul694.manuldynmaphidefix;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinHandler implements Listener {
    @EventHandler
    public void onJoin (PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if(!p.hasPermission("dynmap.hide.self")) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "dynmap show " + p.getName());
        }
    }
}
