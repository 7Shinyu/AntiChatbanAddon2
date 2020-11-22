package net.labymod.addons.antichatban.shinyu;

import net.labymod.api.LabyModAddon;
import net.labymod.api.events.MessageSendEvent;
import net.labymod.main.LabyMod;
import net.labymod.settings.elements.BooleanElement;
import net.labymod.settings.elements.ControlElement;
import net.labymod.settings.elements.SettingsElement;
import net.labymod.utils.Consumer;
import net.labymod.utils.Material;
import net.labymod.utils.ServerData;

import java.util.List;

public class AntiChatbanAddon extends LabyModAddon {

    private String blocked_hurensohn = "Hurensohn";
    private String blocked_hs = "HS";
    private String blocked_bastard = "Bastard";
    private String blocked_spast = "Spast";
    private String blocked_fotze = "Fotze";
    private String blocked_fick_dich = "Fick dich";
    private String blocked_fuck_you = "Fuck you";
    private String blocked_fick = "Fick";
    private String blocked_ficken = "Ficken";
    private String blocked_fuck = "Fuck";
    private String blocked_easy = "Easy";
    private String blocked_ez = "eZ";
    private String blocked_arsch = "Arsch";
    private String blocked_arschloch = "Arschloch";

    private boolean AntiChatban = true;

    @Override
    public void onEnable() {
        this.getApi().getEventManager().registerOnJoin(new Consumer<ServerData>() {
            @Override
            public void accept(ServerData serverData) {
                LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                LabyMod.getInstance().displayMessageInChat("§cYou want to help us?");
                LabyMod.getInstance().displayMessageInChat("§cSend other words there ⬇");
                LabyMod.getInstance().displayMessageInChat("§9https://discord.gg/ydzFSt6RH4");
                LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
            }
        });

        this.getApi().getEventManager().register((new MessageSendEvent() {

            public boolean onSend(final String message) {
                if (!AntiChatban) {

                    if (message.toLowerCase().contains("discord")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cOur Discord ⬇");
                        LabyMod.getInstance().displayMessageInChat("§9https://discord.gg/ydzFSt6RH4");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }
                    if (message.toLowerCase().contains("hurensohn")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: " + blocked_hurensohn);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("hs")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_hs);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("bastard")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_bastard);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("spast")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_spast);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("fotze")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_fotze);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("fick dich")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_fick_dich);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("fuck you")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_fuck_you);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("fick")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_fick);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("ficken")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_ficken);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("fuck")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_fuck);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("easy")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_easy);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("ez")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_ez);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("arsch")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_arsch);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("arschloch")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou sended: §4" + blocked_arschloch);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("https://www.")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou send a §4link§c!");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains("www.")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou send a §4link§c!");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }

                    if (message.toLowerCase().contains(".de")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cThis is a warning!");
                        LabyMod.getInstance().displayMessageInChat("§cYou send a §4link§c!");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return false;
                    }
                }

                if (AntiChatban) {

                    if (message.toLowerCase().contains("discord")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cOur Discord ⬇");
                        LabyMod.getInstance().displayMessageInChat("§9https://discord.gg/ydzFSt6RH4");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }
                    if (message.toLowerCase().contains("hurensohn")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_hurensohn);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("hs")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_hs);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("bastard")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_bastard);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("spast")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_spast);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("fotze")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_fotze);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("fick dich")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_fick_dich);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("fuck you")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_fuck_you);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("fick")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_fick);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("ficken")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_ficken);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("fuck")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_fuck);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("easy")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_easy);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("ez")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_ez);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("arsch")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_arsch);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("arschloch")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cBlocked word: §4" + blocked_arschloch);
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("https://www.")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cYou send a §4link§c!");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains("www.")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cYou send a §4link§c!");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }

                    if (message.toLowerCase().contains(".de")) {
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        LabyMod.getInstance().displayMessageInChat("§cMessage blocked!");
                        LabyMod.getInstance().displayMessageInChat("§cWrited message: §4" + message);
                        LabyMod.getInstance().displayMessageInChat("§cYou send a §4link§c!");
                        LabyMod.getInstance().displayMessageInChat("§7----------§aAntiChatBan§7----------");
                        return true;
                    }
                }
                return false;

            }
        }));
    }

    @Override
    public void loadConfig() {

        this.AntiChatban = !this.getConfig().has("AntiChatban") || this.getConfig().get("AntiChatban").getAsBoolean();
    }

    @Override
    protected void fillSettings(final List<SettingsElement> list) {

        final BooleanElement AntiChatban = new BooleanElement("AntiChatban", new ControlElement.IconData(Material.BARRIER), new Consumer<Boolean>() {
            @Override
            public void accept(final Boolean AntiChatban) {
                AntiChatbanAddon.this.AntiChatban = AntiChatban;

                AntiChatbanAddon.this.getConfig().addProperty("AntiChatban", AntiChatban);
            }
        }, this.AntiChatban);

        list.add(AntiChatban);
    }

}
