package pl.norbit.playermarket.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import pl.norbit.playermarket.gui.MarketGui;
import pl.norbit.playermarket.service.CategoryService;

public class MarketCMD implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        new MarketGui((Player) sender, CategoryService.getMain()).open();

        return true;
    }
}